package com.springapp.service.impl;

import com.springapp.model.Car;
import com.springapp.model.User;
import com.springapp.repository.jpa.CarRepository;
import com.springapp.security.SecurityUtils;
import com.springapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("CarService")
@Transactional
public class CarServiceImpl implements CarService {

    //    @Autowired
//    private CarDao carDao;
    @Autowired
    private CarRepository carRepository;

    public List<Car> findAllCars() {
        //return carDao.findAllCars();
        return carRepository.findAll();
    }

    @Override
    public void createCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public Car updateCar(Long id, Car updatableCar) {
        Car car = getCarFromRepository(id);
        if(car != null) {
            if (updatableCar.getMark() != null)
                car.setMark(updatableCar.getMark());
            if(updatableCar.getModel() != null)
                car.setModel(updatableCar.getModel());
            if(updatableCar.getYear() != null)
                car.setYear(updatableCar.getYear());
            if(updatableCar.getProdCountry() != null)
                car.setProdCountry(updatableCar.getProdCountry());
        }
        return car;
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    private Car getCarFromRepository(Long id){
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.orElse(null);
    }
}
