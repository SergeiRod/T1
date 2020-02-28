package Lesson8.HomeWork8;

import Lesson14.CarManufacturers;

import java.time.LocalDate;
import java.time.Period;

public class Truck extends Car{
    private int bearingCapacity;

    public Truck(int yearOfRelease, CarManufacturers manufacturer, CarCondition carCondition, int bearingCapacity) {
        super(yearOfRelease, manufacturer, carCondition);
        this.bearingCapacity = bearingCapacity;
    }

    public Truck(CarManufacturers manufacturer, CarCondition carCondition, LocalDate dateOfRelease, int bearingCapacity) {
        super(manufacturer, carCondition, dateOfRelease);
        this.bearingCapacity = bearingCapacity;
    }

    @Override
    public int getCarAge() {
        return Period.between(this.dateOfRelease, LocalDate.now()).getYears();
    }

    public int getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(int bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "bearingCapacity=" + bearingCapacity +
                ", yearOfRelease=" + yearOfRelease +
                ", manufacturer=" + manufacturer +
                ", carCondition=" + carCondition +
                ", dateOfRelease=" + dateOfRelease +
                '}';
    }
}
