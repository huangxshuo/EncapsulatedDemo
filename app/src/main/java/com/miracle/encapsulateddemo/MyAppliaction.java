package com.miracle.encapsulateddemo;

import android.app.Application;

import com.miracle.encapsulateddemo.imageloader.ImageLoaderManager;

/**
 * Created by miracle on 2017/7/16.
 */

public class MyAppliaction extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		ImageLoaderManager.getInstance().init(this);
	}
}
