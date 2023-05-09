import Entities.SCSystem;

public class Main {
    public static void main(String[] args) {
        SCSystem sc = SCSystem.getInstance();
        sc.start();
        sc.addProductToInventory();
        sc.addItemToCart();
        sc.proceedToPayment();
    }
}