package com.christianbahl.basekit.activity.delegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import java.util.HashSet;

/**
 * Created by bodo on 14.04.16.
 */
public class CBActivityDelegateManager implements CBIActivityDelegate {

  private HashSet<CBIActivityDelegate> delegates = new HashSet<>();

  public CBActivityDelegateManager addDelegate(@NonNull CBIActivityDelegate delegate) {
    if (delegate == null) {
      throw new NullPointerException("CBActivityDelegate is null!");
    }

    delegates.add(delegate);

    return this;
  }

  public CBActivityDelegateManager removeDelegate(@NonNull CBIActivityDelegate delegate) {
    if (delegate == null) {
      throw new NullPointerException("CBActivityDelegate is null!");
    }

    delegates.remove(delegate);

    return this;
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onCreate(savedInstanceState);
    }
  }

  @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onCreate(savedInstanceState, persistentState);
    }
  }

  @Override public void onRestart() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onRestart();
    }
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onSaveInstanceState(outState);
    }
  }

  @Override public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onSaveInstanceState(outState, outPersistentState);
    }
  }

  @Override public void onRestoreInstanceState(Bundle savedInstanceState) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onRestoreInstanceState(savedInstanceState);
    }
  }

  @Override
  public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onRestoreInstanceState(savedInstanceState, persistentState);
    }
  }

  @Override public void onNewIntent(Intent intent) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onNewIntent(intent);
    }
  }

  @Override public void onStart() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onStart();
    }
  }

  @Override public void onResume() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onResume();
    }
  }

  @Override public void onPause() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onPause();
    }
  }

  public void onStop() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onStop();
    }
  }

  @Override public void onDestroy() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onDestroy();
    }
  }

  @Override public void onBackPressed() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onBackPressed();
    }
  }

  @Override public void onAttachedToWindow() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onAttachedToWindow();
    }
  }

  @Override public void onDetachedFromWindow() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onDetachedFromWindow();
    }
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onConfigurationChanged(newConfig);
    }
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onActivityResult(requestCode, resultCode, data);
    }
  }

  @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
      @NonNull int[] grantResults) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
  }

  @Override public void startActivity(Intent intent) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.startActivity(intent);
    }
  }

  @Override public void startActivityForResult(Intent intent, int requestCode) {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.startActivityForResult(intent, requestCode);
    }
  }

  @Override public void finish() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.finish();
    }
  }
}
