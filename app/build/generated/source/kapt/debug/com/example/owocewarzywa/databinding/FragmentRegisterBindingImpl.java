package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.example.owocewarzywa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pic_greeting, 3);
        sViewsWithIds.put(R.id.greeting, 4);
        sViewsWithIds.put(R.id.card_view, 5);
        sViewsWithIds.put(R.id.info_login, 6);
        sViewsWithIds.put(R.id.email, 7);
        sViewsWithIds.put(R.id.email_input, 8);
        sViewsWithIds.put(R.id.password, 9);
        sViewsWithIds.put(R.id.password_input, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (android.widget.ImageView) bindings[3]
            );
        this.buttonLogin.setTag(null);
        this.buttonRegister.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.owocewarzywa.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.example.owocewarzywa.generated.callback.OnClickListener(this, 2);
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
        if (BR.registerFragment == variableId) {
            setRegisterFragment((com.example.owocewarzywa.auth.RegisterFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterFragment(@Nullable com.example.owocewarzywa.auth.RegisterFragment RegisterFragment) {
        this.mRegisterFragment = RegisterFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registerFragment);
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
        com.example.owocewarzywa.auth.RegisterFragment registerFragment = mRegisterFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.buttonLogin.setOnClickListener(mCallback8);
            this.buttonRegister.setOnClickListener(mCallback7);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // registerFragment != null
                boolean registerFragmentJavaLangObjectNull = false;
                // registerFragment
                com.example.owocewarzywa.auth.RegisterFragment registerFragment = mRegisterFragment;



                registerFragmentJavaLangObjectNull = (registerFragment) != (null);
                if (registerFragmentJavaLangObjectNull) {


                    registerFragment.register();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // registerFragment != null
                boolean registerFragmentJavaLangObjectNull = false;
                // registerFragment
                com.example.owocewarzywa.auth.RegisterFragment registerFragment = mRegisterFragment;



                registerFragmentJavaLangObjectNull = (registerFragment) != (null);
                if (registerFragmentJavaLangObjectNull) {


                    registerFragment.go_to_login();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}