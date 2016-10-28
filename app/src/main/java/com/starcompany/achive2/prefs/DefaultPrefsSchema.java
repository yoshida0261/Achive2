package com.starcompany.achive2.prefs;


import com.rejasupotaro.android.kvs.annotations.Key;
import com.rejasupotaro.android.kvs.annotations.Table;

/**
 * Created by takeshi on 16/10/29.
 */
@Table(name = "com.starcompany.achive2_preferences")
public interface DefaultPrefsSchema {
    @Key(name = "current_language_id")
    String languageId = "";
    @Key(name = "notification_setting")
    boolean notificationFlag = true;

}
