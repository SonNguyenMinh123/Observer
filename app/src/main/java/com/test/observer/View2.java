package com.test.observer;

import android.util.Log;

import com.test.observer.Callbacks.AdsListener;

public class View2 implements AdsListener {

    private static final String TAG = View2.class.getName();

    View2() {
        AdsObserver.add(this);
    }

    @Override
    public void showAds() {
        Log.d(TAG, "show ads view 2");
    }

    @Override
    public void goneAds() {
        Log.d(TAG, "gone ads view 2");
    }

    public void onDestroy() {
        AdsObserver.remove(this);
    }
}
