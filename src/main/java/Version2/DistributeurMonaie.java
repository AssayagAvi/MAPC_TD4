package Version2;

public class DistributeurMonaie implements DistributeurEtat {

    private static DistributeurEtat instance;

    public static DistributeurEtat instance(){
        if (instance == null)
            instance = new DistributeurMonaie();
        return instance;
    }
    @Override
    public void askTea(Distributeur distributeur) {

    }

    @Override
    public void askCoffee(Distributeur distributeur) {

    }

    @Override
    public void refund() {

    }
}
