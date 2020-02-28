package Lesson2;

import java.sql.SQLOutput;

public class Day2 {

    public static void printMyMessage(int i, double d) { // сигнатура метода
        System.out.println("Int ->" + i);
        System.out.print("Int ->" + i);
        System.out.println("Double ->" + d);
        System.out.print("Double ->" + d);
    }

    public static int getSum(int a, int b) { // вернет сумму int типа
        System.out.println(("a+b=" + a + b));
        return (int) (a + b + 1.0);
    }

    public static void getClosestTo100(double m, double n) {
        double mDelta = Math.abs(100 - m);
        double nDelta = Math.abs(100 - n);
        if (mDelta == nDelta) {
            System.out.println("equally");
        } else if (mDelta > nDelta) {
            System.out.println("n is closest");
        } else {
            System.out.println("m is closest");
        }
    }

    public static boolean isEven(int s) {
        int rest = s % 2;
        boolean result = rest == 0;
        if (result) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        return result;
    }

    /*
        public static void checkRandomInterval() {
            double randomOrigin = Math.random();
            int random = (int) (randomOrigin * 150 + 5);
            // () не входит значение
            // [] входит значение
            // (25,100]
            if (random <= 25) {
                System.out.println("Ne popal: " + random);
            } else if (random > 100) {
                System.out.println("Ne popal: " + random);
            } else {
                System.out.println("Popal: " + random);
            }

        }
    */
    public static int getRandomFromInterval(int from, int to) {
        // [5..150]
        int start = to - from; // 150
        int end = from; // 5
        return (int) (Math.random() * start + end);
    }

    public static void checkRandomInterval(int intFrom, int intTo,
                                           int randFrom, int randTo) {
        //double randomOrigin = Math.random();
        //int random = (int) (randomOrigin * 150 + 5);
        int random = getRandomFromInterval(randFrom, randTo);
        if (random > intFrom && random <= intTo) {
            System.out.println("Popal: " + random);
        } else {
            System.out.println("Ne popal: " + random);
        }

    }

    public static void main(String[] args) {
        checkRandomInterval(3, 4, 9, 9);
    }

}


    //public static void printArrayInReverseOrder (array) {
    //    for (array=array.length-1; array<=0; array--) {

    //    }
    //}

    //public static void main(String[] args) {
    //    checkRandomInterval (0,1,23, 3 );
    //}
        //printMyMessage(4, 4);
        //printMyMessage(6, 6.0);
        //int sum = getSum (77, 23);
        //getClosestTo100(90, 140);
        //isEven(4);
        //isEven(7);
        //isEven(1428);
        //System.out.println((int) (Math.random()*3)+1); // Выводит от 0 до 4
        //int i = 10;
        //i = i++;
        //int j = 10;
        //j = ++j;
        //System.out.println("i="+i);
        //System.out.println("j="+j);
        //if (i == j) {
            //System.out.println("TRUE");
        //} else {
            //System.out.println("FALSE");
        //    for (int i =0; i<array.length; i++){
        //        System.out.println(array[i]);
        //    }
        //}
    //}
//}
