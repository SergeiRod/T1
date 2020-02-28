package Lesson8;

public class L8 {
    public static void main(String[] args) {
        WithPerimeter krug1 = new Krug(4);
        WithSquare krug2 = new Krug(3);
        krug2.printFromInterface();
        Krug krug3 = new Krug(6);

        krug1.calculatePerimeter();
        krug2.calculateSquare();
        krug3.printFromKrug();

        /*Krug restoredKr = null;
        Kvadrat restoredKv = null;
        //krug1 = krug2;
        if (krug1 instanceof Krug){
            restoredKr = (Krug) krug1;
        }
        if (krug1 instanceof Kvadrat){
            restoredKv = (Kvadrat) krug1;
        }*/

        krug3.printFromKrug();
        krug2.calculateSquare();
        krug1.calculatePerimeter();
        krug1.calculateSquare();

        WithSquare[] shape1;
        WithPerimeter[] shape2;
        Kvadrat[] kvadrats;
        Krug [] krups;

        WithSquare kvadrat1 = new Kvadrat(6);
        kvadrat1.printFromInterface();
        Kvadrat kvadrat2 = new Kvadrat(7);


    }
}
