public class Saimai extends Bakery{
    private int pack;
    public Saimai(int pack, String flavor, double unitPrice){
        super(flavor,unitPrice);
        this.pack = pack;
    }
    public void promotion(){
        if (this.pack == 5)System.out.println(" Get free 1 ");
    }
    @Override
    public int getPackingcost() {
      //  if (this.pack >= 3)
            return 10;
       // return super.getPackingcost();
    }

    @Override
    public double calculateTotalPrice() {
        return getUnitPice() * this.pack + getPackingcost();
    }
    public String toString(){
        return super.toString() +
                "\nSai mai: " + getFlavor() +
                "\nPack: " + pack + " Pack" +
                "\nTotal price of Sai mai = " + calculateTotalPrice();
    }
}
