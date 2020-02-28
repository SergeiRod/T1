/*
package myClasses;

import Lesson7.Point;

public class Triangle {
private int a;
    private int b;
    private int c;

    private Point a;
    private Point b;
    private Point c;


    public Triangle(int a, int b, int c) {
        arePositive(a, b, c);
        isValid(a, b, c);
        this.a = a; // point a (x,y)
        this.b = b;
        this.c = c;
    }

    private void isValid(int a, int b, int c) {
        if (a + b > c && b + c > a) {
            System.out.println("Possible to calculate perimeter");
        } else {
            System.out.println("Not possible to calculate perimeter");
            throw new IllegalArgumentException(); //исключение
        }
    }

    private void arePositive(int a, int b, int c) {
        isPositive(a);
        isPositive(b);
        isPositive(c);
    }

    private void isPositive(int paramName) {
        if (paramName > 0) {
            System.out.println("Triangle is Ok");
        } else {
            System.out.println("One of sides is less then 0");
            throw new IllegalArgumentException();
        }
    }

    public int getA() {
        isPositive(a);
        return this.a;
    }

    public void setA(Point a) {
        isPositive(a);
        this.a = a;
    }

    public int getB() {
        isPositive(b);
        return this.b;
    }

    public void setB(Point b) {
        isPositive(b);
        this.b = b;
    }

    public int getC() {
        isPositive(c);
        return this.c;
    }

    public void setC(Point c) {
        isPositive(c);
        this.c = c;
    }

    public double getPerimeter() {
        //int p = this.a + this.b + this.c;
        double result = 0;
        double ab = Math.sqrt(Math.pow(this.a.getX()) - this.a.getY())
                + Math.pow((this.c.getY()-this.));
        return p;
    }

public float getAreaTriangle () {
        float s = Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2);
        return s;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
*/
