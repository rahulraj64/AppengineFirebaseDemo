package com.example.appenginefirebasedemo;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * Created by rahul on 4/3/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
