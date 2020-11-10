package Version2;

public class App {
    public static void main(String[] args) {
        Distributeur distributeur = new Distributeur();
        distributeur.askCoffee();
        distributeur.give(2);
        distributeur.askCoffee();
        distributeur.give(6);
        distributeur.askCoffee();
        distributeur.give(3);
        distributeur.askCoffee();


    }
}
