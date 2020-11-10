package JeuDeGuerre_V1;

public class Canon implements Attaque {
    public Canon() {
    }

    @Override
    public void attaquer() {
        System.out.println("J'attaque avec un Canon");
    }
}
