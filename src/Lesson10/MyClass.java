package Lesson10;

public class MyClass {
    private int myProperty;
    private String myPropertyString;
    private ProfessionalDate professionalDate;

    public MyClass(int myProperty, String myPropertyString, ProfessionalDate professionalDate) {
        this.myProperty = myProperty;
        this.myPropertyString = myPropertyString;
        this.professionalDate = professionalDate;
    }

    class ProfessionalDate {
        private int salary;
        private int taxes;
        private String department;



        public ProfessionalDate() {

        }

        public ProfessionalDate(int salary, int taxes, String department) {
            this();
            this.salary = salary;
            this.taxes = taxes;
            this.department = department;
        }
    }
    public static class InnerStatic {

    }

}
