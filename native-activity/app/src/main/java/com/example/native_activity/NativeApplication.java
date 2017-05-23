package com.example.native_activity;

import android.app.Application;

public class NativeApplication extends Application {

    static {
        System.loadLibrary("native-activity");
    }
}