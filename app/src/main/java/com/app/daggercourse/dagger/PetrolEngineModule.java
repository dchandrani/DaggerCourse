package com.app.daggercourse.dagger;

import com.app.daggercourse.car.Engine;
import com.app.daggercourse.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
