package com.christianbahl.basekit.support.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import com.christianbahl.basekit.common.activity.CBActivityDelegateManager;

/**
 * Created by bodo on 14.04.16.
 */
public class CBAppCompatActivityDelegate extends AppCompatActivity {

  protected CBActivityDelegateManager delegateManager = new CBActivityDelegateManager();

  /**
   * <p>Initialize CBActivityDelegateManager. Add or remove delegates</p>
   */
  protected void initDelegateManager() {

  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    initDelegateManager();

    delegateManager.onCreate(savedInstanceState);
  }

  @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);

    delegateManager.onCreate(savedInstanceState, persistentState);
  }

  @Override protected void onStart() {
    super.onStart();

    delegateManager.onStart();
  }

  @Override protected void onResume() {
    super.onResume();

    delegateManager.onResume();
  }

  @Override protected void onPause() {
    super.onPause();

    delegateManager.onPause();
  }

  @Override protected void onStop() {
    super.onStop();

    delegateManager.onStop();
  }

  @Override protected void onDestroy() {
    super.onDestroy();

    delegateManager.onDestroy();
  }

  @Override protected void onRestart() {
    super.onRestart();

    delegateManager.onRestart();
  }

  @Override protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

    delegateManager.onSaveInstanceState(outState);
  }

  @Override public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    super.onSaveInstanceState(outState, outPersistentState);

    delegateManager.onSaveInstanceState(outState, outPersistentState);
  }

  @Override protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);

    delegateManager.onRestoreInstanceState(savedInstanceState);
  }

  @Override
  public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
    super.onRestoreInstanceState(savedInstanceState, persistentState);

    delegateManager.onRestoreInstanceState(savedInstanceState, persistentState);
  }

  @Override protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);

    delegateManager.onNewIntent(intent);
  }

  @Override public void onBackPressed() {
    super.onBackPressed();

    delegateManager.onBackPressed();
  }

  @Override public void onAttachedToWindow() {
    super.onAttachedToWindow();

    delegateManager.onAttachedToWindow();
  }

  @Override public void onDetachedFromWindow() {
    super.onDetachedFromWindow();

    delegateManager.onDetachedFromWindow();
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);

    delegateManager.onConfigurationChanged(newConfig);
  }

  @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    delegateManager.onActivityResult(requestCode, resultCode, data);
  }

  @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    delegateManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
  }

  @Override public void startActivity(Intent intent) {
    super.startActivity(intent);

    delegateManager.startActivity(intent);
  }

  @Override public void startActivityForResult(Intent intent, int requestCode) {
    super.startActivityForResult(intent, requestCode);

    delegateManager.startActivityForResult(intent, requestCode);
  }

  @Override public void finish() {
    super.finish();

    delegateManager.finish();
  }
}
