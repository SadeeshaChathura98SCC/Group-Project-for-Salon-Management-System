
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class invoicedetails extends javax.swing.JInternalFrame {

   
    
     Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null; 
    
    
    public invoicedetails() {
        super("Add InvoiceDetails");
        initComponents();
        jTable1.getTableHeader().setDefaultRenderer(new regcustomer.HeaderColor());
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setGridColor(Color.gray);
        
//set the current date to jdate chooser
        Date date=new Date();
        jDateChooser1.setDate(date);
        conn = databaseConnection.connection();
        try{
            stmt = conn.createStatement();
//            SimpleDateFormat sdf = new SimpleDateFormat("MM,dd,yyyy");
//            String Date = sdf.format(jDateChooser1.getDate());
            java.util.Date d=jDateChooser1.getDate();
            if(d==null){
                JOptionPane.showMessageDialog(null,"No date Specified!");
            }
            else{
                java.sql.Date sqldate=new  java.sql.Date(d.getTime());
                String sql = "SELECT * FROM invoice WHERE Date>='"+sqldate+" 00:00:00.00' AND Date <='"+sqldate+" 23:59:00.00'";
                ResultSet rs = stmt.executeQuery(sql);
                int count=0;
                while (rs.next()) {
                 count++;
                 DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
                 dtm.addRow(new Object[]{rs.getString("invoice_no"),rs.getString("NIC"), rs.getString("CName"),rs.getString("NetTotal")});                 
                }
                Integer cnt=count;
                receiptno.setText(cnt.toString());
            }
        }
        catch (HeadlessException | NumberFormatException | SQLException e)
        {   
             JOptionPane.showMessageDialog(null, e);
        }
        //get the daily sum
        double sum = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 3).toString());

        }
        
        income.setText(""+sum);  
        

        
   
        
    }
    
    
//    public void getInvoice() {
//            
//        try {
//           
//            stmt = conn.createStatement();
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM,dd,yyyy");
//            LocalDateTime now = LocalDateTime.now();
//            String sql = "SELECT * FROM appointment WHERE Date ='"+dtf.format(now)+"'";
//            ResultSet rs = stmt.executeQuery(sql);
//            int count=0;
//           while (rs.next()) {
//              count++;
//              DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
//             dtm.addRow(new Object[]{rs.getString("IID"),rs.getString("NIC"),rs.getString("NetTotal")});                  
//           }
//            Integer cnt=count;
//            receiptno.setText(cnt.toString());
//        
//
//        
//            
//        } catch (Exception e) {
//            
//        }
//            
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        receiptno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        income = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        income1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMonthChooser2 = new com.toedter.calendar.JMonthChooser();
        jPanel2 = new javax.swing.JPanel();
        print = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Month");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("No.Of Receipts");

        receiptno.setBackground(new java.awt.Color(230, 231, 232));
        receiptno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        receiptno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        receiptno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptnoActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "NIC", "CName", "Price"
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

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Daily Income");

        income.setBackground(new java.awt.Color(230, 231, 232));
        income.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        income.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(230, 231, 232));
        jDateChooser1.setToolTipText("Select the Date you want to Search");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/incomedetails.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Date");

        income1.setBackground(new java.awt.Color(230, 231, 232));
        income1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        income1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        income1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                income1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Monthly Income");

        jMonthChooser2.setToolTipText("Select the Month you want to Search");
        jMonthChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMonthChooser2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jMonthChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(297, 297, 297)
                                    .addComponent(jLabel3)
                                    .addGap(56, 56, 56)
                                    .addComponent(receiptno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(income1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel4)
                                    .addGap(45, 45, 45)
                                    .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(receiptno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jMonthChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(income1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reportbtn.png"))); // NOI18N
        print.setToolTipText("Click to Print Report");
        print.setContentAreaFilled(false);
        print.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/reportpur.png"))); // NOI18N
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monthlybtn.png"))); // NOI18N
        jButton1.setToolTipText("Click to Search Monthly Income");
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/monthlypur.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dailybtn.png"))); // NOI18N
        jButton2.setToolTipText("Click to Search Daily Income");
        jButton2.setContentAreaFilled(false);
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/dailypur.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(print)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receiptnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel predat=(DefaultTableModel)jTable1.getModel();
        int rows=predat.getRowCount();
        for(int i=rows-1;i>=0;i--){
            predat.removeRow(i);
        }
        try{
            stmt = conn.createStatement();
//            SimpleDateFormat sdf = new SimpleDateFormat("MM,dd,yyyy");
//            String Date = sdf.format(jDateChooser1.getDate());
            java.util.Date d=jDateChooser1.getDate();
           
            
            if(d!=null){
               
               java.sql.Date sqldate=new  java.sql.Date(d.getTime());
               String sql = "SELECT * FROM invoice WHERE Date>='"+sqldate+" 00:00:00.00' AND Date <='"+sqldate+" 23:59:00.00'";
               ResultSet rs = stmt.executeQuery(sql);
                int count=0;
                while (rs.next()) {
                 count++;
                 DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
                 dtm.addRow(new Object[]{rs.getString("invoice_no"),rs.getString("NIC"), rs.getString("CName"),rs.getString("NetTotal")});                 
                }
                Integer cnt=count;
                receiptno.setText(cnt.toString());
                
            }else{
                 JOptionPane.showMessageDialog(null,"No date Specified!");   
            }
            
        }
        catch (HeadlessException | NumberFormatException | SQLException e)
        {   
             JOptionPane.showMessageDialog(null, e);
        }
        //get the daily sum
        //implement as a function
        double sum = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 3).toString());

        }
        
        income.setText(""+sum);
        
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.45,0.55);
                
                jPanel1.paint(g2);
          
               
                return Printable.PAGE_EXISTS;
                         
                
                 }
             }
         );
  
            
        boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){}
        JOptionPane.showMessageDialog(null,"Report Generated");
        }
    }//GEN-LAST:event_printActionPerformed

    private void income1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_income1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_income1ActionPerformed

    private void jMonthChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMonthChooser2MouseClicked
       
       
    
    
    }//GEN-LAST:event_jMonthChooser2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
        int date = jMonthChooser2.getMonth();
            int ndate = date+1;
            
            String nDate = String.format("%02d", ndate); 
            
            
            
            if(ndate != 0){
               
               
                try{
                    stmt = conn.createStatement();
        
                    String sql = "SELECT * FROM invoice WHERE EXTRACT(MONTH FROM Date) = '"+ndate+"' ";
                    ResultSet rs = stmt.executeQuery(sql);
                    int count=0;
                    while (rs.next()) {
                        
           
                   
                    count++;
                    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
                    dtm.addRow(new Object[]{rs.getString("invoice_no"),rs.getString("NIC"), rs.getString("CName"),rs.getString("NetTotal")});                 
                    }
                    
                    Integer cnt=count;
                    receiptno.setText(cnt.toString());

 
                }
                catch (HeadlessException | NumberFormatException | SQLException e)
                {   
                     JOptionPane.showMessageDialog(null, e);
                }

                 
                double sum = 0;

                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    sum = sum + Double.parseDouble(jTable1.getValueAt(i, 3).toString());
                }
                income1.setText(""+sum);
            
            }
            
            else{
                JOptionPane.showMessageDialog(null,"No month Specified!");     
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField income;
    private javax.swing.JTextField income1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JMonthChooser jMonthChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    private javax.swing.JTextField receiptno;
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
}}

