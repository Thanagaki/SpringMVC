package Service;

import Models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl {

    public static List<Car> carsCount (List<Car> carList , int number) {
        if (number == 0 || number > 5) return carList;
        return carList.stream().limit(number).collect(Collectors.toList());

    }


}
