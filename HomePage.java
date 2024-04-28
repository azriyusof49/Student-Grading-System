/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

/**
 *
 * @author Azuri
 */
public class HomePage extends javax.swing.JFrame {
    // Variables declaration - do not modify
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ImportButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton WeightTask;
    private javax.swing.JPanel devidePanel;
    private javax.swing.JPanel devidePanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton printReportButton;
    // End of variables declaration

    Lang lang = new Lang(); // Call Text

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        devidePanel = new javax.swing.JPanel();
        devidePanel1 = new javax.swing.JPanel();

        MenuBar = new javax.swing.JPanel();
        ImportButton = new TransparentButton(lang.getText("import"), new Color(47, 102, 144));
        printReportButton = new TransparentButton(lang.getText("report"), new Color(47, 102, 144));
        ExitButton = new TransparentButton(lang.getText("exit"), new Color(47, 102, 144));
        WeightTask = new TransparentButton(lang.getText("exit"), new Color(47, 102, 144));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Grading System");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("HomePage"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(58, 124, 165));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 600));

        MenuBar.setBackground(new java.awt.Color(22, 66, 91));

        ImportButton.setBackground(new java.awt.Color(0, 0, 0));
        ImportButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        ImportButton.setText("Import");
        ImportButton.setPreferredSize(new java.awt.Dimension(93, 26));

        printReportButton.setBackground(new java.awt.Color(0, 0, 0));
        printReportButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        printReportButton.setText("Grade Report");
        printReportButton.setPreferredSize(new java.awt.Dimension(93, 26));
        printReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        ExitButton.setText("Log Out");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        WeightTask.setBackground(new java.awt.Color(0, 0, 0));
        WeightTask.setFont(new java.awt.Font("Segoe UI", 0, 14));
        WeightTask.setText("Percentage");
        WeightTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTaskActionPerformed(evt);
            }
        });

        devidePanel.setBackground(new java.awt.Color(47, 102, 144));
        devidePanel.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout devidePanelLayout = new javax.swing.GroupLayout(devidePanel);
        devidePanel.setLayout(devidePanelLayout);
        devidePanelLayout.setHorizontalGroup(
                devidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        devidePanelLayout.setVerticalGroup(
                devidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        devidePanel1.setBackground(new java.awt.Color(47, 102, 144));
        devidePanel1.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout devidePanel1Layout = new javax.swing.GroupLayout(devidePanel1);
        devidePanel1.setLayout(devidePanel1Layout);
        devidePanel1Layout.setHorizontalGroup(
                devidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        devidePanel1Layout.setVerticalGroup(
                devidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
                MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuBarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(printReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 169,
                                                Short.MAX_VALUE)
                                        .addComponent(ImportButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(WeightTask, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(devidePanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(devidePanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addContainerGap()));
        MenuBarLayout.setVerticalGroup(
                MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuBarLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(devidePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WeightTask, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ImportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284,
                                        Short.MAX_VALUE)
                                .addComponent(devidePanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 899, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MenuBar, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void WeightTaskActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        
    }

    private void printReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // HOVERING BUTTON EFFECT
    public class TransparentButton extends JButton {

        private Color hoverColor; // Color for hover state
        private boolean isHovering = false;

        public TransparentButton(String text, Color hoverColor) {
            super(text);
            this.hoverColor = hoverColor;
            setContentAreaFilled(false); // Don't paint default background
            setBorderPainted(false); // Don't paint default border
            setFocusPainted(false); // Don't paint default focus indicator
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
                g2d.setColor(new Color(22, 66, 91));
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
            g2d.setColor(Color.WHITE); // Text Color
            g2d.drawString(getText(), horizontalOffset, verticalOffset);
        }

        // Optional: Override getPreferredSize() to ensure the button has a reasonable
        // size
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
