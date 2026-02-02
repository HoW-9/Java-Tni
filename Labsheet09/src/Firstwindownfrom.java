import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstwindownfrom {
    private JPanel winfrom;
    private JLabel Lbl_firsname;
    private JLabel Lbl_lastname;
    private JTextField Txt_firstname;
    private JTextField Txt_lastname;
    private JButton Btn_summit;
    private JButton Btn_reset;
    private JFrame jframe;

    public Firstwindownfrom(){
        jframe = new JFrame();
        jframe.setContentPane(winfrom);
        jframe.setTitle("My First Window Form");
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(300,200);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        Btn_summit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Txt_firstname.getText().isEmpty() || Txt_lastname.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "Please fill in your First Name or Last Name",
                            "Waring",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,
                            Txt_firstname.getText() + " " + Txt_lastname.getText());
                }
            }
        });
        Btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Txt_firstname.setText("");
                Txt_lastname.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Firstwindownfrom windowFrom = new Firstwindownfrom();
    }
}
