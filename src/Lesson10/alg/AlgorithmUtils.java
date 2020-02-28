package Lesson10.alg;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmUtils {
    public static int[] generateArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            int element = (int) (Math.random() * 1000);
            array[i] = element;
        }
        return array;
    }

    // O(1)
    public static void printLength(int[] array) {
        System.out.println("Array length: " + array.length);

    }

    //0(n)
    public static void printMax(int[] array) {
        int max = 0;
        for (int item : array) {
            if (item > max)
                max = item;

        }
        System.out.println("Max: " + max);

    }

    public static List<Integer> getList(int count) {
        //TODO ..

        return null;
    }

    public static void printList(List<Integer> list) {
        // TODO print all items
    }

    public static long factorial(long n) {
        long fac;
        if (n == 0) {
            return 1;
        }
        fac = n * factorial(n - 1);
        return fac;
    }
}

// ArrayList Чтение
// LinkedList Вставка
// Queue элементы добавляются в начало массива
// Set не гарантируют порядок, без дубликатов. HashSet множестиво, хэш таблица.
// TODO equals и Hashcode Контракт разобраться
// SortedSet ... TreeSet (красно, черное) Порядок и быстрый поиск

// Map колекция с ключем значений Key (Bucket) - Value
