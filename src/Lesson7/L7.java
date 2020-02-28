package Lesson7;

import java.util.Scanner;

import static Lesson7.TriangleX.*;

public class L7 {
    public static void main(String[] args) {
        Shape square = new SquareX();
        square.calculatePerimeter();
        Shape square1 = new SquareX();
        square1.printFromAbstract();

        Shape circle = new CircleX();
        circle.calculatePerimeter();
        circle = square; // Полиморфная ссылка
        if (circle instanceof SquareX){
            SquareX sq = (SquareX) circle;
        }


        Shape triangle = new TriangleX();
        triangle.calculatePerimeter();

        System.out.println(PI);
        //System.out.println(TriangleX.printBlah());

        //Object [] basket = {square, circle, triangle};
        Shape [] basket = {square, circle, triangle};
        int maxPerimeter = 0;
        for (int i = 0; i < basket.length; i++) {
            Shape shape = basket[i];
            int currentPerimeter = shape.calculatePerimeter();
            if (currentPerimeter>maxPerimeter){
                maxPerimeter = currentPerimeter;
            }

            //Object shape = basket[i]; // так как массив объект, то можно достать его как объект Object
            /*Shape shape = basket[i];
            if (shape instanceof SquareX) {
                SquareX squareX = (SquareX) shape;
                int currentPerimeter = squareX.calculatePerimeter();
                if (currentPerimeter > maxPerimeter) {
                    maxPerimeter = currentPerimeter;
                }
            } else if (shape instanceof CircleX) {
                CircleX squareX = (CircleX) shape;
                int currentPerimeter = squareX.calculatePerimeter();
                if (currentPerimeter > maxPerimeter) {
                    maxPerimeter = currentPerimeter;
                }
            } else if (shape instanceof TriangleX) {
                TriangleX squareX = (TriangleX) shape;
                int currentPerimeter = squareX.calculatePerimeter();
                if (currentPerimeter > maxPerimeter) {
                    maxPerimeter = currentPerimeter;

                }
            }*/
        }
    }

}
