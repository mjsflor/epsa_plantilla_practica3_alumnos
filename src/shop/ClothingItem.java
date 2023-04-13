package shop;

public class ClothingItem {
    private String name;
    private double price;
    private char size;

    public ClothingItem(){}

    public ClothingItem(String name, double price, char size) {
        this.name = name;
        this.price = price;
        this.size = size;
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

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product => " +
                "name:" + name +
                ", price:" + price +
                ", size:" + size;
    }

}
