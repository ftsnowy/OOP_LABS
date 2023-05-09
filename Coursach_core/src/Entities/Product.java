package Entities;

public class Product {

    private int productId;
    private boolean isWeighed, isAgedRestricted;
    private double pricePerUnit, weight;
    private String name, description;
    private Barcode barcode;
    private ProductType category;
    private Image image;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean isWeighed() {
        return isWeighed;
    }

    public void setWeighed(boolean weighed) {
        isWeighed = weighed;
    }

    public boolean isAgedRestricted() {
        return isAgedRestricted;
    }

    public void setAgedRestricted(boolean agedRestricted) {
        isAgedRestricted = agedRestricted;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Barcode getBarcode() {
        return barcode;
    }

    public void setBarcode(Barcode barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getCategory() {
        return category;
    }

    public void setCategory(ProductType category) {
        this.category = category;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Product(int productId, boolean isWeighed, boolean isAgedRestricted, double pricePerUnit, double weight, String name, Barcode barcode, String description, ProductType category, Image image) {
        this.productId = productId;
        this.isWeighed = isWeighed;
        this.isAgedRestricted = isAgedRestricted;
        this.pricePerUnit = pricePerUnit;
        this.weight = weight;
        this.name = name;
        this.barcode = barcode;
        this.description = description;
        this.category = category;
        this.image = image;
    }

    public Product(int productId, double pricePerUnit, String name, Barcode barcode, ProductType category){
        this.productId = productId;
        this.pricePerUnit = pricePerUnit;
        this.name = name;
        this.barcode = barcode;
        this.category = category;
    }

}
