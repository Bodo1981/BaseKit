package com.christianbahl.basekit.sample.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import com.christianbahl.basekit.fragment.delegate.CBIFragmentDelegate;

/**
 * Created by bodo on 20.04.16.
 */
public class FragmentDelegateImpl implements CBIFragmentDelegate {

  private static final String TAG = "FragmentDelegateImpl";

  @Override public void onAttach(Context context) {
    Log.d(TAG, "onAttach() called with: " + "context = [" + context + "]");
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    Log.d(TAG, "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    Log.d(TAG, "onViewCreated() called with: "
        + "view = ["
        + view
        + "], savedInstanceState = ["
        + savedInstanceState
        + "]");
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    Log.d(TAG,
        "onActivityCreated() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
  }

  @Override public void onStart() {
    Log.d(TAG, "onStart() called with: " + "");
  }

  @Override public void onResume() {
    Log.d(TAG, "onResume() called with: " + "");
  }

  @Override public void onPause() {
    Log.d(TAG, "onPause() called with: " + "");
  }

  @Override public void onStop() {
    Log.d(TAG, "onStop() called with: " + "");
  }

  @Override public void onDestroyView() {
    Log.d(TAG, "onDestroyView() called with: " + "");
  }

  @Override public void onDestroy() {
    Log.d(TAG, "onDestroy() called with: " + "");
  }

  @Override public void onDetach() {
    Log.d(TAG, "onDetach() called with: " + "");
  }
}
