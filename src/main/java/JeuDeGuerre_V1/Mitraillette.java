package JeuDeGuerre_V1;

public class Mitraillette implements Attaque {
    public Mitraillette() {
    }

    @Override
    public void attaquer() {
        System.out.println("J'attaque avec une mitraillette");
    }
}
