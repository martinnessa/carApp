package com.madsennessa.carprojectapp.controller;

import com.madsennessa.carprojectapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarController {
    public final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository){
        this.carRepository = carRepository;
    }


}
