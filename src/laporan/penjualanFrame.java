/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

import laporan.semualaporanFame;

/**
 *
 * @author thero
 */
public class penjualanFrame extends javax.swing.JFrame {

    /**
     * Creates new form penjualanFrame
     */
    public penjualanFrame() {
        initComponents();
        dashboard yuda = new dashboard();
        txtnormal.setText(Integer.toString(yuda.jmltransaksinormal));
        txtpromo1.setText(Integer.toString(yuda.jmltransaksidiskon));
        txtpromo.setText(Integer.toString(yuda.jmldiskon));
        ttldiskon.setText(Integer.toString(yuda.jmldiskon));
        
        String show = String.join("\n", yuda.listDiskon);
        txtPenjualan.setText(Integer.toString(yuda.totaltransaksi));
        txtPengeluaran.setText(Integer.toString(yuda.totalbeli));
        txtDetailDiskon.append(" \t\t Meuli Point of Sale"
            + "\n\t\t Diskon Summary"
            + "\n====================================================="
            + "\nDeskripsi\t\t Jumlah Diskon\n"+show);
        
        txtKeuntungan.setText(Integer.toString(yuda.totaltransaksi-yuda.totalbeli-yuda.jmldiskon));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKeuntungan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpromo = new javax.swing.JTextField();
        txtnormal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpromo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPenjualan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPengeluaran = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetailDiskon = new javax.swing.JTextArea();
        ttldiskon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        txtKeuntungan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txtKeuntungan);
        txtKeuntungan.setBounds(470, 640, 450, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Total Diskon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 150, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("TOTAL KEUNTUNGAN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 640, 420, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Jumlah Transaksi Normal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 100, 280, 60);
        getContentPane().add(txtpromo);
        txtpromo.setBounds(680, 150, 240, 30);
        getContentPane().add(txtnormal);
        txtnormal.setBounds(470, 110, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Jumlah Transaksi Diskon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 110, 230, 30);
        getContentPane().add(txtpromo1);
        txtpromo1.setBounds(790, 110, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("DETAIL DISKON");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 200, 320, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("TOTAL DISKON");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 570, 420, 60);

        txtPenjualan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txtPenjualan);
        txtPenjualan.setBounds(470, 430, 450, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("TOTAL PENJUALAN");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 440, 350, 60);

        txtPengeluaran.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txtPengeluaran);
        txtPengeluaran.setBounds(470, 500, 450, 60);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 120, 40);

        txtDetailDiskon.setColumns(20);
        txtDetailDiskon.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtDetailDiskon.setRows(5);
        jScrollPane1.setViewportView(txtDetailDiskon);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 200, 450, 200);

        ttldiskon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(ttldiskon);
        ttldiskon.setBounds(470, 570, 450, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("TOTAL PENGELUARAN");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 510, 420, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
        new semualaporanFame().setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args){
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
            java.util.logging.Logger.getLogger(penjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualanFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ttldiskon;
    private javax.swing.JTextArea txtDetailDiskon;
    private javax.swing.JTextField txtKeuntungan;
    private javax.swing.JTextField txtPengeluaran;
    private javax.swing.JTextField txtPenjualan;
    private javax.swing.JTextField txtnormal;
    private javax.swing.JTextField txtpromo;
    private javax.swing.JTextField txtpromo1;
    // End of variables declaration//GEN-END:variables
}
