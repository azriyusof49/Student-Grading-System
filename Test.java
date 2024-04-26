import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class Test extends JFrame{    
    Lang lang = new Lang(); // Call Text
    JButton fileImport, listStudent, report, exit;//Button Variable
    JPanel MenuBar, top_menubar, HomeMenu;
    int[] frameSize = {1080,600};

    public Test(){
    }

    public void HomePage(){
        JLabel text = new JLabel();
        text.setText(lang.getText("listStudent"));
        //text.setHorizontalAlignment(JLabel.LEFT);
        //text.setAlignmentY(600);
        text.setFont(new Font("TimesNewRomen",Font.BOLD,25));

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
        fileImport = new TransparentButton(lang.getText("import"), new Color(40, 40, 43));
        listStudent = new TransparentButton(lang.getText("listStudent"), new Color(54, 69, 79));
        report = new TransparentButton(lang.getText("report"), new Color(40, 40, 43));
        exit = new TransparentButton(lang.getText("exit"), new Color(40, 40, 43));

        exit.setPreferredSize(new Dimension(100,23));
        

        //EventListener BUTTON
        exit.addActionListener(e -> System.exit(0));
        
        //MenuBar addList
        MenuBar.add(top_menubar, BorderLayout.WEST);
        MenuBar.add(fileImport);
        MenuBar.add(report);
        MenuBar.add(exit);
        
       //-------------END MENUBAR FILL----------

       //------------HOME MENU---------- 
       HomeMenu = new JPanel();
       HomeMenu.setBackground(new Color(40, 40, 43));
       HomeMenu.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));

       RoundedPanel tableName = new RoundedPanel(40);
       tableName.setLayout(new FlowLayout(FlowLayout.CENTER));
       tableName.setBackground(new Color(251,244,239));
       tableName.setPreferredSize(new Dimension(800,450));


       JPanel listStudent = new JPanel();
       listStudent.setBackground(Color.BLACK);
       listStudent.setPreferredSize(new Dimension(100,100));

       //Home Menu Component
       tableName.add(text);
       //tableName.add(listStudent);


       HomeMenu.add(tableName);
       //------------END HOME MENU---------- 


        //Frame Component
        frame.add(MenuBar, BorderLayout.WEST);
        frame.add(HomeMenu, BorderLayout.CENTER);
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
            setFont(new Font("TimesNewRomen",Font.BOLD,13));
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
    //BORDER PANEL ROUNDED
    public class RoundedPanel extends JPanel {
        private int radius;
    
        public RoundedPanel(int radius) {
            this.radius = radius;
            setOpaque(false); // Make sure to set opaque to false to see the background color
        }
    
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
            int width = getWidth();
            int height = getHeight();
            int diameter = radius * 2;
    
            // Draw background
            g2d.setColor(getBackground());
            g2d.fill(new RoundRectangle2D.Double(0, 0, width, height, diameter, diameter));
    
            g2d.dispose();
        }
    }
}
