package com.codeweb.patterns.factory.implementations;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.intefaces.CarFactory;
import com.codeweb.patterns.factory.model.Car;

public class SuvFactory implements CarFactory {
    @Override
    public Car createCar() {
        var car = new Car();
        car.setName("Jeep Compass");
        car.setNumberOfDoors(4);
        car.setFuelCapacity(60);
        car.setType(CarType.valueOf("SUV"));
        return car;
    }
}