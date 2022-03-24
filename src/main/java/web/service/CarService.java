package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> carsCount (List<Car> carList, int number);
}

