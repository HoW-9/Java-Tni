import javax.swing.*;
import java.text.DecimalFormat;

public class Lab207 {
    public static void main(String[] args) {
        final double HOURLY_RATE = 7.50;
        final double TAX_RATE = 0.15;
        DecimalFormat frm = new DecimalFormat("#,###.00");


        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
        String employee_name = (JOptionPane.showInputDialog("Enter employee name:"));
        int hour_employee = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee:"));
        double earnings = hour_employee * HOURLY_RATE;
        double tax = earnings * TAX_RATE;
        double net_earnings = earnings - tax;

        JOptionPane.showMessageDialog(null,"Employee name: " + employee_name +
                "\nHour worked: " + hour_employee +
                "\nHourly wage: $"+frm.format(HOURLY_RATE) +
                "\nGross earnings: $"+ frm.format(earnings)+
                "\nTax rate: "+TAX_RATE +
                "\nTax: $"+frm.format(tax) +
                "\nNet earnings: $"+ frm.format(net_earnings));
    }
}
