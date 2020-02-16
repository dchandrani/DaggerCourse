package com.app.daggercourse.car;

import android.util.Log;

import com.app.daggercourse.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
