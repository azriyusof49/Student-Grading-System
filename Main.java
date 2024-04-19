import java.awt.Font;

import javax.swing.*;

public class Main {
    String username, password;
    public static void main(String[] args) {
        String username = null , password = null;
        //String SystemName = "Student Grading System";
        boolean auth = true, sys = false;

        Lang lang = new Lang(); // Call Text from class (For Repeating Text)

        while(auth){
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Arrange vertically

            JLabel label1 = new JLabel("Username");
            JTextField field1 = new JTextField(5); // Set width for visual appeal
            panel.add(label1);
            panel.add(field1);

            JLabel label2 = new JLabel("Password");
            JTextField field2 = new JTextField(5);
            panel.add(label2);
            panel.add(field2);

            int result = JOptionPane.showConfirmDialog(null, panel, lang.getText("SysName"), JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                username = field1.getText();
                password = field2.getText();

                Auth admin = new Auth(username, password);

                // Input check
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter both username and password.");
                }else{
                    if(admin.check()){// Successful login message
                        JOptionPane.showMessageDialog(null, "Login successful!", lang.getText("SysName"), JOptionPane.PLAIN_MESSAGE);
                        auth = false;
                    }else{
                        JOptionPane.showMessageDialog(null, "Wrong Username Or Password");
                    }
                }
            }
            else {// Cancel button and X button
                auth = false;
                sys = true;
            }
        }// END WHILE LOOP
        if (sys) {
            System.exit(0);
        }// Exit program

        //TODO : CODE UI HERE
        
        JLabel text = new JLabel();
        text.setText(lang.getText("SysName"));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setFont(new Font("Arial",Font.PLAIN,20));

        //Frame Start
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(text);
               
    }
}
