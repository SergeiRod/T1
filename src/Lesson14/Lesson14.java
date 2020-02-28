package Lesson14;

import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;
import Utils.CarUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static Lesson8.HomeWork8.CarCondition.*;
import static Utils.CarUtils.generateCar;

public class Lesson14 {


    public static void main(String[] args) {
        List<Car> cars = CarUtils.generateListOfCar(3);
        System.out.println("1+++++++++++++++++++++++++++++++++++++++");
        System.out.println(cars);
        System.out.println(cars.size());

        System.out.println("2+++++++++++++++++++++++++++++++++++++++");
        //System.out.println("Bad car = " + CarUtils.findOneCarByCondition(CarCondition.BAD, car));
        System.out.println("Bad car = " + cars.stream().filter(car -> car.getCarCondition()==BAD).findFirst().get());

        System.out.println("3+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Millennium Car = " + cars.stream().filter(car -> car.getYearOfRelease()==2000).findFirst().orElse(generateCar()));
        System.out.println("4+++++++++++++++++++++++++++++++++++++++");
        cars.stream().forEach(car -> System.out.println(car));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        cars.stream().filter(car -> car.getCarCondition()==EXCELLENT).forEach(car -> System.out.println(car));

        System.out.println("5+++++++++++++++++++++++++++++++++++++++");


        long count =  cars.stream()
                .filter(car -> car.getCarCondition() == EXCELLENT)
                .peek(car -> System.out.println("peek().. year: " + car.getYearOfRelease()))
                .peek(car -> System.out.println("peek() .. Manufacturer: " + car.getManufacturer()))
                .count();

        System.out.println("Excellent cars count = "+ count);

        // Тоже самое
        /*System.out.println("Excellent cars count = "
                + cars.stream()
                .filter(car -> car.getCarCondition() == EXCELLENT)
                .peek(car -> System.out.println("peek().. year: " + car.getYearOfRelease()))
                .peek(car -> System.out.println("peek() .. Manufacturer: " + car.getManufacturer()))
                .count());*/

        long count1 =  cars.stream()
                .peek(car -> System.out.println("peek().. year: " + car.getYearOfRelease()))
                .peek(car -> System.out.println("peek() .. Manufacturer: " + car.getManufacturer()))
                .filter(car -> car.getCarCondition() == EXCELLENT)
                .count();

        System.out.println("Excellent cars count = "+ count1);
        System.out.println("6+++++++++++++++++++++++++++++++++++++++");
        int year = LocalDateTime.now().getYear();
        System.out.println(year);

        System.out.println("7+++++++++++++++++++++++++++++++++++++++");
        cars.stream()
                .filter(car -> car.getCarCondition()==GOOD)
                .forEach(car -> System.out.println("Manufacturer: "+ car.getManufacturer()+ " and car age is: " + (year -car.getYearOfRelease())));


        boolean hasBadCar = cars.stream().anyMatch(car -> car.getCarCondition()==BAD);
        System.out.println(hasBadCar ? "We have a bad car " : "All cars are OK ");

        boolean allBadCar = cars.stream().allMatch(car -> car.getCarCondition()==BAD);
        System.out.println(allBadCar ? "All cars are bad " : "Some cars are OK ");

        System.out.println("8+++++++++++++++++++++++++++++++++++++++");
        //boolean carOlder18 = cars.stream().anyMatch(car -> LocalDateTime.now().getYear() - car.getYearOfRelease()==18);
        boolean carOlder18 = cars.stream().anyMatch(car -> getAge(car)==18);
        System.out.println(carOlder18 ? "We have a car older 18 " : "All cars are younger than 18 ");

        //boolean allBCarThatOlder24 = cars.stream().allMatch(car -> LocalDateTime.now().getYear() - car.getYearOfRelease()==24);
        boolean allBCarThatOlder24 = cars.stream().allMatch(car -> getAge(car)<24);
        System.out.println(allBCarThatOlder24 ? "All cars are younger than 24 " : "Some cars are older than 24 ");

        System.out.println("9+++++++++++++++++++++++++++++++++++++++");

        List<CarCondition> listOfCondition = cars.stream()
                .map(car -> car.getCarCondition())
                .peek(CarCondition -> System.out.println("Car condition "+CarCondition))
                .collect(Collectors.toList());
        System.out.println(listOfCondition);

        Set<CarCondition> setOfCondition = cars.stream()
                .map(car -> car.getCarCondition())
                .collect(Collectors.toSet());
        System.out.println(setOfCondition);

        Set<CarManufacturers> setOfCarManufacturers = cars.stream()
                .map(car -> car.getManufacturer())
                .collect(Collectors.toSet());
        System.out.println(setOfCarManufacturers);
        System.out.println(setOfCarManufacturers.size());

        System.out.println("10+++++++++++++++++++++++++++++++++++++++");

        cars.stream().peek(car -> System.out.println("Car from peek :"+car))
                .map(car -> car.getYearOfRelease())
                .peek(y-> System.out.println("Car years peek :"+y))
                .map(y -> y+1000)
                .peek(ny -> System.out.println("New car year: "+ny))
                .count();
    }


    private static int getAge (Car car) {
        return LocalDateTime.now().getYear() - car.getYearOfRelease();

    }


}
