package Lesson9.Observer;

public class Pjatyj implements Observer {


    @Override
    public void getEvent(String forecast) {
        System.out.println(" Pjatyj говорит ... ");
        System.out.println(" Погода будет " + forecast);

    }
}
