package Lesson11.generic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Citizen extends Person {
    boolean healthInsuranceStatus;

    public Citizen(String name, int age, Gender gender, boolean healthInsuranceStatus) {
        super(name, age, gender);
        this.healthInsuranceStatus = healthInsuranceStatus;

    }

    public Citizen(String name, Gender gender, String secondName, LocalDate birthday, boolean healthInsuranceStatus) {
        super(name, gender, secondName, birthday);
        this.healthInsuranceStatus = healthInsuranceStatus;
        getAgePerson();
        randomCrimeGenerator();
    }

    public boolean isHealthInsuranceStatus() {
        return healthInsuranceStatus;
    }

    public void setHealthInsuranceStatus(boolean healthInsuranceStatus) {
        this.healthInsuranceStatus = healthInsuranceStatus;
    }

    @Override
    public int getAgePerson() throws IllegalArgumentException{
        int ageCitizen = Period.between(this.birthday, LocalDate.now()).getYears();
        try {
            if (ageCitizen < 18) {
                throw new IllegalArgumentException("Customer is under 18!");
            }
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return ageCitizen;

    }

    public int crime;

    @Override
    public int randomCrimeGenerator() {
        crime = (int) ((Math.random() *  10) );
        if (crime < 5) {
            System.out.println("Crime commit");
        } else {
            System.out.println("No crime commit");
        }
        return crime;
    }


    @Override
    public String toString() {
        return "Citizen{" +
                "healthInsuranceStatus=" + healthInsuranceStatus +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                '}';
    }


}
