package com.starcompany.achive2.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;

/**
 * Created by takeshi on 16/10/29.
 */
public class IntentUtil {
    private static final String HASH_TAG = "#achive2";

    private IntentUtil() {
        throw new AssertionError();
    }

    public static void share(Context context, @NonNull String url) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, url + " " + HASH_TAG);
        context.startActivity(Intent.createChooser(intent, "share"));
    }

    public static void toBrowser(Context context, @NonNull String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(intent);
    }
}
