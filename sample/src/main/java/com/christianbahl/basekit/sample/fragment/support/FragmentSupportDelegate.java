package com.christianbahl.basekit.sample.fragment.support;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.christianbahl.basekit.sample.fragment.FragmentDelegateImpl;
import com.christianbahl.basekit.support.fragment.CBFragmentDelegate;
import com.christianbahl.basekit.sample.R;

/**
 * Created by bodo on 20.04.16.
 */
public class FragmentSupportDelegate extends CBFragmentDelegate {

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);

    return inflater.inflate(R.layout.fragment_delegate, container, false);
  }

  @Override protected void initDelegateManager() {
    super.initDelegateManager();

    delegateManager.addDelegate(new FragmentDelegateImpl(getActivity()));
  }
}
