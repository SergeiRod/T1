package myClasses;

import java.util.Objects;

public class Car {
    public int price;
    public double weight;
    public String mark;
    public String color;

    public Car(int price, int weight, String mark, String color) {
        this.price = price;
        this.weight = weight;
        this.mark = mark;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price &&
                Double.compare(car.weight, weight) == 0 &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, mark, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
