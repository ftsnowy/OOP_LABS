package Handlers;

import Entities.Barcode;
import Entities.Inventory;
import Entities.Product;
import Entities.ProductType;

public class InventoryHandler {
    private SearchHandler handler;
    public Inventory loadInventoryFromDB(){
        return Inventory.getInstance();
    }

    public void addProduct(Inventory inventory){
        //inventory.getProducts().add(createProduct());
        inventory.getProducts().add(new Product(1, 3.0, "Cheese ver1", new Barcode("1"), new ProductType(1, "Cheese")));
        inventory.getProducts().add(new Product(2, 1.7, "Milk ver1", new Barcode("2"), new ProductType(2, "Milk")));
        inventory.getProducts().add(new Product(3, 3.5, "Cheese ver2", new Barcode("3"), new ProductType(1, "Cheese")));
        inventory.getProducts().add(new Product(4, 4.0, "Cheese ver3", new Barcode("4"), new ProductType(1, "Cheese")));
        inventory.getProducts().add(new Product(5, 1.5, "Bread", new Barcode("5"), new ProductType(3, "Bread")));
        inventory.getProducts().add(new Product(6, 2.0, "Milk ver2", new Barcode("6"), new ProductType(2, "Milk")));
    }

    public void removeProduct(Inventory inventory){
        //handler = new SearchHandler();
        //inventory.getProducts().remove(handler.getProducts(new Barcode("4"), inventory));
    }

    public void adjustProduct(Inventory inventory){
        //
    }
}
