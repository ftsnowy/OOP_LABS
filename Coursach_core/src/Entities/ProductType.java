package Entities;

public class ProductType {
    private int typeId;
    private String type;

    public ProductType(int typeId, String type){
        this.type = type;
        this.typeId = typeId;
    }
    public int getTypeId(){
        return typeId;
    }

    public String getType(){
        return type;
    }
}
