package Lesson13;

import Lesson11.generic.Citizen;
import Lesson11.generic.Gender;
import Lesson14.CarManufacturers;
import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;

import java.util.Optional;

public class Lesson13 {
    public static void main(String[] args) {
        Citizen citizenNull = null;
        Citizen citizen = new Citizen("Joe", 23, Gender.MALE, true);
        Citizen citizenDefault = new Citizen("Def", 99, Gender.MALE, true);
        Optional<Citizen> otpEJoe = Optional.of(citizen);
        Optional<Citizen> otpEmpty = Optional.empty();
        Optional<Citizen> otpNullable = Optional.ofNullable(citizenNull);

        //.get()....
        System.out.println(".get() from Optional: " + otpEJoe.get());

        //System.out.println(".get() from Optional: " + otpEmpty.get());
        if (otpEmpty.isPresent()) {
            System.out.println(".get() from Optional: " + otpEmpty.get());
        }

        //System.out.println(".get() from Optional: " + otpNullable.get());
        if (otpNullable.isPresent()) {
            System.out.println(".get() from Optional: " + otpNullable.get());
        }

        System.out.println("orElse(T,t) form Optional" + otpEJoe.orElse(citizenDefault));
        System.out.println("orElse(T,t) form Optional" + otpNullable.orElse(citizenDefault));

        System.out.println("orElseGet(Supplier<T>,t) form Optional" + otpEJoe.orElseGet(() -> citizenDefault));
        System.out.println("orElseGet(Supplier<T>,t) form Optional" + otpNullable.orElseGet(() ->
                new Citizen("PPP", 33, Gender.FEMALE, true)
        ));

        otpEJoe.ifPresent((c)-> {
            System.out.println("Hello form Consumer!!!! ");
            System.out.println("I've consumed: "+c.getName());
            System.out.println("I am very happy....");
        });

        otpNullable.ifPresent((c)-> {
            System.out.println("Hello form Consumer!!!! ");
            System.out.println("I've consumed: "+c.getName());
            System.out.println("I am very happy....");
        });

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        Car carNull = null;
        Car bmw = new PassengerCar(2001, CarManufacturers.BENTLEY, CarCondition.EXCELLENT, 4);
        Car carDefault = new PassengerCar(2000, CarManufacturers.LAMBORGHINI, CarCondition.GOOD, 5);
        Optional<Car> otpBmw = Optional.of(bmw);
        Optional<Car> otpCarEmpty = Optional.empty();
        Optional<Car> otpCarNullable = Optional.ofNullable(carNull);

        System.out.println(".get() from Optional: " + otpBmw.get());

        if (otpCarEmpty.isPresent()) {
            System.out.println(".get() from Optional: " + otpEmpty.get());
        }

        if (otpCarNullable.isPresent()) {
            System.out.println(".get() from Optional: " + otpNullable.get());
        }

        System.out.println("orElse(T,t) form Optional" + otpBmw.orElse(carDefault));
        System.out.println("orElse(T,t) form Optional" + otpCarNullable.orElse(carDefault));

        System.out.println("orElseGet(Supplier<T>,t) form Optional" + otpBmw.orElseGet(() -> carDefault));
        System.out.println("orElseGet(Supplier<T>,t) form Optional" + otpCarNullable.orElseGet(() ->
                new PassengerCar(1999, CarManufacturers.VOLKSWAGEN, CarCondition.BAD, 5)
        ));



    }
}
