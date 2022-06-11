/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoccerManagermentUIdelegate;

import SoccerManagementModel.ConnectDB;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenduylinh
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        setSize(760, 580);
        initComponents();
        setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        btnBack = new javax.swing.JLabel();
        txtRewritepassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 172, 158));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/soccer-player-2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel2)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 27)); // NOI18N
        jLabel1.setText("SIGN UP");

        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AppleGothic", 1, 18))); // NOI18N

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AppleGothic", 1, 18))); // NOI18N

        btnSignup.setBackground(new java.awt.Color(34, 172, 158));
        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/previous.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        txtRewritepassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Rewrite password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AppleGothic", 1, 18))); // NOI18N

        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AppleGothic", 1, 18))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRewritepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel1))
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRewritepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel1)
                    .addGap(38, 38, 38)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String rewritepassword = txtRewritepassword.getText();
        
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(btnSignup, "Please fill in your username.");
        }else if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(btnSignup, "Please fill in your email.");
        }else if(txtPassword.getPassword().equals("")){
            JOptionPane.showMessageDialog(btnSignup, "Please fill in your password.");
        }else if(txtRewritepassword.getPassword().equals("")){
            JOptionPane.showMessageDialog(btnSignup, "Please fill in the rewrite password.");
        }else if(password.equals(rewritepassword) == false){
            JOptionPane.showMessageDialog(btnSignup, "Password and Rewrite Password must be the same!");
        }else{
            try {
            ConnectDB cn = new ConnectDB();
            Connection conn = cn.createConn();
            
//            String query = "INSERT INTO ACCOUNT  VALUES ('"+username+"', '"+password+"', '"+email+"')";
//            Statement statement;
//            
//            statement = conn.createStatement();
//            int x = statement.executeUpdate(query);
//            if(x == 0)
//                JOptionPane.showMessageDialog(btnSignup, "Your account has been existed!");
//            else
//                JOptionPane.showMessageDialog(btnSignup, "Sign up successfully!");

            String querycheck = "Select * from account where USERNAME = '"+username+"'OR EMAIL = '"+email+"'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(querycheck);
            if(rs.next() == false){
                String query = "INSERT INTO ACCOUNT  VALUES ('"+username+"', '"+password+"', '"+email+"')";
                Statement stm = conn.createStatement();
                int x = stm.executeUpdate(query);
                JOptionPane.showMessageDialog(btnSignup, "Sign up successfully!");
                this.setVisible(false);
                new Login().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(btnSignup, "Your account has been existed!");
            }
            
            conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRewritepassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
