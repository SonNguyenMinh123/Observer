package com.test.observer;

import com.test.observer.Callbacks.AdsListener;

import java.util.ArrayList;

public class AdsObserver {
    private static ArrayList<AdsListener> mAdsListeners = new ArrayList<>();

    public static void add(AdsListener adsListener) {
        if (!mAdsListeners.contains(adsListener)) {
            mAdsListeners.add(adsListener);
        }
    }

    public static void remove(AdsListener adsListener) {
        if (mAdsListeners.contains(adsListener)) {
            mAdsListeners.remove(adsListener);
        }
    }

    // Show Ads Facebook
    public static void showAds() {
        for (AdsListener a : mAdsListeners) {
            a.showAds();
        }
    }

    // Remove Ads Facebook
    public static void goneAds() {
        for (AdsListener a : mAdsListeners) {
            a.goneAds();
        }
    }

    // Clear khi back ra vao lai
    public static void clearAll() {
        mAdsListeners.clear();
    }

}
