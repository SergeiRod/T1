package Lesson8.Lesson7HW;

/*2.  В комании работают:
программисты (возраст,  имя, ЗП, язык программирования),
администраторы (возраст, имя, ЗП, отдел) и
бухгалтеры (возраст, имя, ЗП и отдел).
Создайте конструктор с параметрами   для всех классов для всех параметров.
Реализуйте в классе Компания метод,
определяющий имя сотрудника  с самой  большой ЗП.
Naidite samogo molodogo sotrudnika.
Produmaite dizain klassov s uchetom podhodjashei ierarhii i nasledovanija.*/

public class Company {

    private Employee [] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void findMaxSalary (){
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i <employees.length ; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        System.out.println("Employee "+ employeeWithMaxSalary.getName() + " has salary "+ employeeWithMaxSalary.getSalary());
    }
}
