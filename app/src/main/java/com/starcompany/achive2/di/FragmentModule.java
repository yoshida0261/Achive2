package com.starcompany.achive2.di;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by takeshi on 16/10/29.
 */
@Module
public class FragmentModule {
    final Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    public Context context() {
        return fragment.getContext();
    }

    @Provides
    public FragmentManager provideFragmentManager() {
        return fragment.getFragmentManager();
    }

}
