/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Pedido;

/**
 *
 * @author User
 */
public class Asados extends javax.swing.JDialog {

    /**
     * Creates new form Asados
     */
    public Asados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtCantidadUno.setVisible(false);
        jLabel9.setVisible(false);
        txtCantidadDos.setVisible(false);
        jLabel10.setVisible(false);
        txtCantidadTres.setVisible(false);
        jLabel11.setVisible(false);
        txtCantidadCuatro.setVisible(false);
        jLabel12.setVisible(false);
        txtCantidadCinco.setVisible(false);
        jLabel5.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadUno = new javax.swing.JTextField();
        txtCantidadDos = new javax.swing.JTextField();
        txtCantidadTres = new javax.swing.JTextField();
        txtCantidadCuatro = new javax.swing.JTextField();
        txtCantidadCinco = new javax.swing.JTextField();
        checkBox1 = new javax.swing.JCheckBox();
        checkBox2 = new javax.swing.JCheckBox();
        checkBox3 = new javax.swing.JCheckBox();
        checkBox4 = new javax.swing.JCheckBox();
        checkBox5 = new javax.swing.JCheckBox();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_menú2.png"))); // NOI18N
        jLabel8.setText("Cant.");

        jLabel6.setText("jLabel6");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_menú2.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Carne Asada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Pollo Asado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Chorizo Asado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Asado Trifasico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Cerdo Asado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txtCantidadUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadUnoActionPerformed(evt);
            }
        });
        txtCantidadUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadUnoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, -1));

        txtCantidadDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadDosActionPerformed(evt);
            }
        });
        txtCantidadDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadDosKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 40, -1));

        txtCantidadTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadTresActionPerformed(evt);
            }
        });
        txtCantidadTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadTresKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 40, -1));

        txtCantidadCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCuatroActionPerformed(evt);
            }
        });
        txtCantidadCuatro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadCuatroKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 40, -1));

        txtCantidadCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCincoActionPerformed(evt);
            }
        });
        txtCantidadCinco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadCincoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, -1));

        checkBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        checkBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        checkBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        checkBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        checkBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        cmdGuardar.setBackground(new java.awt.Color(0, 0, 0));
        cmdGuardar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 395, -1, 20));

        cmdCancelar.setBackground(new java.awt.Color(0, 0, 0));
        cmdCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 395, -1, 20));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Cant.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setText("Cant.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Cant.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Cant.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Cant.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("$ 9000");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("$ 7500");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("$ 4000");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("$ 12000");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("$ 8500");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_menú2.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 570));

        setSize(new java.awt.Dimension(496, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox1ActionPerformed
        if (checkBox1.isSelected()) {
            txtCantidadUno.setVisible(true);
            jLabel9.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadUno.requestFocusInWindow();
        } else {
            txtCantidadUno.setVisible(false);
            jLabel9.setVisible(false);
        }
    }//GEN-LAST:event_checkBox1ActionPerformed

    private void checkBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox2ActionPerformed
        if (checkBox2.isSelected()) {
            txtCantidadDos.setVisible(true);
            jLabel10.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadDos.requestFocusInWindow();
        } else {
            txtCantidadDos.setVisible(false);
            jLabel10.setVisible(false);
        }
    }//GEN-LAST:event_checkBox2ActionPerformed

    private void checkBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox3ActionPerformed
        if (checkBox3.isSelected()) {
            txtCantidadTres.setVisible(true);
            jLabel11.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadTres.requestFocusInWindow();
        } else {
            txtCantidadTres.setVisible(false);
            jLabel11.setVisible(false);
        }
    }//GEN-LAST:event_checkBox3ActionPerformed

    private void checkBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox4ActionPerformed
        if (checkBox4.isSelected()) {
            txtCantidadCuatro.setVisible(true);
            jLabel12.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadCuatro.requestFocusInWindow();
        } else {
            txtCantidadCuatro.setVisible(false);
            jLabel12.setVisible(false);
        }
    }//GEN-LAST:event_checkBox4ActionPerformed

    private void checkBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox5ActionPerformed
        if (checkBox5.isSelected()) {
            txtCantidadCinco.setVisible(true);
            jLabel5.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadCinco.requestFocusInWindow();
        } else {
            txtCantidadCinco.setVisible(false);
            jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_checkBox5ActionPerformed

    private void txtCantidadUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadUnoActionPerformed
        if (txtCantidadUno.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadUno.setVisible(false);
            jLabel9.setVisible(false);
        }
        if (txtCantidadUno.getText().equals("0")) {
            checkBox1.setSelected(false);
            txtCantidadUno.setText("");
        }
    }//GEN-LAST:event_txtCantidadUnoActionPerformed

    private void txtCantidadDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadDosActionPerformed
        if (txtCantidadDos.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadDos.setVisible(false);
            jLabel10.setVisible(false);
        }
        if (txtCantidadDos.getText().equals("0")) {
            checkBox2.setSelected(false);
            txtCantidadDos.setText("");
        }
    }//GEN-LAST:event_txtCantidadDosActionPerformed

    private void txtCantidadTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadTresActionPerformed
        if (txtCantidadTres.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadTres.setVisible(false);
            jLabel11.setVisible(false);
        }
        if (txtCantidadTres.getText().equals("0")) {
            checkBox3.setSelected(false);
            txtCantidadTres.setText("");
        }
    }//GEN-LAST:event_txtCantidadTresActionPerformed

    private void txtCantidadCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCuatroActionPerformed
        if (txtCantidadCuatro.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadCuatro.setVisible(false);
            jLabel12.setVisible(false);
        }
        if (txtCantidadCuatro.getText().equals("0")) {
            checkBox4.setSelected(false);
            txtCantidadCuatro.setText("");
        }
    }//GEN-LAST:event_txtCantidadCuatroActionPerformed

    private void txtCantidadCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCincoActionPerformed
        if (txtCantidadCinco.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadCinco.setVisible(false);
            jLabel5.setVisible(false);
        }
        if (txtCantidadCinco.getText().equals("0")) {
            checkBox5.setSelected(false);
            txtCantidadCinco.setText("");
        }
    }//GEN-LAST:event_txtCantidadCincoActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String producto;
        int precio, cantidad, total;
        if (checkBox1.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadUno.getText());
            producto = jLabel1.getText();
            precio = 9000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (checkBox2.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadDos.getText());
            producto = jLabel2.getText();
            precio = 7500;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (checkBox3.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadTres.getText());
            producto = jLabel3.getText();
            precio = 4000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (checkBox4.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadCuatro.getText());
            producto = jLabel4.getText();
            precio = 12000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (checkBox5.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadCinco.getText());
            producto = jLabel7.getText();
            precio = 8500;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        } else {
        }
        Asados.this.setVisible(false);
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        Asados.this.setVisible(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtCantidadUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadUnoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadUnoKeyTyped

    private void txtCantidadDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadDosKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadDosKeyTyped

    private void txtCantidadTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadTresKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadTresKeyTyped

    private void txtCantidadCuatroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCuatroKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadCuatroKeyTyped

    private void txtCantidadCincoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCincoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadCincoKeyTyped

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
            java.util.logging.Logger.getLogger(Asados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Asados dialog = new Asados(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JCheckBox checkBox2;
    private javax.swing.JCheckBox checkBox3;
    private javax.swing.JCheckBox checkBox4;
    private javax.swing.JCheckBox checkBox5;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantidadCinco;
    private javax.swing.JTextField txtCantidadCuatro;
    private javax.swing.JTextField txtCantidadDos;
    private javax.swing.JTextField txtCantidadTres;
    private javax.swing.JTextField txtCantidadUno;
    // End of variables declaration//GEN-END:variables
}
