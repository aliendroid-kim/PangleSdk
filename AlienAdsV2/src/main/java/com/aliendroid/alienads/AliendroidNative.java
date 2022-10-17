package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesStartApp;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesStartApp;
import com.bumptech.glide.Glide;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

import java.util.ArrayList;
import java.util.List;

public class AliendroidNative {

    public static OnLoadSmallNativesAdmob onLoadSmallNativesAdmob;
    public static OnLoadSmallNativesApplovinMax onLoadSmallNativesApplovinMax;
    public static OnLoadSmallNativesFacebook onLoadSmallNativesFacebook;
    public static OnLoadSmallNativesStartApp onLoadSmallNativesStartApp;
    public static OnLoadSmallNativesAlien onLoadSmallNativesAlien;

    public static OnLoadMediumNativesAdmob onLoadMediumNativesAdmob;
    public static OnLoadMediumNativesApplovinMax onLoadMediumNativesApplovinMax;
    public static OnLoadMediumNativesFacebook onLoadMediumNativesFacebook;
    public static OnLoadMediumNativesStartApp onLoadMediumNativesStartApp;
    public static OnLoadMediumNativesAlien onLoadMediumNativesAlien;

    public static void SmallNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        PAGNativeRequest request = new PAGNativeRequest();
        PAGNativeAd.loadAd(nativeId, request, new PAGNativeAdLoadListener() {
            @Override
            public void onError(int code, String message) {

            }

            @Override
            public void onAdLoaded(PAGNativeAd pagNativeAd) {
                PAGNativeAdData adData = pagNativeAd != null ? pagNativeAd.getNativeAdData() : null;
                View nativeAdView = LayoutInflater.from(activity).inflate(R.layout.pangle_small_native, null);
                TextView mTitle = (TextView) nativeAdView.findViewById(R.id.ad_title);
                TextView mDescription = (TextView) nativeAdView.findViewById(R.id.ad_desc);
                ImageView mIcon = (ImageView) nativeAdView.findViewById(R.id.ad_icon);
                Button mCreativeButton = (Button) nativeAdView.findViewById(R.id.creative_btn);
                mTitle.setText(adData.getTitle());
                mDescription.setText(adData.getDescription());
                PAGImageItem icon = adData.getIcon();
                if (icon != null && icon.getImageUrl() != null) {
                    Glide.with(activity).load(icon.getImageUrl()).into(mIcon);
                }
                mCreativeButton.setText(TextUtils.isEmpty(adData.getButtonText()) ? activity.getString(R.string.tt_native_banner_download) : adData.getButtonText());

                List<View> creativeViewList = new ArrayList<>();
                creativeViewList.add(mCreativeButton);
                creativeViewList.add(mIcon);
                creativeViewList.add(mTitle);

                pagNativeAd.registerViewForInteraction((ViewGroup) nativeAdView, null, creativeViewList, layNative, new PAGNativeAdInteractionListener() {
                    @Override
                    public void onAdShowed() {

                    }

                    @Override
                    public void onAdClicked() {

                    }

                    @Override
                    public void onAdDismissed() {

                    }
                });
                layNative.addView(nativeAdView);
            }
        });

    }

    public static void SmallNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void SmallNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void SmallNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void MediumNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        PAGNativeRequest request = new PAGNativeRequest();
        PAGNativeAd.loadAd(nativeId, request, new PAGNativeAdLoadListener() {
            @Override
            public void onError(int code, String message) {

            }

            @Override
            public void onAdLoaded(PAGNativeAd pagNativeAd) {
                PAGNativeAdData adData = pagNativeAd != null ? pagNativeAd.getNativeAdData() : null;
                View nativeAdView = LayoutInflater.from(activity).inflate(R.layout.pangle_big_native, null);
                TextView mTitle = (TextView) nativeAdView.findViewById(R.id.ad_title);
                TextView mDescription = (TextView) nativeAdView.findViewById(R.id.ad_desc);
                ImageView mIcon = (ImageView) nativeAdView.findViewById(R.id.ad_icon);
                Button mCreativeButton = (Button) nativeAdView.findViewById(R.id.creative_btn);
                mTitle.setText(adData.getTitle());
                mDescription.setText(adData.getDescription());
                PAGImageItem icon = adData.getIcon();
                if (icon != null && icon.getImageUrl() != null) {
                    Glide.with(activity).load(icon.getImageUrl()).into(mIcon);
                }
                mCreativeButton.setText(TextUtils.isEmpty(adData.getButtonText()) ? activity.getString(R.string.tt_native_banner_download) : adData.getButtonText());

                List<View> creativeViewList = new ArrayList<>();
                creativeViewList.add(mCreativeButton);
                creativeViewList.add(mIcon);
                creativeViewList.add(mTitle);

                pagNativeAd.registerViewForInteraction((ViewGroup) nativeAdView, null, creativeViewList, layNative, new PAGNativeAdInteractionListener() {
                    @Override
                    public void onAdShowed() {

                    }

                    @Override
                    public void onAdClicked() {

                    }

                    @Override
                    public void onAdDismissed() {

                    }
                });
                layNative.addView(nativeAdView);
            }
        });
    }

    public static void MediumNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void MediumNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


}
