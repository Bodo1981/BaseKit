package com.christianbahl.basekit.activity.delegate;

import android.content.Intent;
import android.os.Bundle;
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

  @Override public void onRestart() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onRestart();
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

    // cleanup
    delegates.clear();
    delegates = null;
  }

  @Override public void onBackPressed() {
    for (CBIActivityDelegate delegate : delegates) {
      delegate.onBackPressed();
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
