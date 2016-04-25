package com.christianbahl.basekit.sample.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
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

  @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Log.d(TAG, "onCreate() called with: "
        + "savedInstanceState = ["
        + savedInstanceState
        + "], persistentState = ["
        + persistentState
        + "]");
  }

  @Override public void onRestart() {
    Log.d(TAG, "onRestart() called with: " + "");
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    Log.d(TAG, "onSaveInstanceState() called with: " + "outState = [" + outState + "]");
  }

  @Override public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    Log.d(TAG, "onSaveInstanceState() called with: "
        + "outState = ["
        + outState
        + "], outPersistentState = ["
        + outPersistentState
        + "]");
  }

  @Override public void onRestoreInstanceState(Bundle savedInstanceState) {
    Log.d(TAG, "onRestoreInstanceState() called with: "
        + "savedInstanceState = ["
        + savedInstanceState
        + "]");
  }

  @Override
  public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
    Log.d(TAG, "onRestoreInstanceState() called with: "
        + "savedInstanceState = ["
        + savedInstanceState
        + "], persistentState = ["
        + persistentState
        + "]");
  }

  @Override public void onNewIntent(Intent intent) {
    Log.d(TAG, "onNewIntent() called with: " + "intent = [" + intent + "]");
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

  @Override public void onAttachedToWindow() {
    Log.d(TAG, "onAttachedToWindow() called with: " + "");
  }

  @Override public void onDetachedFromWindow() {
    Log.d(TAG, "onDetachedFromWindow() called with: " + "");
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    Log.d(TAG, "onConfigurationChanged() called with: " + "newConfig = [" + newConfig + "]");
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    Log.d(TAG, "onActivityResult() called with: "
        + "requestCode = ["
        + requestCode
        + "], resultCode = ["
        + resultCode
        + "], data = ["
        + data
        + "]");
  }

  @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults) {
    Log.d(TAG, "onRequestPermissionsResult() called with: "
        + "requestCode = ["
        + requestCode
        + "], permissions = ["
        + permissions
        + "], grantResults = ["
        + grantResults
        + "]");
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
