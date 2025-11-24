import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int input_minutes = Integer.parseInt(
                JOptionPane.showInputDialog("Input minutes:"));

        int hours = input_minutes/60;
        int minutes = input_minutes%60;

        JOptionPane.showMessageDialog(null,
                + input_minutes + " minutes is " + hours + " hour " + minutes +" minute");

    }
}
