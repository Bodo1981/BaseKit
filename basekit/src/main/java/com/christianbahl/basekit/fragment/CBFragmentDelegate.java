package com.christianbahl.basekit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import com.christianbahl.basekit.fragment.delegate.CBFragmentDelegateManager;

/**
 * Created by bodo on 14.04.16.
 */
public class CBFragmentDelegate extends Fragment {

  protected CBFragmentDelegateManager delegateManager = new CBFragmentDelegateManager();

  /**
   * <p>Initialize CBFragmentDelegateManager. Add or remove delegates</p>
   */
  protected void initDelegateManager() {

  }

  @Override public void onAttach(Context context) {
    super.onAttach(context);

    initDelegateManager();

    delegateManager.onAttach(context);
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    delegateManager.onCreate(savedInstanceState);
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    delegateManager.onViewCreated(view, savedInstanceState);
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    delegateManager.onActivityCreated(savedInstanceState);
  }

  @Override public void onStart() {
    super.onStart();

    delegateManager.onStart();
  }

  @Override public void onResume() {
    super.onResume();

    delegateManager.onResume();
  }

  @Override public void onPause() {
    super.onPause();

    delegateManager.onPause();
  }

  @Override public void onStop() {
    super.onStop();

    delegateManager.onStop();
  }

  @Override public void onDestroyView() {
    super.onDestroyView();

    delegateManager.onDestroyView();
  }

  @Override public void onDestroy() {
    super.onDestroy();

    delegateManager.onDestroy();
  }

  @Override public void onDetach() {
    super.onDetach();

    delegateManager.onDetach();
  }
}
