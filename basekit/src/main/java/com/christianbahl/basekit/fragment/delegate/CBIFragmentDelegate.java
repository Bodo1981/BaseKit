package com.christianbahl.basekit.fragment.delegate;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by bodo on 14.04.16.
 */
public interface CBIFragmentDelegate {

  /**
   * Called from Fragment#onAttach()
   */
  void onAttach(Context context);

  /**
   * Called from Fragment#onCreate(Bundle savedInstanceState)
   */
  void onCreate(@Nullable Bundle savedInstanceState);

  /**
   * Called from Fragment#onViewCreated(View view, @Nullable Bundle savedInstanceState)
   */
  void onViewCreated(View view, @Nullable Bundle savedInstanceState);

  /**
   * Called from Fragment#onActivityCreated(Bundle savedInstanceState)
   */
  void onActivityCreated(@Nullable Bundle savedInstanceState);

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
}
