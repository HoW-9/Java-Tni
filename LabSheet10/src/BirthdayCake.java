public class BirthdayCake extends Bakery {
    private String message;
    private double pound;
    public BirthdayCake(String message, double pound,String flavor,double unitPrice){
        super(flavor,unitPrice);
        this.message = message;
        this.pound = pound;
    }
    public String getMessage(){
        return this.message;
    }
    public void changeMessag(String new_message){
        this.message = new_message;
    }
    @Override
    public int getPackingcost() {
        if (this.pound >= 3)
            return 10;
        return super.getPackingcost();
    }
    @Override
    public double calculateTotalPrice() {
        return getUnitPice() * this.pound + getPackingcost();
    }
    public String toString(){
        return super.toString() +
                "\n" + super.getFlavor() + " birthday cake (message=" + this.message + ")" +
                "\nTotal price of Birthday Cake = " + calculateTotalPrice();
    }
}
