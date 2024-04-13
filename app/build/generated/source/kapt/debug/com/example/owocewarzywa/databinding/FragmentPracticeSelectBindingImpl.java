package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPracticeSelectBindingImpl extends FragmentPracticeSelectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.practice_select_title, 1);
        sViewsWithIds.put(R.id.cardView, 2);
        sViewsWithIds.put(R.id.practice_label1, 3);
        sViewsWithIds.put(R.id.label_quiz, 4);
        sViewsWithIds.put(R.id.button_quiz, 5);
        sViewsWithIds.put(R.id.label_fiszki, 6);
        sViewsWithIds.put(R.id.button_fiszki, 7);
        sViewsWithIds.put(R.id.label_fill, 8);
        sViewsWithIds.put(R.id.button_luki, 9);
        sViewsWithIds.put(R.id.cardView2, 10);
        sViewsWithIds.put(R.id.practice_label2, 11);
        sViewsWithIds.put(R.id.label_memory, 12);
        sViewsWithIds.put(R.id.button_memory, 13);
        sViewsWithIds.put(R.id.label_unscramble, 14);
        sViewsWithIds.put(R.id.button_unscramble, 15);
        sViewsWithIds.put(R.id.label_lock, 16);
        sViewsWithIds.put(R.id.button_riddles, 17);
        sViewsWithIds.put(R.id.textView3, 18);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPracticeSelectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentPracticeSelectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[18]
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
        if (BR.practiceSelect == variableId) {
            setPracticeSelect((com.example.owocewarzywa.practice.PracticeSelect) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPracticeSelect(@Nullable com.example.owocewarzywa.practice.PracticeSelect PracticeSelect) {
        this.mPracticeSelect = PracticeSelect;
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
        flag 0 (0x1L): practiceSelect
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}