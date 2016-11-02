package com.starcompany.achive2;

import android.app.Application;
import android.support.annotation.NonNull;
//import com.starcompany.achive2.di.DaggerAppComponent;
import com.starcompany.achive2.di.AppComponent;
import com.starcompany.achive2.di.AppModule;
import com.starcompany.achive2.util.LocaleUtil;

/**
 * Created by takeshi on 16/10/29.
 */
public class MainApplication extends Application{
    AppComponent appComponent;

    @NonNull
    public AppComponent getComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

/*
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
*/
        //Fabric.with(this, new Crashlytics());

       // new StethoWrapper(this).setup();

      //  AndroidThreeTen.init(this);
        //LocaleUtil.initLocale(this);
    }

}
