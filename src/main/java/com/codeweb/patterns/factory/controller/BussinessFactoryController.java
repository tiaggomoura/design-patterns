package com.codeweb.patterns.factory.controller;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.model.Car;
import com.codeweb.patterns.factory.service.BusinessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class BussinessFactoryController {
    private BusinessService service;

    private BussinessFactoryController(BusinessService service) {
        this.service = service;
    }

    @PostMapping("/create-car/{type}")
    public ResponseEntity<Car> createCar(@PathVariable("type") String type) throws ClassNotFoundException {
        return new ResponseEntity<Car>(this.service.createCar(CarType.valueOf(type)), HttpStatus.CREATED);
    }
}
