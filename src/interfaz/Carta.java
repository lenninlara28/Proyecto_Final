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
public class Carta extends javax.swing.JDialog {

    /**
     * Creates new form Carta
     */
    public Carta(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        cmdDesayunos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmdAsados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmdAlmuerzos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmdHelados = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmdComidadRapidas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmdBebidad = new javax.swing.JButton();
        cmdOK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CARTA");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Desayunos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        cmdDesayunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desayunos.png"))); // NOI18N
        cmdDesayunos.setBorderPainted(false);
        cmdDesayunos.setContentAreaFilled(false);
        cmdDesayunos.setPreferredSize(new java.awt.Dimension(136, 88));
        cmdDesayunos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desayunos_click.png"))); // NOI18N
        cmdDesayunos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desayunos_mouse.png"))); // NOI18N
        cmdDesayunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDesayunosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdDesayunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Asados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        cmdAsados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Asados.png"))); // NOI18N
        cmdAsados.setBorderPainted(false);
        cmdAsados.setContentAreaFilled(false);
        cmdAsados.setPreferredSize(new java.awt.Dimension(136, 88));
        cmdAsados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Asados_click.png"))); // NOI18N
        cmdAsados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Asados_mouse.png"))); // NOI18N
        cmdAsados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAsadosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAsados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Almuerzos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 120, 20));

        cmdAlmuerzos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Corrientes.png"))); // NOI18N
        cmdAlmuerzos.setBorderPainted(false);
        cmdAlmuerzos.setContentAreaFilled(false);
        cmdAlmuerzos.setPreferredSize(new java.awt.Dimension(132, 135));
        cmdAlmuerzos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Corrientes_click.png"))); // NOI18N
        cmdAlmuerzos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Corrientes_mouse.png"))); // NOI18N
        cmdAlmuerzos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAlmuerzosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAlmuerzos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Helados y Postres");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cmdHelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Helados.png"))); // NOI18N
        cmdHelados.setBorderPainted(false);
        cmdHelados.setContentAreaFilled(false);
        cmdHelados.setPreferredSize(new java.awt.Dimension(183, 114));
        cmdHelados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Helados_click.png"))); // NOI18N
        cmdHelados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Helados_mouse.png"))); // NOI18N
        cmdHelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHeladosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdHelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Comidas Rapidas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        cmdComidadRapidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comidas_Rapidas.png"))); // NOI18N
        cmdComidadRapidas.setPreferredSize(new java.awt.Dimension(180, 124));
        cmdComidadRapidas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comidas_Rapidas_Click.png"))); // NOI18N
        cmdComidadRapidas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comidas_Rapidas_mouse.png"))); // NOI18N
        cmdComidadRapidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdComidadRapidasActionPerformed(evt);
            }
        });
        jPanel1.add(cmdComidadRapidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Bebidas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        cmdBebidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bebidas.png"))); // NOI18N
        cmdBebidad.setBorderPainted(false);
        cmdBebidad.setContentAreaFilled(false);
        cmdBebidad.setPreferredSize(new java.awt.Dimension(151, 111));
        cmdBebidad.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bebidas_click.png"))); // NOI18N
        cmdBebidad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bebidas_mouse.png"))); // NOI18N
        cmdBebidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBebidadActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBebidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        cmdOK.setBackground(new java.awt.Color(0, 0, 0));
        cmdOK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdOK.setForeground(new java.awt.Color(255, 255, 255));
        cmdOK.setText("OK");
        cmdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOKActionPerformed(evt);
            }
        });
        jPanel1.add(cmdOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo menú.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDesayunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDesayunosActionPerformed
        Desayunos a = new Desayunos(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_cmdDesayunosActionPerformed

    private void cmdAsadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAsadosActionPerformed
        Asados a = new Asados(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_cmdAsadosActionPerformed

    private void cmdAlmuerzosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAlmuerzosActionPerformed
        Almuerzos a = new Almuerzos(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_cmdAlmuerzosActionPerformed

    private void cmdHeladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHeladosActionPerformed
        HeladosYPostres hp = new HeladosYPostres(null, true);
        hp.setVisible(true);
    }//GEN-LAST:event_cmdHeladosActionPerformed

    private void cmdBebidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBebidadActionPerformed
        Bebidas b = new Bebidas(null, true);
        b.setVisible(true);
    }//GEN-LAST:event_cmdBebidadActionPerformed

    private void cmdComidadRapidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdComidadRapidasActionPerformed
        ComidasRapidas cr = new ComidasRapidas(null, true);
        cr.setVisible(true);
    }//GEN-LAST:event_cmdComidadRapidasActionPerformed

    private void cmdOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOKActionPerformed
        Carta.this.setVisible(false);
    }//GEN-LAST:event_cmdOKActionPerformed

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
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Carta dialog = new Carta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdAlmuerzos;
    private javax.swing.JButton cmdAsados;
    private javax.swing.JButton cmdBebidad;
    private javax.swing.JButton cmdComidadRapidas;
    private javax.swing.JButton cmdDesayunos;
    private javax.swing.JButton cmdHelados;
    private javax.swing.JButton cmdOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
