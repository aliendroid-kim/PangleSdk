package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsAdmob;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsAlienView;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsApplovinDiscovery;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsApplovinMax;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsGoogle;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsIronSource;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsStartApp;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAdmob;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAlienMedition;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAlienView;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsApplovinDiscovery;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsGoogle;
import com.aliendroid.sdkads.interfaces.OnLoadRewardsMediation;
import com.aliendroid.sdkads.interfaces.OnLoadRewardsView;
import com.aliendroid.sdkads.interfaces.OnShowInterstitialView;
import com.aliendroid.sdkads.interfaces.OnShowRewards;
import com.aliendroid.sdkads.interfaces.OnShowRewardsView;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;


import java.util.Map;

public class AliendroidReward {
    public static boolean unlockreward = false;

    public static PAGRewardedAd rewardedAdPangle;
    public static OnLoadRewardsAdmob onLoadRewardsAdmob;
    public static OnLoadRewardsStartApp onLoadRewardsStartApp;
    public static OnLoadRewardsGoogle onLoadRewardsGoogle;
    public static OnLoadRewardsApplovinDiscovery onLoadRewardsApplovinDiscovery;
    public static OnLoadRewardsApplovinMax onLoadRewardsApplovinMax;
    public static OnLoadRewardsIronSource onLoadRewardsIronSource;
    public static OnLoadRewardsMediation onLoadRewardsMediation;
    public static OnLoadRewardsAlienView onLoadRewardsAlienView;

    public static OnShowRewardsAdmob onShowRewardsAdmob;
    public static OnShowRewardsGoogle onShowRewardsGoogle;
    public static OnShowRewardsApplovinDiscovery onShowRewardsApplovinDiscovery;
    public static OnShowRewardsAlienMedition onShowRewardsAlienMedition;
    public static OnShowRewardsAlienView onShowRewardsAlienView;

    public static boolean SHOW_ALIEN_VIEW=false;
    public static void LoadRewardAdmob(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

        try {
            PAGRewardedAd.loadAd(idReward,
                    new PAGRewardedRequest(),
                    new PAGRewardedAdLoadListener() {
                        @Override
                        public void onError(int code, String message) {
                        }

                        @Override
                        public void onAdLoaded(PAGRewardedAd rewardedAd) {
                            rewardedAdPangle =  rewardedAd;
                        }
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void LoadRewardAlienMediation(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardAlienView(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardUnity(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardGoogleAds(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }


    public static void LoadRewardApplovinMax(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardApplovinDis(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardMopub(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardStartApp(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }


    public static void ShowRewardAdmob(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        if (rewardedAdPangle != null) {

            rewardedAdPangle.show(activity);
            rewardedAdPangle.setAdInteractionListener(new PAGRewardedAdInteractionListener(){

                @Override
                public void onAdShowed() {

                }

                @Override
                public void onAdClicked() {

                }

                @Override
                public void onAdDismissed() {

                }

                @Override
                public void onUserEarnedReward(PAGRewardItem item) {
                    unlockreward = true;
                }

                @Override
                public void onUserEarnedRewardFail(int errorCode, String errorMsg) {

                }
            });
        }

        LoadRewardAdmob(activity, selecBackuptAds, idReward, idBackupReward);
    }

    public static void ShowRewardGoogleAds(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardApplovinMax(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardApplovinDis(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardMopub(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardUnity(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardStartApp(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardAlienView(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardAlienMediation(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }
}
