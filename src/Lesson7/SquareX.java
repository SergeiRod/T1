package Lesson7;

import java.util.Scanner;

public class SquareX extends Shape {


    public SquareX () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input side for Square :");
        int sideFromConsole = scanner.nextInt();
        this.side = sideFromConsole;
    }

    @Override  // означает переписать метод
    public int calculatePerimeter () {
        int result = 4 * this.side;
        System.out.println("Square perimeter = "+result);
        return result;
    }

    public void printFromSquare (){
        System.out.println("Square!!!");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
