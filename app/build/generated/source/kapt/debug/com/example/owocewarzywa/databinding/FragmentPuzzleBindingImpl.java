package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPuzzleBindingImpl extends FragmentPuzzleBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.quiz_title_label, 1);
        sViewsWithIds.put(R.id.quiz_card1, 2);
        sViewsWithIds.put(R.id.quiz_question1, 3);
        sViewsWithIds.put(R.id.quiz_question1answers, 4);
        sViewsWithIds.put(R.id.quiz_answer1a, 5);
        sViewsWithIds.put(R.id.quiz_answer1b, 6);
        sViewsWithIds.put(R.id.quiz_answer1c, 7);
        sViewsWithIds.put(R.id.quiz_card2, 8);
        sViewsWithIds.put(R.id.quiz_question2, 9);
        sViewsWithIds.put(R.id.quiz_question2answers, 10);
        sViewsWithIds.put(R.id.quiz_answer2a, 11);
        sViewsWithIds.put(R.id.quiz_answer2b, 12);
        sViewsWithIds.put(R.id.quiz_answer2c, 13);
        sViewsWithIds.put(R.id.quiz_card3, 14);
        sViewsWithIds.put(R.id.quiz_question3, 15);
        sViewsWithIds.put(R.id.quiz_question3answers, 16);
        sViewsWithIds.put(R.id.quiz_answer3a, 17);
        sViewsWithIds.put(R.id.quiz_answer3b, 18);
        sViewsWithIds.put(R.id.quiz_answer3c, 19);
        sViewsWithIds.put(R.id.quiz_submit, 20);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPuzzleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentPuzzleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[17]
            , (android.widget.RadioButton) bindings[18]
            , (android.widget.RadioButton) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioGroup) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioGroup) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.Button) bindings[20]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.puzzleFragment == variableId) {
            setPuzzleFragment((com.example.owocewarzywa.practice.puzzle.PuzzleFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPuzzleFragment(@Nullable com.example.owocewarzywa.practice.puzzle.PuzzleFragment PuzzleFragment) {
        this.mPuzzleFragment = PuzzleFragment;
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
        flag 0 (0x1L): puzzleFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}