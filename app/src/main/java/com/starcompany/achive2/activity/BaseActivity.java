package com.starcompany.achive2.activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.starcompany.achive2.MainApplication;
import com.starcompany.achive2.di.ActivityComponent;
import com.starcompany.achive2.di.ActivityModule;

/**
 * Created by takeshi on 16/10/29.
 */
public abstract class BaseActivity extends AppCompatActivity{
    private ActivityComponent activityComponent;

    @NonNull
    public ActivityComponent getComponent() {
        if (activityComponent == null) {
            MainApplication mainApplication = (MainApplication) getApplication();
            activityComponent = mainApplication.getComponent().plus(new ActivityModule(this));
        }
        return activityComponent;
    }
}
