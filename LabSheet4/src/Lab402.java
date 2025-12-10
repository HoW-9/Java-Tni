import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String id  = "";
        while (true){
            id = JOptionPane.showInputDialog("Enter student-id:");

            if (id == null || id.trim().equals("")){
                continue;
            }
            id = id.trim();

            if (id.length() == 10){
                break;
            }
        }
        String code = id.substring(2,5);

        String major;
        switch (code){
            case "131": major = "Information Technology (IT)"; break;
            case "132": major = "Multimedia Technology (MT)";break;
            case "133": major = "Digital Business Information Technology (BI)";break;
            case "134": major = "Digital Technology in Mass Communication (DC)";break;
            case "135": major = "Data Science and Data Analytics (DS)";break;
            default: major = "Cannot found major";break;
        }
        JOptionPane.showMessageDialog(null,"Student ID: " + id +
                "\nMajoir: " + major);
    }
}
