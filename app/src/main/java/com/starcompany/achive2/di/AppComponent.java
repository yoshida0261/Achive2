package com.starcompany.achive2.di;

import com.starcompany.achive2.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by takeshi on 16/10/29.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    //void inject(StethoWrapper stethoDelegator);

    void inject(MainActivity stethoDelegator);

    ActivityComponent plus(ActivityModule module);

}
