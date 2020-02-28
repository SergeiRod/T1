package Lesson11.generic;

import Lesson11.Auto;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        return o2.getAge()-o1.getAge();

    }
}
