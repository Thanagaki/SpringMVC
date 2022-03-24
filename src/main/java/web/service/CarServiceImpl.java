package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;


public class CarServiceImpl implements  CarService{
   private CarDao carDao;
   public CarServiceImpl(CarDao carDao){
       this.carDao = carDao;

   }

    public List<Car> carsCount (List<Car> carListCount, int count){
        carListCount = carDao.getCarList();
        if (count == 0 || count > 5) return carListCount;
        return carListCount.stream().limit(count).collect(Collectors.toList());

    }
}
