package com.starcompany.achive2.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;

import com.starcompany.achive2.activity.BaseActivity;
import com.starcompany.achive2.di.FragmentComponent;
import com.starcompany.achive2.di.FragmentModule;

/**
 * Created by takeshi on 16/10/29.
 */
public abstract class BaseFragment extends Fragment {
    private FragmentComponent fragmentComponent;

    @NonNull
    public FragmentComponent getComponent() {
        if (fragmentComponent != null) {
            return fragmentComponent;
        }

        Activity activity = getActivity();
        if (!(activity instanceof BaseActivity)) {
            throw new IllegalStateException(
                    "The activity of this fragment is not an instance of BaseActivity");
        }
        fragmentComponent = ((BaseActivity) activity).getComponent()
                .plus(new FragmentModule(this));
        return fragmentComponent;
    }

}
