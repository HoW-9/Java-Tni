import javax.swing.*;

public class Lab501 {
    public static double cal_bmi(double weight,double height_cm){
        double height_m = height_cm / 100;
        return weight / (height_m * height_m);
    }
    public static String check_bmi(double bmi){
        if (bmi < 18.5){
            return "Underweight";
        }
        if (bmi <= 24.9){
            return "Healthy Weight";
        }
        if (bmi <=29.9){
            return "Overweight";
        }
        return "Obese";
    }

    public static void main(String[] args) {
        while (true) {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your BMI?",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!");
                break;
            }
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.):"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));

            double bmi = cal_bmi(weight, height);

            JOptionPane.showMessageDialog(null, "Your BMI = " + bmi +
                    "\nYour BMI result = " + check_bmi(bmi));
        }
    }
}
