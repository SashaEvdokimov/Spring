package com.springapp.controller;

import com.springapp.model.Car;
import com.springapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String listCar(ModelMap modelMap) {
        List<Car> cars = carService.findAllCars();
        System.out.println(cars);
        modelMap.addAttribute("cars", cars);
        return "allcars";
    }

    @GetMapping("/get1")
    public List<Car> listCar1() {
        return carService.findAllCars();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createCar(@RequestBody Car car) {
        carService.createCar(car);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Car updateCar(@PathVariable("id") Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
    }
}
