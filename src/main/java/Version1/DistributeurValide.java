package Version1;

public class DistributeurValide implements DistributeurEtat {

    private static DistributeurEtat instance;

    private static DistributeurEtat instance(){
        if (instance == null)
            instance = new DistributeurValide();
        return instance;
    }

    @Override
    public void askTea(Distributeur distributeur) {

    }

    @Override
    public void askCoffee(Distributeur distributeur) {

    }

}
