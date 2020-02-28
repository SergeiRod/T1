package myClasses;

import java.util.Objects;

public class Person {

    public Person() {
        System.out.println("Constructor...");
        this.companyName = "FB";
    }

    public Person(String name) {
        System.out.println("Constructor2...");
        this.companyName = "Oracle";
        this.name = name;
    }

    public Person(long salary) {
        System.out.println("Constructor3...");
        this.salary = salary;
        int randomAge = (int) (Math.random() * 47 + 18);
        this.age = randomAge;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.name + "!!!");
    }

    public void becameOneYearOlder() {
        this.age++;
    }

    public void sayHelloTo(Person toPerson) {
        System.out.println(this.name + " says Hello to " + toPerson.name + " :)");
    }

    public int age;
    public long salary;
    public String name;
    public String companyName;
    public boolean gender;

    public Person(int age, long salary, String name, String companyName, boolean gender) {

        if (age < MIN_AGE) {
            System.out.println("Impossible");
        }
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.companyName = companyName;
        this.gender = gender;
    }


    // static значит переменная относится к классу и как класс хранится в статической памяти

    public static final int MAX_AGE = 99; // final = константа  MAX_AGE
    public static final int MIN_AGE = 18; // final = константа  MAX_AGE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                salary == person.salary &&
                gender == person.gender &&
                Objects.equals(name, person.name) &&
                Objects.equals(companyName, person.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary, name, companyName, gender);
    }

    @Override //перепеши под себя
    public String toString() {
        return "Lesson5.L5.Person{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
