package curs6.ro.siit;

public class Product implements Buyable {
    private String name;
    private double price;
    private double quantity;
    private String ageRestriction;

    public static final String AGE_RESTICTION_NONE = "none";
    public static final String AGE_RESTICTION_TEENAGER_AND_ABOVE = "teenager";
    public static final String AGE_RESTICTION_ADULT_ONLY = "adult";
    public Product(){

    }


    public Product(String name, double price, double quantity, String ageRestriction){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }
    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
