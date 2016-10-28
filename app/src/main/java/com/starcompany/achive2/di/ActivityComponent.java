package com.starcompany.achive2.di;

import com.starcompany.achive2.activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by takeshi on 16/10/29.
 */
//@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
    FragmentComponent plus(FragmentModule module);

}
