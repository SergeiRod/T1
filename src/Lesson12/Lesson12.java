package Lesson12;

import Lesson11.generic.Citizen;
import Lesson11.generic.Gender;
import Lesson11.generic.Person;
import Lesson14.CarManufacturers;
import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;

import java.util.HashMap;
import java.util.Map;

public class Lesson12 {
    public static void main(String[] args) {

        Map<String, Person> people = new HashMap<>(20);
        Person person1 = new Citizen("Max", 22, Gender.MALE, false);
        Person person2 = new Citizen("Laura", 25, Gender.FEMALE, false);
        Person person3 = new Citizen("Serz", 28, Gender.MALE, true);
        Person person4 = new Citizen("Maria", 32, Gender.FEMALE, true);

        people.put(person1.getName(), person1);
        people.put(person2.getName(), person2);
        people.put(person3.getName(), person3);
        people.put(person4.getName(), person4);
        System.out.println(people);
        people.put(person4.getName(), person1);
        System.out.println(people);
        people.put(person4.getName(), person2);
        System.out.println(people);

        System.out.println(people.get("Laura").getAge());


        Car car1 = new PassengerCar(2019, CarManufacturers.OPEL, CarCondition.EXCELLENT, 5);
        Car car2 = new PassengerCar(2012,CarManufacturers.MERCEDES_BENZ, CarCondition.GOOD, 4);
        Car car3 = new PassengerCar(2005,CarManufacturers.OPEL, CarCondition.GOOD, 5);
        Car car4 = new PassengerCar(2015,CarManufacturers.SKODA, CarCondition.EXCELLENT, 5);

        Map<String, Car> car = new HashMap<>(20);

        String businessKey1 = car1.getYearOfRelease()+" "+car1.getManufacturer();
        String businessKey2 = car2.getYearOfRelease()+" "+car2.getManufacturer();
        String businessKey3 = car3.getYearOfRelease()+" "+car3.getManufacturer();
        String businessKey4 = car4.getYearOfRelease()+" "+car4.getManufacturer();
        //car.put(car1.getYearOfRelease()+car1.getManufacturer(), car1);
        //car.put(car2.getYearOfRelease()+car2.getManufacturer(), car2);
        //car.put(car3.getYearOfRelease()+car3.getManufacturer(), car3);
        //car.put(car4.getYearOfRelease()+car4.getManufacturer(), car4);
        car.put(businessKey1, car1);
        car.put(businessKey2, car2);
        car.put(businessKey3, car3);
        car.put(businessKey4, car4);

        System.out.println("++++++++++++1++++++++++++");
        System.out.println(car);
        System.out.println("Total car Number is = "+car.size());
        System.out.println(car.get(CarManufacturers.BMW+" "+car.get(CarCondition.GOOD)));


        System.out.println("++++++++++++2++++++++++++");

        Map<String, Car> carNew = new HashMap<>(20);
        System.out.println(carNew);
        carNew.putAll(car);
        System.out.println(carNew);

        System.out.println("++++++++++++3++++++++++++");
        //Car lookup = car.get("2012 BMW");
        //System.out.println(lookup);
        System.out.println(car.get("2012 BMW"));

        System.out.println("++++++++++++4++++++++++++");



    }
}
