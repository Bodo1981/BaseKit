package com.christianbahl.basekit.sample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.christianbahl.basekit.activity.delegate.CBIActivityDelegate;

/**
 * Created by bodo on 20.04.16.
 */
public class ActivityDelegateImpl implements CBIActivityDelegate {

  private static final String TAG = "ActivityDelegateImpl";

  @Override public void onCreate(Bundle savedInstanceState) {
    Log.d(TAG, "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
  }

  @Override public void onRestart() {
    Log.d(TAG, "onRestart() called with: " + "");
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

  @Override public void onDestroy() {
    Log.d(TAG, "onDestroy() called with: " + "");
  }

  @Override public void onBackPressed() {
    Log.d(TAG, "onBackPressed() called with: " + "");
  }

  @Override public void startActivity(Intent intent) {
    Log.d(TAG, "startActivity() called with: " + "intent = [" + intent + "]");
  }

  @Override public void startActivityForResult(Intent intent, int requestCode) {
    Log.d(TAG, "startActivityForResult() called with: "
        + "intent = ["
        + intent
        + "], requestCode = ["
        + requestCode
        + "]");
  }

  @Override public void finish() {
    Log.d(TAG, "finish() called with: " + "");
  }
}
