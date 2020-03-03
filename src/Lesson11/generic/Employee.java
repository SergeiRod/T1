package Lesson11.generic;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private int income;


    public Employee(String name, int age, Gender gender, int income) {
        super(name, age, gender);
        this.income = income;
    }

    public Employee(String name, int age, Gender gender, String secondName, LocalDate birthday, int income) {
        super(name, gender, secondName, birthday);
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public int getAgePerson() {
        Period p = Period.between(this.birthday, LocalDate.now());
        return p.getYears();
    }

    @Override
    public int randomCrimeGenerator() {
        int crime = (int) ((Math.random() *  10) );
        if (crime < 5) {
            System.out.println("Crime commit");
        } else {
            System.out.println("No crime commit");
        }
        return crime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "income=" + income +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                '}';
    }


}

