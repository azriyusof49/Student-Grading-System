import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import User.*;
public class LoginPage extends javax.swing.JFrame {

    private Button JButton;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private TextField textField1;
    private TextField textField2;

    // Track login attempts
    private int wrongAttempts = 3;


    public LoginPage() {
        initComponents();
        setEnterKeyListener();
    }

   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        JButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(22, 66, 91));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24)); // Changed font style
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Login");

        textField1.setText("");

        label2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12)); // Changed font style
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Username");

        label3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12)); // Changed font style
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Password");

        textField2.setText("");

        JButton.setLabel("Login");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPerform(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    // Listen for Enter key press
    private void setEnterKeyListener() {
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField2.requestFocus(); // Move focus to password field
            }
        });
        textField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login(); // Perform login when Enter key is pressed in password field
            }
        });
    }

    // Perform login
    private void login() {
        String username = textField1.getText();
        String password = new String(textField2.getText());

        Admin admin = new Admin("Admin", username, password);

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter username and password");
        } else if (!admin.check()) {
            wrongAttempts--;
            JOptionPane.showMessageDialog(null, "Your username or password seems incorrect. You have "
                    + wrongAttempts + " attempts left.");
            if (wrongAttempts == 0) {
                JOptionPane.showMessageDialog(null, "Your Account Has been LOCK");
                System.exit(0);
            }
        } else {
            dispose();
            Main mainApp = new Main();
            mainApp.run();
        }
    }                                          

    // Login button action
    private void LoginPerform(java.awt.event.ActionEvent evt) {                                        
        String username = textField1.getText();
        String password = textField2.getText();

        Admin admin = new Admin("Admin",username, password);

        if(username.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter username and password");

        }else if(!admin.check()){
            JOptionPane.showMessageDialog(null, "Your username or password seems incorrect. You have "
                                + (wrongAttempts - 1) + " attempts left.");
             wrongAttempts--;
            if (wrongAttempts == 0) {
                JOptionPane.showMessageDialog(null, "Your Account Has been LOCK");
                System.exit(0);
            }
        }else{
            dispose(); //close frame login
            Main mainApp = new Main(); //run main program
            mainApp.run();
        }
    }                                       
}
