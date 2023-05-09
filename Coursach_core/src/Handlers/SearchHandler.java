package Handlers;

import Entities.Barcode;
import Entities.Inventory;
import Entities.Product;
import Entities.ProductType;

import java.util.ArrayList;


public class SearchHandler{

    public ArrayList<Product> searchProduct(Inventory inventory){
        Object param = getParam();
        if (param instanceof Barcode){
            return getProducts(((Barcode) param).getCode(), inventory);
        } else if (param instanceof ProductType){
            return getProducts(((ProductType) param).getType(), inventory);
        } else {
            return getProducts(((Product) param).getName(), inventory);
        }
    }

    public Object getParam(){
        return new Barcode("233123");
    }

    public ArrayList<Product> getProducts(Barcode barcode, Inventory inventory){
        ArrayList<Product> found = new ArrayList<>();
        for (Product product: inventory.getProducts()){
            if (product.getBarcode().getCode() == barcode.getCode()){
                found.add(product);
                break;
            }
        }
        return found;
    }

    public ArrayList<Product> getProducts(ProductType category, Inventory inventory){
        ArrayList<Product> found = new ArrayList<>();
        for (Product product: inventory.getProducts()){
            if (product.getCategory().getTypeId() == category.getTypeId()){
                found.add(product);
                break;
            }
        }
        return found;
    }

    public ArrayList<Product> getProducts(String name, Inventory inventory){
        ArrayList<Product> found = new ArrayList<>();
        return found;
    }

}
