package Lesson8.HomeWork8;

        import Lesson14.CarManufacturers;

        import java.time.LocalDate;

        import static Lesson14.CarManufacturers.BMW;
        import static Lesson14.CarManufacturers.TOYOTA;

public abstract class Car {
    protected int yearOfRelease;
    protected CarManufacturers manufacturer;
    protected CarCondition carCondition;
    protected LocalDate dateOfRelease;

    public Car(int yearOfRelease, CarManufacturers manufacturer, CarCondition carCondition) throws IllegalArgumentException {
        if (manufacturer == BMW || manufacturer == TOYOTA) {
            throw new IllegalArgumentException("Invalid Manufacturer");
        }
        this.manufacturer = manufacturer;

        if (yearOfRelease < 1990) {
            throw new IllegalArgumentException("invalid year of release");
        }
        this.yearOfRelease = yearOfRelease;

        if (carCondition == CarCondition.BAD) {
            throw new IllegalArgumentException("invalid car condition");
        }
        this.carCondition = carCondition;
    }

    public Car(CarManufacturers manufacturer, CarCondition carCondition, LocalDate dateOfRelease)  {
        this.manufacturer = manufacturer;
        this.carCondition = carCondition;
        this.dateOfRelease = dateOfRelease;
    }

    public abstract int getCarAge();

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) throws IllegalArgumentException {
        if (yearOfRelease < 1990) {
            throw new IllegalArgumentException("invalid year of release");
        }
        this.yearOfRelease = yearOfRelease;
    }


    public CarManufacturers getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(CarManufacturers manufacturer) {
        if (manufacturer == BMW || manufacturer == TOYOTA) {
            throw new IllegalArgumentException("Invalid Manufacturer");
        }
        this.manufacturer = manufacturer;
    }

    public CarCondition getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(CarCondition carCondition) throws IllegalArgumentException {
        if (carCondition == CarCondition.BAD) {
            throw new IllegalArgumentException("invalid car condition");
        }
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
