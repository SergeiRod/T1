package Lesson11.generic;

import java.time.LocalDate;
import java.time.Period;

public class Citizen extends Person {
    boolean healthInsuranceStatus;

    public Citizen(String name, int age, Gender gender, boolean healthInsuranceStatus) {
        super(name, age, gender);
        this.healthInsuranceStatus = healthInsuranceStatus;

    }

    public Citizen(String name, Integer age, Gender gender, String secondName, LocalDate birthday, boolean healthInsuranceStatus) {
        super(name, gender, secondName, birthday);
        this.healthInsuranceStatus = healthInsuranceStatus;
        this.age = getAgePerson();
    }

    public boolean isHealthInsuranceStatus() {
        return healthInsuranceStatus;
    }

    public void setHealthInsuranceStatus(boolean healthInsuranceStatus) {
        this.healthInsuranceStatus = healthInsuranceStatus;
    }

    @Override
    public int getAgePerson() {
        return Period.between(this.birthday, LocalDate.now()).getYears();
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
