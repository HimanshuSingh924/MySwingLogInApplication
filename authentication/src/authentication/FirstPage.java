
package authentication;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;                        
import oracle.jdbc.OracleTypes;

//for QR 
import java.util.HashMap;  
import java.util.Map;  
import com.google.zxing.BarcodeFormat;  
import com.google.zxing.MultiFormatWriter;  
import com.google.zxing.NotFoundException;  
import com.google.zxing.client.j2se.MatrixToImageWriter;  
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.qrcode.EncodeHintType;
import com.itextpdf.text.pdf.qrcode.ErrorCorrectionLevel;
import com.itextpdf.text.pdf.qrcode.WriterException;

/**
 *
 * @author Himanshu Singh
 */
public class FirstPage extends javax.swing.JFrame {

    static String userName = null;
    static String password = null;
    
    static String l_fName1 = null;
    static String l_lName1 = null;
    static String l_moblieNumber1;
    static String l_userName1 = null;
    static String l_password1 = null;
    
    public FirstPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        p_logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lUserName = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        fUserName = new javax.swing.JTextField();
        fPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Student Login");

        lUserName.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lUserName.setText("User Id");

        lPassword.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lPassword.setText("Password");

        fUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fUserNameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(213, 252, 252));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCreateAccount.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(0, 102, 204));
        btnCreateAccount.setText("create account");
        btnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentication/login logo.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout p_logoLayout = new javax.swing.GroupLayout(p_logo);
        p_logo.setLayout(p_logoLayout);
        p_logoLayout.setHorizontalGroup(
            p_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_logoLayout.createSequentialGroup()
                .addGroup(p_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_logoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(p_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lUserName)
                            .addComponent(lPassword)
                            .addComponent(fPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(fUserName)))
                    .addGroup(p_logoLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel3))
                    .addGroup(p_logoLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_logoLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_logoLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        p_logoLayout.setVerticalGroup(
            p_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_logoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount)
                .addGap(42, 42, 42))
            .addGroup(p_logoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseClicked
        // Open Second Page
        SecondPage sp = new SecondPage();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateAccountMouseClicked

    public static void takingValue(){
        
       userName = fUserName.getText();
       password = String.valueOf(fPassword.getPassword());
       //System.out.println(userName+" "+password);
    }
    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    
        //method call
        takingValue();
        
        if(userName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter User ID...");
        }
        else if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Password...");
        }
        else if(userName != null || password != null){
        
        //if(userName == ID)
        try {
            
            Connection conn = DataBaseClass.getConnection("GOLU", "GOLU");
            String selectQuery = DataBaseClass.getSelectQuery();
            
            PreparedStatement ps;
                ps = conn.prepareStatement(selectQuery);
            
            ps.setString(1,userName);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            //rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
        
                l_fName1 = rs.getString(1);
                l_lName1 = rs.getString(2);
                l_moblieNumber1 = rs.getString(3);
                    //String no = String.parseString(l_moblieNumber1);
                l_userName1 = rs.getString(4);
                l_password1  = rs.getString(5);
                
                
                
            }
            rs.close();
            ps.close();
            conn.close();
         
        } catch (ClassNotFoundException | SQLException  ex) {
            Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            e.printStackTrace();
            }
        }
        //this.dispose();
        
        if((userName == null ? l_userName1 == null : userName.equals(l_userName1)) && password.equals(l_password1)){
            
            //close FirstPage Class
        this.dispose();
            //Objext of ThirdPage
        ThirdPage tp1 = new ThirdPage();
        tp1.setVisible(true);
        //tp1.dataBaseMethod();
        tp1.l_fName.setText(l_fName1);
        tp1.l_lName.setText(l_lName1);
        tp1.l_moblieNumber.setText(l_moblieNumber1);
        tp1.l_userName.setText(l_userName1);
        tp1.l_password.setText(l_password1);
        }
        else {
            
            //JOptionPane.showMessageDialog(this, "Invalid User and Password...");
            /*if(userName == null ? l_userName1 != null : !userName.equals(l_userName1)){
                JOptionPane.showMessageDialog(this, "Invalid User ...");
            }
            if(password == null ? l_password1 != null : !password.equals(l_password1)){
                JOptionPane.showMessageDialog(this, "Invalid  Password...");
            }*/
            
            //else{
                JOptionPane.showMessageDialog(this, "Invalid User and Password..."/*+"Please Register YourSelf "*/);
            //}
        }
         
    }//GEN-LAST:event_btnLoginActionPerformed

    private void fUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCreateAccount;
    private javax.swing.JButton btnLogin;
    public static javax.swing.JPasswordField fPassword;
    public static javax.swing.JTextField fUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lUserName;
    private javax.swing.JPanel p_logo;
    // End of variables declaration//GEN-END:variables

    public static void pdf1(){
        try{
                System.out.println(userName+" "+password);
		
                Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("1");    
            try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:GOLU/GOLU@localhost:1521:XE","system","system")) {
        System.out.println("2");
                String query = "{call GOLU.fatchData(?,?,?)}";
        System.out.println("3");        
                    try (CallableStatement cs = conn.prepareCall(query)) {
        System.out.println("4");
                        cs.registerOutParameter(3,OracleTypes.CURSOR);
                        
                        cs.setString(1,userName);
                        cs.setString(2,password);
        System.out.println("5");                
                        cs.execute();
        System.out.println("6");                
                        Object obj = cs.getObject(3);
                    try (ResultSet rs = (ResultSet)obj) {
                        Document doc = new Document();
                        OutputStream ops = new FileOutputStream(new File("E:\\Client_Pdf.pdf"));
                        PdfWriter.getInstance(doc,ops);
        System.out.println("7");                
                        doc.open();
        System.out.println("8");                
                        while(rs.next())
                        {
        System.out.println("9");                    
                            PdfPTable bpdfPTable = new PdfPTable(5);
                            
                            PdfPCell pdfPCella1 = new PdfPCell(new Paragraph("First Name"));
                            PdfPCell pdfPCella2 = new PdfPCell(new Paragraph("Lasr Name"));
                            PdfPCell pdfPCella3 = new PdfPCell(new Paragraph("Mobile Number"));
                            PdfPCell pdfPCella4 = new PdfPCell(new Paragraph("User id"));
                            PdfPCell pdfPCella5 = new PdfPCell(new Paragraph("Password"));
                            //Create cells	2
                            PdfPCell pdfPCellb1 = new PdfPCell(new Paragraph(rs.getString(1)));
                            PdfPCell pdfPCellb2 = new PdfPCell(new Paragraph(rs.getString(2)));
                            PdfPCell pdfPCellb3 = new PdfPCell(new Paragraph(rs.getString(3)));
                            PdfPCell pdfPCellb4 = new PdfPCell(new Paragraph(rs.getString(4)));
                            PdfPCell pdfPCellb5 = new PdfPCell(new Paragraph(rs.getString(5)));
                            
                            //Add cells to table
                            
                            bpdfPTable.addCell(pdfPCella1);
                            bpdfPTable.addCell(pdfPCella2);
                            bpdfPTable.addCell(pdfPCella3);
                            bpdfPTable.addCell(pdfPCella4);
                            bpdfPTable.addCell(pdfPCella5);
                            
                            bpdfPTable.addCell(pdfPCellb1);
                            bpdfPTable.addCell(pdfPCellb2);
                            bpdfPTable.addCell(pdfPCellb3);
                            bpdfPTable.addCell(pdfPCellb4);
                            bpdfPTable.addCell(pdfPCellb5);
                            
                            bpdfPTable.setWidthPercentage(100);
                            
                            //Add content to the document using Table objects.
                            //add table 2stk
                            doc.add(bpdfPTable);
            System.out.println("10");            
                        }
                        System.out.println("Complete Successfully");
                        doc.close();
                        ops.close();
                    }
                    }
            }
		
		}catch(DocumentException | IOException | ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
    }
    
    public static void generateQRcode(String data, String path, String charset, Map map, int h, int w) throws WriterException, IOException, com.google.zxing.WriterException  {  
//the BitMatrix class represents the 2D matrix of bits  
//MultiFormatWriter is a factory class that finds the appropriate Writer subclass for the BarcodeFormat requested and encodes the barcode with the supplied contents.  
        com.google.zxing.common.BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);  
    MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));  
    }
    
//main() method  
    public static void createQR() throws WriterException, IOException, NotFoundException, com.google.zxing.WriterException  
    {
        
//data that we want to store in the QR code  
    //String str= "This Generated QR of " + l_fName1 + " ";  

//path where we want to get QR Code  
    String path = "E:\\Quote.png";  

//Encoding charset to be used  
    String charset = "UTF-8";  
    Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<>();  
    
//generates QR code with Low level(L) error correction capability  
    hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);  
    
//invoking the user-defined method that creates the QR code  
    generateQRcode(/*str*/"This Generated QR of " + l_fName1 + " " + l_lName1, path, charset, hashMap, 200, 200);//increase or decrease height and width accodingly   

//prints if the QR code is generated   
    System.out.println("QR Code created successfully."); 
    
    
    }  

}
