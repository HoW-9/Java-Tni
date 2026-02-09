package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        //No.1
        String customer_name = JOptionPane.showInputDialog("Enter customer's name:");

        //No.2
        double total_price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter customer's bill:"));

        //NO.3
        int is_member = JOptionPane.showConfirmDialog(null,
                "Do you have a member card?",
                "Member",JOptionPane.YES_NO_OPTION);

        if (is_member == JOptionPane.YES_OPTION){
            String mem_level = JOptionPane.showInputDialog(
                    "Enter a member level [Gold / Premium]");
            Member bill = new Member(customer_name,total_price,mem_level);
            JOptionPane.showMessageDialog(null,bill);

        }else {
            Regular bill = new Regular(customer_name,total_price);
            JOptionPane.showMessageDialog(null,bill);
        }
    }
}
