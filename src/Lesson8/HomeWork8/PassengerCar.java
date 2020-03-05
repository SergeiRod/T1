package Lesson8.HomeWork8;

import Lesson14.CarManufacturers;

import java.time.LocalDate;
import java.time.Period;

public class PassengerCar extends Car {
    private int passengerCapacity;


    public PassengerCar(int yearOfRelease, CarManufacturers manufacturer, CarCondition carCondition, int passengerCapacity) {
        super(yearOfRelease, manufacturer, carCondition);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCar(CarManufacturers manufacturer, CarCondition carCondition, LocalDate dateOfRelease) {
        super(manufacturer, carCondition, dateOfRelease);
    }
    private void secretMethod(){
        System.out.println("Secret methods");
    }

    @Override
    public int getCarAge() {
        return Period.between(this.dateOfRelease, LocalDate.now()).getYears();
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


    @Override
    public String toString() {
        return "PassengerCar{" +
                "passengerCapacity=" + passengerCapacity +
                ", yearOfRelease=" + yearOfRelease +
                ", manufacturer=" + manufacturer +
                ", carCondition=" + carCondition +
                ", dateOfRelease=" + dateOfRelease +
                '}';
    }
}
