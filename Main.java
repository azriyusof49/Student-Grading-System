
import javax.swing.*;

public class Main {
    String username, password;
    public static void main(String[] args) {
        String username = null , password = null;
        int count = 3;
        //String SystemName = "Student Grading System";
        boolean auth = true; //Loop control 
        boolean sys = false; //System Exit control

        Frame frame = new Frame(); // Call Page
        Lang lang = new Lang(); // Call Text from class (For Repeating Text)

        while(auth){
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Arrange vertically

            JLabel labUser = new JLabel("Username");
            JTextField field1 = new JTextField(5); // Set width for visual appeal
            panel.add(labUser);
            panel.add(field1);

            JLabel labPass = new JLabel("Password");
            JTextField field2 = new JTextField(5);
            panel.add(labPass);
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
                        //JOptionPane.showMessageDialog(null, "Login successful!", lang.getText("SysName"), JOptionPane.PLAIN_MESSAGE);
                        auth = false;
                    }else{
                        JOptionPane.showMessageDialog(null, "Your username or password seems incorrect. You have " + (count-1) + " attempts left." );
                        count--;
                        if(count == 0){
                            auth = false;
                            sys = true;
                            JOptionPane.showMessageDialog(null, lang.getText("lockAccount"));
                        }
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
        
       frame.HomePage();
               
    }
}
