package Lesson8;

public class Kvadrat implements WithPerimeter{
    private int side;

    public Kvadrat (int side) {
        this.side = side;
    }

    @Override
    public int calculatePerimeter (){
        return this.side*8;
    }

    public void printFromKvadrat (){

    }

    @Override
    public double calculateSquare() {
        return side*side;
    }

    @Override
    public void printFromInterface() {
        System.out.println("Hello form Kvadrat");
    }
}
