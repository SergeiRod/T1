package Lesson5;

import myClasses.Car;
import myClasses.Person;
import sun.java2d.opengl.WGLSurfaceData;

public class L5 {

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
            if (team[i].age > oldest.age) {
                oldest = team[i];
                //salaryOldest = team[i].salary;
                //oldestName = team[i].name;
            }
        }
        //System.out.println("\n" + "Youngest employee name is "+youngestName+ " and age is " + youngest + " and his/her salary is "+salaryYoungest);
        System.out.println("\n" + "Youngest employee name is " + youngest.name + " and age is " + youngest.age + " and his/her salary is " + youngest.salary);
        //System.out.println("Oldest employee salary name is "+oldestName + " and age is "+ oldest + " and his/her salary is "+salaryOldest);
        System.out.println("Oldest employee salary name is " + oldest.name + " and age is " + oldest.age + " and his/her salary is " + oldest.salary);
    }


    static void printBlah() {
        System.out.println("Blah");
    }


    public static void main(String[] args) {

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

        printAgeVsSalaryMaxMin(oracleTeam);


        Person p1 = new Person(18, 5000L, "Jane", "FB", true);
        p1.salary = 7000;
        p1.becameOneYearOlder();
        System.out.println(p1);
        Person p2 = new Person(30, 7000L, "Gregor", "FB", true);
        Person p3 = new Person(65, 9000L, "Max", "FB", true);
        p1.sayHello();
        p2.sayHello();
        p3.sayHello();

        p1.sayHelloTo(p2);

        Person[] dreamTeam = {p1, p2, p3};
        printAgeVsSalaryMaxMin(dreamTeam);

        System.out.println(Person.MAX_AGE);
        System.out.println(Person.MIN_AGE);

        Person petr = new Person(60, 9000L, "Petr", "FB", true);
        Person otherPetr = new Person(60, 9000L, "Petr", "FB", true);

        //otherPetr = petr;
        boolean resultLink = petr == otherPetr;
        boolean resultEquals = petr.equals(otherPetr);
        System.out.println("Link comparison: " + resultLink);
        System.out.println("Equal comparison: " + resultEquals);
        System.out.println("Petr Hash " + petr.hashCode());
        System.out.println("OtherPetr Hash " + otherPetr.hashCode());
        System.out.println(otherPetr.getClass().getName());
        System.out.println("Person Object States: " + petr);
        //System.out.println("Person Object States: "+petr.toString());

        // final
        final int f = 3;
        //f += 5;
        //f += 4;
        //f *=2;
        final Person p4 = new Person();
        Person p5 = new Person();
        //p4 = p5;

        //Pereopredelit v klasse Car metody: toString, equals, hashCode;
        // Proverit ih raboty.
        Car wv1 = new Car(55_000, 2300, "WV", "blue");
        Car wv2 = new Car(55_000, 2300, "WV", "red");
        boolean resultLink1 = wv1 == wv2;
        boolean resultEquals1 = wv1.equals(wv2);
        System.out.println("Link comparison: " + resultLink1);
        System.out.println("Equal comparison: " + resultEquals1);
        System.out.println("wv1 Hash " + wv1.hashCode());
        System.out.println("wv2 Hash " + wv2.hashCode());
        System.out.println("wv2 toString " + wv1.toString());
        System.out.println("wv2 toString " + wv2.toString());
        System.out.println(wv1.getClass().getName());
        System.out.println(wv2.getClass().getName());
        System.out.println("Person Object States: " + wv1);
        System.out.println("Person Object States: " + wv2);

        Car skoda = new Car(20_000, 3200, "Skoda", "green");
        Car opel = new Car(10_000, 3000, "Opel", "black");
        //skoda = opel;
        boolean resultLink2 = skoda == opel;
        boolean resultEquals2 = skoda.equals(opel);
        System.out.println("Link result " + resultLink2);
        System.out.println("Equals result " + resultEquals2);
        System.out.println("Hash Skoda " + skoda.hashCode());
        System.out.println("Hash Opel " + opel.hashCode());
        System.out.println("toString Skoda " + skoda.toString());
        System.out.println("toString Opel " + opel.toString());
        System.out.println("Car Object is " + skoda);
        System.out.println("Car Object is " + opel);
        System.out.println(skoda.getClass().hashCode());
        System.out.println(opel.getClass().hashCode());
        System.out.println(skoda.getClass().getName());
        System.out.println(opel.getClass().getName());

        /*int s = 1;
        //int h = ++s;
        int l = s++;
        System.out.println(s);
        //System.out.println(h);
        System.out.println(l);*/

        int hex = 0x0aff;
        int eig = 0345;
        int bin = 101010110;
        System.out.println(hex);
        System.out.println(Integer.toBinaryString(hex));
        System.out.println(Long.toBinaryString(hex));
        System.out.println(eig);
        System.out.println(Integer.toBinaryString(eig));
        System.out.println(Long.toBinaryString(eig));
        System.out.println(bin);
        System.out.println(277 ^ 432);

        int x = 64;//значение
        int y = 3;//количество
        int z = (x << y);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(z));
        System.out.println(z);

        System.out.println(111111111 << 3);

        int x1 = 64;//значение
        int y1 = 2;//количество

        int z1 = (x1 >> y1);
        System.out.println(z1);

        int[] arrayToSort = {9, 9, 63, 8, 7, 2, 55, 7, 66, 44};
        //usage of static method:
        SortingExamples.sortAndPrintArrayOfInt(arrayToSort);

        //TODO add elements to array
        Person per1 = new Person(18, 5000L, "Jane", "FB", true);
        Person per2 = new Person(30, 7000L, "Gregor", "FB", true);
        Person per3 = new Person(16, 9000L, "Max", "FB", true);
        Person per4 = new Person(65, 9000L, "Max", "FB", true);
        Person per5 = new Person(42, 9000L, "Max", "FB", true);
        Person[] arrayPersonToSort = {per1,per2,per3,per4,per5};
        SortingExamples.sortAndPrintArrayOfPerson(arrayPersonToSort);

        //TODO add elements to array
        Car mini = new Car(20_000, 3200, "Mini", "green");
        Car nissan = new Car(15_000, 3000, "Nissan", "black");
        Car bmw = new Car(50_000, 3000, "BMW", "black");
        Car toyota = new Car(30_000, 3000, "Toyota", "black");
        Car  renault = new Car(25_000, 3000, "Renault", "black");
        Car[] arrayCarToSort = {mini,nissan,bmw,toyota,renault};
        SortingExamples.sortAndPrintArrayOfCar(arrayCarToSort);

    }

}
