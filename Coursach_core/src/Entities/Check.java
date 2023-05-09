package Entities;

public class Check {
    private ShoppingCart cart;

    public Check(ShoppingCart cart) {
        this.cart = cart;
    }

    public void print() {
        for (CartItem item : cart.getCart()) {
            System.out.println(item.getProduct().getName() + "  " + item.getProduct().getPricePerUnit() + " * " + item.getAmount() + " = " + item.getTotalPrice());
        }
        System.out.println("#################");
        System.out.println("Total price: " + cart.getTotalCartPrice());
    }

    public void sendViaEmail(String email){

    }
}
