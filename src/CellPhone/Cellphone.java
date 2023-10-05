package CellPhone;

public class Cellphone {
    private String brand;
    private String color;
    private double screenSize;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void Display(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Color: " + getColor());
        System.out.println("Size: " + getScreenSize());
        System.out.println("Price: " + getPrice());
    }
}
