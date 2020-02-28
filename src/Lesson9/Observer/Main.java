package Lesson9.Observer;

public class Main {
    public static void main(String[] args) {
        Observer cnn = new CNN();
        Observer en = new EuroNews();
        Observer pj = new Pjatyj();

        MeteoStation meteo = new MeteoStation();

        /*meteo.addObserver(cnn);
        meteo.addObserver(en);
        meteo.addObserver(pj);*/ // Если метол public void addObserver

        meteo.addObservers(cnn,en,pj); // Если метол public void addObservers

        meteo.eventFired("Hurricane!!!");
        meteo.eventFired("Flood!!!");
        meteo.removeObservers(pj);
        meteo.eventFired("Hot");

    }
}
