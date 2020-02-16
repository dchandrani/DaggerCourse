package com.app.daggercourse;

import android.util.Log;

public class Tires {
    private static final String TAG = "Car";
    // We don't own this class so we can't annotate it with @Inject

    public void inflate() {
        Log.d(TAG, "Inflating tires");
    }
}
