package Lesson10;

import java.util.ArrayList;

public class Recursion {
    static int getSumOfN(int n) {
        int summ = 0;
        for (int i = 0; i <= n; i++) {
            summ += i;
        }
        return summ;

    }

    static int getSumRec(int n) {
        if (n == 0){
            return 0;
        }
        return n + getSumRec(n-1);
    }

    static int getFiboByNumber (int n){
        if (n == 0 || n==1){
            return n;
        }
        return getFiboByNumber(n -1) + getFiboByNumber(n -2);
    }


    public static void main(String[] args) {
        int summ = getSumOfN(6666);
        int sumRec = getSumRec(6666);
        System.out.println(summ);
        System.out.println(sumRec);
        System.out.println(getFiboByNumber(4));


    }

}
