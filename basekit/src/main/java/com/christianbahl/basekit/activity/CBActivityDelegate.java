package com.christianbahl.basekit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.christianbahl.basekit.activity.delegate.CBActivityDelegateManager;

/**
 * Created by bodo on 14.04.16.
 */
public class CBActivityDelegate extends AppCompatActivity {

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

  @Override protected void onRestart() {
    super.onRestart();

    delegateManager.onRestart();
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

  @Override public void onBackPressed() {
    super.onBackPressed();

    delegateManager.onBackPressed();
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
