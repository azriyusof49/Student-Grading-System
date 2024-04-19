import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{    
    Lang lang = new Lang(); // Call Text
    public Frame(){

    }

    public void HomePage(){
        JLabel text = new JLabel();
        text.setText(lang.getText("SysName"));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setFont(new Font("Arial",Font.PLAIN,10));

        //Frame Start
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());

        //MenuBar Component
        JPanel MenuBar = new JPanel();
        MenuBar.setBackground(Color.ORANGE);
        MenuBar.setPreferredSize(new Dimension(100,50));
        MenuBar.setLayout(new GridLayout(4,1,0,50));

        MenuBar.add(new JButton("Import"));
        MenuBar.add(new JButton("List Student"));
        MenuBar.add(new JButton("Report"));
        MenuBar.add(new JButton("Exit"));
       
        //Frame Component
        frame.add(MenuBar, BorderLayout.WEST);


        frame.setVisible(true);
    }
}
