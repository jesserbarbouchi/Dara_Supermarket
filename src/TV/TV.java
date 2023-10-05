package TV;

public class TV {
    private String brand;
    private double screenSize;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        System.out.println("Size: " + getScreenSize());
        System.out.println("Price: " + getPrice());
    }
}
