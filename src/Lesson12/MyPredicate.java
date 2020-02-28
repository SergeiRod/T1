package Lesson12;

import Lesson8.HomeWork8.Car;

import java.util.function.Predicate;

public class MyPredicate implements Predicate <Car> {

    @Override
    public boolean test(Car car) {
        return car.getManufacturer().equals("BMW");
    }
}
