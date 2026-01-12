import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        JOptionPane.showMessageDialog(null,"Welcome to Product stock System");
        p1.name = JOptionPane.showInputDialog("Enter product name:");
        p1.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));

        p1.showInfo();
        System.out.println();
        int add_choice = JOptionPane.showConfirmDialog(null,"Do you want to add more item?");
        if (add_choice == JOptionPane.YES_OPTION){
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            p1.addStock(amount);
        }
        int add_price = JOptionPane.showConfirmDialog(null,"Do you want to change price?");
        if (add_price == JOptionPane.YES_OPTION){
            p1.price = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            p1.changePrice(p1.price);
        }
        System.out.println();
        p1.showInfo();
    }
}
