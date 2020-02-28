package Lesson9.Builder;

public class Builder {
    // ctrl+shift+N открывает класс

    private Body bodyForVessel;
    private Engine engineForVessel;
    private Missile missileForVessel;

    /*public Builder() {
    }*/  // default уже есть

   public Builder addBody(Body bodyFromSupply){
       bodyForVessel = bodyFromSupply;
       return this;
   }
   public Builder addMissile (Missile missileFromSupply){
       missileForVessel = missileFromSupply;
       return this;
   }

   public Builder addEngine (Engine engineFromSupply){
       engineForVessel = engineFromSupply;
       return this;
   }
   public  Vessel build (){
       return new Vessel(bodyForVessel, engineForVessel,missileForVessel);
   }
}
