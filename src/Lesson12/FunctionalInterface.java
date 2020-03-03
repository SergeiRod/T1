package Lesson12;

import Lesson11.generic.Citizen;
import Lesson11.generic.Employee;
import Lesson11.generic.Gender;
import Lesson11.generic.Person;
import Lesson12.HomeWork12.MyUnaryOperator;
import Lesson14.CarManufacturers;
import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;
import Lesson8.HomeWork8.Truck;

import java.time.LocalDate;
import java.util.function.*;

public class FunctionalInterface {

    static void printSmt(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }

    static String useFunction(Function<Integer, String> function, Integer integer) {
        return function.apply(integer);
    }

    static void usePredicate(Predicate<Car> carPredicate, Car testCar) {
        boolean isOK = carPredicate.test(testCar);
        System.out.println(isOK ? "Car is Ok" : "Not a good one");
    }

    static void useUnaryOperator(UnaryOperator<Person> unaryOperator, Person person) {
        System.out.println("Person before OUL " + person);
        unaryOperator.apply(person);
        System.out.println("Person after UO: " + person);
    }

    static void activeUseOfCar(UnaryOperator<Car> carUnaryOperator, Car car) {
        System.out.println("Car before use " + car);
        carUnaryOperator.apply(car);
        System.out.println("Car after use " + car);
    }

    static void getAverageAge(BiFunction<Citizen, Employee, Double> biFunction,
                              Citizen citizen,
                              Employee employee) {
        System.out.println("Average age is: " + biFunction.apply(citizen, employee));
    }

    static void marriage(BiConsumer<Citizen, Citizen> zags, Citizen groom, Citizen bride) {
        System.out.println("Bride before marriage: " + bride);
        zags.accept(groom, bride);
        System.out.println("Bride after marriage: " + bride);

    }

    static Integer oldestInFamily(BiFunction<Person, Person, Integer> biFunction, Person p1, Person p2) {
        biFunction.apply(p1, p2);
        if (p1.getAgePerson() > p2.getAgePerson()) {
            return p1.getAgePerson();
        }
        return p2.getAgePerson();

    }

    static Integer youngestInFamily(BiFunction<Person, Person, Integer> biFunction, Person person1, Person person2) {
        biFunction.apply(person1, person2);
        if (person1.getAgePerson() < person2.getAgePerson()) {
            return person1.getAgePerson();
        } else {
            return person2.getAgePerson();
        }
    }

    /*static boolean isOlderCar(BiPredicate<PassengerCar, PassengerCar> biPredicateCar, PassengerCar p1, PassengerCar p2) {
        return biPredicateCar.test(p1, p2);
    }*/

    static Car isOlderCar(BiPredicate<Car, Car> biPredicateCar, Car p1, Car p2) {
        if (biPredicateCar.test(p1,p2)){
            System.out.println("Oldest car is "+p1);
            return p1;
        } else System.out.println("Oldest car is "+p2);
        return p2;
    }

    public static void main(String[] args) {
        Supplier<String> classSupplier = new MySupplier();

        Supplier<String> anonymousSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "from Anonymous initialization";
            }
        };

        Supplier<String> lambdaSupplier = () -> "from Lambda supplier";

        printSmt(classSupplier);
        printSmt(anonymousSupplier);
        printSmt(lambdaSupplier);

        int age = 200;
        printSmt(() -> "A" + age);

        printSmt(() -> {
            int i = 100;
            return "A" + i;
        });

        /////////////////////////////////

        Function<Integer, String> classFunction = new MyFunction();

        Function<Integer, String> anonymousFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "String from anonymous initialization: " + integer.toString();
            }
        };

        Function<Integer, String> lambdaFunction = (i) -> "String from lambda: " + i.toString();

        useFunction(classFunction, 1982);

        System.out.println(useFunction(classFunction, 67));
        System.out.println(useFunction(anonymousFunction, 56));
        System.out.println(useFunction(lambdaFunction, 45));

        System.out.println(useFunction((i) -> "String from inline lambda: " + i, 22));

        //////////////////////////////////
        Predicate<Car> classPredicate = new MyPredicate();
        Car car1 = new Truck(2050, CarManufacturers.ACURA, CarCondition.GOOD, 5);
        Car car2 = new Truck(1999, CarManufacturers.ALFA_ROMEO, CarCondition.GOOD, 5);
        usePredicate(classPredicate, car1);
        usePredicate(classPredicate, car2);

        usePredicate((c) -> c.getYearOfRelease() > 2000, car1);
        usePredicate((c) -> c.getYearOfRelease() > 2000, car2);


        //////////////////////////////////
        Person person = new Citizen("Mark", 23, Gender.MALE, true);
        UnaryOperator<Person> classUnaryOperator = new MyUnaryOperator();
        useUnaryOperator(classUnaryOperator, person);
        Integer delta = 10;
        useUnaryOperator((p) -> {
            Integer newAge = p.getAge() + delta;
            p.setAge(newAge);
            return p;
        }, person);
        String newCompany = "Google";

        Car car = new PassengerCar(2000, CarManufacturers.BMW, CarCondition.GOOD, 5);
        activeUseOfCar((c) -> {
            c.setCarCondition(CarCondition.BAD);
            return c;
        }, car);

        Citizen citizen = new Citizen("Anna", 25, Gender.FEMALE, true);
        Employee employee = new Employee("Andrej", 30, Gender.MALE, 20_500);

        getAverageAge((c, e) -> Double.valueOf(c.getAge() + e.getAge()) / 2, citizen, employee);
        getAverageAge((c, e) -> new Double(c.getAge() + e.getAge()) / 2, citizen, employee); // тоже самое

        Citizen mike = new Citizen("Mike",  Gender.MALE, "Greenwood", LocalDate.of(1982, 10, 15), true);
        Citizen jane = new Citizen("Jane", Gender.FEMALE, "Health", LocalDate.of(1979, 02, 22), true);
        Person helen = new Citizen("Helen", Gender.FEMALE, "Block", LocalDate.of(1997, 10, 15), true);
        Employee paul = new Employee("Paul", age, Gender.MALE, "Brucksen", LocalDate.of(2002, 12, 14), 20_000);

        System.out.println("=======================================================================");
        System.out.println(mike);
        System.out.println(jane);
        System.out.println(helen);
        System.out.println("=======================================================================");
        marriage((c1, c2) -> c2.setSecondName(c1.getSecondName()), mike, jane);
        System.out.println("=======================================================================");
        System.out.println(mike);
        System.out.println(jane);
        System.out.println(helen);

        System.out.println("=======================================================================");
        System.out.println("Jane is " + jane.getAgePerson() + " old");
        System.out.println("Mike is " + mike.getAgePerson() + " old");
        System.out.println("Helen is " + helen.getAgePerson() + " old");
        System.out.println("Paul is " + paul.getAgePerson() + " old");
        System.out.println("Old family=======================================================================");
        System.out.println("Oldest in family is " + oldestInFamily((c1, c2) -> c1.getAgePerson(), mike, jane));
        System.out.println("Youngest in family is " + youngestInFamily((c1, c2) -> c1.getAgePerson(), mike, jane));
        System.out.println("New family=======================================================================");
        System.out.println("Oldest in family is " + oldestInFamily((c1, c2) -> c1.getAgePerson(), mike, helen));
        System.out.println("Youngest in family is " + youngestInFamily((c1, c2) -> c1.getAgePerson(), paul, helen));
        System.out.println("Cars=======================================================================");


        PassengerCar passengerCar1 = new PassengerCar(CarManufacturers.BMW, CarCondition.EXCELLENT, LocalDate.of(2003, 02, 03));
        PassengerCar passengerCar2 = new PassengerCar(CarManufacturers.MERCEDES_BENZ, CarCondition.EXCELLENT, LocalDate.of(2004, 02, 02));

        System.out.println(passengerCar1);
        System.out.println(passengerCar2);

        System.out.println("=======================================================================");
        System.out.println("Car1 is " + passengerCar1.getCarAge() + " old");
        System.out.println("Car2 is " + passengerCar2.getCarAge() + " old");

        isOlderCar((c1,c2)-> c1.getCarAge() > c2.getCarAge(), passengerCar1, passengerCar2);

        System.out.println("=======================================================================");


    }

}
