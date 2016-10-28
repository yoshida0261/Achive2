package com.starcompany.achive2.util;

import android.content.Context;

import com.starcompany.achive2.BuildConfig;

import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by takeshi on 16/10/29.
 */
public class LocaleUtil {
    public static final String LANG_EN_ID = "en";
    public static final String LANG_JA_ID = "ja";
    public static final String LANG_AR_ID = "ar";
    public static final String LANG_KO_ID = "ko";
    public static final List<String> SUPPORT_LANG = Arrays.asList(LANG_EN_ID, LANG_JA_ID, LANG_AR_ID, LANG_KO_ID);

    private static final String TAG = LocaleUtil.class.getSimpleName();

    // todo build config
    //private static final TimeZone CONFERENCE_TIMEZONE = TimeZone.getTimeZone(BuildConfig.);

/*
    public static TimeZone getDisplayTimeZone(Context context) {
        TimeZone defaultTimeZone = TimeZone.getDefault();
        boolean shouldShowLocalTime = DefaultPrefs.get(context).getShowLocalTimeFlag();
        return (shouldShowLocalTime && defaultTimeZone != null) ? defaultTimeZone : CONFERENCE_TIMEZONE;
    }
*/
}
