package com.christianbahl.basekit.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.christianbahl.basekit.sample.activity.ActivityDelegate;
import com.christianbahl.basekit.sample.activity.support.AppCompatActivityDelegate;
import com.christianbahl.basekit.sample.fragment.ActivityFragment;
import com.christianbahl.basekit.sample.fragment.support.AppCompatActivityFragment;

/**
 * Created by bodo on 14.04.16.
 */
public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);
  }

  @Override public void onContentChanged() {
    super.onContentChanged();

    findViewById(R.id.button_activity).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ActivityDelegate.class));
      }
    });

    findViewById(R.id.button_fragment).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ActivityFragment.class));
      }
    });

    findViewById(R.id.button_app_compat_activity).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, AppCompatActivityDelegate.class));
      }
    });

    findViewById(R.id.button_fragment_support).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, AppCompatActivityFragment.class));
      }
    });
  }
}
