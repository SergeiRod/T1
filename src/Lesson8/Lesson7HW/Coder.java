package Lesson8.Lesson7HW;

import Lesson8.Lesson7HW.Company;
import Lesson8.Lesson7HW.Employee;

public class Coder extends Employee {
    private String programmingLanguage;
    private Company company;

    public Coder(int age, String name, long salary, String programmingLanguage) {
        super(age, name , salary);
        // super class parent class в данном случае Employee
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Programmers{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
