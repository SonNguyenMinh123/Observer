package com.test.observer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// su dung trong các truong hop update data o nhieu noi.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View1 view1 = new View1();
        View2 view2 = new View2();
        View3 view3 = new View3();

        AdsObserver.showAds();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AdsObserver.goneAds();
            }
        }, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AdsObserver.clearAll();
    }
}
