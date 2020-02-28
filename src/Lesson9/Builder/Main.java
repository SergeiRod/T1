package Lesson9.Builder;

public class Main {
    public static void main(String[] args) {

        Body body = new Body();
        Engine engine = new Engine();
        Missile missile = new Missile();

        Builder builder = new Builder();
        builder.addBody(body).addEngine(engine);
        System.out.println("wait some time till missile arrives");
        builder.addMissile(missile);
        Vessel newVessel = builder.build();

        //builder.addBody(new Body()).addEngine(new Engine()).addMissile(new Missile());
    }
}
