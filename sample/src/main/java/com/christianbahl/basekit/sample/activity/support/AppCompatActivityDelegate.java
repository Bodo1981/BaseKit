package com.christianbahl.basekit.sample.activity.support;

import com.christianbahl.basekit.sample.activity.ActivityDelegateImpl;
import com.christianbahl.basekit.support.activity.CBAppCompatActivityDelegate;

/**
 * Created by bodo on 20.04.16.
 */
public class AppCompatActivityDelegate extends CBAppCompatActivityDelegate {

  @Override protected void initDelegateManager() {
    super.initDelegateManager();

    delegateManager.addDelegate(new ActivityDelegateImpl(this));
  }
}
