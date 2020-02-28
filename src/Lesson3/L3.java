package Lesson3;

public class L3 {
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentCell = array[i];
            sum += currentCell;
        }
        return sum;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //System.out.println(array[i]);
            int currentCell = array[i];
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(max);
        return max;
    }

    static long whileSum() {
        long[] train = {34, 45, 70};
        int sum = 0, i = 0;
        while (i < train.length) {
            sum += train[i];
            i++;
        }
        System.out.println("Sum of while = " + sum);
        return sum;
    }


    static long whileMin() {
        long[] train = {54, 45, 70, 33, 42};
        long min = train[0];
        //long max = train[0];
        int i = 1;
        while (i < train.length) {
            if (min > train[i]) {
                min = train[i];
            }
            i++;
        }
        System.out.println("Min is :" + min);
        return min;
    }

    public static int minMaxChange(int[] array) {
        int min = array[0], max = array[0];

        int indexOfMin = 0, indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            //int currentCell = array[i];
            if (min > array[i]) {
                min = array[i];
                indexOfMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexOfMax = i;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");

        int temp = indexOfMin;
        indexOfMin = indexOfMax;
        indexOfMax = temp;

        System.out.println(array);

        System.out.println("\n" + "Min [" + min + "," + max + "] Max");
        return max;

    }


    public static void main(String[] args) {
        //System.out.println(args[2]);
        int[] arrayNumber = {1, 6, 3, 4};
        System.out.println(sum(arrayNumber));
        System.out.println(max(arrayNumber));
        max(arrayNumber);
        whileSum();
        whileMin();
        minMaxChange(arrayNumber);

        //Test 1
        /*int a = 1;
        for (int i = 0; i <10; i++) {
            a=a+2;
        }
        System.out.println("a = "+a);*/

        // Test2
        /*int a=10;
        int k=1;
        while ( a>1 ) {
            a--;
            k++;
        }
        System.out.println("a= "+a+"\n"+"k= "+k);*/

        //Test3
        /*int a=3;
        do {
            a+=2;
        } while ( a<5 );
        System.out.println("a= "+a);*/

        //Test4
        /*int a = 1;
        for ( int i = 0; i<10; i++ ) {
            a=a+2;
            if (a>4){
                break;
            }
        }
        System.out.println("a= "+a);*/

        //Test 5
        /*int a = 1;
        for ( int i = 0; i<7; i++ ) {
            if (a==5){
                continue;
            }
            a=a+1;
        }
        System.out.println("a= "+a);*/


        String[][] group = {
                {"N1", "N2", "N3"},
                {"I1", "I2", "I3"},
                {"K1", "K2", "K3"}
        };
        for (int i = 0; i < group.length; i++) {
            //String[] row = group [i];
            for (int j = 0; j < group[i].length; j++) {
                //String nameR = row [j];
                String name = group[i][j];
                System.out.print("[" + i + "," + j + "] = " + name + "  ");
            }
            System.out.println();
        }

    }

}