package com.christianbahl.basekit.sample.activity;

import com.christianbahl.basekit.activity.CBActivityDelegate;

/**
 * Created by bodo on 20.04.16.
 */
public class ActivityDelegate extends CBActivityDelegate {

  @Override protected void initDelegateManager() {
    super.initDelegateManager();

    delegateManager.addDelegate(new ActivityDelegateImpl(this));
  }
}
