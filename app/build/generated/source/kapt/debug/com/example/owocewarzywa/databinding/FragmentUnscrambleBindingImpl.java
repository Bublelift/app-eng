package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUnscrambleBindingImpl extends FragmentUnscrambleBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.skip, 1);
        sViewsWithIds.put(R.id.submit, 2);
        sViewsWithIds.put(R.id.textView_instructions, 3);
        sViewsWithIds.put(R.id.textView_unscrambled_word, 4);
        sViewsWithIds.put(R.id.word_count, 5);
        sViewsWithIds.put(R.id.score, 6);
        sViewsWithIds.put(R.id.textField, 7);
        sViewsWithIds.put(R.id.text_input_edit_text, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUnscrambleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentUnscrambleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.example.owocewarzywa.practice.unscramble.UnscrambleViewModel) variable);
        }
        else if (BR.unscrambleFragment == variableId) {
            setUnscrambleFragment((com.example.owocewarzywa.practice.unscramble.UnscrambleFragment) variable);
        }
        else if (BR.maxNoOfWords == variableId) {
            setMaxNoOfWords((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.example.owocewarzywa.practice.unscramble.UnscrambleViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
    }
    public void setUnscrambleFragment(@Nullable com.example.owocewarzywa.practice.unscramble.UnscrambleFragment UnscrambleFragment) {
        this.mUnscrambleFragment = UnscrambleFragment;
    }
    public void setMaxNoOfWords(int MaxNoOfWords) {
        this.mMaxNoOfWords = MaxNoOfWords;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViewModel
        flag 1 (0x2L): unscrambleFragment
        flag 2 (0x3L): maxNoOfWords
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}