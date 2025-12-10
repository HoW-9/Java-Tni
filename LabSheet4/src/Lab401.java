import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String fullname = "";
        while (true) {
            fullname = JOptionPane.showInputDialog(null, "Enter your full name:");
            if (fullname == null || fullname.trim().equals("")){
                continue;
            }
            String[] parts = fullname.trim().split(" ");
            if (parts.length<2){
                continue;
            }
            String firstname = parts[0];
            firstname = firstname.substring(0,1).toUpperCase() +
                    firstname.substring(1).toLowerCase();
            String lastname = "";
            for (int i = 1;i< parts.length;i++){
                lastname += parts[i].toUpperCase() + " ";
            }
            lastname = lastname.trim();
            JOptionPane.showMessageDialog(null,"Welcome," + firstname + " " + lastname);
            break;
        }

    }
}
