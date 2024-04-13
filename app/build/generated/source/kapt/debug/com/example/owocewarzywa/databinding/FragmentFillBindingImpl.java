package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFillBindingImpl extends FragmentFillBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fill_title_label, 1);
        sViewsWithIds.put(R.id.fill_contentcard, 2);
        sViewsWithIds.put(R.id.fill_content, 3);
        sViewsWithIds.put(R.id.fill_answer_container_1, 4);
        sViewsWithIds.put(R.id.fill_label_1, 5);
        sViewsWithIds.put(R.id.fill_SpinnerOutline1, 6);
        sViewsWithIds.put(R.id.fill1, 7);
        sViewsWithIds.put(R.id.fill_answer_container_2, 8);
        sViewsWithIds.put(R.id.fill_label_2, 9);
        sViewsWithIds.put(R.id.fill_SpinnerOutline2, 10);
        sViewsWithIds.put(R.id.fill2, 11);
        sViewsWithIds.put(R.id.fill_answer_container_3, 12);
        sViewsWithIds.put(R.id.fill_label_3, 13);
        sViewsWithIds.put(R.id.fill_SpinnerOutline3, 14);
        sViewsWithIds.put(R.id.fill3, 15);
        sViewsWithIds.put(R.id.fill_submit, 16);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFillBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentFillBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Spinner) bindings[7]
            , (android.widget.Spinner) bindings[11]
            , (android.widget.Spinner) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.Button) bindings[16]
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
        if (BR.fillFragment == variableId) {
            setFillFragment((com.example.owocewarzywa.practice.fill.FillFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFillFragment(@Nullable com.example.owocewarzywa.practice.fill.FillFragment FillFragment) {
        this.mFillFragment = FillFragment;
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
        flag 0 (0x1L): fillFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}