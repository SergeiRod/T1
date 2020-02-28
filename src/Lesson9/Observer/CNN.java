package Lesson9.Observer;

public class CNN implements Observer {


    @Override
    public void getEvent(String forecast) {
        System.out.println(" CNN says ... ");
        System.out.println(" Weather is " + forecast);
    }
}
