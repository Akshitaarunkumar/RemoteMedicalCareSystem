import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {
    //to get s\user name and password
    String Name = new String();
    String Pass = new String();
    FormUtil FUtil = new FormUtil();
    
    public RegistrationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        
        //JTextField to get sex
        TF_Sex = new javax.swing.JTextField();
        //JTextField to get name
        TF_Name = new javax.swing.JTextField();
        //JTextField to get age
        TF_Age = new javax.swing.JTextField();
        //JTextField to get prescription
        TF_Presc = new javax.swing.JTextField();
        //JTextField to get blood group
        TF_Bloodgrp = new javax.swing.JTextField();
        //JTextField to get password
        TF_Pass = new javax.swing.JPasswordField();
        
        RegFormButton = new javax.swing.JButton();
        RegFormButton2 = new javax.swing.JButton();
        RegFormButton1 = new javax.swing.JButton();
        
        
        //JTextField to get email
        TF_Email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //to set font
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        
        //set text for the labels
        jLabel1.setText("Enter your details");
        jLabel2.setText("Name :");
        jLabel3.setText("Sex :");
        jLabel4.setText("Age :");
        jLabel6.setText("Prescription :");
        jLabel7.setText("Blood group :");
        jLabel16.setText("Password :");
        
        //Action listener to add sex
        TF_Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_SexActionPerformed(evt);
            }
        });

        //Action listener to add name
        TF_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NameActionPerformed(evt);
            }
        });

        //Action listener to add age
        TF_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_AgeActionPerformed(evt);
            }
        });

        //Action listener to add prescription
        TF_Presc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PrescActionPerformed(evt);
            }
        });

        //Action listener to add blood group
        TF_Bloodgrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_BloodgrpActionPerformed(evt);
            }
        });
        
        //Action listener to add password
        TF_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PassActionPerformed(evt);
            }
        });

        RegFormButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        
        //Register button
        RegFormButton.setText("Register");
        RegFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFormButtonActionPerformed(evt);
            }
        });

        //Back button
        RegFormButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegFormButton2.setText("Back");
        RegFormButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFormButton2ActionPerformed(evt);
            }
        });

        //Go to account button
        RegFormButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegFormButton1.setText("Go to account");
        RegFormButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFormButton1ActionPerformed(evt);
            }
        });

       
        jLabel8.setText("Email ID:");
        //Action listener to add email
        TF_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_EmailActionPerformed(evt);
            }
        });
        
        //UI layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RegFormButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RegFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TF_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TF_Bloodgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TF_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TF_Presc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(RegFormButton1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Bloodgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Presc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegFormButton2)
                    .addComponent(RegFormButton))
                .addGap(26, 26, 26)
                .addComponent(RegFormButton1)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_SexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_SexActionPerformed

    private void RegFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFormButtonActionPerformed
                                             
        Name = TF_Name.getText();
        Pass = String.valueOf(TF_Pass.getPassword());
        String Sex= TF_Sex.getText();
        String BloodGrp= TF_Bloodgrp.getText();
        String Age1 = TF_Age.getText();
        Integer Age = Integer.valueOf(Age1);
        String Presc = TF_Presc.getText();
        String Email = TF_Email.getText();
        
        Connection con= null;
        PreparedStatement ps=null;
        try{
            //To connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            //database name=she_db,table name=user1,password=xxxx
            con= DriverManager.getConnection("jdbc:mysql://localhost/she_db","user1","xxxx");
            //query to insert into the patient table of the database
            String query= ("INSERT INTO she_db.patient (pname,password,sex,bloodgrp,age,prescription,email) VALUES (?,?,?,?,?,?,?)");
            
            //prepared statement to insert into the patient table of the database
            ps= con.prepareStatement(query);
            ps.setString(1, Name);
            ps.setString(2, Pass);
            ps.setString(3, Sex);
            ps.setString(4, BloodGrp);
            ps.setInt(5, Age);
            ps.setString(6, Presc);
            ps.setString(7, Email);
            
           //message displayed after successful insertion into table
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "New Patient Added");
            }
            
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_RegFormButtonActionPerformed
     
    private void TF_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NameActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_TF_NameActionPerformed

    private void TF_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_AgeActionPerformed

    private void TF_BloodgrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_BloodgrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_BloodgrpActionPerformed

    private void TF_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_PassActionPerformed

    private void RegFormButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFormButton2ActionPerformed
        // TODO add your handling code here:
        FrontPage FP= new FrontPage();
        FP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegFormButton2ActionPerformed

    private void TF_PrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PrescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_PrescActionPerformed

    private void RegFormButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFormButton1ActionPerformed
        // TODO add your handling code here:
        FUtil.sendData(Name,Pass);
        this.setVisible(false);
    }//GEN-LAST:event_RegFormButton1ActionPerformed

    private void TF_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EmailActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrationForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegFormButton;
    private javax.swing.JButton RegFormButton1;
    private javax.swing.JButton RegFormButton2;
    private javax.swing.JTextField TF_Age;
    private javax.swing.JTextField TF_Bloodgrp;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Name;
    private javax.swing.JPasswordField TF_Pass;
    private javax.swing.JTextField TF_Presc;
    private javax.swing.JTextField TF_Sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
