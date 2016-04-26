package com.christianbahl.basekit.sample.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.christianbahl.basekit.sample.R;

/**
 * Created by bodo on 25.04.16.
 */
public class ActivityFragment extends Activity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_fragment);
  }

}
