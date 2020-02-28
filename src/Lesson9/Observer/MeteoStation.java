package Lesson9.Observer;

import java.util.ArrayList;
import java.util.Arrays;

public class MeteoStation {
    ArrayList<Observer> observers = new ArrayList<>(); // коллекции

    public void addObserver (Observer observer) {
        observers.add(observer); // add method of object List (List methods must know)
    }

    public void addObservers (Observer... observers) {
        this.observers.addAll(Arrays.asList(observers));
    }

    public void removeObservers (Observer observer){
        observers.remove(observer);
    }


    public void eventFired (String event){
        for ( Observer obs: observers) {
            obs.getEvent(event);
        }
    }
}
