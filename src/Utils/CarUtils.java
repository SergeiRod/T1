package Utils;

import Lesson14.CarManufacturers;
import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class CarUtils {
    public static List<Car> generateListOfCar (int amount){
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            result.add(generateCar());
        }
        return result;

    }

    public static Car generateCar() {
        int year = getRandomYear();
        // manufacturer = getManufacturer();
        CarManufacturers manufacturer = getManufacturer();
        CarCondition condition = getCarCondition();
        int capacity = getCarCapacity();
        return new PassengerCar(year,manufacturer,condition, capacity);
    }

    public static Car findOneCarByCondition (CarCondition condition, List<Car> cars){
        return cars.stream().filter(car -> car.getCarCondition()==condition).findFirst().get();

        /*Car result = null;
        for (Car car: cars){
            if (car.getCarCondition()== condition){
                result = car;
                break;

            }
        }*/
        /*Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getCarCondition() ==condition;
            }
        };*/
        //return result;
        //return cars.parallelStream().filter(car -> car.getCarCondition()==condition).findFirst().get();
    }


    private static int getRandomYear() {
        return (int) ((Math.random() *  25) + 1990);
    }

    /*private static String getManufacturer () {
        return UUID.randomUUID().toString();
    }*/

    private static CarManufacturers getManufacturer () {
        int randomPassengerCar = (int) (Math.random() *75);
        return CarManufacturers.values()[randomPassengerCar];
    }

    private static CarCondition getCarCondition (){
        int randomState = (int) (Math.random() *3);
        return CarCondition.values()[randomState];
    }

    private static int getCarCapacity (){
        int randomCapacity = (int) (Math.random() * 3+2);
        return randomCapacity;
    }
}
