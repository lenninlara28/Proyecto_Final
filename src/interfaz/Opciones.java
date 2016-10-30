/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author hp 14
 */
public class Opciones extends javax.swing.JDialog {

    /**
     * Creates new form Opciones
     */
    public Opciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cmdEliminar.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmdEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmdAbrirCarta = new javax.swing.JButton();
        cmdJuntar = new javax.swing.JButton();
        cmdCambiarMesa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmdCancelar = new javax.swing.JButton();
        cmdConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OPCIONES DE MESA");
        setIconImage(null);
        setResizable(false);

        jPanel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedido De Mesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant", "Producto", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, 280));

        cmdEliminar.setBackground(new java.awt.Color(0, 0, 0));
        cmdEliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdEliminar.setForeground(new java.awt.Color(255, 255, 255));
        cmdEliminar.setText("Eliminar");
        jPanel2.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 470, 370));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdAbrirCarta.setBackground(new java.awt.Color(0, 0, 0));
        cmdAbrirCarta.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdAbrirCarta.setForeground(new java.awt.Color(255, 255, 255));
        cmdAbrirCarta.setText("Abrir La Carta");
        cmdAbrirCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAbrirCartaActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAbrirCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmdJuntar.setBackground(new java.awt.Color(0, 0, 0));
        cmdJuntar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdJuntar.setForeground(new java.awt.Color(255, 255, 255));
        cmdJuntar.setText("Juntar Mesas");
        jPanel3.add(cmdJuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmdCambiarMesa.setBackground(new java.awt.Color(0, 0, 0));
        cmdCambiarMesa.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdCambiarMesa.setForeground(new java.awt.Color(255, 255, 255));
        cmdCambiarMesa.setText("Cambiar Mesa");
        jPanel3.add(cmdCambiarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 160));

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCancelar.setBackground(new java.awt.Color(0, 0, 0));
        cmdCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setText("Cancelar");
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        cmdConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        cmdConfirmar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        cmdConfirmar.setText("Confirmar Pedido");
        cmdConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfirmarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 200, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAbrirCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAbrirCartaActionPerformed
        Carta a = new Carta(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_cmdAbrirCartaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        cmdEliminar.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void cmdConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfirmarActionPerformed
        int estado = Integer.parseInt(Principal.txtEstado.getText());
        switch (estado) {
            case 0:
                System.out.println("prueba");
                break;
            case 1:
                Principal.cmdMesa1.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 2:
                Principal.cmdMesa2.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 3:
                Principal.cmdMesa3.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 4:
                Principal.cmdMesa4.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 5:
                Principal.cmdMesa5.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 6:
                Principal.cmdMesa6.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 7:
                Principal.cmdMesa7.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 8:
                Principal.cmdMesa8.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 9:
                Principal.cmdMesa9.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
            case 10:
                Principal.cmdMesa10.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                break;
        }
    }//GEN-LAST:event_cmdConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Opciones dialog = new Opciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdAbrirCarta;
    private javax.swing.JButton cmdCambiarMesa;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdConfirmar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdJuntar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
