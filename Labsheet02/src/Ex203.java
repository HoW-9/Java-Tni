import javax.swing.*;
import java.text.DecimalFormat;

public class Ex203 {
    public static void main(String[] args) {
        final int lectrue_price = 1900;
        final int lab_price = 3500;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        int lectrue_credit = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Lectrue credit:"));

        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter Lab credit:"));

        int lectrue_total_price = lectrue_credit * lectrue_price;
        int lab_total_price = lab_price * lab_credit;
        int total_price = lectrue_total_price + lab_total_price;

        JOptionPane.showMessageDialog(null,
                "Lectrue: " + lectrue_credit + "x" + lectrue_price + " = " + frm.format(lectrue_total_price)+
                "\nLaboratory: " + lab_credit + "x" + lab_price + " = " + frm.format(lab_total_price) +
                "\nTotal price: " + frm.format(total_price));

    }
}
