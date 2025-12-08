import javax.swing.*;

public class EX403 {
    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Enter your email:");

        while (email.toLowerCase().endsWith("@gmail.com")==false){
            email = JOptionPane.showInputDialog("Plase enter your email again:");
        }

        JOptionPane.showMessageDialog(null,"Your mail is " + email);
    }
}
