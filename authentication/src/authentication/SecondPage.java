
package authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
//import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu Singh
 */
public class SecondPage extends javax.swing.JFrame {

        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
    
    public SecondPage() {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("authentication/logo.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfMobile = new javax.swing.JTextField();
        tfUserId = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfRePassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(filler1);
        filler1.setBounds(785, 288, 0, 49);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentication/regis_img.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 360, 540);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 142, -1, -1));
        jPanel1.add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 198, 137, -1));
        jPanel1.add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 232, 137, -1));
        jPanel1.add(tfMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 266, 137, -1));
        jPanel1.add(tfUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 300, 137, -1));
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 340, 137, -1));
        jPanel1.add(tfRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 375, 137, -1));

        btnSubmit.setBackground(new java.awt.Color(102, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 470, -1, -1));

        btnCancle.setBackground(new java.awt.Color(255, 0, 51));
        btnCancle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(255, 255, 255));
        btnCancle.setText("Cancle");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Retype Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 375, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("User Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mobile Number ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 266, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 232, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 0, 390, 540);

        setSize(new java.awt.Dimension(764, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void backToFirstPage(){
        FirstPage fp = new FirstPage();
        fp.setVisible(true);
        this.dispose();
    }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        s1 = tfFirstName.getText();
        s2 = tfLastName.getText();
        s3 = tfMobile.getText();
        s4 = tfUserId.getText();
        s5 = String.valueOf(tfPassword.getPassword());
        s6 = String.valueOf(tfRePassword.getPassword());
        
        if(s1.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter First Name...");
        }
        else if(s2.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Last Name...");
        }
        else if(s3.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Your Mobile Numebr...");
        }
        else if(s4.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter User Id...");
        }
        else if(s5.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Password...");
        }
        else if(s6.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ReType Password...");
        }
        else if(s1!=null || s2!=null || s3!=null || s4!=null || s5!=null || s6!=null)
        {
            try
            {
                //String query = "select * from himanshu.Employee";
                //String query = "insert into golu.STUDENT_RECORD values(?,?,?,?,?,?)";
                
                //Connection connection = DBClass.getConnection("golu","golu");
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                
                String insertQuery = DataBaseClass.getInsertQuery();
                //Connection conn  = DriverManager.getConnection("jdbc:oracle:thin:GOLU/GOLU@localhost:1521:XE","system","system");
                Connection conn = DataBaseClass.getConnection("golu", "golu");
                //String query = "insert into GOLU.STUDENT_RECORD values(?,?,?,?,?,?)"; 
                //System.out.println("Connection Establish");
                
                PreparedStatement st = conn.prepareStatement(insertQuery);
                
                st.setString(1,s1);
                st.setString(2,s2);
                    long i3 = Long.parseLong(s3);
                st.setLong(3,i3);
                st.setString(4,s4);
                st.setString(5,s5);
                st.setString(6,s6);
                
                int rowAffect = st.executeUpdate();
                
                System.out.println(rowAffect);
                if(rowAffect == 0)
                {
                    JOptionPane.showMessageDialog(this, "Registration Incomplete...");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Registration Complete...");
                }
                st.close();
                conn.close();
            // closeing of insertquery
                //DataBaseClass.closeStatOfInsertQuery(conn);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            // Move to FirtPage
            backToFirstPage();
        }    
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // Move to FirtPage
        backToFirstPage();
    }//GEN-LAST:event_btnCancleActionPerformed

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
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SecondPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnSubmit;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JPasswordField tfRePassword;
    private javax.swing.JTextField tfUserId;
    // End of variables declaration//GEN-END:variables
}
