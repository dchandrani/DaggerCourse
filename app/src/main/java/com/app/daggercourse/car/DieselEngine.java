package com.app.daggercourse.car;

import android.util.Log;

import com.app.daggercourse.car.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
