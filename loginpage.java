/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sample;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
//import java.util.Arrays;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage//C:\Users\HP\Downloads\reset-password.png
     */
    public loginpage() {
        initComponents();
        //logo image
        ImageIcon icon=new ImageIcon("C:\\Users\\HP\\Downloads\\IMG-20230117-WA0007.jpg");
        Image img=icon.getImage();
        Image imgscale=img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon=new ImageIcon(imgscale);
        jLabel2.setIcon(scaledicon);
        //login image
        ImageIcon icon1=new ImageIcon("C:\\Users\\HP\\Downloads\\IMG_20230122_122903.jpg");
        Image img1=icon1.getImage();
        Image imgscale1=img1.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon1=new ImageIcon(imgscale1);
        jLabel6.setIcon(scaledicon1);
        //username img
        ImageIcon icon2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\sample\\src\\icons\\unauthorized-person.png");
        Image img2=icon2.getImage();
        Image imgscale2=img2.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon2=new ImageIcon(imgscale2);
        jLabel3.setIcon(scaledicon2);
        //same
         ImageIcon icontwo=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\sample\\src\\icons\\456212.png");
        Image imgtwo=icontwo.getImage();
        Image imgscaletwo=imgtwo.getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicontwo=new ImageIcon(imgscaletwo);
        jLabel12.setIcon(scaledicontwo);
        //pass img
        ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Downloads\\reset-password.png");
        Image img3=icon3.getImage();
        Image imgscale3=img3.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon3=new ImageIcon(imgscale3);
        jLabel7.setIcon(scaledicon3);
        //same
        ImageIcon iconthree=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\sample\\src\\icons\\2710718.png");
        Image imgthree=iconthree.getImage();
        Image imgscalethree=imgthree.getScaledInstance(disable.getWidth(),disable.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scalediconthree=new ImageIcon(imgscalethree);
        disable.setIcon(scalediconthree);
        //same show
        ImageIcon iconfour=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\sample\\src\\icons\\159604.png");
        Image imgfour=iconfour.getImage();
        Image imgscalefour=imgfour.getScaledInstance(show.getWidth(),show.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scalediconfour=new ImageIcon(imgscalefour);
        show.setIcon(scalediconfour);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(82, 175, 206));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 643));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("BHISHMA INFOTECH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 160));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_________________________________________________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 390, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 100, 30));

        jTextField1.setBackground(new java.awt.Color(82, 175, 206));
        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getSize()+2f));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 230, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 80, 20));

        disable.setForeground(new java.awt.Color(255, 255, 255));
        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 315, 20, 20));

        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 315, 20, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("__________________________________________________");
        jLabel10.setMaximumSize(new java.awt.Dimension(229, 16));
        jLabel10.setMinimumSize(new java.awt.Dimension(229, 16));
        jLabel10.setPreferredSize(new java.awt.Dimension(229, 16));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 360, -1));

        jPasswordField1.setBackground(new java.awt.Color(82, 175, 206));
        jPasswordField1.setFont(jPasswordField1.getFont().deriveFont(jPasswordField1.getFont().getSize()+2f));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 360, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 590, 490));

        loginbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(82, 175, 206));
        loginbutton.setText("Login");
        loginbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 340, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 235, 20, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 50, 40));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 50, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Login");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 230, -1));

        exitbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(82, 175, 206));
        exitbutton.setText("Exit");
        exitbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbuttonMouseClicked(evt);
            }
        });
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 60, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hello! Let's get started");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Remember Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Forget Password?");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 360, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Don't have an account?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 150, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sign Up");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
       jPasswordField1.setEchoChar((char)0);
       disable.setVisible(false);
       disable.setEnabled(false);
       disable.setEnabled(true);
       disable.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        jPasswordField1.setEchoChar((char)8226);
       disable.setVisible(true);
       disable.setEnabled(true);
       disable.setEnabled(false);
       disable.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void exitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitbuttonMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       /*for(double i=0.0;i<=1;i=i+0.1)
       {
           String val=i+"";
           float f=Float.valueOf(val);
           this.setOpacity(f);
           try
           {
               Thread.sleep(50);
           }
           catch(Exception e)
           {
               
           }
       }*/
    }//GEN-LAST:event_formWindowOpened

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
       
           
 try{
          Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
          // String uname=jTextField1.getText();
           //String pass=jPasswordField1.getText();
           
            String sql = "SELECT * FROM login WHERE uname = ? and pass = ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            pst.setString(2,jPasswordField1.getText());
            ResultSet rs = pst.executeQuery();
    if(rs.next()){
        JOptionPane.showMessageDialog(null, "Login Successfull", "Login Success", 1);
        mainpage mp=new mainpage();
        mp.show();
        this.hide();
    }
    else{
        JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
    }
    con.close();
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_loginbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        loginpage lp=new loginpage();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable;
    private javax.swing.JButton exitbutton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
