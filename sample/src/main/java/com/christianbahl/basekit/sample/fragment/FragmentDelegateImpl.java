package com.christianbahl.basekit.sample.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.christianbahl.basekit.common.fragment.CBIFragmentDelegate;
import com.hannesdorfmann.debugoverlay.DebugOverlay;

/**
 * Created by bodo on 20.04.16.
 */
public class FragmentDelegateImpl implements CBIFragmentDelegate {

  private static final String TAG = "FragmentDelegateImpl";

  private Context context;

  public FragmentDelegateImpl(Context context) {
    this.context = context;
  }

  @Override public void onAttach(Context context) {
    String msg = "onAttach() called with: " + "context = [" + context + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onAttach(Activity activity) {
    String msg = "onAttach() called with: " + "activity = [" + activity + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    String msg = "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    String msg = "onCreateView() called with: "
        + "inflater = ["
        + inflater
        + "], container = ["
        + container
        + "], savedInstanceState = ["
        + savedInstanceState
        + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    String msg = "onViewCreated() called with: "
        + "view = ["
        + view
        + "], savedInstanceState = ["
        + savedInstanceState
        + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    String msg =
        "onActivityCreated() called with: " + "savedInstanceState = [" + savedInstanceState + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
    String msg =
        "onViewStateRestored() called with: " + "savedInstanceState = [" + savedInstanceState + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onStart() {
    String msg = "onStart() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onResume() {
    String msg = "onResume() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onPause() {
    String msg = "onPause() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onStop() {
    String msg = "onStop() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onDestroyView() {
    String msg = "onDestroyView() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onDestroy() {
    String msg = "onDestroy() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onDetach() {
    String msg = "onDetach() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    String msg = "onSaveInstanceState() called with: " + "outState = [" + outState + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    String msg = "onConfigurationChanged() called with: " + "newConfig = [" + newConfig + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    String msg = "onActivityResult() called with: "
        + "requestCode = ["
        + requestCode
        + "], resultCode = ["
        + resultCode
        + "], data = ["
        + data
        + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }

  @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults) {
    String msg = "onRequestPermissionsResult() called with: "
        + "requestCode = ["
        + requestCode
        + "], permissions = ["
        + permissions
        + "], grantResults = ["
        + grantResults
        + "]";

    DebugOverlay.with(context).log(TAG + " - " + msg);
    Log.d(TAG, msg);
  }
}
