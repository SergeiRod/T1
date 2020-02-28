package Lesson12.HomeWork12;


import Lesson11.generic.Person;

import java.util.function.UnaryOperator;

public class MyUnaryOperator implements UnaryOperator<Person> {

    @Override
    public Person apply(Person p) {
        p.setAge(p.getAge() + 6);
        return p;
    }
}
