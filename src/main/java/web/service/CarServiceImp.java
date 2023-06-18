package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCar(List<Car> cars, int count) throws IndexOutOfBoundsException {
        return (count >= 5) ? cars : cars.subList(0, count);
    }
}
