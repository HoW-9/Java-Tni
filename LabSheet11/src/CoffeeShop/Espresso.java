package CoffeeShop;

public class Espresso extends Drink{
    private int shot;
    public Espresso(String size){
        super("Espresso",35,size);
        this.shot = 0;
    }
    public void addshot(int shot){
        this.shot = shot;
    }
    @Override
    public double calculateFinalPrice() {
        return this.getBasePrice() + (this.shot * 15) + getSizeExtra();
    }
    public String toString(){
        return super.toString() +
                (shot > 0 ? "\nAdded " + this.shot + " shot" : "") +
                "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
}
