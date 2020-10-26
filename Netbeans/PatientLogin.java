//For patients the login is handled by PatientLogin.java which fetches information from the Patient table.

import java.sql.*;
import javax.swing.JOptionPane;

public class PatientLogin extends javax.swing.JFrame {
    
    String Name1= new String();
    String Pass1= new String();
    FormUtil FUtil = new FormUtil();

    public PatientLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        //variable declaration
        TF_Uname1 = new javax.swing.JTextField();
        LogFormButton = new javax.swing.JButton();
        UnameLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        TF_Pass1 = new javax.swing.JPasswordField();
        LogFormTitle = new javax.swing.JLabel();
        RegFormButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TF_Uname1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TF_Uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Uname1ActionPerformed(evt);
            }
        });
        //login button
        LogFormButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogFormButton.setText("Login");
        LogFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogFormButtonActionPerformed(evt);
            }
        });
        //patient login
        UnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UnameLabel.setText("Name :");
        PassLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PassLabel.setText("Password :");

        TF_Pass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Pass1ActionPerformed(evt);
            }
        });

        LogFormTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogFormTitle.setText("Enter patient details");
        //back button
        RegFormButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegFormButton2.setText("Back");
        RegFormButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFormButton2ActionPerformed(evt);
            }
        });
        //UI layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(LogFormTitle)
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RegFormButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(PassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_Uname1)
                                    .addComponent(TF_Pass1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(LogFormTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_Uname1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegFormButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogFormButtonActionPerformed
        // TODO add your handling code here:
        Name1 = TF_Uname1.getText();
        Pass1 = String.valueOf(TF_Pass1.getPassword());
        
        Connection con= null;
        PreparedStatement ps=null;
        ResultSet rs;
        
        try {
            //database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            //databse name=blooddon,user=user1,password=xxxx
            con= DriverManager.getConnection("jdbc:mysql://localhost/blooddon","user1","xxxx");
            //query to select patient record given username and password
            String query= ("SELECT * FROM she_db.patient WHERE `pname` =? AND `password` =?");
            //prepared statement to execute query
            ps= con.prepareStatement(query);
            ps.setString(1, Name1);
            ps.setString(2, Pass1);
            rs= ps.executeQuery();
            
            if(rs.next())
            {
                FUtil.sendData(Name1,Pass1);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Name or Password");
            }

        } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_LogFormButtonActionPerformed

    private void TF_Uname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Uname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Uname1ActionPerformed

    private void TF_Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Pass1ActionPerformed

    private void RegFormButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFormButton2ActionPerformed
        // TODO add your handling code here:
        FrontPage FP= new FrontPage();
        FP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegFormButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new PatientLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogFormButton;
    private javax.swing.JLabel LogFormTitle;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JButton RegFormButton2;
    private javax.swing.JPasswordField TF_Pass1;
    private javax.swing.JTextField TF_Uname1;
    private javax.swing.JLabel UnameLabel;
    // End of variables declaration//GEN-END:variables
}
