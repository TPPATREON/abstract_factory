public class Factory1 implements AbstractFactory {
    public ProduitA createProduitA() {
        return new ProduitA1();
    }
    public ProduitB createProduitB() {
        return new ProduitB1();
    }
    public ProduitD createProduitD() {
        return new ProduitD1();
    }
}
