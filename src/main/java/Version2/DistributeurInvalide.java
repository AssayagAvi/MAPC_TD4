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
            distributeur.setEtat(DistributeurValide.instance());

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
            distributeur.setEtat(DistributeurValide.instance());

        }

    }

    @Override
    public void refund() {

    }

}
