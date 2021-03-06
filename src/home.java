
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
     Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public home() {
        initComponents();
        showDate();
        showTime();
        homepage HM = new homepage();
        jDesktopPane1.add(HM).setVisible(true);
    }
    
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyy/MM/dd");
        date.setText(s.format(d));
    }
    
    void showTime(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }
        }).start();
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customerbtn = new javax.swing.JLabel();
        homebtn = new javax.swing.JLabel();
        searchbtn = new javax.swing.JLabel();
        servicebtn = new javax.swing.JLabel();
        appointmentbtn = new javax.swing.JLabel();
        invoicedetailbtn = new javax.swing.JLabel();
        adminbtn = new javax.swing.JLabel();
        invoicebtn = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ntfbtn = new javax.swing.JLabel();
        lgtbtn1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 232, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 4, new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1.png"))); // NOI18N

        customerbtn.setBackground(new java.awt.Color(255, 0, 164));
        customerbtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        customerbtn.setForeground(new java.awt.Color(255, 255, 255));
        customerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registercustomer.png"))); // NOI18N
        customerbtn.setText("Register Customer");
        customerbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        customerbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerbtn.setOpaque(true);
        customerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerbtnMouseClicked(evt);
            }
        });

        homebtn.setBackground(new java.awt.Color(255, 0, 164));
        homebtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        homebtn.setText("Home");
        homebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homebtn.setOpaque(true);
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        homebtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homebtnKeyPressed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(255, 0, 164));
        searchbtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.setOpaque(true);
        searchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbtnMouseClicked(evt);
            }
        });

        servicebtn.setBackground(new java.awt.Color(255, 0, 164));
        servicebtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        servicebtn.setForeground(new java.awt.Color(255, 255, 255));
        servicebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registerservices.png"))); // NOI18N
        servicebtn.setText("Register Services");
        servicebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        servicebtn.setOpaque(true);
        servicebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servicebtnMouseClicked(evt);
            }
        });

        appointmentbtn.setBackground(new java.awt.Color(255, 0, 164));
        appointmentbtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        appointmentbtn.setForeground(new java.awt.Color(255, 255, 255));
        appointmentbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appointment icon.png"))); // NOI18N
        appointmentbtn.setText("Appointment");
        appointmentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentbtn.setOpaque(true);
        appointmentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentbtnMouseClicked(evt);
            }
        });

        invoicedetailbtn.setBackground(new java.awt.Color(255, 0, 164));
        invoicedetailbtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        invoicedetailbtn.setForeground(new java.awt.Color(255, 255, 255));
        invoicedetailbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoicedetails.png"))); // NOI18N
        invoicedetailbtn.setText("Income Details");
        invoicedetailbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invoicedetailbtn.setOpaque(true);
        invoicedetailbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoicedetailbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                invoicedetailbtnMouseEntered(evt);
            }
        });

        adminbtn.setBackground(new java.awt.Color(255, 0, 164));
        adminbtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        adminbtn.setForeground(new java.awt.Color(255, 255, 255));
        adminbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addadmin.png"))); // NOI18N
        adminbtn.setText("Add Admin");
        adminbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminbtn.setOpaque(true);
        adminbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminbtnMouseClicked(evt);
            }
        });

        invoicebtn.setBackground(new java.awt.Color(255, 0, 164));
        invoicebtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        invoicebtn.setForeground(new java.awt.Color(255, 255, 255));
        invoicebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payementreceipt.png"))); // NOI18N
        invoicebtn.setText("Payment Receipt");
        invoicebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invoicebtn.setOpaque(true);
        invoicebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoicebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(servicebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoicedetailbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointmentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(servicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(appointmentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(invoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(invoicedetailbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1485, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimizebtn.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closebtn.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 4, new java.awt.Color(0, 0, 0)));

        ntfbtn.setBackground(new java.awt.Color(60, 36, 21));
        ntfbtn.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        ntfbtn.setForeground(new java.awt.Color(255, 255, 255));
        ntfbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ntfbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notification.png"))); // NOI18N
        ntfbtn.setToolTipText("Click to See Notifications");
        ntfbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ntfbtn.setOpaque(true);
        ntfbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ntfbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ntfbtnMouseEntered(evt);
            }
        });

        lgtbtn1.setBackground(new java.awt.Color(237, 28, 36));
        lgtbtn1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lgtbtn1.setForeground(new java.awt.Color(255, 255, 255));
        lgtbtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgtbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoutbtn (2).png"))); // NOI18N
        lgtbtn1.setToolTipText("Click to Logout");
        lgtbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lgtbtn1.setOpaque(true);
        lgtbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgtbtn1MouseClicked(evt);
            }
        });

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setText("Date");

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setText("Time");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lgtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ntfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time)
                            .addComponent(date))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(ntfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lgtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        homepage HM = new homepage();
        jDesktopPane1.add(HM).setVisible(true);
        homebtn.setBackground(new Color(134, 0, 196));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
        
    }//GEN-LAST:event_homebtnMouseClicked

    private void customerbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerbtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        regcustomer HM = new regcustomer();
        jDesktopPane1.add(HM).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(134, 0, 196));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_customerbtnMouseClicked

    private void homebtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homebtnKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_homebtnKeyPressed

    private void searchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        searchcustomer SC = new searchcustomer();
        jDesktopPane1.add(SC).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(134, 0, 196));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_searchbtnMouseClicked

    private void servicebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicebtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        regservice RS = new regservice();
        jDesktopPane1.add(RS).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(134, 0, 196));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_servicebtnMouseClicked

    private void appointmentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentbtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        appointment AP = new appointment();
        jDesktopPane1.add(AP).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(134, 0, 196));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_appointmentbtnMouseClicked

    private void invoicebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoicebtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        payreceipt PR = new payreceipt();
        jDesktopPane1.add(PR).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(134, 0, 196));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_invoicebtnMouseClicked

    private void invoicedetailbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoicedetailbtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        invoicedetails ID = new invoicedetails();
        jDesktopPane1.add(ID).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(134, 0, 196));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_invoicedetailbtnMouseClicked

    private void adminbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminbtnMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        admin AD = new admin();
        jDesktopPane1.add(AD).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(134, 0, 196));
        ntfbtn.setBackground(new Color(60,36,21));
    }//GEN-LAST:event_adminbtnMouseClicked

    private void ntfbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntfbtnMouseClicked
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        notifications NF = new notifications();
        jDesktopPane1.add(NF).setVisible(true);
        homebtn.setBackground(new Color(255, 0, 164));
        customerbtn.setBackground(new Color(255, 0, 164));
        searchbtn.setBackground(new Color(255, 0, 164));
        servicebtn.setBackground(new Color(255, 0, 164));
        appointmentbtn.setBackground(new Color(255, 0, 164));
        invoicebtn.setBackground(new Color(255, 0, 164));
        invoicedetailbtn.setBackground(new Color(255, 0, 164));
        adminbtn.setBackground(new Color(255, 0, 164));
        ntfbtn.setBackground(new Color(134, 0, 196));

    }//GEN-LAST:event_ntfbtnMouseClicked

    private void lgtbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgtbtn1MouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        this.setVisible(false);
        login object = new login();
        object.setVisible(true);

        
    }//GEN-LAST:event_lgtbtn1MouseClicked

    private void ntfbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntfbtnMouseEntered
        // TODO add your handling code here:
        conn = databaseConnection.connection();
        try{
            stmt = conn.createStatement();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM,dd,yyyy");
            LocalDateTime now = LocalDateTime.now();
            String sql = "SELECT * FROM appointment WHERE Date ='"+dtf.format(now)+"'";
            ResultSet rs = stmt.executeQuery(sql);
            int count=0;
            while (rs.next()) {
               count++;               
           }
            Integer cnt=count;
            ntfbtn.setText(cnt.toString());
        }
        catch (HeadlessException | NumberFormatException | SQLException e)
        {   
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ntfbtnMouseEntered

    private void invoicedetailbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoicedetailbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_invoicedetailbtnMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminbtn;
    private javax.swing.JLabel appointmentbtn;
    private javax.swing.JLabel customerbtn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel invoicebtn;
    private javax.swing.JLabel invoicedetailbtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lgtbtn1;
    private javax.swing.JLabel ntfbtn;
    private javax.swing.JLabel searchbtn;
    private javax.swing.JLabel servicebtn;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
