package Lesson1;

public class Main {
    public static void main(String[] args) {
        double i = 121.0;
        double d1 = Math.pow(388.0, 3);
        double df=  i*1/3+d1;
        System.out.println(df);

        // Создайте программу выводящую на экран результаты следующих вычислений: (int) ((double)7 / 3 )*10 ) % 31=?
        int i1 = 0;
        double d2 = 7.0/3.0;
        i1 = (int)(d2*10)%31;
        System.out.println("Task1: "+i1);

        /* Создайте программу, которая вычислит выражение 69/100+18*(69-13^2+69/3.14) и выведет результат на экран.
        Замените число 69 переменной  b соответствующего типа и поэкспериментируйте с различными значениями. */
        double f = 69/100+18*(69-Math.pow(13.0, 2)+69/3.14);
        System.out.println("Task2 :" +f);

        double f1 = 0;
        double i2 = 13, i3 = 2;
        double f2 = Math.pow(i2, i3);
        double f3 = 69;
        f1 = f3/100+18*(f3-f2+f3/3.14);
        System.out.println("Task2 :" +f1);

        //В переменных a и b хранятся два натуральных числа.
        //Создайте программу, выводящую на экран результат деления a на b с остатком.
        // Пример вывода программы "17 / 8  = 2,  остаток 1"

        // Доделать

        int a = 33;
        int b = 12;
        System.out.println("Task3 :"+ "остаток "+a%b);

    }
}
