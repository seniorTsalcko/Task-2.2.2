package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class carServiseImpl implements carService {

    @Override
    public List<Car> listOfCars(int count) {

        List<Car> carList;

        carList = new ArrayList<>();

        carList.add(new Car("BMW", 218, "black"));
        carList.add(new Car("Jiguli", 78, "yellow"));
        carList.add(new Car("Lada", 114, "baklajan"));
        carList.add(new Car("Zapor", 66, "white"));
        carList.add(new Car("RB018", 713, "orange"));

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
