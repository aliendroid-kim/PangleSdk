package com.aliendroid.alienads;

import static android.content.ContentValues.TAG;

import android.app.Application;
import android.util.Log;

import com.aliendroid.sdkads.config.InitializeAlienAds;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;


public class MyApplication extends Application {
    private static AlienOpenAds alienOpenAds;
    private static InitializeAlienAds sdkads;
    private static AdManagerHolder adManagerHolder;
    private static AlienNotif notif;
    //Uranus
    @Override
    public void onCreate() {
        super.onCreate();

        new FlurryAgent.Builder()
                .withDataSaleOptOut(false)
                .withCaptureUncaughtExceptions(true)
                .withIncludeBackgroundSessionsInMetrics(true)
                .withLogLevel(Log.VERBOSE)
                .withPerformanceMetrics(FlurryPerformance.ALL)
                .build(this,"W35KQ7HGRYQGT3Q9NDSH");

        sdkads = new InitializeAlienAds(this);
        alienOpenAds = new AlienOpenAds(this);
        adManagerHolder = new AdManagerHolder(this);

        try {
            PAGSdk.addPAGInitCallback(new PAGSdk.PAGInitCallback() {
                @Override
                public void success() {
                    Log.i(TAG, "PAGInitCallback success: addPAGInitCallback");
                }

                @Override
                public void fail(int code, String msg) {
                    Log.i(TAG, "PAGInitCallback fail: addPAGInitCallback");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        notif = new AlienNotif(this);


    }

    public static void initSdk(String appid){
        AdManagerHolder.doInitNewApi(appid);
    }

}