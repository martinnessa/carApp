package com.madsennessa.carprojectapp.controller;

import com.madsennessa.carprojectapp.entity.Car;
import com.madsennessa.carprojectapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService){this.carService = carService;}

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id){return carService.getCarById(id);}

    @GetMapping("/page/{pageNumber}")
    public List<Car> getAllCarsPaged(@PathVariable int pageNumber){return carService.getAllCarsPaginated(pageNumber);}

    @PostMapping
    public Car createCar(@RequestBody Car car){return carService.createCar(car);}

}
