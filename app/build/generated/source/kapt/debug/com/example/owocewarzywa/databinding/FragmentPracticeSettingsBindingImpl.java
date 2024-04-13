package com.example.owocewarzywa.databinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPracticeSettingsBindingImpl extends FragmentPracticeSettingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.settings_title, 1);
        sViewsWithIds.put(R.id.settings_label_topic, 2);
        sViewsWithIds.put(R.id.SpinnerOutline2, 3);
        sViewsWithIds.put(R.id.spinner_topic, 4);
        sViewsWithIds.put(R.id.settings_label_difficulty, 5);
        sViewsWithIds.put(R.id.SpinnerOutline3, 6);
        sViewsWithIds.put(R.id.spinner_difficulty, 7);
        sViewsWithIds.put(R.id.settings_progress, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPracticeSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentPracticeSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Spinner) bindings[7]
            , (android.widget.Spinner) bindings[4]
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
        if (BR.practiceSettingsFragment == variableId) {
            setPracticeSettingsFragment((com.example.owocewarzywa.practice.PracticeSettingsFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPracticeSettingsFragment(@Nullable com.example.owocewarzywa.practice.PracticeSettingsFragment PracticeSettingsFragment) {
        this.mPracticeSettingsFragment = PracticeSettingsFragment;
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
        flag 0 (0x1L): practiceSettingsFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}