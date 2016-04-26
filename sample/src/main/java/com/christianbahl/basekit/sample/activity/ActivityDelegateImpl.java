package com.christianbahl.basekit.sample.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.util.Log;
import com.christianbahl.basekit.common.activity.CBIActivityDelegate;
import com.hannesdorfmann.debugoverlay.DebugOverlay;

/**
 * Created by bodo on 20.04.16.
 */
public class ActivityDelegateImpl implements CBIActivityDelegate {

  private static final String TAG = "ActivityDelegateImpl";

  private Context context;

  public ActivityDelegateImpl(Context context) {
    this.context = context;
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    String msg = "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    String msg = "onCreate() called with: "
        + "savedInstanceState = ["
        + savedInstanceState
        + "], persistentState = ["
        + persistentState
        + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onRestart() {
    String msg = "onRestart() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    String msg = "onSaveInstanceState() called with: " + "outState = [" + outState + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    String msg = "onSaveInstanceState() called with: "
        + "outState = ["
        + outState
        + "], outPersistentState = ["
        + outPersistentState
        + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onRestoreInstanceState(Bundle savedInstanceState) {
    String msg = "onRestoreInstanceState() called with: "
        + "savedInstanceState = ["
        + savedInstanceState
        + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override
  public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
    String msg = "onRestoreInstanceState() called with: "
        + "savedInstanceState = ["
        + savedInstanceState
        + "], persistentState = ["
        + persistentState
        + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onNewIntent(Intent intent) {
    String msg = "onNewIntent() called with: " + "intent = [" + intent + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onStart() {
    String msg = "onStart() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onResume() {
    String msg = "onResume() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onPause() {
    String msg = "onPause() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onStop() {
    String msg = "onStop() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onDestroy() {
    String msg = "onDestroy() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onBackPressed() {
    String msg = "onBackPressed() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onAttachedToWindow() {
    String msg = "onAttachedToWindow() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onDetachedFromWindow() {
    String msg = "onDetachedFromWindow() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    String msg = "onConfigurationChanged() called with: " + "newConfig = [" + newConfig + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
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

    DebugOverlay.with(context).log(TAG + " - "  + msg);
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

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void startActivity(Intent intent) {
    String msg = "startActivity() called with: " + "intent = [" + intent + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void startActivityForResult(Intent intent, int requestCode) {
    String msg = "startActivityForResult() called with: "
        + "intent = ["
        + intent
        + "], requestCode = ["
        + requestCode
        + "]";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }

  @Override public void finish() {
    String msg = "finish() called with: " + "";

    DebugOverlay.with(context).log(TAG + " - "  + msg);
    Log.d(TAG, msg);
  }
}
