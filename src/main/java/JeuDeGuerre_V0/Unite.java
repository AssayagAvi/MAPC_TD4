package JeuDeGuerre_V0;

public class Unite {

    private Deplacement deplacement;
    private Attaque attaque;


    public Unite(Deplacement deplacement, Attaque attaque) {
        this.deplacement = deplacement;
        this.attaque = attaque;
    }

    public void seDeplacer(){
        this.deplacement.deplacer();
    }

    public void combattre(){
        this.attaque.attaquer();
    }
}
