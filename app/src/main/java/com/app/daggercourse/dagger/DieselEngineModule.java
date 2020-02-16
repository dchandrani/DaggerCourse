package com.app.daggercourse.dagger;

import com.app.daggercourse.car.DieselEngine;
import com.app.daggercourse.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
