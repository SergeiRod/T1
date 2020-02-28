package Lesson9.Singleton;

// Изучить класс String

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
        System.out.println(singleton5);

        String str = "RTRTRUFJDTDKF";
        String str1 = new String("RRR");
        String str2 = new String("RRR");
        //System.out.println(str == str1);

        String [] split = str.split("T");
        //TODO проитерировать for
        System.out.println("Number of indexes in the array "+split.length);
        for (int i = 0; i <split.length; i++) {
            System.out.println("String by index "+ split[i] +" number of chars in String "+ split[i].chars().distinct().count());
        }

        String test = "literal";
        String test2 = new String("literal");
        System.out.println(test == test2);

        String test3 = "literal";
        String test4 = new String("literal").intern();
        System.out.println(test3 == test4);

        String test5 = "literal";
        String test6 = new String("literal").intern();
        System.out.println(test5.equals(test6));

    }
}
