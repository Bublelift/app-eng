package com.example.owocewarzywa;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.owocewarzywa.databinding.FragmentChatBindingImpl;
import com.example.owocewarzywa.databinding.FragmentFeedbackBindingImpl;
import com.example.owocewarzywa.databinding.FragmentFillBindingImpl;
import com.example.owocewarzywa.databinding.FragmentFlashcardBindingImpl;
import com.example.owocewarzywa.databinding.FragmentLoginBindingImpl;
import com.example.owocewarzywa.databinding.FragmentMemoBindingImpl;
import com.example.owocewarzywa.databinding.FragmentPracticeSelectBindingImpl;
import com.example.owocewarzywa.databinding.FragmentPracticeSettingsBindingImpl;
import com.example.owocewarzywa.databinding.FragmentPuzzleBindingImpl;
import com.example.owocewarzywa.databinding.FragmentQuizBindingImpl;
import com.example.owocewarzywa.databinding.FragmentRegisterBindingImpl;
import com.example.owocewarzywa.databinding.FragmentStartBindingImpl;
import com.example.owocewarzywa.databinding.FragmentUnscrambleBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCHAT = 1;

  private static final int LAYOUT_FRAGMENTFEEDBACK = 2;

  private static final int LAYOUT_FRAGMENTFILL = 3;

  private static final int LAYOUT_FRAGMENTFLASHCARD = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTMEMO = 6;

  private static final int LAYOUT_FRAGMENTPRACTICESELECT = 7;

  private static final int LAYOUT_FRAGMENTPRACTICESETTINGS = 8;

  private static final int LAYOUT_FRAGMENTPUZZLE = 9;

  private static final int LAYOUT_FRAGMENTQUIZ = 10;

  private static final int LAYOUT_FRAGMENTREGISTER = 11;

  private static final int LAYOUT_FRAGMENTSTART = 12;

  private static final int LAYOUT_FRAGMENTUNSCRAMBLE = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_feedback, LAYOUT_FRAGMENTFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_fill, LAYOUT_FRAGMENTFILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_flashcard, LAYOUT_FRAGMENTFLASHCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_memo, LAYOUT_FRAGMENTMEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_practice_select, LAYOUT_FRAGMENTPRACTICESELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_practice_settings, LAYOUT_FRAGMENTPRACTICESETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_puzzle, LAYOUT_FRAGMENTPUZZLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_quiz, LAYOUT_FRAGMENTQUIZ);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_start, LAYOUT_FRAGMENTSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.owocewarzywa.R.layout.fragment_unscramble, LAYOUT_FRAGMENTUNSCRAMBLE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCHAT: {
          if ("layout/fragment_chat_0".equals(tag)) {
            return new FragmentChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEEDBACK: {
          if ("layout/fragment_feedback_0".equals(tag)) {
            return new FragmentFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILL: {
          if ("layout/fragment_fill_0".equals(tag)) {
            return new FragmentFillBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_fill is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFLASHCARD: {
          if ("layout/fragment_flashcard_0".equals(tag)) {
            return new FragmentFlashcardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_flashcard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEMO: {
          if ("layout/fragment_memo_0".equals(tag)) {
            return new FragmentMemoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_memo is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRACTICESELECT: {
          if ("layout/fragment_practice_select_0".equals(tag)) {
            return new FragmentPracticeSelectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_practice_select is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRACTICESETTINGS: {
          if ("layout/fragment_practice_settings_0".equals(tag)) {
            return new FragmentPracticeSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_practice_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPUZZLE: {
          if ("layout/fragment_puzzle_0".equals(tag)) {
            return new FragmentPuzzleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_puzzle is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTQUIZ: {
          if ("layout/fragment_quiz_0".equals(tag)) {
            return new FragmentQuizBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_quiz is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTART: {
          if ("layout/fragment_start_0".equals(tag)) {
            return new FragmentStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUNSCRAMBLE: {
          if ("layout/fragment_unscramble_0".equals(tag)) {
            return new FragmentUnscrambleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_unscramble is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(19);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "chatFragment");
      sKeys.put(2, "feedbackFragment");
      sKeys.put(3, "fillFragment");
      sKeys.put(4, "flashcardFragment");
      sKeys.put(5, "flashcardViewModel");
      sKeys.put(6, "gameViewModel");
      sKeys.put(7, "loginFragment");
      sKeys.put(8, "maxNoOfCards");
      sKeys.put(9, "maxNoOfWords");
      sKeys.put(10, "memoFragment");
      sKeys.put(11, "practiceSelect");
      sKeys.put(12, "practiceSettingsFragment");
      sKeys.put(13, "puzzleFragment");
      sKeys.put(14, "quizFragment");
      sKeys.put(15, "registerFragment");
      sKeys.put(16, "startFragment");
      sKeys.put(17, "unscrambleFragment");
      sKeys.put(18, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/fragment_chat_0", com.example.owocewarzywa.R.layout.fragment_chat);
      sKeys.put("layout/fragment_feedback_0", com.example.owocewarzywa.R.layout.fragment_feedback);
      sKeys.put("layout/fragment_fill_0", com.example.owocewarzywa.R.layout.fragment_fill);
      sKeys.put("layout/fragment_flashcard_0", com.example.owocewarzywa.R.layout.fragment_flashcard);
      sKeys.put("layout/fragment_login_0", com.example.owocewarzywa.R.layout.fragment_login);
      sKeys.put("layout/fragment_memo_0", com.example.owocewarzywa.R.layout.fragment_memo);
      sKeys.put("layout/fragment_practice_select_0", com.example.owocewarzywa.R.layout.fragment_practice_select);
      sKeys.put("layout/fragment_practice_settings_0", com.example.owocewarzywa.R.layout.fragment_practice_settings);
      sKeys.put("layout/fragment_puzzle_0", com.example.owocewarzywa.R.layout.fragment_puzzle);
      sKeys.put("layout/fragment_quiz_0", com.example.owocewarzywa.R.layout.fragment_quiz);
      sKeys.put("layout/fragment_register_0", com.example.owocewarzywa.R.layout.fragment_register);
      sKeys.put("layout/fragment_start_0", com.example.owocewarzywa.R.layout.fragment_start);
      sKeys.put("layout/fragment_unscramble_0", com.example.owocewarzywa.R.layout.fragment_unscramble);
    }
  }
}
