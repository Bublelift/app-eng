package com.example.owocewarzywa.auth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.owocewarzywa.R
import com.example.owocewarzywa.databinding.FragmentLoginBinding
import com.example.owocewarzywa.model.LoginViewModel
import com.example.owocewarzywa.MainActivity
import com.example.owocewarzywa.utils.FirestoreUtil
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider


class LoginFragment : Fragment() {
    //DM
    private var binding: FragmentLoginBinding? = null
    private val sharedViewModel: LoginViewModel by activityViewModels()
    private lateinit var oneTapClient: SignInClient

    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentLoginBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        auth = FirebaseAuth.getInstance()

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.loginFragment = this
        (activity as MainActivity).supportActionBar?.hide()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun go_to_register() {
        findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
    }


    fun login() {
        val email = binding!!.emailInput.text.toString()
        val password = binding!!.passwordInput.text.toString()
        if (email == "") binding!!.email.setError("Email nie może być pusty")
        else if (password == "") binding!!.password.setError("Hasło nie może być puste")
        else {
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    FirestoreUtil.initCurrentUserIfFirstTime {
                        sharedViewModel.log_in(auth.currentUser!!.uid)
                        Log.e("LOGIN_PROCESS", "przekierowanie")
                        findNavController().navigate(R.id.action_loginFragment_to_startFragment)
                    }

                }
            }.addOnFailureListener { exception ->
                Toast.makeText(context, exception.localizedMessage, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val googleCredential = oneTapClient.getSignInCredentialFromIntent(data)
        val idToken = googleCredential.googleIdToken
        when {
            idToken != null -> { //check połączenia z firestore
                val firebaseCredential = GoogleAuthProvider.getCredential(idToken, null)
                auth.signInWithCredential(firebaseCredential)
                    .addOnCompleteListener(requireActivity()) { task ->
                        if (task.isSuccessful) {
                            findNavController().navigate(R.id.action_loginFragment_to_startFragment)
                        } else {
                            Log.w("OnActivityResult1", "signInWithCredential:failure", task.exception)
                        }
                    }
            }
            else -> {
                Log.d("onActivityResult2", "No ID token!")
            }
        }
    }

}