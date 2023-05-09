package Entities;

import Handlers.*;

public class SCSystem {
    private static SCSystem instance = null;

    private ShoppingCart cart;
    private Inventory inventory;
    private InventoryHandler inventoryHandler;
    private PaymentHandler paymentHandler;
    private SearchHandler searchHandler;
    private CartHandler cartHandler;
    private AdminHandler adminHandler;
    private SCSystem(){
        inventory = Inventory.getInstance();
        cart = ShoppingCart.getInstance();
    }
    public static SCSystem getInstance(){
        if (instance == null){
            instance = new SCSystem();
        }
        return instance;
    }

    public void start(){
        inventoryHandler = new InventoryHandler();
        inventory = inventoryHandler.loadInventoryFromDB();
        paymentHandler = new PaymentHandler();
        searchHandler = new SearchHandler();
        cartHandler = new CartHandler();
        adminHandler = new AdminHandler();
    }

    public void addProductToInventory(){
        if (adminHandler.approveAdmin()) {
            inventoryHandler.addProduct(inventory);
        }
    }

    public void removeProductFromInventory(){
        if (adminHandler.approveAdmin()){
            inventoryHandler.removeProduct(inventory);
        }
    }

    public void adjustProductInInventory(){
        if (adminHandler.approveAdmin()){
            inventoryHandler.adjustProduct(inventory);
        }
    }

    public void addItemToCart(){
        cartHandler.addItem(cart, inventory);
    }

    public void proceedToPayment(){
        paymentHandler.proceed(cart);
    }

    public void reset(){
        instance = null;
        instance = getInstance();
    }

}
