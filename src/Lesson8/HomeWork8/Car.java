package Lesson8.HomeWork8;

        import Lesson14.CarManufacturers;

        import java.time.LocalDate;

public abstract class Car {
    protected int yearOfRelease;
    protected CarManufacturers manufacturer;
    protected CarCondition carCondition;
    protected LocalDate dateOfRelease;

    public Car(int yearOfRelease, CarManufacturers manufacturer, CarCondition carCondition) {
        this.yearOfRelease = yearOfRelease;
        this.manufacturer = manufacturer;
        this.carCondition = carCondition;
    }

    public Car(CarManufacturers manufacturer, CarCondition carCondition, LocalDate dateOfRelease) {
        this.manufacturer = manufacturer;
        this.carCondition = carCondition;
        this.dateOfRelease = dateOfRelease;
    }

    public abstract int getCarAge();

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    public CarManufacturers getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(CarManufacturers manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CarCondition getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(CarCondition carCondition) {
        this.carCondition = carCondition;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfRelease=" + yearOfRelease +
                ", manufacturer=" + manufacturer +
                ", carCondition=" + carCondition +
                ", dateOfRelease=" + dateOfRelease +
                '}';
    }
}
