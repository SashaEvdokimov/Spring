package com.springapp.service;

import com.springapp.model.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();
    void createCar(Car car);
    Car updateCar(Long id, Car updatableCar);
    void deleteCar(Long id);
}
