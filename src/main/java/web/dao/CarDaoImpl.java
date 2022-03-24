package web.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;



public class CarDaoImpl implements CarDao {
    List<Car> carList = new ArrayList<>();
    public List<Car> getCarList(){
        carList = new ArrayList<>();
        carList.add(new Car("Lexus", "Green", 2020));
        carList.add(new Car("Jeep", "Yellow", 2021));
        carList.add(new Car("Honda", "Black", 2019));
        carList.add(new Car("Audi", "Purple", 2017));
        carList.add(new Car("Lambargini", "Blue", 2022));
        return carList;
    }

}
