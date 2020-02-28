package Lesson8.Lesson7HW;

public class Administrator extends Employee {
    private String department;

    public Administrator(int age, String name, long salary, String department) {
        super(age, name , salary);
        this.department = department;
    }

    public Administrator(int age, String name, long salary) {
        super(age, name , salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Administrators{" +
                "department='" + department + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
