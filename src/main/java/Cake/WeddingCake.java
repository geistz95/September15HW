package Cake;

public class WeddingCake extends Cake{
    private int tiers;
    public WeddingCake(String flavor, double price, int tiers){
        super(flavor, price);
        this.tiers=tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        if(tiers>0) {
            this.tiers = tiers;
        }else{
            System.out.println("Invalid tiers amount");
        }
    }
}
