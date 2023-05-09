package Entities;

public class CartItem {
    private Product product;
    private double amount;

    public CartItem(Product product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        if (!product.isWeighed()){
            return amount * product.getPricePerUnit();
        } else {
            return product.getWeight()*product.getPricePerUnit();
        }
    }

}
