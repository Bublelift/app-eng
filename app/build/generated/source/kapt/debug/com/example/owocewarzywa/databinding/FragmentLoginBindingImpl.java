package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.example.owocewarzywa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pic_greeting, 3);
        sViewsWithIds.put(R.id.imageView, 4);
        sViewsWithIds.put(R.id.greeting, 5);
        sViewsWithIds.put(R.id.card_view, 6);
        sViewsWithIds.put(R.id.info_login, 7);
        sViewsWithIds.put(R.id.email, 8);
        sViewsWithIds.put(R.id.email_input, 9);
        sViewsWithIds.put(R.id.password, 10);
        sViewsWithIds.put(R.id.password_input, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (android.widget.ImageView) bindings[3]
            );
        this.buttonLogin.setTag(null);
        this.buttonRegister.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.owocewarzywa.generated.callback.OnClickListener(this, 1);
        mCallback6 = new com.example.owocewarzywa.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginFragment == variableId) {
            setLoginFragment((com.example.owocewarzywa.auth.LoginFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginFragment(@Nullable com.example.owocewarzywa.auth.LoginFragment LoginFragment) {
        this.mLoginFragment = LoginFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loginFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.owocewarzywa.auth.LoginFragment loginFragment = mLoginFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.buttonLogin.setOnClickListener(mCallback5);
            this.buttonRegister.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // loginFragment != null
                boolean loginFragmentJavaLangObjectNull = false;
                // loginFragment
                com.example.owocewarzywa.auth.LoginFragment loginFragment = mLoginFragment;



                loginFragmentJavaLangObjectNull = (loginFragment) != (null);
                if (loginFragmentJavaLangObjectNull) {


                    loginFragment.login();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // loginFragment != null
                boolean loginFragmentJavaLangObjectNull = false;
                // loginFragment
                com.example.owocewarzywa.auth.LoginFragment loginFragment = mLoginFragment;



                loginFragmentJavaLangObjectNull = (loginFragment) != (null);
                if (loginFragmentJavaLangObjectNull) {


                    loginFragment.go_to_register();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}