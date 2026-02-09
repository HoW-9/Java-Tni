package CoffeeShop;

public class Frappuccino extends Drink{
    private boolean whipphed;

    public Frappuccino(String size,boolean whipphed){
        super("Frappuccino",40,size);
        this.whipphed = whipphed;
    }
    @Override
    public double calculateFinalPrice() {
        return this.getBasePrice() + (this.whipphed ? 15 : 0) + getSizeExtra();
    }
    public String toString(){
        return super.toString() +
                (this.whipphed ? "\nAdd whipped 15 Baht": "") +
                "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
}
