package Lesson8.Lesson7HW;

public class Main {
    public static void main(String[] args) {

        //ExternalEmployee ee = new ExternalEmployee();
        /*ee.makeCoffee();
        ee.getCoder().getProgrammingLanguage();*/

        Coder programmers = new Coder(23, "Mark", 130_000, "Java");
        Accountant accountants = new Accountant(45, "Natalia", 30_000, "FIN");
        /*accountants.setSalary(4000);
        accountants.setName("Masha");*/
        Administrator administrators4 = new Administrator(34, "Dan", 50_000, "IT");
        Administrator administrators3 = new Administrator(34, "Due", 30_000);
        Company fb = new Company();
        Employee[] employees =  {programmers, accountants, administrators4, administrators3};
        fb.setEmployees(employees);
        fb.findMaxSalary();


    }
}
