package com.aliendroid.alienads;

import static com.aliendroid.alienads.MyApplication.initSdk;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;


public class AliendroidInitialize {

    public static void SelectAdsAdmob(Activity activity, String selectAdsBackup, String idInitialize) {
        try {
            initSdk(idInitialize);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void SelectAdsGoogleAds(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsApplovinDis(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsApplovinMax(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsMopub(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsStartApp(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {
    }

    public static void SelectAdsIron(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsUnity(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }


    public static void SelectAdsFAN(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {

    }

    public static void SelectAdsAlienView(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {

    }

    public static void SelectAdsAlienMediation(Activity activity, String selectAdsBackup,String idInitialize, String idInitializeBackupAds) {

    }


}
