package Lesson5;

import myClasses.Car;
import myClasses.Person;

public class SortingExamples { //сортировка перебором
    public static void sortAndPrintArrayOfInt(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int current = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = current;
                }
            }
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }

    public static void sortAndPrintArrayOfPerson(Person[] team) {
        //TODO implement Person sorting by age
        //System.out.print("Person[]arrayPersonToSort sort by Ascending = ");
        for (int i = 0; i < team.length; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].age > team[j].age) {
                    Person current = team[i];
                    team[i] = team[j];
                    team[j] = current;
                }
            }
        }
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i] + " ");
        }
        System.out.println("\n");
    }

    public static void sortAndPrintArrayOfCar(Car[] autoPark) {
        //TODO implement Car sorting by price
        //System.out.print("\n"+"Car[]arrayCarToSort sort by Descending = ");
        for (int i = 0; i < autoPark.length; i++) {
            for (int j = i + 1; j < autoPark.length; j++) {
                if (autoPark[i].price < autoPark[j].price) {
                    Car current = autoPark[i];
                    autoPark[i] = autoPark[j];
                    autoPark[j] = current;
                }
            }
        }
        for (int i = 0; i < autoPark.length; i++) {
            System.out.println(autoPark[i] + " ");
        }
    }
}
