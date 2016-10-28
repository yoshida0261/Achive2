package com.starcompany.achive2.di;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import dagger.Module;
import dagger.Provides;

/**
 * Created by takeshi on 16/10/29.
 */
@Module
public class ActivityModule {
    final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    public Activity activity() {
        return activity;
    }

    @Provides
    public Context context() {
        return activity;
    }

    @Provides
    LayoutInflater layoutInflater() {
        return activity.getLayoutInflater();
    }

}
