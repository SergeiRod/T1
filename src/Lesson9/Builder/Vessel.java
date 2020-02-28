package Lesson9.Builder;

public class Vessel {
    private Body body;
    private Engine engine;
    private Missile missile;

    public Vessel(Body body, Engine engine, Missile missile) {
        this.body = body;
        this.engine = engine;
        this.missile = missile;
    }
}
