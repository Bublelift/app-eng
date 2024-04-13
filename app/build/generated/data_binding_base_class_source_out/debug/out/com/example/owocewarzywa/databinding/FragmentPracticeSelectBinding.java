// Generated by data binding compiler. Do not edit!
package com.example.owocewarzywa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.owocewarzywa.R;
import com.example.owocewarzywa.practice.PracticeSelect;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPracticeSelectBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonFiszki;

  @NonNull
  public final Button buttonLuki;

  @NonNull
  public final Button buttonMemory;

  @NonNull
  public final Button buttonQuiz;

  @NonNull
  public final Button buttonRiddles;

  @NonNull
  public final Button buttonUnscramble;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final TextView labelFill;

  @NonNull
  public final TextView labelFiszki;

  @NonNull
  public final TextView labelLock;

  @NonNull
  public final TextView labelMemory;

  @NonNull
  public final TextView labelQuiz;

  @NonNull
  public final TextView labelUnscramble;

  @NonNull
  public final TextView practiceLabel1;

  @NonNull
  public final TextView practiceLabel2;

  @NonNull
  public final TextView practiceSelectTitle;

  @NonNull
  public final TextView textView3;

  @Bindable
  protected PracticeSelect mPracticeSelect;

  protected FragmentPracticeSelectBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button buttonFiszki, Button buttonLuki, Button buttonMemory,
      Button buttonQuiz, Button buttonRiddles, Button buttonUnscramble, CardView cardView,
      CardView cardView2, TextView labelFill, TextView labelFiszki, TextView labelLock,
      TextView labelMemory, TextView labelQuiz, TextView labelUnscramble, TextView practiceLabel1,
      TextView practiceLabel2, TextView practiceSelectTitle, TextView textView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonFiszki = buttonFiszki;
    this.buttonLuki = buttonLuki;
    this.buttonMemory = buttonMemory;
    this.buttonQuiz = buttonQuiz;
    this.buttonRiddles = buttonRiddles;
    this.buttonUnscramble = buttonUnscramble;
    this.cardView = cardView;
    this.cardView2 = cardView2;
    this.labelFill = labelFill;
    this.labelFiszki = labelFiszki;
    this.labelLock = labelLock;
    this.labelMemory = labelMemory;
    this.labelQuiz = labelQuiz;
    this.labelUnscramble = labelUnscramble;
    this.practiceLabel1 = practiceLabel1;
    this.practiceLabel2 = practiceLabel2;
    this.practiceSelectTitle = practiceSelectTitle;
    this.textView3 = textView3;
  }

  public abstract void setPracticeSelect(@Nullable PracticeSelect practiceSelect);

  @Nullable
  public PracticeSelect getPracticeSelect() {
    return mPracticeSelect;
  }

  @NonNull
  public static FragmentPracticeSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_practice_select, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPracticeSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPracticeSelectBinding>inflateInternal(inflater, R.layout.fragment_practice_select, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPracticeSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_practice_select, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPracticeSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPracticeSelectBinding>inflateInternal(inflater, R.layout.fragment_practice_select, null, false, component);
  }

  public static FragmentPracticeSelectBinding bind(@NonNull View view) {
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
  public static FragmentPracticeSelectBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPracticeSelectBinding)bind(component, view, R.layout.fragment_practice_select);
  }
}