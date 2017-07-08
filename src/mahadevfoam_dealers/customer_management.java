/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahadav
 */
public class customer_management extends javax.swing.JFrame {

    /**
     * Creates new form customer_management
     */
    public customer_management() {
        initComponents();
         try {
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
        Statement stmt = conn.createStatement();
        String combo_group = "Select DISTINCT region from region_list;";
        ResultSet rs = stmt.executeQuery(combo_group);
 
       while(rs.next())
        {
        jcomboregion.addItem(rs.getString(1));
        }
        
            } 
        catch (Exception e)
            {
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jtfcusname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfid = new javax.swing.JTextField();
        jtfcusphone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtfcusaddress = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcustable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jcomboregion = new javax.swing.JComboBox();
        jrbtable = new javax.swing.JRadioButton();
        jrbregionwise = new javax.swing.JRadioButton();
        jrbfield = new javax.swing.JRadioButton();
        jrbsearch = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText(" Name:-");

        jLabel5.setText("Contact Number:-");

        jLabel1.setText("Customer ID:-");

        jLabel4.setText("Address:-");

        jtfcusaddress.setColumns(20);
        jtfcusaddress.setRows(5);
        jScrollPane2.setViewportView(jtfcusaddress);

        jcustable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "Address", "Region"
            }
        ));
        jcustable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jcustable);

        jLabel3.setText("Region");

        jcomboregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboregionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtable);
        jrbtable.setText("View in Table");

        buttonGroup1.add(jrbregionwise);
        jrbregionwise.setText("View Region Wise");

        buttonGroup1.add(jrbfield);
        jrbfield.setText("View in Fields");

        buttonGroup1.add(jrbsearch);
        jrbsearch.setText("Search");

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Go to Billings");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfcusname)
                                .addComponent(jtfcusphone)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcomboregion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbregionwise)
                            .addComponent(jrbtable)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbsearch)
                                    .addComponent(jrbfield))
                                .addGap(48, 48, 48)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfcusname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfcusphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcomboregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbtable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbfield)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbsearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(16, 16, 16)))
                        .addComponent(jrbregionwise)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomboregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboregionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboregionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jtfid.getText();
            String name=jtfcusname.getText();
            String phone=jtfcusphone.getText();
            String address=jtfcusaddress.getText();
            String region=jcomboregion.getSelectedItem().toString();
            
            String sql = "update customer_details set cus_name='"+name+"',cus_phone='"+phone+"',cus_address='"+address+"',cus_region='"+region+"'where cus_id='"+id+"';";
            stmt.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(this,"customer details updated  Sucessfully...");
            
            } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());  
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jtfid.getText();
            
            String sqldelete = "delete from customer_details where cus_id='"+id+"';";
            stmt.executeUpdate(sqldelete);
            
            JOptionPane.showMessageDialog(this, "customer detail deleted..!");
            jtfid.setText(null);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new mahadev_menu_page().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(jrbtable.isSelected())
        {
            try{
                    DefaultTableModel model=(DefaultTableModel)jcustable.getModel();

                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();

                     String sql="select * from customer_details;";

                     ResultSet rs=stmt.executeQuery(sql);

                int rows=model.getRowCount();
                if(rows>0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }
                    }
                    while(rs.next())
                    {
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }

                }    
                catch(Exception e)
                {
                        JOptionPane.showMessageDialog(this, "Database Connection Error.....!"); 
                }

                    }
        if (jrbfield.isSelected())
        {
                        try {
                    DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();
                    int id=Integer.parseInt(jtfid.getText());
                    String sql="select * from customer_details WHERE cus_id='"+id+"';";
                    ResultSet rs1=stmt.executeQuery(sql);

                     if(rs1.next())
                     {
                     jtfid.setText(rs1.getString("CUS_ID"));
                     jtfcusname.setText(rs1.getString("CUS_NAME"));
                     jtfcusphone.setText(rs1.getString("CUS_PHONE"));
                     jtfcusaddress.setText(rs1.getString("CUS_ADDRESS"));
                     jcomboregion.setSelectedItem(rs1.getString("CUS_REGION"));
                     }
                        }
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
                    }
        if (jrbsearch.isSelected())
        {
            try {
                        DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                        Statement stmt = conn.createStatement();
                        String name = (jtfcusname.getText());
                        String sql = "SELECT * FROM customer_details where cus_name like '%"+name+"%';";
                                    //select * from region_list where region like '%r%';
                        ResultSet rs = stmt.executeQuery(sql);

                        int rows=model.getRowCount();
                    if(rows>=0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }

                            while(rs.next())
                            {
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                            }

                    }
          }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        if (jrbregionwise.isSelected())
        {
            try 
                        {
                        DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                        Statement stmt = conn.createStatement();
                        String region = jcomboregion.getSelectedItem().toString();
                        String sql = "SELECT * FROM customer_details where cus_region='"+region+"';"; 

                        ResultSet rs = stmt.executeQuery(sql);

                        int rows=model.getRowCount();
                    if(rows>0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }

                            while(rs.next())
                            {
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                            }

                    }

                        } 
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
                        }
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try 
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            int id=Integer.parseInt(jtfid.getText());
            int id2=id+1;
            String name=jtfcusname.getText();
            String phone=jtfcusphone.getText();
            String address=jtfcusaddress.getText();
            String region=jcomboregion.getSelectedItem().toString();
            
            String sqlinsert = "insert into customer_details values('"+id+"','"+name+"','"+phone+"','"+address+"','"+region+"');";
            stmt.executeUpdate(sqlinsert);
            
            jtfcusaddress.setText(null);
            jtfcusname.setText(null);
            jtfcusphone.setText(null);
            jtfcusname.setText(null);
            jtfid.setText(""+id2);
            JOptionPane.showMessageDialog(this, "Customer added succesfully");
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
new bills().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcomboregion;
    private javax.swing.JTable jcustable;
    private javax.swing.JRadioButton jrbfield;
    private javax.swing.JRadioButton jrbregionwise;
    private javax.swing.JRadioButton jrbsearch;
    private javax.swing.JRadioButton jrbtable;
    private javax.swing.JTextArea jtfcusaddress;
    private javax.swing.JTextField jtfcusname;
    private javax.swing.JTextField jtfcusphone;
    private javax.swing.JTextField jtfid;
    // End of variables declaration//GEN-END:variables
}
