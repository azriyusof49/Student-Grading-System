/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Frame.Controller.AssignModule;

/**
 *
 * @author AzrixDya
 */
public class ManageCourse extends javax.swing.JFrame {

        String nameCourse[] = new String[] {
                        "Module 1",
                        "Module 2",
                        "Module 3",
                        "Module 4",
                        "Module 5"
        };

        String hasAssign[] = new String[] {
                        "COURSE : Null",
                        "COURSE : Null",
                        "COURSE : Null",
                        "COURSE : Null",
                        "COURSE : Null",
                        "COURSE : Null"
        };

        public ManageCourse() {
                initComponents();
        }

        private void initComponents() {

                MainMenu = new javax.swing.JPanel();
                Menu = new javax.swing.JPanel();
                BarTop1 = new javax.swing.JPanel();
                BarTop = new javax.swing.JPanel();
                accountLogo = new javax.swing.JLabel();
                TextAdmin = new javax.swing.JLabel();
                ManageCourseBtn = new javax.swing.JButton();
                PercentageBtn = new javax.swing.JButton();
                ImportBtn = new javax.swing.JButton();
                logoutBtn = new javax.swing.JButton();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                Module1Btn1 = new javax.swing.JButton();
                LabelModule1 = new javax.swing.JLabel();
                Module1Btn = new javax.swing.JButton();
                LabelModule2 = new javax.swing.JLabel();
                Module1Btn2 = new javax.swing.JButton();
                LabelModule3 = new javax.swing.JLabel();
                Module1Btn3 = new javax.swing.JButton();
                LabelModule4 = new javax.swing.JLabel();
                Module1Btn4 = new javax.swing.JButton();
                LabelModule5 = new javax.swing.JLabel();
                BarTop2 = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);

                MainMenu.setBackground(new java.awt.Color(47, 102, 144));

                Menu.setBackground(new java.awt.Color(22, 66, 91));

                BarTop1.setBackground(new java.awt.Color(58, 124, 165));
                BarTop1.setPreferredSize(new java.awt.Dimension(126, 2));

                javax.swing.GroupLayout BarTop1Layout = new javax.swing.GroupLayout(BarTop1);
                BarTop1.setLayout(BarTop1Layout);
                BarTop1Layout.setHorizontalGroup(
                                BarTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                BarTop1Layout.setVerticalGroup(
                                BarTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                BarTop.setBackground(new java.awt.Color(58, 124, 165));
                BarTop.setPreferredSize(new java.awt.Dimension(126, 2));

                javax.swing.GroupLayout BarTopLayout = new javax.swing.GroupLayout(BarTop);
                BarTop.setLayout(BarTopLayout);
                BarTopLayout.setHorizontalGroup(
                                BarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                BarTopLayout.setVerticalGroup(
                                BarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                accountLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                accountLogo.setForeground(new java.awt.Color(255, 255, 255));
                accountLogo.setIcon(new javax.swing.ImageIcon(
                                "D:\\STUDY\\UMT SEM2\\Student-Grading-System-main\\asset\\icons8-male-user-50.png")); // NOI18N

                TextAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                TextAdmin.setForeground(new java.awt.Color(255, 255, 255));
                TextAdmin.setText("ADMIN");

                ManageCourseBtn.setBackground(new java.awt.Color(47, 102, 144));
                ManageCourseBtn.setForeground(new java.awt.Color(255, 255, 255));
                ManageCourseBtn.setText("Manage Course");
                ManageCourseBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ManageCourseBtnActionPerformed(evt);
                        }
                });

                PercentageBtn.setBackground(new java.awt.Color(47, 102, 144));
                PercentageBtn.setForeground(new java.awt.Color(255, 255, 255));
                PercentageBtn.setText("Percentage");
                PercentageBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                PercentageBtnActionPerformed(evt);
                        }
                });

                ImportBtn.setBackground(new java.awt.Color(47, 102, 144));
                ImportBtn.setForeground(new java.awt.Color(255, 255, 255));
                ImportBtn.setText("Import");
                ImportBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ImportBtnActionPerformed(evt);
                        }
                });

                logoutBtn.setBackground(new java.awt.Color(47, 102, 144));
                logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
                logoutBtn.setText("Log Out");
                logoutBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                logoutBtnActionPerformed(evt);
                        }
                });

                jLabel11.setIcon(new javax.swing.ImageIcon(
                                "D:\\STUDY\\UMT SEM2\\Student-Grading-System-main\\asset\\icons8-create-order-32.png")); // NOI18N

                jLabel12.setIcon(new javax.swing.ImageIcon(
                                "D:\\STUDY\\UMT SEM2\\Student-Grading-System-main\\asset\\icons8-document-32.png")); // NOI18N

                jLabel13.setIcon(new javax.swing.ImageIcon(
                                "D:\\STUDY\\UMT SEM2\\Student-Grading-System-main\\asset\\icons8-download-32.png")); // NOI18N

                javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
                Menu.setLayout(MenuLayout);
                MenuLayout.setHorizontalGroup(
                                MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(MenuLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(MenuLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(BarTop,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                152, Short.MAX_VALUE)
                                                                                .addComponent(BarTop1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                152, Short.MAX_VALUE)
                                                                                .addGroup(MenuLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(MenuLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(MenuLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel11)
                                                                                                                                .addComponent(jLabel12,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                                .addComponent(jLabel13,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(MenuLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(PercentageBtn,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(ManageCourseBtn,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(ImportBtn,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                MenuLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(accountLogo,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(TextAdmin)
                                                                                                                .addGap(16, 16, 16))
                                                                                .addComponent(logoutBtn,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                MenuLayout.setVerticalGroup(
                                MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(MenuLayout.createSequentialGroup()
                                                                .addGroup(MenuLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(MenuLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(MenuLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(MenuLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(22, 22, 22)
                                                                                                                                .addComponent(TextAdmin))
                                                                                                                .addGroup(MenuLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addContainerGap()
                                                                                                                                .addComponent(accountLogo,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                50,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(BarTop,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(MenuLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(ManageCourseBtn)
                                                                                                                .addComponent(jLabel11))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(PercentageBtn))
                                                                                .addComponent(jLabel12))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(MenuLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(ImportBtn))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                196,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(BarTop1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(logoutBtn)
                                                                .addGap(29, 29, 29)));

                accountLogo.getAccessibleContext().setAccessibleName("Logo");

                jPanel1.setBackground(new java.awt.Color(58, 124, 165));

                jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("COURSE MANAGEMENT");

                Module1Btn1.setText(nameCourse[0]);
                Module1Btn1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Module1Btn1ActionPerformed(evt);
                        }
                });

                LabelModule1.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
                LabelModule1.setForeground(new java.awt.Color(255, 255, 255));
                LabelModule1.setText(hasAssign[0]);

                Module1Btn.setText(nameCourse[1]);
                Module1Btn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Module2Btn2ActionPerformed(evt);
                        }
                });

                LabelModule2.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
                LabelModule2.setForeground(new java.awt.Color(255, 255, 255));
                LabelModule2.setText(hasAssign[1]);

                Module1Btn2.setText(nameCourse[2]);
                Module1Btn2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Module3Btn3ActionPerformed(evt);
                        }
                });

                LabelModule3.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
                LabelModule3.setForeground(new java.awt.Color(255, 255, 255));
                LabelModule3.setText(hasAssign[2]);

                Module1Btn3.setText(nameCourse[3]);
                Module1Btn3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Module4Btn4ActionPerformed(evt);
                        }
                });

                LabelModule4.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
                LabelModule4.setForeground(new java.awt.Color(255, 255, 255));
                LabelModule4.setText(hasAssign[3]);

                Module1Btn4.setText(nameCourse[4]);
                Module1Btn4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Module5Btn5ActionPerformed(evt);
                        }
                });

                LabelModule5.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
                LabelModule5.setForeground(new java.awt.Color(255, 255, 255));
                LabelModule5.setText(hasAssign[4]);

                BarTop2.setBackground(new java.awt.Color(47, 102, 144));
                BarTop2.setPreferredSize(new java.awt.Dimension(126, 2));

                javax.swing.GroupLayout BarTop2Layout = new javax.swing.GroupLayout(BarTop2);
                BarTop2.setLayout(BarTop2Layout);
                BarTop2Layout.setHorizontalGroup(
                                BarTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                BarTop2Layout.setVerticalGroup(
                                BarTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                jLabel7.setIcon(
                                new javax.swing.ImageIcon(
                                                "D:\\STUDY\\UMT SEM2\\Student-Grading-System-main\\asset\\Document.png")); // NOI18N

                jLabel2.setBackground(new java.awt.Color(153, 153, 153));
                jLabel2.setForeground(new java.awt.Color(204, 204, 204));
                jLabel2.setText("Create course by following specific task for each module");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(BarTop2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                820,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(28, 28, 28)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                345,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(30, 30, 30)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(Module1Btn4,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                132,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(LabelModule5))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(Module1Btn2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                132,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(LabelModule3))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(Module1Btn,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                132,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(LabelModule2))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(Module1Btn3,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                132,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(LabelModule4))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(Module1Btn1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                132,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(LabelModule1)))))
                                                                                                .addGap(0, 422, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel7,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(BarTop2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(Module1Btn1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LabelModule1))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(Module1Btn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LabelModule2))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(Module1Btn2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LabelModule3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(Module1Btn3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LabelModule4))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(Module1Btn4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LabelModule5))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
                MainMenu.setLayout(MainMenuLayout);
                MainMenuLayout.setHorizontalGroup(
                                MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(MainMenuLayout.createSequentialGroup()
                                                                .addComponent(Menu,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                MainMenuLayout.setVerticalGroup(
                                MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                .addGroup(MainMenuLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                setSize(new java.awt.Dimension(1060, 525));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
                // TODO add your handling code here:
                dispose();
                LoginPage loginFrame = new LoginPage();
                loginFrame.setVisible(true);
        }// GEN-LAST:event_logoutBtnActionPerformed

        private void ManageCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ManageCourseBtnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_ManageCourseBtnActionPerformed

        private void PercentageBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PercentageBtnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_PercentageBtnActionPerformed

        private void ImportBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ImportBtnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_ImportBtnActionPerformed

        private void Module1Btn1ActionPerformed(java.awt.event.ActionEvent evt) {
                AssignModule.AssignModuleListener listener = new AssignModule.AssignModuleListener() {
                        @Override
                        public void onModuleAssigned(String courseName) {
                                nameCourse[0] = courseName;
                                hasAssign[0] = "COURSE : DONE";
                                // Repaint the button and label with the new course name
                                Module1Btn1.setText(nameCourse[0]);
                                Module1Btn1.revalidate();
                                Module1Btn1.repaint();
                                LabelModule1.setText(hasAssign[0]);
                                LabelModule1.revalidate();
                                LabelModule1.repaint();
                        }
                };// GEN-LAST:event_Module1Btn1ActionPerformed

                AssignModule module1 = new AssignModule(listener);
                module1.setVisible(true);
        }

        private void Module2Btn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Module1Btn2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_Module1Btn2ActionPerformed

        private void Module3Btn3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Module1Btn3ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_Module1Btn3ActionPerformed

        private void Module4Btn4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Module1Btn4ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_Module1Btn4ActionPerformed

        private void Module5Btn5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Module1Btn4ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_Module1Btn4ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel BarTop;
        private javax.swing.JPanel BarTop1;
        private javax.swing.JPanel BarTop2;
        private javax.swing.JButton ImportBtn;
        private javax.swing.JLabel LabelModule1;
        private javax.swing.JLabel LabelModule2;
        private javax.swing.JLabel LabelModule3;
        private javax.swing.JLabel LabelModule4;
        private javax.swing.JLabel LabelModule5;
        private javax.swing.JPanel MainMenu;
        private javax.swing.JButton ManageCourseBtn;
        private javax.swing.JPanel Menu;
        private javax.swing.JButton Module1Btn;
        private javax.swing.JButton Module1Btn1;
        private javax.swing.JButton Module1Btn2;
        private javax.swing.JButton Module1Btn3;
        private javax.swing.JButton Module1Btn4;
        private javax.swing.JButton PercentageBtn;
        private javax.swing.JLabel TextAdmin;
        private javax.swing.JLabel accountLogo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton logoutBtn;
        // End of variables declaration//GEN-END:variables
}
