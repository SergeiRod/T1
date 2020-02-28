package Lesson7;

import java.util.Scanner;

public class CircleX extends Shape{


    public CircleX (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input circle Radius :");
        Integer radiusFromConsole = scanner.nextInt();
        this.side = radiusFromConsole;
    }

    @Override
    public int calculatePerimeter () {
        int result = (int) (2 * Math.PI * side);
        System.out.println("Circle perimeter = "+result);
        return result;
    }

    public void printFromCircle () {
        System.out.println("Circle");
    }

    public int getRadius() {
        return side;
    }

    public void setRadius(int radius) {
        this.side = radius;
    }
}
