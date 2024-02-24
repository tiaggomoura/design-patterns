package com.codeweb.patterns.factory.implementations;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.intefaces.CarFactory;
import com.codeweb.patterns.factory.model.Car;

public class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        var car = new Car();
        car.setName("Toyta Corolla");
        car.setNumberOfDoors(4);
        car.setFuelCapacity(50);
        car.setType(CarType.valueOf("SEDAN"));
        return car;
    }
}
