package Lesson19;


import Lesson8.HomeWork8.Car;
import Utils.CarUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Lesson19 {

    private static void printRange(int from, int to) {
        new Thread(() -> {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        }).start();
    }


    private static volatile int price = 100;

    private static synchronized int incrementPrice(int increment) {
        return price += increment;
    }

    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("Hello from main Thread!");
        Runnable playMusic = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Play Music");


            }
        };

        MyThread myThread1 = new MyThread(playMusic, "Thread number 1");
        MyThread myThread2 = new MyThread(() -> System.out.println("Print my documents"), "Thread number 2");

        System.out.println("Drink coffee");
        myThread1.start();
        myThread1.join();
        myThread2.join();
        myThread2.start();
        System.out.println("Come back");*/

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //printRange(0,10);
        //printRange(11,20);
        //printRange(21,30);

        Runnable runnableForRaceCondition = () -> {
            try {
                System.out.println("data from runnable before increment R1 " + price);
                incrementPrice(1);
                Thread.sleep(1000);
                System.out.println("data from runnable after increment R1 " + price);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };

        Runnable runnable2ForRaceCondition = () -> {
            System.out.println("data from runnable before increment R2 " + price);
            incrementPrice(2);
            System.out.println("data from runnable after increment R2 " + price);
        };

        //new Thread(runnableForRaceCondition).start();
        //new Thread(runnable2ForRaceCondition).start();


        /*List<Car> cars = CarUtils.generateListOfCar(10);
        printCarsInTwoThreads(cars);*/


    }

    /*private static void printCarsInTwoThreads(List<Car> cars){
        List<Car> part1 = cars.subList(0, cars.size() / 2);
        List<Car> part2 = cars.subList(cars.size() / 2, cars.size());
        Runnable runnable1 = () -> part1.forEach(car -> {
            System.out.println("Print from Thread1");
            System.out.println(car);
        });
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Runnable runnable2 = () -> part2.forEach(car -> {
            System.out.println("Print from Thread2");
            System.out.println(car);
        });
        Thread thread2 = new Thread(runnable2);
        thread2.start();

    }*/
}


