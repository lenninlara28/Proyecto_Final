/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author hp 14
 */
public class Mesas_Cuenta extends javax.swing.JDialog {

    /**
     * Creates new form Mesas_Cuenta
     */
    public Mesas_Cuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        cmdCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RETIRAR CUENTA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Mesa 1");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Mesa 2");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setText("Mesa 3 ");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton4.setText("Mesa 4");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton5.setText("Mesa 5 ");
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton6.setText("Mesa 6");
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton7.setText("Mesa 7");
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton8.setText("Mesa 8");
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton9.setText("Mesa 9 ");
        jPanel1.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jRadioButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton10.setText("Mesa 10");
        jPanel1.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        cmdCuenta.setBackground(new java.awt.Color(0, 0, 0));
        cmdCuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCuenta.setForeground(new java.awt.Color(255, 255, 255));
        cmdCuenta.setText("Retirar Cuenta");
        jPanel1.add(cmdCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Mesas_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mesas_Cuenta dialog = new Mesas_Cuenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
