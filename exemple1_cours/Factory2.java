public class Factory2 implements AbstractFactory {
    public ProduitA createProduitA() {
        return new ProduitA2();
    }
    public ProduitB createProduitB() {
        return new ProduitB2();
    }
}
