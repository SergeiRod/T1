package Lesson4;

import myClasses.Car;
import myClasses.Person;

public class L4 {

    int y = true ? 5 : 6; // тернарный оператор, [boolExpr] ? val1 : val2
    // true - берется первое значение, false - берется второе значение, условие которое проверяется [boolExpr]

    //Класс (в отдельном файле каждый класс, здесь Lesson5.L5.Person.java)
    //public class Lesson5.L5.Person {
    // int age; - свойства класса properties
    //String name;
    // }

    //Объект экземпляр класса
    // Создание объекта с помощью слова new
    // Lesson5.L5.Person      p1 =      new Lesson5.L5.Person ();
    //  Type    Reference  Object in memory
    // Heap - зона где крутятся объекты

    static void printAverageAge(Person[] xMenZ) {

        for (int i = 0; i < xMenZ.length; i++) {
            Person p = xMenZ[i];
            System.out.println(p.name);
            //System.out.println(people[i]);
        }
        int sumAge = 0;
        int totalSalary = 0;
        for (int i = 0; i < xMenZ.length; i++) {
            sumAge += xMenZ[i].age;
            totalSalary += xMenZ[i].salary;
        }
        double averageAge = sumAge / xMenZ.length;
        double averageSalary = totalSalary / xMenZ.length;
        //double averageSalaryPerMonth = (totalSalary/xMenZ.length)/12;

        System.out.println("Average age= " + averageAge);
        System.out.println("Average salary= " + averageSalary);
        //System.out.println("Average salary per month = "+averageSalaryPerMonth);

    }

    static void printAgeVsSalaryMaxMin(Person[] team) {
        Person oldest = team[0];
        Person youngest = team[0];
        /*int oldest = team[0].age;
        int youngest = team[0].age;
        long salaryOldest = team[0].salary;
        long salaryYoungest = team[0].salary;
        String youngestName = team[0].name;
        String oldestName = team[0].name;*/

        for (int i = 1; i < team.length; i++) {
            if (team[i].age < youngest.age) {
                youngest = team[i];
                //salaryYoungest = team[i].salary;
                //youngestName = team[i].name;
            }
            if (team[i].age > oldest.age){
                oldest = team[i];
                //salaryOldest = team[i].salary;
               //oldestName = team[i].name;
            }
        }
        //System.out.println("\n" + "Youngest employee name is "+youngestName+ " and age is " + youngest + " and his/her salary is "+salaryYoungest);
        System.out.println("\n" + "Youngest employee name is "+youngest.name+ " and age is " + youngest.age + " and his/her salary is "+youngest.salary);
        //System.out.println("Oldest employee salary name is "+oldestName + " and age is "+ oldest + " and his/her salary is "+salaryOldest);
        System.out.println("Oldest employee salary name is "+oldest.name + " and age is "+ oldest.age + " and his/her salary is "+oldest.salary);
    }


    static void printBlah() {
        System.out.println("Blah");
    }

    static void maxCarPrice (myClasses.Car[] cars) {
        int carPrice = cars[0].price;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].price > carPrice ){
                carPrice = cars[i].price;
            }
        }
        System.out.println("\n"+"THe most expensive car price is "+carPrice);
    }

    public static void main(String[] args) {
        Person jack = new Person();
        jack.name = "Jack";
        jack.age = 23;
        jack.companyName = "FB";
        jack.gender = true;
        jack.salary = 150_000;

        Person joe = new Person();
        joe.name = "Joe";
        joe.age = 48;
        joe.companyName = "Google";
        joe.gender = true;
        joe.salary = 300_000;

        Person julia = new Person();
        julia.name = "Julia";
        julia.age = 25;
        julia.companyName = "Oracle";
        julia.gender = false;
        julia.salary = 350_000;

        /*julia = jack;
        joe = julia;*/

        //System.out.println("jack -> "+jack);
        //System.out.println("joe -> "+joe);
        //System.out.println("julia -> "+julia);

        Person[] people = {joe, julia, jack};
        Person[] people1 = {joe, jack};
        Person[] people2 = {joe, julia};


        printAverageAge(people);
        printAverageAge(people1);
        printAverageAge(people2);
        printBlah();
        printBlah();
        Person nik = new Person();
        //Lesson5.L5.Person dummy = null; // в никуда
        //nik = null;
        //System.gc(); //Garbage collector
        Person ivan = new Person("Ivan");
        System.out.println(nik.companyName);
        System.out.println(ivan.companyName);

        Person[] oracleTeam = new Person[10]; // Массив
        long baseSalary = 2000;
        for (int i = 0; i < oracleTeam.length; i++) {
            long personalSalary = baseSalary + i;
            oracleTeam[i] = new Person(personalSalary);
        }
        printAverageAge(oracleTeam);
        printAgeVsSalaryMaxMin(oracleTeam);


        Person p1 = new Person(18, 5000L,"Jane", "FB", true);
        p1.salary = 7000;
        p1.becameOneYearOlder();
        System.out.println(p1);
        Person p2 = new Person(30, 7000L,"Gregor", "FB", true);
        Person p3 = new Person(65, 9000L,"Max", "FB", true);
        p1.sayHello();
        p2.sayHello();
        p3.sayHello();

        p1.sayHelloTo(p2);

        Person[] dreamTeam = {p1, p2, p3};
        printAgeVsSalaryMaxMin(dreamTeam);

        System.out.println(Person.MAX_AGE);
        System.out.println(Person.MIN_AGE);

        Person petr = new Person(60, 9000L,"Petr", "FB", true);
        Person otherPetr = new Person(60, 9000L,"Petr", "FB", true);

        //otherPetr = petr;
        boolean resultLink = petr == otherPetr;
        boolean resultEquals = petr.equals(otherPetr);
        System.out.println("Link comparison: "+resultLink);
        System.out.println("Equal comparison: "+resultEquals);
        System.out.println("Petr Hash " + petr.hashCode());
        System.out.println("OtherPetr Hash " + otherPetr.hashCode());
        System.out.println(otherPetr.getClass().getName());
        System.out.println("Person Object States: "+petr);
        //System.out.println("Person Object States: "+petr.toString());

        // final
        final int f = 3;
        //f += 5;
        //f += 4;
        //f *=2;
        final Person p4 = new Person();
        Person p5 = new Person();
        //p4 = p5;

        Car price1 = new Car(25_000,3200,"WV", "red");
        Car price2 = new Car(20_000,3000,"Opel", "white");
        Car price3 = new Car(15_000,2000,"Smart", "purple");
        System.out.println("WV price is "+price1.price);
        System.out.println("Opel price is "+price2.price);
        System.out.println("Smart price is "+price3.price);
        Car[] carPrises = {price1,price2,price3};
        maxCarPrice(carPrises);

    }
}
