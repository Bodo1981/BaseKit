package com.christianbahl.basekit.sample.fragment.support;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.christianbahl.basekit.sample.R;

/**
 * Created by bodo on 20.04.16.
 */
public class AppCompatActivityFragment extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_fragment_support);
  }
}
