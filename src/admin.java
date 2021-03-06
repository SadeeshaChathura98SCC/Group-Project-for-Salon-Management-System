
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import static jdk.nashorn.tools.ShellFunctions.input;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class admin extends javax.swing.JInternalFrame {

    /**
     * Creates new form admin
     */
       
     Connection conn = null;
     Statement stmt = null;
     ResultSet rs = null; 
     
    public admin() {
        super("Add Admin");
        initComponents();
        conn = databaseConnection.connection();
        jTable1.getTableHeader().setDefaultRenderer(new regcustomer.HeaderColor());
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        
        try{
           stmt = conn.createStatement();
           String sql = "SELECT * FROM admin";
           ResultSet res = stmt.executeQuery(sql);
             while(res.next()){
              DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
               dtm.addRow(new Object[]{res.getString("NIC"),res.getString("Name"),res.getString("Email"),res.getString("Password")});   
          }
        }catch(Exception e){ 
            JOptionPane.showMessageDialog(null, e);
        
        
        
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setGridColor(Color.gray);
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addadmin (2).png"))); // NOI18N

        aname.setBackground(new java.awt.Color(230, 231, 232));
        aname.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        aname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        aname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Admin NIC");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Email");

        mail.setBackground(new java.awt.Color(230, 231, 232));
        mail.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        mail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mailKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Password");

        anic.setBackground(new java.awt.Color(230, 231, 232));
        anic.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        anic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anicKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Admin Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Name", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminsearchbtn.png"))); // NOI18N
        jButton4.setToolTipText("Search the Admin Details");
        jButton4.setContentAreaFilled(false);
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/searchpur1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminsubmitbtn.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/submitpur.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminresetbtn.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resetpur.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admindeletebtn.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/deletepur.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        alert.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        alert.setForeground(java.awt.Color.red);
        alert.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                alertFocusGained(evt);
            }
        });

        pass.setBackground(new java.awt.Color(230, 231, 232));
        pass.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        pass.setBorder(null);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });

        showpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        showpass.setText("Show");
        showpass.setContentAreaFilled(false);
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(anic, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anic, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        String enterpw = pass.getText();
        
        String passwordToHash = enterpw;
        String generatedPassword = null;
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(passwordToHash.getBytes());

            byte[] bytes = md.digest();

            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            generatedPassword = sb.toString();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }  
 
        
        
          try{
            int count = 0; 
            stmt = conn.createStatement();
             
            String Name = aname.getText();
            String NIC = anic.getText();
            String Email = mail.getText();
            String Password = generatedPassword;
            
            String sql1 = "SELECT NIC FROM admin WHERE NIC= '"+anic.getText()+"' OR Name= '"+aname.getText()+"' OR Email= '"+mail.getText()+"' OR Password= '"+pass.getText()+"'";
            rs = stmt.executeQuery(sql1);
            while(rs.next()){
                  count++;
              }
              if(count==1){
              JOptionPane.showMessageDialog(null, "Already Exists an Account from these Details!"); 
           
               
              }else{
                  if (NIC.hashCode() == 0 || Name.hashCode() == 0 || NIC.hashCode() == 0 || Email.hashCode() == 0 || Password.hashCode() == 0)
              {
                  JOptionPane.showMessageDialog(null, "Some fields are empty!");
              }
              else
              {
    
            String sql = "INSERT INTO admin (Name, NIC, Email, Password) VALUES('"+Name+"', '"+NIC+"', '"+Email+"', '"+Password+"')";
   
            if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mail.getText()))) 
{
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Inserted Successfully");

         
            
           stmt = conn.createStatement();
           String sql2 = "SELECT * FROM admin";
           ResultSet res = stmt.executeQuery(sql2);
           jTable1.setModel(DbUtils.resultSetToTableModel(res));
             
           anic.setText(null);
           aname.setText(null);
           mail.setText(null);
           pass.setText(null);
           alert.setText(null);
           
            }
         }
              }
           
           
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try{
            stmt = conn.createStatement();
            
            String NIC = anic.getText();
            
            String sql = "SELECT * FROM admin WHERE NIC ='"+NIC+"'";
            
            rs = stmt.executeQuery(sql);
               
            if(rs.next()){
                
                anic.setText(rs.getString("NIC"));
                aname.setText(rs.getString("Name"));
                mail.setText(rs.getString("Email"));
                pass.setText(rs.getString("Password"));
                            
                
            }else{
                 JOptionPane.showMessageDialog(null,"Record not found");
            }
                
            } catch (HeadlessException | NumberFormatException | SQLException e)
            {JOptionPane.showMessageDialog(null, e); 
           
        
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String enterpw = pass.getText();
        
        String passwordToHash = enterpw;
        String generatedPassword = null;
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(passwordToHash.getBytes());

            byte[] bytes = md.digest();

            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            generatedPassword = sb.toString();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }  
        
        try{
            String Name = aname.getText();
            String NIC = anic.getText();
            String Email = mail.getText();
            String Password = generatedPassword;
            

            String sql = "UPDATE admin SET NIC ='"+NIC+"', Name='"+Name+"', Email='"+Email+"', Password='"+Password+"' WHERE NIC='"+NIC+"'";
   
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Data is successfully updated");
            
           stmt = conn.createStatement();
           String sql2 = "SELECT * FROM admin";
           ResultSet res = stmt.executeQuery(sql2);
           jTable1.setModel(DbUtils.resultSetToTableModel(res));
            
//            anic.setText(rs.getString("NIC"));
//            aname.setText(rs.getString("Name"));
//            mail.setText(rs.getString("Email"));
//            password.setText(rs.getString("Password"));

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to Delete?", "Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){
        
         try{
             
           int columnNIC = 1;
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();
            String value1 = jTable1.getModel().getValueAt(row, columnNIC).toString();
             
           stmt = conn.createStatement();

           String sql= "DELETE FROM admin WHERE  NIC = '"+value1+"'";
           stmt.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Data is successfully Deleted");

            dtm.removeRow(row);
             
        }catch (NumberFormatException | SQLException e){JOptionPane.showMessageDialog(null, e); 
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alertFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alertFocusGained
        // TODO add your handling code here:
      
    }//GEN-LAST:event_alertFocusGained

    private void anicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anicKeyPressed
        // TODO add your handling code here:
             switch(evt.getKeyCode())
        {
           case 38:pass.requestFocus();
                break;
           case 40:aname.requestFocus();
                break;
        }
           int key=evt.getKeyCode();
            if(key==10){
            aname.requestFocus();
        }
    }//GEN-LAST:event_anicKeyPressed

    private void anameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anameKeyPressed
        // TODO add your handling code here:
             switch(evt.getKeyCode())
        {
           case 38:anic.requestFocus();
                break;
           case 40:mail.requestFocus();
                break;
        }
           int key=evt.getKeyCode();
            if(key==10){
            mail.requestFocus();
        }
    }//GEN-LAST:event_anameKeyPressed

    private void mailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyPressed
        // TODO add your handling code here:
             switch(evt.getKeyCode())
        {
           case 38:aname.requestFocus();
                break;
           case 40:pass.requestFocus();
                break;
        }
           int key=evt.getKeyCode();
            if(key==10){
            pass.requestFocus();
        }
    }//GEN-LAST:event_mailKeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
         switch(evt.getKeyCode())
        {
           case 38:mail.requestFocus();
                break;
           case 40:anic.requestFocus();
                break;
        }
           int key=evt.getKeyCode();
            if(key==10){
            anic.requestFocus();
        }
    }//GEN-LAST:event_passKeyPressed

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        // TODO add your handling code here:
        try {
             if(pass.getText().length()>5){
             alert.setVisible(true);
             alert.setText("6 characters completed");
             alert.setForeground(new Color(0, 181, 12));
              
             
          }else{
             alert.setVisible(true);
             alert.setText("Password should contain atleast 6 characters  ");
             alert.setForeground(new Color(181, 0, 0));
        
          }  
    
        }catch (Exception e) {
        }
    }//GEN-LAST:event_passKeyReleased

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
        if(showpass.isSelected()){
            pass.setEchoChar((char)0);
        }
        else{
        pass.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField anic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox showpass;
    // End of variables declaration//GEN-END:variables

static public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable jTable1, Object value, boolean selected, boolean focused, int row, int colomn) {

            super.getTableCellRendererComponent(jTable1, value, selected, focused, row, colomn);
            setBackground(new Color(102,0,102));
            setForeground(Color.white);
            setFont(new Font("Century Gothic",Font.BOLD,15));

            TableCellRenderer rendererFromHeader = jTable1.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.LEFT);
            return this;
        }
}

    public boolean searching(){
        
        
           String m = "";
            boolean chk = false;
            try {
            String sql = "SELECT NIC FROM admin WHERE  NIC= "+anic.getText()+"";
            ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()){ 

                    m = rs.getString(1);
                    System.out.println(m);
                    
                }
               
        } catch (Exception e) {
                System.out.println(e);
        }
            if (m.equalsIgnoreCase(anic.getText())) {
                chk = true;
            
        }
   
    return chk;

    }

    }

