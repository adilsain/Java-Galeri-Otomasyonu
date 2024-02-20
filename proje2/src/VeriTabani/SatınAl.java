
package VeriTabani;

import Loading.Loadingg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SatınAl extends javax.swing.JFrame {
        
    public static Connection baglan;
    private ResultSet res;
    
    
    public SatınAl() {
        initComponents();
    }
    
    public static void baglantiAc(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String bag ="jdbc:mysql://localhost:3306/kayit";
            String kullaniciAdi = "root";
            String sifre = "";
            baglan = DriverManager.getConnection(bag, kullaniciAdi, sifre);
            System.out.println("Veritabanına Bağlantı Başarılı Bir Şekilde Gerçekleştirildi...");
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println("Veritabanına Bağlanılamadı!!!");
        }
    }
   public void ekle(){
       String ad,soyad,telefon,email,adres,tc_kimlik,kart_no,cvv,sifre;
       
       
       ad=txtAd.getText();
       soyad=txtSoyAd.getText();
       telefon=txtTelefon.getText();
       email=txtEmail.getText();
       adres=txtAdres.getText();
       tc_kimlik=txtTC.getText();
       kart_no=jTextField1.getText();
       cvv=jTextField2.getText();
       sifre=jPasswordField1.getText();
       
       
       
       
       
       
       String ekleSorgusu = "INSERT INTO satis (ad,soyad,tc_kimlik,telefon,email,adres,kart_no,cvv,sifre) values ('"+ad+"','"+soyad+"',"+tc_kimlik+","+telefon+",'"+email+"','"+adres+"',"+kart_no+","+cvv+","+sifre+")";
       try {
           java.sql.Statement sta = baglan.createStatement();
           sta.execute(ekleSorgusu);
           
           
           
           
       } catch (SQLException e) {
           System.out.println(e.toString());
           JOptionPane.showConfirmDialog(null,"Satın Alma İşlemi Gerçekleştirilemedi,Lütfen Bilgileri Doğru Giriniz...", "İşlem Onaylanmadı!",JOptionPane.PLAIN_MESSAGE);
       }
       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSatinAl = new javax.swing.JButton();
        lblAd = new javax.swing.JLabel();
        lblSoyad = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        txtSoyAd = new javax.swing.JTextField();
        lblTC = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        lblAdres = new javax.swing.JLabel();
        txtAdres = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        btnSatinAl.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnSatinAl.setForeground(new java.awt.Color(0, 0, 0));
        btnSatinAl.setText("SATIN AL");
        btnSatinAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatinAlActionPerformed(evt);
            }
        });

        lblAd.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblAd.setForeground(new java.awt.Color(255, 255, 255));
        lblAd.setText("Ad :");

        lblSoyad.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblSoyad.setForeground(new java.awt.Color(255, 255, 255));
        lblSoyad.setText("Soyad :");

        txtAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdActionPerformed(evt);
            }
        });

        lblTC.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblTC.setForeground(new java.awt.Color(255, 255, 255));
        lblTC.setText("TC :");

        txtTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTCActionPerformed(evt);
            }
        });

        lblAdres.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblAdres.setForeground(new java.awt.Color(255, 255, 255));
        lblAdres.setText("Adres :");

        lblTelefon.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblTelefon.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefon.setText("Tel :");

        lblEmail.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email  :");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adil Sain\\Desktop\\slider-051.jpg")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Kredi Kartı Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setText("Kart No : ");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setText("CVV :");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel4.setText("Kart Şifresi : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(txtSoyAd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(btnSatinAl, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(lblTC))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(lblEmail))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(lblTelefon))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(lblAdres))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblAd))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblSoyad))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(txtSoyAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btnSatinAl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSatinAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatinAlActionPerformed
                    baglantiAc();
                    
        if(txtAd.getText().isEmpty() == false && txtSoyAd.getText().isEmpty() == false && txtAdres.getText().isEmpty() == false && txtEmail.getText().isEmpty() == false && jTextField1.getText().isEmpty()==false && jTextField2.getText().isEmpty()==false && jPasswordField1.getText().isEmpty()==false ) {
            
Loadingg loadingg = new Loadingg();
       loadingg.setVisible(true);
            
       ekle();
        }     
        else{
          JOptionPane.showConfirmDialog(null,"Satın Alma İşlemi Gerçekleştirilemedi!\nLütfen Tüm Bilgileri Eksiksiz Giriniz...", "İşlem Onaylanmadı!",JOptionPane.PLAIN_MESSAGE);

        }
        
    }//GEN-LAST:event_btnSatinAlActionPerformed

    private void txtAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdActionPerformed
       
    }//GEN-LAST:event_txtAdActionPerformed

    private void txtTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTCActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(SatınAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SatınAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SatınAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SatınAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SatınAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSatinAl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblTC;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSoyAd;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
