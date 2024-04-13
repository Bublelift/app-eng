// Generated by data binding compiler. Do not edit!
package com.example.owocewarzywa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.owocewarzywa.FeedbackFragment;
import com.example.owocewarzywa.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFeedbackBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText feedback;

  @NonNull
  public final Button nextButton;

  @Bindable
  protected FeedbackFragment mFeedbackFragment;

  protected FragmentFeedbackBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText feedback, Button nextButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.feedback = feedback;
    this.nextButton = nextButton;
  }

  public abstract void setFeedbackFragment(@Nullable FeedbackFragment feedbackFragment);

  @Nullable
  public FeedbackFragment getFeedbackFragment() {
    return mFeedbackFragment;
  }

  @NonNull
  public static FragmentFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_feedback, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFeedbackBinding>inflateInternal(inflater, R.layout.fragment_feedback, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_feedback, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFeedbackBinding>inflateInternal(inflater, R.layout.fragment_feedback, null, false, component);
  }

  public static FragmentFeedbackBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentFeedbackBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFeedbackBinding)bind(component, view, R.layout.fragment_feedback);
  }
}
