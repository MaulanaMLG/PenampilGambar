/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4_maulana_5e;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author user
 */
public class PenampilGambarFulscreen extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarFulscreen
     */
    public PenampilGambarFulscreen() {
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

        ButtonPanel = new javax.swing.JPanel();
        Gbr1Btn = new javax.swing.JButton();
        Gbr2Btn = new javax.swing.JButton();
        Gbr3Btn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Gbr1Btn.setText("Gambar 1");
        Gbr1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gbr1BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(Gbr1Btn);

        Gbr2Btn.setText("Gambar 2");
        Gbr2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gbr2BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(Gbr2Btn);

        Gbr3Btn.setText("Gambar 3");
        Gbr3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gbr3BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(Gbr3Btn);

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(ExitBtn);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.PAGE_START);

        ImagePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihan4_maulana_5e/Gambar4.png"))); // NOI18N
        ImagePanel.add(jLabel1, "1");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihan4_maulana_5e/Gambar5.png"))); // NOI18N
        ImagePanel.add(jLabel2, "2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihan4_maulana_5e/Gambar6.png"))); // NOI18N
        ImagePanel.add(jLabel3, "3");

        getContentPane().add(ImagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Gbr1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gbr1BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) (ImagePanel.getLayout());
        c1.show(ImagePanel, "1");
    }//GEN-LAST:event_Gbr1BtnActionPerformed

    private void Gbr2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gbr2BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) (ImagePanel.getLayout());
        c1.show(ImagePanel, "2");
    }//GEN-LAST:event_Gbr2BtnActionPerformed

    private void Gbr3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gbr3BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) (ImagePanel.getLayout());
        c1.show(ImagePanel, "3");
    }//GEN-LAST:event_Gbr3BtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                PenampilGambarButton fullFrame = new PenampilGambarButton();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
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
            java.util.logging.Logger.getLogger(PenampilGambarFulscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarFulscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarFulscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarFulscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                PenampilGambarButton fullFrame = new PenampilGambarButton();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                new PenampilGambarFulscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton Gbr1Btn;
    private javax.swing.JButton Gbr2Btn;
    private javax.swing.JButton Gbr3Btn;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
