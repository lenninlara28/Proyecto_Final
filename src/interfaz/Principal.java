/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Mesas;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<Mesas> mesa;
    public Principal() {
        initComponents();
        int estado = Integer.parseInt(jlbM_Ocupada1.getText());
        if (estado == 1) {
            cmdMesa1.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
            cmdMesa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
        } 


        /*int estado;
        
        switch (estado) {
            case 1:
                cmdMesa1.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 2:
                cmdMesa2.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 3:
                cmdMesa3.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 4:
                cmdMesa4.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 5:
                cmdMesa5.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 6:
                cmdMesa6.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 7:
                cmdMesa7.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 8:
                cmdMesa8.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 9:
                cmdMesa9.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
            case 10:
                cmdMesa10.setIcon(new ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas.png")));
                cmdMesa10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas_ocupadas_mouse.png")));
                break;
        }*/
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
        cmdMesa1 = new javax.swing.JButton();
        cmdMesa2 = new javax.swing.JButton();
        cmdMesa3 = new javax.swing.JButton();
        cmdMesa4 = new javax.swing.JButton();
        cmdMesa5 = new javax.swing.JButton();
        cmdMesa6 = new javax.swing.JButton();
        cmdMesa7 = new javax.swing.JButton();
        cmdMesa8 = new javax.swing.JButton();
        cmdMesa9 = new javax.swing.JButton();
        cmdMesa10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        jlbM_Ocupada1 = new javax.swing.JLabel();
        jlbM_Ocupada2 = new javax.swing.JLabel();
        jlbM_Ocupada3 = new javax.swing.JLabel();
        jlbM_Ocupada4 = new javax.swing.JLabel();
        jlbM_Ocupada5 = new javax.swing.JLabel();
        jlbM_Ocupada6 = new javax.swing.JLabel();
        jlbM_Ocupada7 = new javax.swing.JLabel();
        jlbM_Ocupada8 = new javax.swing.JLabel();
        jlbM_Ocupada9 = new javax.swing.JLabel();
        jlbM_Ocupada10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpciones = new javax.swing.JMenu();
        mnReportes = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU RESTAURANTE");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienvenida.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        cmdMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa1.setBorderPainted(false);
        cmdMesa1.setContentAreaFilled(false);
        cmdMesa1.setDisabledIcon(null);
        cmdMesa1.setFocusable(false);
        cmdMesa1.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 110));

        cmdMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa2.setBorderPainted(false);
        cmdMesa2.setContentAreaFilled(false);
        cmdMesa2.setDisabledIcon(null);
        cmdMesa2.setFocusable(false);
        cmdMesa2.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, 110));

        cmdMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa3.setBorderPainted(false);
        cmdMesa3.setContentAreaFilled(false);
        cmdMesa3.setDisabledIcon(null);
        cmdMesa3.setFocusable(false);
        cmdMesa3.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 140, 110));

        cmdMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa4.setBorderPainted(false);
        cmdMesa4.setContentAreaFilled(false);
        cmdMesa4.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa4ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 140, 110));

        cmdMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa5.setBorderPainted(false);
        cmdMesa5.setContentAreaFilled(false);
        cmdMesa5.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa5ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 110));

        cmdMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa6.setBorderPainted(false);
        cmdMesa6.setContentAreaFilled(false);
        cmdMesa6.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa6ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 140, 110));

        cmdMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa7.setBorderPainted(false);
        cmdMesa7.setContentAreaFilled(false);
        cmdMesa7.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa7ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 140, 110));

        cmdMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa8.setBorderPainted(false);
        cmdMesa8.setContentAreaFilled(false);
        cmdMesa8.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa8ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 140, 110));

        cmdMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa9.setBorderPainted(false);
        cmdMesa9.setContentAreaFilled(false);
        cmdMesa9.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa9ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 140, 110));

        cmdMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png"))); // NOI18N
        cmdMesa10.setBorderPainted(false);
        cmdMesa10.setContentAreaFilled(false);
        cmdMesa10.setPreferredSize(new java.awt.Dimension(147, 110));
        cmdMesa10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png"))); // NOI18N
        cmdMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMesa10ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 140, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mesa 1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Mesa 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mesa 3");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mesa 4");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mesa 5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Mesa 6");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Mesa 7");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Mesa 8");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Mesa 9");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Mesa 10");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Mesas Disponibles");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estados.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Mesas Ocupadas");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, -1, -1));

        txtEstado.setText("0");
        txtEstado.setEnabled(false);
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 20, 30));

        jlbM_Ocupada1.setText("0");
        jPanel1.add(jlbM_Ocupada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 20, -1));

        jlbM_Ocupada2.setText("0");
        jlbM_Ocupada2.setEnabled(false);
        jPanel1.add(jlbM_Ocupada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada3.setText("0");
        jlbM_Ocupada3.setEnabled(false);
        jPanel1.add(jlbM_Ocupada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada4.setText("0");
        jlbM_Ocupada4.setEnabled(false);
        jPanel1.add(jlbM_Ocupada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada5.setText("0");
        jlbM_Ocupada5.setEnabled(false);
        jPanel1.add(jlbM_Ocupada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada6.setText("0");
        jlbM_Ocupada6.setEnabled(false);
        jPanel1.add(jlbM_Ocupada6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada7.setText("0");
        jlbM_Ocupada7.setEnabled(false);
        jPanel1.add(jlbM_Ocupada7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada8.setText("0");
        jlbM_Ocupada8.setEnabled(false);
        jPanel1.add(jlbM_Ocupada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada9.setText("0");
        jlbM_Ocupada9.setEnabled(false);
        jPanel1.add(jlbM_Ocupada9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        jlbM_Ocupada10.setText("0");
        jlbM_Ocupada10.setEnabled(false);
        jPanel1.add(jlbM_Ocupada10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 20, -1));

        mnOpciones.setText("Opciones");
        mnOpciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnReportes.setText("Reportes");
        mnOpciones.add(mnReportes);

        jMenuBar1.add(mnOpciones);

        mnSalir.setText("Salir");
        mnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(671, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa1ActionPerformed
        txtEstado.setText("1");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        /*int mesas = 1;
        Mesas m = new Mesas(mesas);
        mesa.add(m);
        //System.out.println(""+m);
        //Helper.llenarTablaPrueba(Opciones.tblPedido,mesa);*/
    }//GEN-LAST:event_cmdMesa1ActionPerformed

    private void cmdMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa2ActionPerformed
        txtEstado.setText("2");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 2;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa2ActionPerformed

    private void cmdMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa3ActionPerformed
        txtEstado.setText("3");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 3;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa3ActionPerformed

    private void cmdMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa4ActionPerformed
        txtEstado.setText("4");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 4;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa4ActionPerformed

    private void cmdMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa5ActionPerformed
        txtEstado.setText("5");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 5;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa5ActionPerformed

    private void cmdMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa6ActionPerformed
        txtEstado.setText("6");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 6;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa6ActionPerformed

    private void cmdMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa7ActionPerformed
        txtEstado.setText("7");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 7;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa7ActionPerformed

    private void cmdMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa8ActionPerformed
        txtEstado.setText("8");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 8;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa8ActionPerformed

    private void cmdMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa9ActionPerformed
        txtEstado.setText("9");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 9;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa9ActionPerformed

    private void cmdMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMesa10ActionPerformed
        txtEstado.setText("10");
        Opciones a = new Opciones(this, true);
        a.setVisible(true);
        int mesas = 10;
        Mesas m = new Mesas(mesas);
    }//GEN-LAST:event_cmdMesa10ActionPerformed

    private void mnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton cmdMesa1;
    public static javax.swing.JButton cmdMesa10;
    public static javax.swing.JButton cmdMesa2;
    public static javax.swing.JButton cmdMesa3;
    public static javax.swing.JButton cmdMesa4;
    public static javax.swing.JButton cmdMesa5;
    public static javax.swing.JButton cmdMesa6;
    public static javax.swing.JButton cmdMesa7;
    public static javax.swing.JButton cmdMesa8;
    public static javax.swing.JButton cmdMesa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jlbM_Ocupada1;
    public static javax.swing.JLabel jlbM_Ocupada10;
    public static javax.swing.JLabel jlbM_Ocupada2;
    public static javax.swing.JLabel jlbM_Ocupada3;
    public static javax.swing.JLabel jlbM_Ocupada4;
    public static javax.swing.JLabel jlbM_Ocupada5;
    public static javax.swing.JLabel jlbM_Ocupada6;
    public static javax.swing.JLabel jlbM_Ocupada7;
    public static javax.swing.JLabel jlbM_Ocupada8;
    public static javax.swing.JLabel jlbM_Ocupada9;
    private javax.swing.JMenu mnOpciones;
    private javax.swing.JMenuItem mnReportes;
    private javax.swing.JMenu mnSalir;
    public static javax.swing.JLabel txtEstado;
    // End of variables declaration//GEN-END:variables
}
