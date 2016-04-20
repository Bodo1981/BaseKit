package com.christianbahl.basekit.activity.delegate;

import android.content.Intent;
import android.os.Bundle;

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
   * Called from Activity#onRestart()
   */
  void onRestart();

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
   * Called from Activity#onBackPressed()
   */
  void onBackPressed();

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
