package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMemoBindingImpl extends FragmentMemoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.score, 1);
        sViewsWithIds.put(R.id.memo_label, 2);
        sViewsWithIds.put(R.id.memo_goal, 3);
        sViewsWithIds.put(R.id.memo_scroll_view, 4);
        sViewsWithIds.put(R.id.barrier, 5);
        sViewsWithIds.put(R.id.memo_pic1, 6);
        sViewsWithIds.put(R.id.memo_reverse1, 7);
        sViewsWithIds.put(R.id.memo_pic2, 8);
        sViewsWithIds.put(R.id.memo_reverse2, 9);
        sViewsWithIds.put(R.id.memo_pic3, 10);
        sViewsWithIds.put(R.id.memo_reverse3, 11);
        sViewsWithIds.put(R.id.memo_pic4, 12);
        sViewsWithIds.put(R.id.memo_reverse4, 13);
        sViewsWithIds.put(R.id.memo_pic5, 14);
        sViewsWithIds.put(R.id.memo_reverse5, 15);
        sViewsWithIds.put(R.id.memo_pic6, 16);
        sViewsWithIds.put(R.id.memo_reverse6, 17);
        sViewsWithIds.put(R.id.memo_pic7, 18);
        sViewsWithIds.put(R.id.memo_reverse7, 19);
        sViewsWithIds.put(R.id.memo_pic8, 20);
        sViewsWithIds.put(R.id.memo_reverse8, 21);
        sViewsWithIds.put(R.id.memo_pic9, 22);
        sViewsWithIds.put(R.id.memo_reverse9, 23);
        sViewsWithIds.put(R.id.memo_pic10, 24);
        sViewsWithIds.put(R.id.memo_reverse10, 25);
        sViewsWithIds.put(R.id.button_ready, 26);
        sViewsWithIds.put(R.id.memoloading, 27);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMemoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FragmentMemoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.Button) bindings[26]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[23]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (android.widget.ProgressBar) bindings[27]
            , (android.widget.TextView) bindings[1]
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
        if (BR.memoFragment == variableId) {
            setMemoFragment((com.example.owocewarzywa.practice.memo.MemoFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMemoFragment(@Nullable com.example.owocewarzywa.practice.memo.MemoFragment MemoFragment) {
        this.mMemoFragment = MemoFragment;
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
        flag 0 (0x1L): memoFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}