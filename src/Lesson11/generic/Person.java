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
    private boolean crime;

    public Person(String name, int age, Gender gender) throws IllegalArgumentException {
        randomCrimeGenerator();
        this.name = name;
        if (age < 18) {
            throw new IllegalArgumentException("You are to young!");
        }
        this.age = age;
        this.gender = gender;

    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean isCrime() {
        return crime;
    }

    public Person(String name, Gender gender, String secondName, LocalDate birthday) {
        randomCrimeGenerator();
        this.name = name;
        this.gender = gender;
        this.secondName = secondName;
        this.birthday = birthday;
    }

    private void randomCrimeGenerator() {
        int random = (int) (Math.random() * 10);
        this.crime = random % 2 == 0;
    }

    public abstract int getAgePerson();

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 18) {
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
