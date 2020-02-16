package com.app.daggercourse.dagger;

import com.app.daggercourse.MainActivity;
import com.app.daggercourse.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
