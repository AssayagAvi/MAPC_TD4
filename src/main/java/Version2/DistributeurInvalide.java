package Version2;

public class DistributeurInvalide implements DistributeurEtat {

    private static DistributeurEtat instance;

    public static DistributeurEtat instance(){
        if (instance == null)
            instance = new DistributeurInvalide();
        return instance;
    }

    private DistributeurInvalide(){}


    @Override
    public void askTea(Distributeur distributeur) {
        if(distributeur.caisse() <10){
            System.out.println("pas assez d'argent");
            distributeur.setEtat(DistributeurInvalide.instance());
        }
        else{
            System.out.println(" Commande ok" );
            distributeur.setEtat(DistributeurMonaie.instance());
            int c = distributeur.caisse();
            c = c-10;

        }
    }

    @Override
    public void askCoffee(Distributeur distributeur) {
        if(distributeur.caisse() <10){
            System.out.println("pas assez d'argent");
            distributeur.setEtat(DistributeurInvalide.instance());
        }
        else{
            System.out.println(" Commande ok" );
            distributeur.setEtat(DistributeurMonaie.instance());
            int c = distributeur.caisse();
            c = c-10;

        }

    }

    @Override
    public int refund(Distributeur distributeur) {
        int caisseActuelle = distributeur.caisse();
        distributeur.resetCaisse();
        distributeur.setEtat(DistributeurMonaie.instance());
        return caisseActuelle;
    }

}
