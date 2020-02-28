package Lesson8;

public class Krug implements WithPerimeter {
    private int radius;


    public Krug(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (radius* WithSquare.MY_PI);
    }



    public void printFromKrug (){

    }

    @Override
    public double calculateSquare() {
        return radius*radius*WithSquare.MY_PI;
    }
}

