package JeuDeGuerre_V1;

public class Missile implements Attaque {
    public Missile() {
    }

    @Override
    public void attaquer() {
        System.out.println("J'attaque avec un Missile");
    }
}
