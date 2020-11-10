package Version1;

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

    }

    @Override
    public void askCoffee(Distributeur distributeur) {

    }

    @Override
    public void give(Distributeur distributeur) {

    }
}
