package Lesson7;

import java.util.Scanner;

public class TriangleX extends Shape {


    public static double PI = 3.14;
    public static void printBlah (){
        System.out.println("Blah!!!");
    }

    public TriangleX (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input triangle side :");
        Integer sideFromConsole = scanner.nextInt();
        this.side = sideFromConsole;
    }

    @Override
    public int calculatePerimeter (){
        int result = 3*side;
        System.out.println("Triangle perimeter = "+result);
        return result;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    /*@Override
    protected void finalize () throws Throwable{
        System.out.println("bye,bye");
    }*/  //finalize для того чтобы  удалить объект либо в ручную вызвать
    // либо java сама его вызовает перед уделением garbidge collector.
}
