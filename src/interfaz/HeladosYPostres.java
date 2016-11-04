/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Pedido;
import static interfaz.Carta.pedido;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class HeladosYPostres extends javax.swing.JDialog {

    /**
     * Creates new form HeladosYPostres
     */
    String ruta;
    ObjectOutputStream salida;

    public HeladosYPostres(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        /*int mesas = Integer.parseInt(Principal.txtEstado.getText());
        switch (mesas) {
            case 1:
                ruta = "src/datos/pedido_Mesa1.txt";
                try {
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 2:
                ruta = "src/datos/pedido_Mesa2.txt";
                try {
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
        }*/
        txtCantidadUno.setVisible(false);
        jLabel10.setVisible(false);
        txtCantidadDos.setVisible(false);
        jLabel11.setVisible(false);
        txtCantidadTres.setVisible(false);
        jLabel12.setVisible(false);
        txtCantidadCuatro.setVisible(false);
        jLabel13.setVisible(false);
        txtCantidad5.setVisible(false);
        jLabel14.setVisible(false);
        txtCantidad6.setVisible(false);
        jLabel15.setVisible(false);
        txtCantidad7.setVisible(false);
        jLabel16.setVisible(false);
        txtCantidad8.setVisible(false);
        jLabel9.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelSiete = new javax.swing.JLabel();
        jLabelOcho = new javax.swing.JLabel();
        txtCantidadUno = new javax.swing.JTextField();
        txtCantidadDos = new javax.swing.JTextField();
        txtCantidadTres = new javax.swing.JTextField();
        txtCantidadCuatro = new javax.swing.JTextField();
        txtCantidad5 = new javax.swing.JTextField();
        txtCantidad6 = new javax.swing.JTextField();
        txtCantidad7 = new javax.swing.JTextField();
        txtCantidad8 = new javax.swing.JTextField();
        CheckBox1 = new javax.swing.JCheckBox();
        CheckBox2 = new javax.swing.JCheckBox();
        CheckBox3 = new javax.swing.JCheckBox();
        CheckBox4 = new javax.swing.JCheckBox();
        CheckBox5 = new javax.swing.JCheckBox();
        CheckBox6 = new javax.swing.JCheckBox();
        CheckBox7 = new javax.swing.JCheckBox();
        CheckBox8 = new javax.swing.JCheckBox();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helados Y Postres");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Copa Ternura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Copa Encanto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Brownie Flow");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Copa Corazón");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Chocolate con crema de mora");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 20));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Tres leches relleno de frutas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabelSiete.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelSiete.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSiete.setText("Rollitos de chocolates MontBlanco");
        getContentPane().add(jLabelSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 20));

        jLabelOcho.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelOcho.setForeground(new java.awt.Color(0, 0, 255));
        jLabelOcho.setText("Zumo naranja natural");
        getContentPane().add(jLabelOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 471, -1, 20));

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
        getContentPane().add(txtCantidadUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 30, -1));

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
        getContentPane().add(txtCantidadDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 30, -1));

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
        getContentPane().add(txtCantidadTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 30, 30));

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
        getContentPane().add(txtCantidadCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 30, -1));

        txtCantidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad5ActionPerformed(evt);
            }
        });
        txtCantidad5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidad5KeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 30, -1));

        txtCantidad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad6ActionPerformed(evt);
            }
        });
        txtCantidad6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidad6KeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 30, -1));

        txtCantidad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad7ActionPerformed(evt);
            }
        });
        txtCantidad7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidad7KeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 30, -1));

        txtCantidad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad8ActionPerformed(evt);
            }
        });
        txtCantidad8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidad8KeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 30, -1));

        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        CheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        CheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        CheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        CheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        CheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        cmdGuardar.setBackground(new java.awt.Color(0, 0, 0));
        cmdGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, 20));

        cmdCancelar.setBackground(new java.awt.Color(0, 0, 0));
        cmdCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, 20));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setText("Cant.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 40, 20));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Cant.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 20));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Cant.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Cant.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Cant.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 20));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setText("Cant.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Cant.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 40, 20));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setText("Cant.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 40, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("Precio");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("$ 6000");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("$ 7000");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("$ 9000");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("$ 6500");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("$ 5000");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("$ 6000");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("$ 7500");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("$ 4500");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_menú2.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 480, 640));

        setSize(new java.awt.Dimension(492, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        if (CheckBox1.isSelected()) {
            txtCantidadUno.setVisible(true);
            jLabel10.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadUno.requestFocusInWindow();
        } else {
            txtCantidadUno.setVisible(false);
            jLabel10.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox2ActionPerformed
        if (CheckBox2.isSelected()) {
            txtCantidadDos.setVisible(true);
            jLabel11.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadDos.requestFocusInWindow();
        } else {
            txtCantidadDos.setVisible(false);
            jLabel11.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox2ActionPerformed

    private void CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox3ActionPerformed
        if (CheckBox3.isSelected()) {
            txtCantidadTres.setVisible(true);
            jLabel12.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadTres.requestFocusInWindow();
        } else {
            txtCantidadTres.setVisible(false);
            jLabel12.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox3ActionPerformed

    private void CheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox4ActionPerformed
        if (CheckBox4.isSelected()) {
            txtCantidadCuatro.setVisible(true);
            jLabel13.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidadCuatro.requestFocusInWindow();
        } else {
            txtCantidadCuatro.setVisible(false);
            jLabel13.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox4ActionPerformed

    private void CheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox5ActionPerformed
        if (CheckBox5.isSelected()) {
            txtCantidad5.setVisible(true);
            jLabel14.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidad5.requestFocusInWindow();
        } else {
            txtCantidad5.setVisible(false);
            jLabel14.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox5ActionPerformed

    private void CheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox6ActionPerformed
        if (CheckBox6.isSelected()) {
            txtCantidad6.setVisible(true);
            jLabel15.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidad6.requestFocusInWindow();
        } else {
            txtCantidad6.setVisible(false);
            jLabel15.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox6ActionPerformed

    private void CheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox7ActionPerformed
        if (CheckBox7.isSelected()) {
            txtCantidad7.setVisible(true);
            jLabel16.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidad7.requestFocusInWindow();
        } else {
            txtCantidad7.setVisible(false);
            jLabel16.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox7ActionPerformed

    private void CheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox8ActionPerformed
        if (CheckBox8.isSelected()) {
            txtCantidad8.setVisible(true);
            jLabel9.setVisible(true);
            Helper.mensaje(this, "¡Por Favor! Digite La Cantidad y Precione ENTER ", 1);
            txtCantidad8.requestFocusInWindow();
        } else {
            txtCantidad8.setVisible(false);
            jLabel9.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox8ActionPerformed

    private void txtCantidadUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadUnoActionPerformed
        if (txtCantidadUno.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadUno.setVisible(false);
            jLabel10.setVisible(false);
        }
        if (txtCantidadUno.getText().equals("0")) {
            CheckBox1.setSelected(false);
            txtCantidadUno.setText("");
        }
    }//GEN-LAST:event_txtCantidadUnoActionPerformed

    private void txtCantidadDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadDosActionPerformed
        if (txtCantidadDos.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadDos.setVisible(false);
            jLabel11.setVisible(false);
        }
        if (txtCantidadDos.getText().equals("0")) {
            CheckBox2.setSelected(false);
            txtCantidadDos.setText("");
        }
    }//GEN-LAST:event_txtCantidadDosActionPerformed

    private void txtCantidadTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadTresActionPerformed
        if (txtCantidadTres.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadTres.setVisible(false);
            jLabel12.setVisible(false);
        }
        if (txtCantidadTres.getText().equals("0")) {
            CheckBox3.setSelected(false);
            txtCantidadTres.setText("");
        }
    }//GEN-LAST:event_txtCantidadTresActionPerformed

    private void txtCantidadCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCuatroActionPerformed
        if (txtCantidadCuatro.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidadCuatro.setVisible(false);
            jLabel13.setVisible(false);
        }
        if (txtCantidadCuatro.getText().equals("0")) {
            CheckBox4.setSelected(false);
            txtCantidadCuatro.setText("");
        }
    }//GEN-LAST:event_txtCantidadCuatroActionPerformed

    private void txtCantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad5ActionPerformed
        if (txtCantidad5.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidad5.setVisible(false);
            jLabel14.setVisible(false);
        }
        if (txtCantidad5.getText().equals("0")) {
            CheckBox5.setSelected(false);
            txtCantidad5.setText("");
        }
    }//GEN-LAST:event_txtCantidad5ActionPerformed

    private void txtCantidad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad6ActionPerformed
        if (txtCantidad6.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidad6.setVisible(false);
            jLabel15.setVisible(false);
        }
        if (txtCantidad6.getText().equals("0")) {
            CheckBox6.setSelected(false);
            txtCantidad6.setText("");
        }
    }//GEN-LAST:event_txtCantidad6ActionPerformed

    private void txtCantidad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad7ActionPerformed
        if (txtCantidad7.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidad7.setVisible(false);
            jLabel16.setVisible(false);
        }
        if (txtCantidad7.getText().equals("0")) {
            CheckBox7.setSelected(false);
            txtCantidad7.setText("");
        }
    }//GEN-LAST:event_txtCantidad7ActionPerformed

    private void txtCantidad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad8ActionPerformed
        if (txtCantidad8.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite La Cantidad y Precione ENTER ", 2);
        } else {
            txtCantidad8.setVisible(false);
            jLabel9.setVisible(false);
        }
        if (txtCantidad8.getText().equals("0")) {
            CheckBox8.setSelected(false);
            txtCantidad8.setText("");
        }
    }//GEN-LAST:event_txtCantidad8ActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String producto;
        int precio, cantidad, total;
        if (CheckBox1.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadUno.getText());
            producto = jLabel1.getText();
            precio = 6000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox2.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadDos.getText());
            producto = jLabel2.getText();
            precio = 7000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox3.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadTres.getText());
            producto = jLabel3.getText();
            precio = 9000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox4.isSelected()) {
            cantidad = Integer.parseInt(txtCantidadCuatro.getText());
            producto = jLabel4.getText();
            precio = 6500;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox5.isSelected()) {
            cantidad = Integer.parseInt(txtCantidad5.getText());
            producto = jLabel5.getText();
            precio = 5000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox6.isSelected()) {
            cantidad = Integer.parseInt(txtCantidad6.getText());
            producto = jLabel6.getText();
            precio = 6000;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox7.isSelected()) {
            cantidad = Integer.parseInt(txtCantidad7.getText());
            producto = jLabelSiete.getText();
            precio = 7500;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        }
        if (CheckBox8.isSelected()) {
            cantidad = Integer.parseInt(txtCantidad8.getText());
            producto = jLabelOcho.getText();
            precio = 4500;
            total = precio * cantidad;
            Carta.pedido = new Pedido(cantidad, producto, precio, total);
            Carta.p.add(Carta.pedido);
        } else {

        }
        HeladosYPostres.this.setVisible(false);

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        HeladosYPostres.this.setVisible(false);
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

    private void txtCantidad5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad5KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidad5KeyTyped

    private void txtCantidad6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad6KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidad6KeyTyped

    private void txtCantidad7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad7KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidad7KeyTyped

    private void txtCantidad8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad8KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidad8KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://downloatxtCantidad12vase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HeladosYPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeladosYPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeladosYPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeladosYPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HeladosYPostres dialog = new HeladosYPostres(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBox4;
    private javax.swing.JCheckBox CheckBox5;
    private javax.swing.JCheckBox CheckBox6;
    private javax.swing.JCheckBox CheckBox7;
    private javax.swing.JCheckBox CheckBox8;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelOcho;
    private javax.swing.JLabel jLabelSiete;
    private javax.swing.JTextField txtCantidad5;
    private javax.swing.JTextField txtCantidad6;
    private javax.swing.JTextField txtCantidad7;
    private javax.swing.JTextField txtCantidad8;
    private javax.swing.JTextField txtCantidadCuatro;
    private javax.swing.JTextField txtCantidadDos;
    private javax.swing.JTextField txtCantidadTres;
    private javax.swing.JTextField txtCantidadUno;
    // End of variables declaration//GEN-END:variables
}
