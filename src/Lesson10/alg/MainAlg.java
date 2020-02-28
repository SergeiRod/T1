package Lesson10.alg;

import Lesson7.Point;
import Lesson7.TriangleX;
import Lesson8.HomeWork8.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import static Lesson10.alg.AlgorithmUtils.factorial;
import static Lesson10.alg.AlgorithmUtils.getList;

public class MainAlg {
    public static void main(String[] args) {
        // O(1)
        /*int [] arraySmall = AlgorithmUtils.generateArray(3);
        int [] arrayBig = AlgorithmUtils.generateArray(9999);

        long timeStart1 = LocalDateTime.now().getNano();
        //AlgorithmUtils.printLength(arraySmall);
        AlgorithmUtils.printMax(arraySmall);
        long timeFinnish1 = LocalDateTime.now().getNano();
        long execTime1 = timeFinnish1 - timeStart1;
        System.out.println("Exec Time: "+ execTime1);


        long timeStart2 = LocalDateTime.now().getNano();
        long timeFinnish2 = LocalDateTime.now().getNano();
        //AlgorithmUtils.printLength(arrayBig);
        AlgorithmUtils.printMax(arrayBig);
        long execTime2 = timeFinnish2 - timeStart2;
        System.out.println("Exec Time: "+ execTime2)*/;

        /*ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);*/

        System.out.println(factorial(15    ));


        String red = "red";
        String blue = "blue";
        String black = "black";
        String white = "white";
        String yellow = "yellow";
        String green = "green";
        String purple = "purple";
        String orange = "orange";
        String  pink = "pink";
        String grey = "grey";
        String pearl = "pearl";

        ArrayList<String> list = new ArrayList<>();
        list.add(red);
        list.add(blue);
        list.add(black);
        list.add(white);
        list.add(yellow);
        list.add(green);
        list.add(purple);
        list.add(orange);
        list.add(pink);
        list.add(grey);

        System.out.println(list);
        System.out.println("+++++++++++++++++++++++++++++");
        for (int i = list.size()-1; i >0; i--){
            System.out.println(list.get(i).toUpperCase());
        }
        System.out.println("+++++++++++++++++++++++++++++");
        list.add(0, list.get(9));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Is removed "+list.remove(5));
        System.out.println(list);
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(list.get(0));
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(list.set(3,pearl));
        System.out.println(list);
        System.out.println("+++++++++++++++++++++++++++++");
        for (int i = 0; i < 3; i++) {
            System.out.println("removed "+list.remove(3));

        }
        System.out.println(list);
        System.out.println(list.size());


    }

}
