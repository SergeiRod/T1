package Lesson19.HW;

import Lesson19.Lesson19;

import java.util.stream.Stream;

public class MyClass {
    @MyProfile
    private int i;
    @MyProfile
    public void do1 () {
        Stream.iterate(1, integer -> integer+1).limit(10000).forEach(integer -> System.out.print("iteration"));

    }

    public void do2 () {
        for (int j = 0; j < 10000 ; j++) {
            System.out.print("iteration");
        }

    }
    @MyProfile
    public void do3 () {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

