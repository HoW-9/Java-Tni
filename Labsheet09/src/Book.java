public class Book {
    private String title;
    private String categoty;
    private double price;
    private int discount_percent;
    private Author author; // composition
    public Book(String title, String categoty, double price, Author author) {
        this.title = title;
        this.categoty = categoty;
        this.price = price;
        this.author = author;
        this.discount_percent = 0;
    }
    public Book(){
        this("","",0.0,null);
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public void setDiscount_percent(int discount_percent){
        this.discount_percent = discount_percent;
    }
    public int getDiscount_percent(){
        return this.discount_percent;
    }
    public boolean isDiscountAvailable(){
        return this.price > 500; // return เอง ture/false
    }
    public double calculateDiscountPrice(){
        return this.price - (this.price * this.getDiscount_percent() / 100.0); // this.discount_percent
       // return this.price - (this.price * this.discount_percent / 100.0);
    }
    public String ToString(){
        return "Title: " + this.title +
                "\nCategory: " + this.categoty +
                "\nPrice: " + this.price + (isDiscountAvailable() ? "("+calculateDiscountPrice() : "") +
                "\nAuthor: " + this.author.showAuthorInfo();
    }
}
