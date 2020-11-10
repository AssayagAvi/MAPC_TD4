package Version2;

public class DistributeurValide implements DistributeurEtat {

    private static DistributeurEtat instance;

    static DistributeurEtat instance() {
        if (instance == null)
            instance = new DistributeurValide();
        return instance;
    }


    @Override
    public void askTea(Distributeur distributeur) {
        if (distributeur.caisse() > 10) {
            System.out.println("Commande Ok");
            distributeur.setEtat(DistributeurMonaie.instance());
            int c = distributeur.caisse();
            c = c-10;

        } else {
            System.out.println(" pas assez d'argent");
            distributeur.setEtat(DistributeurInvalide.instance());

        }
    }

    @Override
    public void askCoffee(Distributeur distributeur) {
        if (distributeur.caisse() > 10) {
            System.out.println("Commande Ok");
            distributeur.setEtat(DistributeurMonaie.instance());
            int c = distributeur.caisse();
            c = c-10;

        } else {
            System.out.println(" Pas assez d'argent");
            distributeur.setEtat(DistributeurInvalide.instance());

        }

    }

    @Override
    public void refund(Distributeur distributeur) {
        int caisseActuelle = distributeur.caisse();
        distributeur.resetCaisse();
        distributeur.setEtat(DistributeurMonaie.instance());
        System.out.println("caisseActuelle = " + caisseActuelle);
    }
}


