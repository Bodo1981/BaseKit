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

/**
 * Created by bodo on 14.04.16.
 */
public interface CBIFragmentDelegate {

  /**
   * Called from Fragment#onAttach(Context context)
   */
  void onAttach(Context context);

  /**
   * Called from Fragment#onAttach(Activity activity)
   */
  void onAttach(Activity activity);

  /**
   * Called from Fragment#onCreate(Bundle savedInstanceState)
   */
  void onCreate(Bundle savedInstanceState);

  /**
   * Called from Fragment#onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
   * savedInstanceState)
   */
  void onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState);

  /**
   * Called from Fragment#onViewCreated(View view, @Nullable Bundle savedInstanceState)
   */
  void onViewCreated(View view, @Nullable Bundle savedInstanceState);

  /**
   * Called from Fragment#onActivityCreated(Bundle savedInstanceState)
   */
  void onActivityCreated(@Nullable Bundle savedInstanceState);

  /**
   * Called from Fragment#onViewStateRestored(Bundle savedInstanceState)
   */
  void onViewStateRestored(@Nullable Bundle savedInstanceState);

  /**
   * Called from Fragment#onStart()
   */
  void onStart();

  /**
   * Called from Fragment#onResume()
   */
  void onResume();

  /**
   * Called from Fragment#onPause()
   */
  void onPause();

  /**
   * Called from Fragment#onStop()
   */
  void onStop();

  /**
   * Called from Fragment#onDestroyView()
   */
  void onDestroyView();

  /**
   * Called from Fragment#onDestroy()
   */
  void onDestroy();

  /**
   * Called from Fragment#onDetach()
   */
  void onDetach();

  /**
   * Called from Fragment#onSaveInstanceState(Bundle outState)
   */
  void onSaveInstanceState(Bundle outState);

  /**
   * Called from Fragment#onConfigurationChanged(Configuration newConfig)
   */
  void onConfigurationChanged(Configuration newConfig);

  /**
   * Called from Fragment#onActivityResult(int requestCode, int resultCode, Intent data)
   */
  void onActivityResult(int requestCode, int resultCode, Intent data);

  /**
   * Called from Fragment#onDetach(int requestCode, String[] permissions, int[] grantResults)
   */
  void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults);
}
