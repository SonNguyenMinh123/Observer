package com.test.observer;

import android.util.Log;

import com.test.observer.Callbacks.AdsListener;

public class View1 implements AdsListener {

    private static final String TAG = View1.class.getName();

    public View1() {
        AdsObserver.add(this);
    }

    @Override
    public void showAds() {
        Log.d(TAG, "show ads view 1");
        // addView(this);
        // show qc
    }

    @Override
    public void goneAds() {
        Log.d(TAG, "gone ads view 1");
        // gone qc
    }

    public void onDestroy() {
        AdsObserver.remove(this);
    }

}
