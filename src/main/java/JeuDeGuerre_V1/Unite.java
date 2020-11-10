package JeuDeGuerre_V1;

public class Unite {

    private Deplacement deplacement;
    private Attaque attaque;


    public Unite(Deplacement deplacement, Attaque attaque) {
        this.deplacement = deplacement;
        this.attaque = attaque;
    }



    public void planifierAttaque(){
        //
        this.deplacement.deplacer();
        this.attaque.attaquer();

    }
}
