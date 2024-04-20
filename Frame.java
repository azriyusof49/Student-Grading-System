import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame{    
    Lang lang = new Lang(); // Call Text
    JButton fileImport, listStudent, report, exit;//Button Variable
    JPanel MenuBar, top_menubar;
    int[] frameSize = {1080,600};

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
        frame.setSize(frameSize[0],frameSize[1]);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setBackground(new Color(52, 52, 52));

        //----------MENUBAR FILL-----------
        //MenuBar Component
        MenuBar = new JPanel();
        MenuBar.setBackground(new Color(0,0,0));
        MenuBar.setPreferredSize(new Dimension(100,50));
        MenuBar.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 2)); // Center alignment, horizontal gap, vertical gap

        top_menubar = new JPanel();
        top_menubar.setBackground(new Color(0,0,0));
        top_menubar.setPreferredSize(new Dimension(100,430));

        // Create buttons with specific size
        fileImport = new TransparentButton(lang.getText("import"), new Color(54, 69, 79));
        listStudent = new TransparentButton(lang.getText("listStudent"), new Color(54, 69, 79));
        report = new TransparentButton(lang.getText("report"), new Color(54, 69, 79));
        exit = new TransparentButton(lang.getText("exit"), new Color(54, 69, 79));
        

        //EventListener BUTTON
        exit.addActionListener(e -> System.exit(0));
        
        //MenuBar addList
        MenuBar.add(top_menubar, BorderLayout.WEST);
        MenuBar.add(fileImport);
        MenuBar.add(report);
        MenuBar.add(exit);
        
       //-------------END MENUBAR FILL----------

        //Frame Component
        frame.add(MenuBar, BorderLayout.WEST);
        frame.setVisible(true);
    }

    //HOVERING BUTTON EFFECT
    public class TransparentButton extends JButton {

        private Color hoverColor; // Color for hover state
        private boolean isHovering = false;
    
        public TransparentButton(String text, Color hoverColor) {
            super(text);
            this.hoverColor = hoverColor;
            setContentAreaFilled(false);  // Don't paint default background
            setBorderPainted(false);     // Don't paint default border
            setFocusPainted(false);     // Don't paint default focus indicator
    
            // Add mouse listener to track hover state
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    isHovering = true;
                    repaint();
                }
    
                @Override
                public void mouseExited(MouseEvent e) {
                    isHovering = false;
                    repaint();
                }
            });
        }
    
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
            // Get button dimensions
            int width = getWidth();
            int height = getHeight();
    
            // Draw transparent background
            if (isHovering || getModel().isPressed()) {
                g2d.setColor(hoverColor);
            } else {
                g2d.setColor(new Color(0,0,0));
            }
            g2d.fillRect(0, 0, width, height);
    
            // Get FontMetrics and calculate text height and width
            Font font = getFont();
            FontMetrics fontMetrics = g2d.getFontMetrics(font);
            int textWidth = fontMetrics.stringWidth(getText());
            int textHeight = fontMetrics.getHeight();
    
            // Calculate horizontal and vertical offsets for centering
            int horizontalOffset = (width - textWidth) / 2;
            int verticalOffset = (height - textHeight) / 2 + fontMetrics.getAscent();
    
            // Draw button text with foreground color
            g2d.setColor(Color.WHITE); //Text Color
            g2d.drawString(getText(), horizontalOffset, verticalOffset);
        }
    
        // Optional: Override getPreferredSize() to ensure the button has a reasonable size
        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();
            Insets insets = getInsets();
            size.width += insets.left + insets.right;
            size.height += insets.top + insets.bottom;
            return size;
        }
    }
    
    
}
