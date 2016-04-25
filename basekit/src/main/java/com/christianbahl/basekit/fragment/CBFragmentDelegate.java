package com.christianbahl.basekit.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

  @Override public void onAttach(Activity activity) {
    super.onAttach(activity);

    delegateManager.onAttach(activity);
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    delegateManager.onCreate(savedInstanceState);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    delegateManager.onCreateView(inflater, container, savedInstanceState);

    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    delegateManager.onViewCreated(view, savedInstanceState);
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    delegateManager.onActivityCreated(savedInstanceState);
  }

  @Override public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);

    delegateManager.onViewStateRestored(savedInstanceState);
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

  @Override public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

    delegateManager.onSaveInstanceState(outState);
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);

    delegateManager.onConfigurationChanged(newConfig);
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    delegateManager.onActivityResult(requestCode, resultCode, data);
  }

  @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    delegateManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
  }
}
