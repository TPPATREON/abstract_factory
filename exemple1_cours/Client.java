public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        AbstractFactory factory2 = new Factory2();

        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = factory1.createProduitA();
        produitB = factory1.createProduitB();
        produitA.methodeproduitA();
        produitB.methodeproduitB();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = factory2.createProduitA();
        produitB = factory2.createProduitB();
        produitA.methodeproduitA();
        produitB.methodeproduitB();
    }
}
