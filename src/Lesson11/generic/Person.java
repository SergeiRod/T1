package Lesson11.generic;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public abstract class Person {
    protected String name;
    protected int age;
    protected Gender gender;
    protected String secondName;
    protected LocalDate birthday;

    public Person(String name, int age, Gender gender) throws IllegalArgumentException {
        this.name = name;
        if (age < 18){
                throw new IllegalArgumentException("You are to young!");
            }
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, Gender gender, String secondName, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.secondName = secondName;
        this.birthday = birthday;
    }

    public abstract int getAgePerson();
    public abstract int randomCrimeGenerator();

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException{
        if (age < 18){
            throw new IllegalArgumentException("You are to young!");
        }
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                '}';
    }


}
