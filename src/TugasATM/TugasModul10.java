package TugasATM;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riskiawp
 */
public class TugasModul10 extends javax.swing.JFrame {
int t,s,tab=50000;
    /**
     * Creates new form TugasModul10
     */
    public TugasModul10() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbEnter = new javax.swing.JButton();
        tfPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("BNI SYARIAH - BOJONEGORO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 40, 260, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("PIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 100, 40, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ATM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 10, 50, 40);

        jbEnter.setText("Confirm");
        jbEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnterActionPerformed(evt);
            }
        });
        jPanel1.add(jbEnter);
        jbEnter.setBounds(140, 190, 90, 30);
        jPanel1.add(tfPin);
        tfPin.setBounds(130, 140, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 300);

        setBounds(0, 0, 396, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnterActionPerformed
       int Pin;
       int pin=1234;
       
       Pin = Integer.parseInt(tfPin.getText().toString());
       if (Pin == pin)
       {
           this.setVisible(false);
           new Frame2().setVisible(true);
       }
       else if ( Pin != pin)
       {
           JOptionPane.showMessageDialog(null, "Masukkan PIN dengan benar!");
       }
    }//GEN-LAST:event_jbEnterActionPerformed

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
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasModul10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEnter;
    private javax.swing.JPasswordField tfPin;
    // End of variables declaration//GEN-END:variables
}
