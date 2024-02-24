package com.codeweb.patterns.factory.service;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.implementations.HatchFactory;
import com.codeweb.patterns.factory.implementations.SedanFactory;
import com.codeweb.patterns.factory.implementations.SuvFactory;
import com.codeweb.patterns.factory.intefaces.CarFactory;
import com.codeweb.patterns.factory.model.Car;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BusinessService {

    private final Map<CarType, CarFactory> factoryMap;

    public BusinessService() {
        factoryMap = new HashMap<>();
        factoryMap.put(CarType.SUV, new SuvFactory());
        factoryMap.put(CarType.SEDAN, new SedanFactory());
        factoryMap.put(CarType.HATCH, new HatchFactory());
    }

    public Car createCar(CarType type) {
        CarFactory carFactory = factoryMap.get(type);

        if (carFactory != null) {
            return carFactory.createCar();
        } else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}
