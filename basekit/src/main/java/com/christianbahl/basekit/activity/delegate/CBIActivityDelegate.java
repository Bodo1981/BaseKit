package com.christianbahl.basekit.activity.delegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;

/**
 * Created by bodo on 14.04.16.
 */
public interface CBIActivityDelegate {

  /**
   * Called from Activity#onCreate(Bundle savedInstanceState)
   *
   * @param savedInstanceState saved instance state
   */
  void onCreate(Bundle savedInstanceState);

  /**
   * Called from Activity#onCreate(Bundle savedInstanceState, PersistableBundle persistentState)
   *
   * @param savedInstanceState saved instance state
   * @param persistentState persistent state
   */
  void onCreate(Bundle savedInstanceState, PersistableBundle persistentState);

  /**
   * Called from Activity#onStart()
   */
  void onStart();

  /**
   * Called from Activity#onResume()
   */
  void onResume();

  /**
   * Called from Activity#onPause()
   */
  void onPause();

  /**
   * Called from Activity#onStop()
   */
  void onStop();

  /**
   * Called from Activity#onDestroy()
   */
  void onDestroy();

  /**
   * Called from Activity#onRestart()
   */
  void onRestart();

  /**
   * Called from Activity#onSaveInstanceState(Bundle outState)
   *
   * @param outState out state
   */
  void onSaveInstanceState(Bundle outState);

  /**
   * Called from Activity#onSaveInstanceState(Bundle outState, PersistableBundle
   * outPersistentState)
   *
   * @param outState out state
   * @param outPersistentState out persistent state
   */
  void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState);

  /**
   * Called from Activity#onRestoreInstanceState(Bundle savedInstanceState)
   *
   * @param savedInstanceState saved instance state
   */
  void onRestoreInstanceState(Bundle savedInstanceState);

  /**
   * Called form Activity#onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle
   * persistentState)
   *
   * @param savedInstanceState saved instance state
   * @param persistentState persistent state
   */
  void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState);

  /**
   * Called from Activity#onNewIntent(Intent intent)
   *
   * @param intent intent
   */
  void onNewIntent(Intent intent);

  /**
   * Called from Activity#onBackPressed()
   */
  void onBackPressed();

  /**
   * Called from Activity#onAttachedToWindow()
   */
  void onAttachedToWindow();

  /**
   * Called from Activity#onDetachedFromWindow()
   */
  void onDetachedFromWindow();

  /**
   * Called from Activity#onConfigurationChanged(Configuration newConfig)
   *
   * @param newConfig new config
   */
  void onConfigurationChanged(Configuration newConfig);

  /**
   * Called from Activity#onActivityResult(int requestCode, int resultCode, Intent data)
   *
   * @param requestCode request code
   * @param resultCode result code
   * @param data data
   */
  void onActivityResult(int requestCode, int resultCode, Intent data);

  /**
   * Called from Activity#onRequestPermissionsResult(int requestCode, String[] permissions, int[]
   * grantResults)
   *
   * @param requestCode request code
   * @param permissions permissions
   * @param grantResults grant results
   */
  void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults);

  /**
   * Called from Activity#startActivity(Intent intent)
   *
   * @param intent intent
   */
  void startActivity(Intent intent);

  /**
   * Called from Activity#startActivityForResult(Intent intent, int requestCode)
   *
   * @param intent intent
   * @param requestCode request code
   */
  void startActivityForResult(Intent intent, int requestCode);

  /**
   * Called from Activity#finish()
   */
  void finish();
}
