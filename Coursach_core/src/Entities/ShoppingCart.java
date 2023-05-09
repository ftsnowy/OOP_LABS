package Entities;

import java.util.ArrayList;

public class ShoppingCart {

    private static ShoppingCart instance = null;
    private ArrayList<CartItem> cart;

    public ArrayList<CartItem> getCart() {
        return cart;
    }

    public void setCart(ArrayList<CartItem> cart) {
        this.cart = cart;
    }

    private ShoppingCart(){
        cart = new ArrayList<>();
    }

    public static ShoppingCart getInstance(){
        if (instance == null){
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addItem(CartItem item){
        cart.add(item);
    }

    public double getTotalCartPrice(){
        double price = 0;
        for (CartItem item: cart){
            price += item.getTotalPrice();
        }
        return price;
    }

}
