package Handlers;


import Entities.*;

public class CartHandler {
    SearchHandler searchHandler = new SearchHandler();
    public void addItem(ShoppingCart cart, Inventory inventory){
//        searchHandler = new SearchHandler();
//        Product product = searchHandler.searchProduct(inventory).get(0);
//        CartItem cartItem = new CartItem(product, 1);
//        cart.addItem(cartItem);
          cart.addItem(new CartItem(searchHandler.getProducts(new Barcode("2"), inventory).get(0), 1));
          cart.addItem(new CartItem(searchHandler.getProducts(new Barcode("5"), inventory).get(0), 1));
          cart.addItem(new CartItem(searchHandler.getProducts(new Barcode("6"), inventory).get(0), 1));
    }

}
