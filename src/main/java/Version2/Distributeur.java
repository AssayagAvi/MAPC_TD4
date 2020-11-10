package Version2;

public class Distributeur {

    private int caisse;
    private DistributeurEtat etat;
    private int n;

    public Distributeur() {
        this.caisse = 0;
        this.etat = DistributeurInvalide.instance();

    }


    public void setEtat(DistributeurEtat etat) {
        this.etat = etat;
    }
    public int caisse(){
        return caisse;
    }

    public void resetCaisse(){
        caisse = 0;
    }

    public void askTea(){
        this.etat.askTea(this);
    }

    public void askCoffee(){
        this.etat.askCoffee(this);
    }

    public void give(int n){
        caisse = caisse + n;
    }
}

