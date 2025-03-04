package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    @Override
    public void addCar() {
    }

    @Override
    public List<Car> listCars() {
        return null;
    }
    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car("凡一人", "ModelOfAge_1", 2010));
        cars.add(new Car("凡二人", "ModelOfAge_2", 2020));
        cars.add(new Car("凡三人", "ModelOfAge_3", 2030));
        cars.add(new Car("凡四人", "ModelOfAge_4", 2040));
        cars.add(new Car("凡五人", "ModelOfAge_5", 2050));
    }

    public List<Car> getCars(int count) {
        if (count < 0 || count >= 5) return cars;
        else return cars.stream().limit(count).collect(Collectors.toList());
    }
}
