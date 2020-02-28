package Lesson9.Observer;

public class EuroNews implements Observer{


    @Override
    public void getEvent(String forecast) {
        System.out.println(" EuroNews says ... ");
        System.out.println(" Weather is " + forecast);

    }
}
