package Cake;

public class Main {
    public static void main(String[] args) {
        BirthdayCake yum1 = new BirthdayCake("Strawberry", 20.99,9);
        WeddingCake yum2 = new WeddingCake("Red Velvet", 214.99,3);

        yum1.setFlavor("Chocolate");
        yum2.setPrice(339.99);
        yum2.setTiers(4);

        System.out.println("The flavor is : " + yum1.getFlavor()+ " and the price is " + yum1.getPrice()+" and it has "+ yum1.getCandles()+ " Candles");
        System.out.println("The flavor is : " + yum1.getFlavor()+ " and the price is " + yum1.getPrice()+" and it has "+ yum2.getTiers()+ " Tiers");
    }
}
