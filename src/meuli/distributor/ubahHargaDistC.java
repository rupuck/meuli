/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuli.distributor;

import manageproduk.produk;

/**
 *
 * @author thero
 */
public class ubahHargaDistC extends javax.swing.JFrame {

    /**
     * Creates new form ubahHargaDistA
     */
    public ubahHargaDistC() {
        initComponents();
         distributorC obj = new distributorC();
        lblhargamahkota.setText("Rp. " + obj.getDistMahkota());
        lblhargapangrumat.setText("Rp. " + obj.getDistPangrumat());
        lblhargapangsi.setText("Rp. " + obj.getDistPangsi());
        lblhargaperang.setText("Rp. " + obj.getDistPerang());
        lblhargapisang.setText("Rp. " + obj.getDistPisang());
        lblhargapusaka.setText("Rp. " + obj.getDistPustaka());
        lblhargarumah.setText("Rp. "+ obj.getDistRumah());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alert1 = new javax.swing.JOptionPane();
        lblhargaangklung9 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        lblhargamahkota = new javax.swing.JLabel();
        lblhargapangrumat = new javax.swing.JLabel();
        lblhargapangsi = new javax.swing.JLabel();
        lblhargaperang = new javax.swing.JLabel();
        lblhargapisang = new javax.swing.JLabel();
        lblhargapusaka = new javax.swing.JLabel();
        lblhargarumah = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jmlrumah = new javax.swing.JTextField();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jmlpusaka = new javax.swing.JTextField();
        jButton45 = new javax.swing.JButton();
        jmlpisang = new javax.swing.JTextField();
        jButton46 = new javax.swing.JButton();
        jmlperang = new javax.swing.JTextField();
        jButton47 = new javax.swing.JButton();
        jmlpangsi = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        jmlpangrumat = new javax.swing.JTextField();
        jButton49 = new javax.swing.JButton();
        jmlmahkota = new javax.swing.JTextField();
        lblhargaangklung17 = new javax.swing.JLabel();
        lblhargaangklung18 = new javax.swing.JLabel();
        lblhargaangklung19 = new javax.swing.JLabel();
        lblhargaangklung20 = new javax.swing.JLabel();
        lblhargaangklung21 = new javax.swing.JLabel();
        lblhargaangklung22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setPreferredSize(new java.awt.Dimension(1100, 750));
        getContentPane().setLayout(null);

        lblhargaangklung9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung9.setText("Harga Lama");
        getContentPane().add(lblhargaangklung9);
        lblhargaangklung9.setBounds(900, 210, 60, 20);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/Mahkota190000.png"))); // NOI18N
        getContentPane().add(jButton22);
        jButton22.setBounds(60, 110, 130, 100);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/pangrumatSunda20000.png"))); // NOI18N
        getContentPane().add(jButton23);
        jButton23.setBounds(200, 110, 130, 100);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/pangsi80000.png"))); // NOI18N
        getContentPane().add(jButton24);
        jButton24.setBounds(340, 110, 130, 100);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/perangBubat28000.png"))); // NOI18N
        getContentPane().add(jButton25);
        jButton25.setBounds(480, 110, 130, 100);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/pisangSale25000.png"))); // NOI18N
        getContentPane().add(jButton26);
        jButton26.setBounds(620, 110, 130, 100);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/pustakabasa20000.png"))); // NOI18N
        getContentPane().add(jButton27);
        jButton27.setBounds(760, 110, 130, 100);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/imageProduk/RumahMiniatur60000.png"))); // NOI18N
        getContentPane().add(jButton28);
        jButton28.setBounds(900, 110, 130, 100);

        lblhargamahkota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargamahkota.setText("Rp. 25.000");
        getContentPane().add(lblhargamahkota);
        lblhargamahkota.setBounds(130, 210, 60, 20);

        lblhargapangrumat.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargapangrumat.setText("Rp. 25.000");
        getContentPane().add(lblhargapangrumat);
        lblhargapangrumat.setBounds(270, 210, 60, 20);

        lblhargapangsi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargapangsi.setText("Rp. 25.000");
        getContentPane().add(lblhargapangsi);
        lblhargapangsi.setBounds(410, 210, 60, 20);

        lblhargaperang.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaperang.setText("Rp.25.000");
        getContentPane().add(lblhargaperang);
        lblhargaperang.setBounds(550, 210, 60, 20);

        lblhargapisang.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargapisang.setText("Rp. 25.000");
        getContentPane().add(lblhargapisang);
        lblhargapisang.setBounds(690, 210, 60, 20);

        lblhargapusaka.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargapusaka.setText("Rp. 25.000");
        getContentPane().add(lblhargapusaka);
        lblhargapusaka.setBounds(830, 210, 60, 20);

        lblhargarumah.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargarumah.setText("Rp. 25.000");
        getContentPane().add(lblhargarumah);
        lblhargarumah.setBounds(970, 210, 60, 20);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Rumah");
        getContentPane().add(jLabel82);
        jLabel82.setBounds(900, 80, 49, 30);

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Pusaka");
        getContentPane().add(jLabel83);
        jLabel83.setBounds(760, 80, 100, 30);

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setText("Pisang");
        getContentPane().add(jLabel84);
        jLabel84.setBounds(620, 80, 100, 30);

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setText("Perang");
        getContentPane().add(jLabel85);
        jLabel85.setBounds(480, 80, 110, 30);

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setText("Pangsi");
        getContentPane().add(jLabel86);
        jLabel86.setBounds(340, 80, 80, 30);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setText("Pangrumat");
        getContentPane().add(jLabel87);
        jLabel87.setBounds(200, 80, 100, 30);

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setText("Mahkota");
        getContentPane().add(jLabel88);
        jLabel88.setBounds(60, 80, 60, 30);

        jmlrumah.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlrumah.setText("0");
        getContentPane().add(jmlrumah);
        jmlrumah.setBounds(900, 230, 130, 20);

        jButton43.setText("Ubah");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton43);
        jButton43.setBounds(900, 260, 130, 20);

        jButton44.setText("Ubah");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton44);
        jButton44.setBounds(760, 260, 130, 20);

        jmlpusaka.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlpusaka.setText("0");
        getContentPane().add(jmlpusaka);
        jmlpusaka.setBounds(760, 230, 130, 20);

        jButton45.setText("Ubah");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton45);
        jButton45.setBounds(620, 260, 130, 20);

        jmlpisang.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlpisang.setText("0");
        getContentPane().add(jmlpisang);
        jmlpisang.setBounds(620, 230, 130, 20);

        jButton46.setText("Ubah");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton46);
        jButton46.setBounds(480, 260, 130, 20);

        jmlperang.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlperang.setText("0");
        getContentPane().add(jmlperang);
        jmlperang.setBounds(480, 230, 130, 20);

        jButton47.setText("Ubah");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton47);
        jButton47.setBounds(340, 260, 130, 20);

        jmlpangsi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlpangsi.setText("0");
        getContentPane().add(jmlpangsi);
        jmlpangsi.setBounds(340, 230, 130, 20);

        jButton48.setText("Ubah");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton48);
        jButton48.setBounds(200, 260, 120, 20);

        jmlpangrumat.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlpangrumat.setText("0");
        getContentPane().add(jmlpangrumat);
        jmlpangrumat.setBounds(200, 230, 120, 20);

        jButton49.setText("Ubah");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton49);
        jButton49.setBounds(60, 260, 130, 20);

        jmlmahkota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jmlmahkota.setText("0");
        getContentPane().add(jmlmahkota);
        jmlmahkota.setBounds(60, 230, 130, 20);

        lblhargaangklung17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung17.setText("Harga Lama");
        getContentPane().add(lblhargaangklung17);
        lblhargaangklung17.setBounds(200, 210, 60, 20);

        lblhargaangklung18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung18.setText("Harga Lama");
        getContentPane().add(lblhargaangklung18);
        lblhargaangklung18.setBounds(340, 210, 60, 20);

        lblhargaangklung19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung19.setText("Harga Lama");
        getContentPane().add(lblhargaangklung19);
        lblhargaangklung19.setBounds(480, 210, 60, 20);

        lblhargaangklung20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung20.setText("Harga Lama");
        getContentPane().add(lblhargaangklung20);
        lblhargaangklung20.setBounds(620, 210, 60, 20);

        lblhargaangklung21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung21.setText("Harga Lama");
        getContentPane().add(lblhargaangklung21);
        lblhargaangklung21.setBounds(760, 210, 60, 20);

        lblhargaangklung22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblhargaangklung22.setText("Harga Lama");
        getContentPane().add(lblhargaangklung22);
        lblhargaangklung22.setBounds(60, 210, 60, 20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuli/image/transbg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-170, -40, 1500, 860);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
       distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlrumah.getText())>0){
                obj.setDistRumah(Integer.parseInt(jmlrumah.getText()));
                lblhargarumah.setText("Rp. " + obj.getDistRumah());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
                                          
        distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlpisang.getText())>0){
                obj.setDistPustaka(Integer.parseInt(jmlpusaka.getText()));
                lblhargapusaka.setText("Rp. " + obj.getDistPustaka());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
                                           
        distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlpisang.getText())>0){
                obj.setDistPisang(Integer.parseInt(jmlpisang.getText()));
                lblhargapisang.setText("Rp. " + obj.getDistPisang());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
                                              
        distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlperang.getText())>0){
                obj.setDistPerang(Integer.parseInt(jmlperang.getText()));
                lblhargaperang.setText("Rp. " + obj.getDistPerang());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
                                            
        distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlpangsi.getText())>0){
                obj.setDistPangsi(Integer.parseInt(jmlpangsi.getText()));
                lblhargapangsi.setText("Rp. " + obj.getDistPangsi());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
                                           
        distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlpangrumat.getText())>0){
                obj.setDistPangrumat(Integer.parseInt(jmlpangrumat.getText()));
                lblhargapangrumat.setText("Rp. " + obj.getDistPangrumat());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
                                          
        distributorC obj = new distributorC();
        try{
            if(Integer.parseInt(jmlmahkota.getText())>0){
                obj.setDistMahkota(Integer.parseInt(jmlmahkota.getText()));
                lblhargamahkota.setText("Rp. " + obj.getDistMahkota());
                alert1.showMessageDialog(null, "Harga Berhasil diubah! ", "Berhasil!", alert1.INFORMATION_MESSAGE);
            }else{
                alert1.showMessageDialog(null, "Harga Tidak Valid!", "Perhatian!!", alert1.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            alert1.showMessageDialog(null, "Input Tidak Valid", "Perhatian!", alert1.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.setVisible(false);
        new hargadistributorframe().setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ubahHargaDistC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ubahHargaDistC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ubahHargaDistC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ubahHargaDistC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ubahHargaDistC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane alert1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JTextField jmlmahkota;
    private javax.swing.JTextField jmlpangrumat;
    private javax.swing.JTextField jmlpangsi;
    private javax.swing.JTextField jmlperang;
    private javax.swing.JTextField jmlpisang;
    private javax.swing.JTextField jmlpusaka;
    private javax.swing.JTextField jmlrumah;
    private javax.swing.JLabel lblhargaangklung17;
    private javax.swing.JLabel lblhargaangklung18;
    private javax.swing.JLabel lblhargaangklung19;
    private javax.swing.JLabel lblhargaangklung20;
    private javax.swing.JLabel lblhargaangklung21;
    private javax.swing.JLabel lblhargaangklung22;
    private javax.swing.JLabel lblhargaangklung9;
    private javax.swing.JLabel lblhargamahkota;
    private javax.swing.JLabel lblhargapangrumat;
    private javax.swing.JLabel lblhargapangsi;
    private javax.swing.JLabel lblhargaperang;
    private javax.swing.JLabel lblhargapisang;
    private javax.swing.JLabel lblhargapusaka;
    private javax.swing.JLabel lblhargarumah;
    // End of variables declaration//GEN-END:variables
}
