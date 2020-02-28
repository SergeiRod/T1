package Lesson6;

import Lesson7.Point;
import myClasses.Men;
//import myClasses.Triangle;

//valiIT
//petProject

public class L6 {
    public static void main(String[] args) {
        Men m = new Men();
        m.setFirstName("Jana");
        m.setLastName("Brown");
        m.setGender(45);
        m.setExperience(20);
        m.setGender(Men.MAN); // работа с константой

        System.out.println("FName: "+m.getFirstName());
        System.out.println("LName: "+m.getLastName());
        System.out.println("Age: "+m.getAge());
        System.out.println("Experience "+m.getExperience());
        System.out.println("Gender "+m.getExperience());

        //pojo plain all java object конструктор по умолчанию getter/setter

        int sideA = 2;
        int sideB = 3;
        int sideC = 3;

        /*Triangle triangle = new Triangle(sideA,sideB,sideC);
        //int perim1 = triangle.getPerimeter();
        System.out.println("Triangle perimeter = "+perim1);
        System.out.println("A=" + triangle.getA());
        triangle.setA(3);
        System.out.println("A=" +triangle.getA());
        System.out.println(perim1);

        Triangle -tr1 = new Triangle(new Point(1,1),new Point(5, 1),new Point(3,2));
        System.out.println("Perim of "+ tr1 + "is "+tr1.getPerimeter);*/
    }
}
