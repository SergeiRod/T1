package Lesson17;

import Lesson11.generic.Citizen;
import Lesson11.generic.Gender;
import Lesson11.generic.Person;
import Lesson11.generic.PublicInsuranceCompany;
import Lesson14.CarManufacturers;
import Lesson8.HomeWork8.Car;
import Lesson8.HomeWork8.CarCondition;
import Lesson8.HomeWork8.PassengerCar;
import Utils.ExceptionUtils;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.imageio.IIOException;
import java.io.*;
import java.time.LocalDate;

public class Lesson17 {
    public static void main(String[] args) {
        //Car car1 = new PassengerCar(2000, CarManufacturers.BMW, CarCondition.EXCELLENT, 5);
        //System.out.println(car1);
        Car car2 = new PassengerCar(1991, CarManufacturers.MERCEDES_BENZ, CarCondition.GOOD, 5);
        System.out.println(car2);
        //car2.setYearOfRelease(1989);
        //System.out.println(car2);
        //Car car3 = new PassengerCar(1999, CarManufacturers.TOYOTA, CarCondition.GOOD, 5);
        //System.out.println(car3);
        //Car car4 = new PassengerCar(1999, CarManufacturers.ROLLS_ROYCE, CarCondition.BAD, 5);
        //System.out.println(car4);






        /*System.out.println("Hello from Lesson 17");
        try {
            ExceptionUtils.throwableExperiment("My throwable!");
            System.out.println("Hello from Lesson 17");
        }catch (Throwable t) {
            t.getStackTrace();
            System.out.println("Detail message: "+t.getMessage());

            throw  new RuntimeException(t);
        }*/

        /*public static void main(String[] args) throws Throwable{
            System.out.println("Hello from Lesson 17");
            ExceptionUtils.throwableExperiment("My throwable!");
*/

        /*try {
            ExceptionUtils.runtimeExceptionExperiment("My Runtime!!");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*int i = 2;
        try {
            if(i==1) {
                ExceptionUtils.exceptionExperiment("From Exception");
            } else {
                ExceptionUtils.myExceptionExperiment();
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        catch (Throwable e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("Hello from finally!!!");
        }*/
        //BufferedReader reader = null;
        /*try {
            reader = new BufferedReader(new FileReader("C:\\Users\\srvsi\\IdeaProjects\\T1\\.idea"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert email...");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("send alert email...");

            }
        }*/

        try (
                Closeable myResource = () -> System.out.println("Hello from closable!");
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\srvsi\\IdeaProjects"))
        ){
            String line = reader.readLine();
            System.out.println("send alert email...");
            System.out.println(myResource);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert email...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert email...");
        }

        Citizen citizen = new Citizen("Maria", Gender.FEMALE, "Mat", LocalDate.of(2003, 02, 01),true);
        System.out.println("Customer age is "+citizen.getAgePerson());


        PublicInsuranceCompany insuranceCompany = new PublicInsuranceCompany();
        try {
            insuranceCompany.registerPolicyLocally(citizen);
        } catch (CrimeException e){
            e.printStackTrace();
            System.out.println("You have tried to issue policy for the criminal!");
        }

    }
}





