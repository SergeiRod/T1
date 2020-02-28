package Lesson8.Lesson7HW;

public class Accountant extends Employee {
    private String department;

    public Accountant(int age, String name, long salary, String department) {
        super(age, name , salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Accountants{" +
                "department='" + department + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
