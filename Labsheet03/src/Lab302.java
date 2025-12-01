import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));
        int male = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION);
        if (male == JOptionPane.YES_OPTION){
            double weight = height - 100;
            JOptionPane.showMessageDialog(null,
                    "Hello, Mr." + name +
                    "\nIf your height is " + height + " cm." +
                    "\nYour weight should be " + weight + " kg.");
        }else {
            int female = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);
            if (female == JOptionPane.YES_OPTION) {
                double weight = height - 110;
                JOptionPane.showMessageDialog(null,
                        "Hello, Mr." + name +
                                "\nIf your height is " + height + " cm." +
                                "\nYour weight should be " + weight + " kg.");
            }else {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
            }
        }
    }
}
