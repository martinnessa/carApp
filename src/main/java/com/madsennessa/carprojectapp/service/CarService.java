package com.madsennessa.carprojectapp.service;

import com.madsennessa.carprojectapp.entity.Car;
import com.madsennessa.carprojectapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    public final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car getCarById (Long id){ return carRepository.findById(id).orElse(null); }

    public List<Car> getAllCars (){return carRepository.findAll();}

    public List<Car> getAllCarsPaginated(int pageNumber){return carRepository.findAll(PageRequest.of(pageNumber,20)).stream()
            .toList();}
}
