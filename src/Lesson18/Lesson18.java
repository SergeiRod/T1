package Lesson18;

import Lesson11.generic.Employee;
import Lesson11.generic.Gender;
import Lesson14.CarManufacturers;
import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;
import Lesson8.HomeWork8.Truck;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Lesson18 {
    public static void main(String[] args) {
        Car car = new PassengerCar(CarManufacturers.BENTLEY, CarCondition.EXCELLENT, LocalDate.of(2001, 03, 04));
        PassengerCar car1 = new PassengerCar(CarManufacturers.BENTLEY, CarCondition.EXCELLENT, LocalDate.of(2001, 03, 04));
        Class<?> carClass = car.getClass();

        System.out.println(".getName(): " + carClass.getName());
        Class<?> carClass1 = car1.getClass();
        System.out.println(".getName(): " + carClass1.getName());
        Class<?> carClass2 = car1.getClass();
        System.out.println(".getName(): " + carClass2.getName());
        Object obj = new Object();
        System.out.println(".getName(): " + obj.getClass().getName());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Constructor<?>[] passengerCarConstructor = carClass.getConstructors();
        System.out.println(".getConstructor (number of constructors in the Class): " + passengerCarConstructor.length);
        System.out.println("Constructors info  in the Class): " + passengerCarConstructor);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Method[] carClassMethods = carClass.getMethods();
        System.out.println(".getMethods: " + carClassMethods.length);
        System.out.println("All methods names: ");
        Arrays.asList(carClassMethods).forEach(m -> System.out.println(m.getName()));
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Method[] carClassDeclaredMethods = carClass.getDeclaredMethods();
        System.out.println(".getDeclaredMethods: " + carClassDeclaredMethods.length);
        System.out.println("All declared methods names: ");
        Arrays.asList(carClassDeclaredMethods).forEach(m -> System.out.println(m.getName()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Field[] carClassFields = carClass.getFields();
        System.out.println(".carClassFields: " + carClassFields.length);
        System.out.println("All fields methods names: ");
        Arrays.asList(carClassFields).forEach(m -> System.out.println(m.getName()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Field[] carClassDeclaredFields = carClass.getDeclaredFields();
        System.out.println(".carClassDeclaredFields: " + carClassDeclaredFields.length);
        System.out.println("All declared lds methods names: ");
        Arrays.asList(carClassDeclaredFields).forEach(m -> System.out.println(m.getName()));


        System.out.println("Truck++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //не создавая объекта
        Class<?> truckClass = Truck.class;
        Constructor<?>[] truckCarConstructor = Truck.class.getConstructors();
        System.out.println(".getConstructor (number of constructors in the Class): " + truckCarConstructor.length);
        System.out.println("Constructors info  in the Class): " + truckCarConstructor);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Constructor<?>[] truckCarDeclaredConstructor = truckClass.getDeclaredConstructors();
        System.out.println(".getConstructor (number of constructors in the Class): " + truckCarDeclaredConstructor.length);
        System.out.println("Constructors info  in the Class): " + truckCarDeclaredConstructor);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Method[] truckClassMethods = truckClass.getMethods();
        System.out.println(".getMethods: " + truckClassMethods.length);
        System.out.println("All methods names: ");
        Arrays.asList(truckClassMethods).forEach(m -> System.out.println(m.getName()));
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Method[] truckClassDeclaredMethods = truckClass.getDeclaredMethods();
        System.out.println(".getDeclaredMethods: " + truckClassDeclaredMethods.length);
        System.out.println("All declared methods names: ");
        Arrays.asList(truckClassDeclaredMethods).forEach(m -> System.out.println(m.getName()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Field[] truckClassFields = truckClass.getFields();
        System.out.println(".carClassFields: " + truckClassFields.length);
        System.out.println("All fields methods names: ");
        Arrays.asList(truckClassFields).forEach(m -> System.out.println(m.getName()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Field[] truckClassDeclaredFields = truckClass.getDeclaredFields();
        System.out.println(".carClassDeclaredFields: " + truckClassDeclaredFields.length);
        System.out.println("All declared lds methods names: ");
        Arrays.asList(truckClassDeclaredFields).forEach(m -> System.out.println(m.getName()));

        System.out.println("QQQ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Object secretObject = new Employee("Karl", 22, Gender.MALE, 30_000);
        Class<?> employeeClass = secretObject.getClass();
        Method[] employeeSecretMethod = employeeClass.getDeclaredMethods();
        Method secretMethod = Arrays.asList(employeeSecretMethod).stream().filter(m ->
                m.getName().toLowerCase().contains("secret")).findAny()
                .orElseThrow(() -> new RuntimeException("No Secret Methods"));
        try {
            secretMethod.setAccessible(true);
            Object invokeResult = secretMethod.invoke(secretObject);
            System.out.println(invokeResult.getClass().getName());
            System.out.println(invokeResult);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //Processor example
        Mark markObject = new Mark();
        MyLogProcessor.process(markObject);


    }
}
