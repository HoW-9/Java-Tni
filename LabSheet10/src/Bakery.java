public class Bakery {
    private String flavor;
    private double unitPice;
    private int packingcost = 5;
    public Bakery(String flavor, double unitPice){
        this.flavor = flavor;
        this.unitPice = unitPice;
    }
    public Bakery(){
        this("",0.0);
    }
    public String getFlavor(){
        return this.flavor;
    }
    public double getUnitPice() {
        return this.unitPice;
    }

    public int getPackingcost() {
        return this.packingcost;
    }
    public double calculateTotalPrice(){
        return this.unitPice + this.packingcost;
    }
    public String toString(){
        return "Thank you for your order!";
    }
}
