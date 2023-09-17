package web.service;

import web.model.Car;

import java.util.List;

public interface carService {
    List<Car> listOfCars(int count);
}
