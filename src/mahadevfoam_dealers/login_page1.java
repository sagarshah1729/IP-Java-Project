/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SAGAR
 */
public class login_page1 extends javax.swing.JFrame {

    /**
     * Creates new form login_page1
     */
    public login_page1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTfuserid = new javax.swing.JTextField();
        jTfnewuserid = new javax.swing.JTextField();
        jTfnewuserpass = new javax.swing.JTextField();
        jTfadminid = new javax.swing.JTextField();
        jpassfromuser = new javax.swing.JPasswordField();
        jadminpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("MAHADEV FOAM AND FURNISHING");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setText("DEALER MANAGEMENT SYSTEM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("New User ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("New Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Administrator ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Administrator Pass");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel5)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(179, 179, 179)
                                                .addComponent(jLabel8))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTfuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(jpassfromuser))))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jadminpass, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTfnewuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(jTfnewuserpass)
                                .addComponent(jTfadminid))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTfuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfnewuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jpassfromuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfnewuserpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTfadminid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jadminpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
         String useridfromuser = jTfuserid.getText();
         String passwordfromuser =jpassfromuser.getText();
         String sql = "SELECT * FROM login where userid='"+useridfromuser+"';";
         ResultSet rs = stmt.executeQuery(sql);
         
         //String password=rs.getString("password");
         if(rs.next()) 
         {         
            String password=rs.getString("password");  // password from database
            if(password.equals(passwordfromuser))
            {
              new mahadev_menu_page().setVisible(true);
              dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Check username or password..!");
            }
         }
         
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
         String newuser = jTfnewuserid.getText();
         String newpassword =jTfnewuserpass.getText();
         String adminid = jTfadminid.getText();
         String adminpass = jadminpass.getText();
         String sql = "SELECT * FROM login where userid='"+adminid+"';";
         ResultSet rs = stmt.executeQuery(sql);
         
         //String password=rs.getString("password");
         if(rs.next()) 
         {         
            String password=rs.getString("password");
            if(password.equals(adminpass))
            {
                String sqlinsert = "INSERT INTO LOGIN VALUES('"+newuser+"','"+newpassword+"');";
                                  //insert into login values('newuser','newpassword');
                stmt.executeUpdate(sqlinsert);
                JOptionPane.showMessageDialog(this, "New User Created..!");
                jTfadminid.setText(null);
                jTfnewuserid.setText(null);
                jTfnewuserpass.setText(null);
                jadminpass.setText(null);
                new mahadev_menu_page().setVisible(true);
                dispose();
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Check admin userid or pass..!");
            }
         }
         
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }                                        

    private void jTfnewuseridMouseClicked(java.awt.event.MouseEvent evt) {                                          
      jTfnewuserid.setText(null);
      jTfnewuserid.setForeground(Color.BLACK);
    }                                         

    private void jTfnewuseridFocusLost(java.awt.event.FocusEvent evt) {                                       
      String text = jTfnewuserid.getText();
      if("".equals(text))
      {
      jTfnewuserid.setText("Enter your user id");
      jTfnewuserid.setForeground(Color.gray);
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login_page1().setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTfadminid;
    private javax.swing.JTextField jTfnewuserid;
    private javax.swing.JTextField jTfnewuserpass;
    private javax.swing.JTextField jTfuserid;
    private javax.swing.JPasswordField jadminpass;
    private javax.swing.JPasswordField jpassfromuser;
    // End of variables declaration//GEN-END:variables
}
