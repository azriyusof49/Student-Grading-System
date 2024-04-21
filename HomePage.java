import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage extends JFrame {
    // Variables declaration - do not modify
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ImportButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel TableStudent;
    private javax.swing.JButton WeightTask;
    private javax.swing.JButton printReportButton;
    Lang lang = new Lang(); // Call Text
    // End of variables declaration

    public HomePage() {
        initComponents();
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        MenuBar = new javax.swing.JPanel();
        ImportButton = new TransparentButton(lang.getText("import"), new Color(40, 40, 43));
        printReportButton = new TransparentButton(lang.getText("report"), new Color(40, 40, 43));
        ExitButton = new TransparentButton(lang.getText("exit"), new Color(40, 40, 43));
        WeightTask = new TransparentButton(lang.getText("exit"), new Color(40, 40, 43));

        TableStudent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Grading System");
        setBackground(new java.awt.Color(52, 52, 52));
        setName("HomePage"); // NOI18N
        setResizable(false);
        setPreferredSize(new java.awt.Dimension(1080, 600));
        

        MenuBar.setBackground(new java.awt.Color(0, 0, 0));

        ImportButton.setBackground(new java.awt.Color(0, 0, 0));
        ImportButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ImportButton.setText("Import");
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        printReportButton.setBackground(new java.awt.Color(0, 0, 0));
        printReportButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        printReportButton.setText("Grade Report");
        printReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        WeightTask.setBackground(new java.awt.Color(0, 0, 0));
        WeightTask.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        WeightTask.setText("Weight");
        WeightTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
                MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuBarLayout.createSequentialGroup()
                                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MenuBarLayout.createSequentialGroup()
                                                .addGroup(MenuBarLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(ImportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
                                                        .addComponent(printReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
                                                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
                                                        .addComponent(WeightTask, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));

        MenuBarLayout.setVerticalGroup(
                MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                                .addContainerGap(273, Short.MAX_VALUE)
                                .addComponent(WeightTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ImportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printReportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitButton)
                        .addGap(19, 19, 19)
                        ));

        TableStudent.setBackground(java.awt.Color.white);
        TableStudent.setForeground(new java.awt.Color(251, 244, 239));
        TableStudent.setToolTipText("");

        javax.swing.GroupLayout TableStudentLayout = new javax.swing.GroupLayout(TableStudent);
        TableStudent.setLayout(TableStudentLayout);
        TableStudentLayout.setHorizontalGroup(
                TableStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 845, Short.MAX_VALUE));
        TableStudentLayout.setVerticalGroup(
                TableStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 414, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74,
                                        Short.MAX_VALUE)
                                .addComponent(TableStudent, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TableStudent, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)));

        pack();
    }// </editor-fold>

    private void WeightTaskActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void printReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
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
            setFont(new Font("TimesNewRomen", Font.BOLD, 13));
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
                g2d.setColor(new Color(0, 0, 0));
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
}