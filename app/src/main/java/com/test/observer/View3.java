package com.test.observer;

import android.util.Log;

import com.test.observer.Callbacks.AdsListener;

public class View3 implements AdsListener {

    private static final String TAG = View3.class.getName();

    View3() {
        AdsObserver.add(this);
    }

    @Override
    public void showAds() {
        Log.d(TAG, "show ads view 3");
    }

    @Override
    public void goneAds() {
        Log.d(TAG, "gone ads view 3");
    }

    public void onDestroy() {
        AdsObserver.remove(this);
    }
}
