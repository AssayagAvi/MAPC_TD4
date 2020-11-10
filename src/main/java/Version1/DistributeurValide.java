package Version1;

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
            System.out.println("Ok");
            distributeur.resetCaisse();
            distributeur.setEtat(DistributeurValide.instance());

        } else {
            System.out.println(" pas assez d'argent");
            distributeur.setEtat(DistributeurInvalide.instance());

        }
    }

    @Override
    public void askCoffee(Distributeur distributeur) {
        if (distributeur.caisse() > 10) {
            System.out.println("Ok");
            distributeur.resetCaisse();
            distributeur.setEtat(DistributeurValide.instance());

        } else {
            System.out.println(" Pas assez d'argent");
            distributeur.setEtat(DistributeurInvalide.instance());

        }

    }
}


