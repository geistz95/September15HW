package Cake;

public class Cake {
    String flavor;
    double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }else{
            System.out.println("Invalid price");
        }
    }

    public Cake(String flavor, double price){
        this.flavor=flavor;
        this.price=price;
    }
}
