/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mr Olayinka
 */
public class Attendance_Search extends javax.swing.JDialog {

   
     ResultSet rs=null ;
     Connection conn = null;
      Statement st = null;
      
    public Attendance_Search(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
       
        initComponents();
          ClockThread31 k = new ClockThread31();
         k.start();
         
         DefaultTableModel dtm = (DefaultTableModel) TableS.getModel();
                dtm.setRowCount(0);
                dtm.setColumnCount(0);
       DateconTB.setVisible(false);
        setLocationRelativeTo(null);
        
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
        datebutton = new javax.swing.JButton();
        MatricTB = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        DateconTB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        IDtb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lons = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Attendance");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        datebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.png"))); // NOI18N
        datebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datebuttonActionPerformed(evt);
            }
        });

        MatricTB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MatricTBFocusLost(evt);
            }
        });
        MatricTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricTBActionPerformed(evt);
            }
        });
        MatricTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MatricTBKeyReleased(evt);
            }
        });

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/forward_disabled.png"))); // NOI18N
        jLabel1.setText("By ID");

        IDtb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDtbFocusLost(evt);
            }
        });
        IDtb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDtbKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDtbKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/forward_disabled.png"))); // NOI18N
        jLabel2.setText("By MatricNo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/forward_disabled.png"))); // NOI18N
        jLabel3.setText(" By Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateconTB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MatricTB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDtb, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IDtb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datebutton)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MatricTB)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(DateconTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lons.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lons.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Date/Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12))); // NOI18N

        TableS.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(TableS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lons, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lons, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatricTBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MatricTBKeyReleased
        try {
            conn = SqlConnect2.AttconDB();
            st = conn.createStatement();
            
            String p ="select nn.ID as 'ID',nn.FirstName as 'FirstName', nn.LastName as 'LastName', nnsignin.Date as 'Date', nnsignin.TimeIN as 'TimeIN',nnsignin.Status as 'Status'  from nn,nnsignin where nn.ID = nnsignin.TempID  and nn.MatricNo='"+MatricTB.getText().toUpperCase()+"' ORDER BY nnsignin.Date DESC";
            rs = st.executeQuery(p);

                TableS.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();
            st.close();
          
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,ex);
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
             JOptionPane.showMessageDialog(null, ex);
         }
    }//GEN-LAST:event_MatricTBKeyReleased

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        String s = sdf.format(jXDatePicker1.getDate());
       DateconTB.setText(s);
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void datebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datebuttonActionPerformed
      
        if(DateconTB.getText().equals("")){
              
                  return ;
              }
        try {
            conn = SqlConnect2.AttconDB();
            st = conn.createStatement();
            
            String p ="select nn.ID as 'ID', nn.FirstName as 'FirstName', nn.LastName as 'LastName',nn.MatricNo as 'MatricNo',nnsignin.TimeIN as 'TimeIN',nnsignin.Status as'Status' from nn,nnsignin where nn.ID = nnsignin.TempID  and nnsignin.Date='"+DateconTB.getText()+"'";
            rs = st.executeQuery(p);
           
                TableS.setModel(DbUtils.resultSetToTableModel(rs));
           
            rs.close();
            st.close();
          
        } catch (SQLException | IOException ex) {
             JOptionPane.showMessageDialog(this,ex);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
             JOptionPane.showMessageDialog(null, ex);
         }
    }//GEN-LAST:event_datebuttonActionPerformed

    private void MatricTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatricTBActionPerformed

    private void IDtbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDtbKeyReleased
      
        try {
            conn = SqlConnect2.AttconDB();
            st = conn.createStatement();
            
            String p ="select nnsignin.Date as'Date',nnsignin.TimeIN as 'TimeIN',nnsignin.Status as 'Status' from nn,nnsignin where nn.ID = nnsignin.TempID  and nn.ID='"+IDtb.getText()+"' ORDER BY nnsignin.Date DESC";
            rs = st.executeQuery(p);
            TableS.setModel(DbUtils.resultSetToTableModel(rs));
//            if (rs.next()) {
//                
//                TableS.setModel(DbUtils.resultSetToTableModel(rs));
//                
//            } else {
//                String col[] = {};
//                TableS.setModel(new DefaultTableModel(col, 0));
//            }
                

            rs.close();
            st.close();
          
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,ex);
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
             JOptionPane.showMessageDialog(null, ex);
         }
        
    }//GEN-LAST:event_IDtbKeyReleased

    private void IDtbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDtbKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          evt.consume();
        }
    }//GEN-LAST:event_IDtbKeyTyped

    private void MatricTBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatricTBFocusLost
        // TODO add your handling code here:
        MatricTB.setText("");
    }//GEN-LAST:event_MatricTBFocusLost

    private void IDtbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDtbFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_IDtbFocusLost

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
            java.util.logging.Logger.getLogger(Attendance_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Attendance_Search dialog = new Attendance_Search(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateconTB;
    private javax.swing.JTextField IDtb;
    private javax.swing.JTextField MatricTB;
    private javax.swing.JTable TableS;
    private javax.swing.JButton datebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    public static javax.swing.JLabel lons;
    // End of variables declaration//GEN-END:variables
}
