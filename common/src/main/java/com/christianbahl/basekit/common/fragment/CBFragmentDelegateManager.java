package com.christianbahl.basekit.common.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

  @Override public void onAttach(Activity activity) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onAttach(activity);
    }
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onCreate(savedInstanceState);
    }
  }

  @Override public void onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onCreateView(inflater, container, savedInstanceState);
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

  @Override public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onViewStateRestored(savedInstanceState);
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
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onSaveInstanceState(outState);
    }
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onConfigurationChanged(newConfig);
    }
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onActivityResult(requestCode, resultCode, data);
    }
  }

  @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults) {
    for (CBIFragmentDelegate delegate : delegates) {
      delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
  }
}
