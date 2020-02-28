package Lesson2;

public class HomeworkL2 {
    // 1 Создать программу проверяющую находится ли число в интервале -50 …20;

    public static int getIfNumberInTheInterval(int from, int to) {
        int start = to - from;
        int end = from;
        int x = (int) (Math.random() * start + end);
        //System.out.println("Random number is: "+x);
        return x;

    }

    public static void checkRandomNumberIfInRange (int intFrom, int intTo,
                                                   int randFrom, int randTo) {
        int random =  getIfNumberInTheInterval(randFrom, randTo);
        if ((random >= intFrom & random <= intTo) && (random==5 || random==6 || random==8 || random==9)) {
            System.out.println("Random number is in range " + random + " and it is FALSE condition ");
        } else {
            System.out.println("Random number  is not in range " + random + " and it is TRUE condition");
        }

    }

    //2. Создать программу проверяющую переменную b  в случае если переменная
    // равна 6, 5, 8, 9 выводить "False " иначе выводить "True".

    public static void checkVariableB () {
        int b = (int) (Math.random() * 10 + 1);
        System.out.println("B equals = "+b);
        if (b==5 || b==6 || b==8 || b==9) {
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }

    }

    // 3. Обьединить все условия v odin metod смотри задание 1.


    //4. Создайте программу, которая вычислит выражение 69/100+18*(69-13^2+69/3.14)
    // и выведет результат на экран.Замените число 69 переменной
    // b соответствующего типа и поэкспериментируйте с различными значениями.
    public static void bExperimental () {

        double f = 0, fr = 0, i2 = 13, i3 = 2, f2 = Math.pow(i2, i3), f3 = 69, f4 = Math.random() * 70 + 1;
        f = f3/100+18*(f3-f2+f3/3.14);
        fr = f4/100+18*(f4-f2+f4/3.14);
        System.out.println("Task4 :" +f);
        System.out.println("Task4 :" +fr);
    }

    // 5. В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.

    public static void sumOfNumberWithTwoDigits () {
        int n = (int) (Math.random() * 89 + 10), sum;
        //int n , sum;
        //n = 45;
        for(sum=0; n!=0; n/=10) {
            sum+=n%10;
        }
        System.out.println("Sum of digits of a number is "+sum);

    }

     //6. В переменной n хранится трехзначное число. Создайте программу,
    // вычисляющую и выводящую на экран сумму цифр числа n;

    public static void sumOfNumberWitThreeDigits () {
        int n = (int) (Math.random() * 899 + 100), sum;
        //int n , sum;
        //n = 945;
        for(sum=0; n!=0; n/=10) {
            sum+=n%10;
        }
        System.out.println("Sum of digits of a number is "+sum);

    }

    /*7. ** В три переменные a, b и c записаны три вещественных числа(parametry metoda).
    Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
    либо сообщать, что корней нет. (https://www.mathsisfun.com/algebra/quadratic-equation.html posmotret Summary) */

    public static void quadraticEquations() {
        double a = -13;
        double b = 4;
        double c = 2;
        double d = Math.pow(b, 2) - 4*a*c;
        if (d > 0) {
            double x = -b + Math.sqrt(Math.pow(b, 2)- 4 * a * c);
            double y = -b - Math.sqrt(Math.pow(b, 2)- 4 * a *c);
            System.out.println(x);
            System.out.println(y);
        } else if (d == 0) {
            double x = -b / 2 * a;
            System.out.println(x);
        } else {
            System.out.println("Корней нет");
        }
    }


    //8. Есть три отрезка, различной длины, данные хранятся в переменных а, b и c.
    // Проверить возможно ли из этих отрезков создать треугольник.
    // (symma dvuh storon treugolnika menshe tretjei storony)

    public static void isTrianglePossible (int a, int b, int c) {

        if ((a + b < c) && (b + c > a)) {
            System.out.println("Построить треугольник нельзя");
        } else {
            System.out.println("Построить треугольник можно");
        }

    }

    public static void main(String[] args) {
        //getIfNumberInTheInterval(-50, 20);
        checkRandomNumberIfInRange(-50, 20, -100, 50);
        //int x = (int) (Math.random() * (-30) +20);
        //System.out.println(x);
        checkVariableB();
        bExperimental();
        sumOfNumberWithTwoDigits();
        sumOfNumberWitThreeDigits();
        quadraticEquations();
        isTrianglePossible(2,3,4);
    }
}
