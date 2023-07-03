package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Store;

public abstract class Products {
    private String name;
    private float price;
    abstract String getName();
    abstract float getPrice();

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
