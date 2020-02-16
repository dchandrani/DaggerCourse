package com.app.daggercourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.daggercourse.car.Car;
import com.app.daggercourse.dagger.CarComponent;
import com.app.daggercourse.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();
    }
}
