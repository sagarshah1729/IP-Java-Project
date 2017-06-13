package mahadevfoam_dealers;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
import java.sql.ResultSet;
*/


import java.lang.annotation.Annotation;
import mahadevfoam_dealers.Dealer_Portal;
import mahadevfoam_dealers.dealer_details_portal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahadav
 */
public class Add_region_form extends javax.swing.JFrame {

    /**
     * Creates new form Add_region_form
     */
    public Add_region_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addregionbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTfaddregion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jregiontable = new javax.swing.JTable();
        viewallbutton = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Region update");

        addregionbutton.setText("Add Region");
        addregionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addregionbuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Region:-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Region Update");

        backbutton.setText("Back");
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jregiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Region list"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jregiontable);

        viewallbutton.setText("View All");
        viewallbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallbuttonActionPerformed(evt);
            }
        });

        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTfaddregion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewallbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addregionbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfaddregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addregionbutton)
                            .addComponent(backbutton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewallbutton)
                            .addComponent(searchbutton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
       new Dealer_Portal().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_backbuttonActionPerformed

    private void addregionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addregionbuttonActionPerformed
            try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
           // int id=Integer.parseInt(jTfid.getText());
           //int id2=id+1;
            String region=jTfaddregion.getText();
            String sql = "insert into region_list values('"+region+"');";
		      //"insert into list values('region');"

		stmt.executeUpdate(sql);
           //     jTfid.setText(id2+"");
                jTfaddregion.setText(null);
                JOptionPane.showMessageDialog(this,"Region added Sucessfully...");  
                
}
        catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_addregionbuttonActionPerformed

    private void viewallbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallbuttonActionPerformed
        try{
        DefaultTableModel model=(DefaultTableModel)jregiontable.getModel();
        
        Class.forName("java.sql.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
        Statement stmt=conn.createStatement();
    
    String sql="select * from region_List;";
    	
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
            model.addRow(new Object[]{rs.getString(1)});
        }
    
    }    
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(this, "Database Connection Error.....!"); 
    }
    }//GEN-LAST:event_viewallbuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
          try {
            DefaultTableModel model=(DefaultTableModel)jregiontable.getModel();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String region = (jTfaddregion.getText());
            String sql = "SELECT * FROM region_list where region like '%"+region+"%';";
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
                    model.addRow(new Object[]{rs.getString(1)});
                }
                
        }
          }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Add_region_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_region_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_region_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_region_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_region_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addregionbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTfaddregion;
    private javax.swing.JTable jregiontable;
    private javax.swing.JButton searchbutton;
    private javax.swing.JButton viewallbutton;
    // End of variables declaration//GEN-END:variables
}