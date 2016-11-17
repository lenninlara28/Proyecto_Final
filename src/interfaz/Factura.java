/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Pedido;
import static interfaz.Opciones.*;
import static interfaz.Principal.*;
import static interfaz.TiqueteVenta.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author hp 14
 */
public class Factura extends javax.swing.JDialog {

    /**
     * Creates new form Factura
     */
    DefaultListModel dlm = new DefaultListModel();

    public Factura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtAdmin.setText(cmbAdministrador.getSelectedItem().toString());
        txtMesero.setText(cmbMesero.getSelectedItem().toString());
        txtMesa.setText(cmbMesas.getSelectedItem().toString());
        txtCliente.setText(txtNombre_Cliente.getText());
        txtCedula.setText(txtCedula_Cliente.getText());
        txtFormaDePago.setText(FormaPago);
        ArrayList<Pedido> pedido = Helper.traerTabla(tblPedido);
        Pedido p;
        int total = 0;
        for (int i = 0; i < pedido.size(); i++) {
            p = pedido.get(i);
            dlm.addElement(p.getCantidad() + "  " + p.getProducto() + "  " + p.getTotal());
            total = total + p.getTotal();
        }
        txtTotal.setText("" + total);
        jListPedido.setModel(dlm);
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Agregar_Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Agregar_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        pedido.clear();
        Helper.volcado(salida, pedido);
        Helper.limpiadoTabla(tblPedido);
        this.setVisible(false);
        ArrayList<String> p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        p1 = Helper.traerDatos("src/datos/Pedido_Mesa1.txt");
        p2 = Helper.traerDatos("src/datos/Pedido_mesa2.txt");
        p3 = Helper.traerDatos("src/datos/Pedido_mesa3.txt");
        p4 = Helper.traerDatos("src/datos/Pedido_mesa4.txt");
        p5 = Helper.traerDatos("src/datos/Pedido_mesa5.txt");
        p6 = Helper.traerDatos("src/datos/Pedido_mesa6.txt");
        p7 = Helper.traerDatos("src/datos/Pedido_mesa7.txt");
        p8 = Helper.traerDatos("src/datos/Pedido_mesa8.txt");
        p9 = Helper.traerDatos("src/datos/Pedido_mesa9.txt");
        p10 = Helper.traerDatos("src/datos/Pedido_mesa10.txt");
        if (p1.isEmpty()) {
            cmdMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p2.isEmpty()) {
            cmdMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p3.isEmpty()) {
            cmdMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p4.isEmpty()) {
            cmdMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p5.isEmpty()) {
            cmdMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p6.isEmpty()) {
            cmdMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p7.isEmpty()) {
            cmdMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p8.isEmpty()) {
            cmdMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p9.isEmpty()) {
            cmdMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
        if (p10.isEmpty()) {
            cmdMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles.png")));
            cmdMesa10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesas disponibles mouse.png")));
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMesero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMesa = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFormaDePago = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPedido = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FACTURA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 260, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel1.setText("Menú Restaurante ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Proyecto Final ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setText("Algoritmos I");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel4.setText("Administrador : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtAdmin.setEditable(false);
        txtAdmin.setBackground(new java.awt.Color(255, 255, 255));
        txtAdmin.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtAdmin.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtAdmin.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, 20));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel5.setText("Mesero : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtMesero.setEditable(false);
        txtMesero.setBackground(new java.awt.Color(255, 255, 255));
        txtMesero.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtMesero.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtMesero.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtMesero.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, 20));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel6.setText("Mesa :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtMesa.setEditable(false);
        txtMesa.setBackground(new java.awt.Color(255, 255, 255));
        txtMesa.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtMesa.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtMesa.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtMesa.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel7.setText("Cliente : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtCliente.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtCliente.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, 20));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel8.setText("Cedula : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtCedula.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtCedula.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtCedula.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 260, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel9.setText("Total A Pagar :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtTotal.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtTotal.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 70, 20));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel10.setText("Forma De Pago : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        txtFormaDePago.setEditable(false);
        txtFormaDePago.setBackground(new java.awt.Color(255, 255, 255));
        txtFormaDePago.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtFormaDePago.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtFormaDePago.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        txtFormaDePago.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 130, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 260, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel11.setText("¡¡GRACIAS POR SU COMPRA!!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel12.setText("¡¡VUELVA PRONTO!!");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        jListPedido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jListPedido);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        setSize(new java.awt.Dimension(298, 701));
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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Factura dialog = new Factura(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JTextField txtAdmin;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtFormaDePago;
    public static javax.swing.JTextField txtMesa;
    public static javax.swing.JTextField txtMesero;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
