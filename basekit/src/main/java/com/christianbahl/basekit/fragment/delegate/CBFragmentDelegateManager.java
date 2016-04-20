package com.christianbahl.basekit.fragment.delegate;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import java.util.HashSet;

/**
 * Created by bodo on 14.04.16.
 */
public class CBFragmentDelegateManager implements CBIFragmentDelegate {

  private HashSet<CBIFragmentDelegate> delegates = new HashSet<>();

  public CBFragmentDelegateManager addDelegate(@NonNull CBIFragmentDelegate delegate) {
    if (delegate == null) {
      throw new NullPointerException("CBIFragmentDelegate is null!");
    }

    delegates.add(delegate);

    return this;
  }

  public CBFragmentDelegateManager removeDelegate(@NonNull CBIFragmentDelegate delegate) {
    if (delegate == null) {
      throw new NullPointerException("CBIFragmentDelegate is null!");
    }

    delegates.remove(delegate);

    return this;
  }

  @Override public void onAttach(Context context) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onAttach(context);
    }
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onCreate(savedInstanceState);
    }
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onViewCreated(view, savedInstanceState);
    }
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onActivityCreated(savedInstanceState);
    }
  }

  @Override public void onStart() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onStart();
    }
  }

  @Override public void onResume() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onResume();
    }
  }

  @Override public void onPause() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onPause();
    }
  }

  @Override public void onStop() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onStop();
    }
  }

  @Override public void onDestroyView() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onDestroyView();
    }
  }

  @Override public void onDestroy() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onDestroy();
    }
  }

  @Override public void onDetach() {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onDetach();
    }

    // cleanup
    delegates.clear();
    delegates = null;
  }
}
