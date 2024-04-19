import javax.swing.*;
import java.awt.Font;


public class Frame extends JFrame{    
    Lang lang = new Lang(); // Call Text
    public Frame(){

    }

    public void HomePage(){
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
