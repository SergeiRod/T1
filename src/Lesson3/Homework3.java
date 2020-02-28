package Lesson3;

public class Homework3 {
    //2. Naiti nim i max v odnomernom massive, pomenjat ih mestami i vyvesti na pechat resultirujushij massiv
    public static void minMaxChange(int[] array) {
        int min = array[0], max = array[0];

        int indexOfMin = 0, indexOfMax = 0;

        System.out.print("array = {");
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

        System.out.print("}");
        System.out.println("\n" + "Min [" + min + "," + max + "] Max");
        System.out.println("\n");

        array[indexOfMax] = min;
        array[indexOfMin] = max;
        int swap = min;
        min = max;
        max = swap;

        System.out.print("new array with swap= {");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println("}");

        System.out.println("Max [" + min + "," + max + "] Min");
        System.out.println("\n");
    }


    //3. Naiti nim i max v dvumernom massive, pomenjat ih mestami i vyvesti na pechat resultirujushij massiv
    public static void twoDimensionalArrayMaxMin(int[][] array) {
        int min = array[0][0], max = array[0][0];
        int indexIOfMin = 0, indexIOfMax = 0, indexJOfMin = 0, indexJOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                if (min > array[i][j]) {
                    min = array[i][j];
                    indexIOfMin = i;
                    indexJOfMin = j;
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexIOfMax = i;
                    indexJOfMax = j;
                }
                System.out.print("[" + i + "," + j + "] = " + value + "  ");
            }
            System.out.println();

        }
        System.out.println("Minimum value = " + min + "\nMaximum value = " + max);

        array[indexIOfMax][indexJOfMax] = min;
        array[indexIOfMin][indexJOfMin] = max;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                System.out.print("[" + i + "," + j + "] = " + value + "  ");
            }
            System.out.println();
        }

    }

    //4. Naiti summu elementov v dvuhmernom massive

    public static void sumOfDigitsTwoDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int currentCell = array[i][j];
                sum += currentCell;
            }
        }
        System.out.println("Sum of all digits= " + sum);
    }

    public static void main(String[] args) {
        int[] arrayNumber = {134, 688, 763, 344, 597};
        minMaxChange(arrayNumber);

        int[][] twoDimArray = {
                {797, 124, 809, 319},
                {478, 1431, 323, 101},
                {239, 798, 998, 738}
        };
        twoDimensionalArrayMaxMin(twoDimArray);
        sumOfDigitsTwoDimensionalArray(twoDimArray);
    }

}
