package Lesson8.HomeWork8;
/*
public class AutoSalonImpl implements AutoSalon {
    private Car [] parking = new Car[8];
    private int moneyBalance;
    //private int assessedValue;

    public AutoSalonImpl(int moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public Car[] getParking() {
        return parking;
    }

    public void setParking(Car[] parking) {
        this.parking = parking;
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(int moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    @Override
    public int buyCar(Car someCar) {
        int freePlace = getFreePlace();
        if (freePlace < 0){
            System.out.println("Don't have free place, please sell something");
            return -1;
        }
        int price = 0;
        if (someCar instanceof Truck){
            Truck truck = (Truck) someCar;
            price = truck.getBearingCapacity()*truck.carCondition.getRate()*truck.getYearOfRelease();
        } else if (someCar instanceof PassengerCar){
            PassengerCar passengerCar = (PassengerCar) someCar;
            //TODO
        }
        if (moneyBalance < price){
            System.out.println("Don't have enough money, please sell smth.");
            return -1;
        }
        moneyBalance -= price;
        parking [freePlace] = someCar;
        return price;
    }

    @Override
    public int sellCar(int parkingSlotNumber) {
        return 0;
        //TODO
    }

    @Override
    public void report() {

    }

    private int getFreePlace () {
        int freePlace = -1;
        for (int i = 0; i <parking.length; i++) {
            if (parking[i]== null) {
                freePlace = i;
            }
            return freePlace;
        }
    }
}*/
