package com.example.owocewarzywa.practice.flashcards

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.owocewarzywa.R
import com.example.owocewarzywa.databinding.FragmentFlashcardBinding
import com.example.owocewarzywa.model.PracticeViewModel
import com.example.owocewarzywa.utils.FirestoreUtil
import com.example.owocewarzywa.utils.GlideApp
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.launch


class FlashcardFragment : Fragment() {
    //RW
    private lateinit var binding: FragmentFlashcardBinding
    private val practiceData: PracticeViewModel by activityViewModels()
    private val viewModel: FlashcardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFlashcardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.flashcardViewModel = viewModel
        binding.maxNoOfCards = 10
        binding.lifecycleOwner = viewLifecycleOwner
        binding.submit.setOnClickListener { onSubmitWord() }
        binding.skip.setOnClickListener { onSkipWord() }
        viewLifecycleOwner.lifecycleScope.launch {initView()}
    }

    private suspend fun initView() {
        viewModel.getFlashcardsData(
            practiceData.difficulty.value.toString(),
            practiceData.topic.value.toString()
        )
        binding.score.text = String.format("Wynik: %d", viewModel.score.value)
        binding.wordCount.text = String.format("%d z %d słów", viewModel.currentWordCount.value, 10)
        binding.flashcardHint1.text = "Podpowiedź: "+ viewModel.currentHint.value
        updateNextWordOnScreen()
    }

    private fun onSubmitWord() {
        val playerWord = binding.textInputEditText.text.toString()

        if (viewModel.isUserWordCorrect(playerWord)) {
            setErrorTextField(false)
            if (viewModel.nextWord()) {
                updateNextWordOnScreen()
            } else {
                showFinalScoreDialog()
            }
        } else {
            setErrorTextField(true)
        }
    }

    private fun onSkipWord() {
        when (viewModel.hints.value) {
            2 -> {
                binding.flashcardHint1.visibility = View.VISIBLE
                binding.submit.layoutParams = setTopMargin(30)
                binding.skip.text = "Podpowiedź (1)"
                viewModel.hints.value = 1
            }
            1 -> {
                renderImageHint(viewModel.currentImage.value!!)
                binding.submit.layoutParams = setTopMargin(10)
                binding.flashcardHint2.visibility = View.VISIBLE
                binding.skip.text = "Pomiń"
                viewModel.hints.value = 0
            }
            0 -> {
                if (viewModel.nextWord()) {
                    setErrorTextField(false)
                    updateNextWordOnScreen()
                } else {
                    showFinalScoreDialog()
                }
            }
        }
    }

    private fun showFinalScoreDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Gratulacje!")
            .setMessage(String.format("Wynik: %d", viewModel.score.value))
            .setCancelable(false)
            .setPositiveButton("Menu główne") { _, _ ->
                FirestoreUtil.updateUserScore(viewModel.score.value!!)
                goMenu()
            }
            .show()
    }

    private fun goMenu() {
        findNavController().navigate(R.id.action_flashcardFragment_to_startFragment)
    }

    private fun setErrorTextField(error: Boolean) {
        if (error) {
            binding.textField.isErrorEnabled = true
            binding.textField.error = "Spróbuj ponownie"
        } else {
            binding.textField.isErrorEnabled = false
            binding.textInputEditText.text = null
        }
    }

    private fun updateNextWordOnScreen() {
        viewModel.hints.value = 2
        binding.skip.text = "Podpowiedź (2)"
        binding.flashcardHint1.text = "Podpowiedź: " + viewModel.currentHint.value
        binding.flashcardHint1.visibility = View.GONE
        binding.flashcardHint2.visibility = View.GONE
        binding.score.text = String.format("Wynik: %d", viewModel.score.value)
        binding.wordCount.text = String.format("%d z %d słów", viewModel.currentWordCount.value, 10)
        binding.textViewUnscrambledWord.text = viewModel.currentFlashWord.value
    }

    private fun renderImageHint(url: String) {
        GlideApp.with(this)
            .load(url)
            .error(R.drawable.ic_error)
            .into(binding.flashcardHint2)
    }

    private fun setTopMargin(margin: Int): ConstraintLayout.LayoutParams {
        val margindp = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, margin.toFloat(), resources
                .displayMetrics
        ).toInt()
        val layoutParams = binding.submit.layoutParams as ConstraintLayout.LayoutParams
        layoutParams.setMargins(0, margindp, 0, 0)
        return layoutParams
    }
}