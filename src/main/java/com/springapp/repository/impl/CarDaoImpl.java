package com.springapp.repository.impl;

import com.springapp.model.Car;
import com.springapp.repository.AbstractDao;
import com.springapp.repository.CarDao;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarDao")
public class CarDaoImpl extends AbstractDao<Long, Car> implements CarDao {
   /* public List<Car> findAllCars() {
        Criteria criteria = createEntityCriteria();
        return (List<Car>) criteria.list();
    }*/
}
