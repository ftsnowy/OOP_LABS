package Entities;

import java.util.ArrayList;

public class Inventory {

    private static Inventory instance = null;
    private ArrayList<Product> products;

    private Inventory(){
        products = new ArrayList<>();
    }

    public static Inventory getInstance(){
        if (instance == null){
            instance = new Inventory();
        }
        return instance;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
