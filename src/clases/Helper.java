/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp 14
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);

            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void habilitarBotones(JButton[] botonesH) {
        for (int i = 0; i < botonesH.length; i++) {
            botonesH[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botonesD) {
        for (int i = 0; i < botonesD.length; i++) {
            botonesD[i].setEnabled(false);

        }
    }

    public static void llenarTabla(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Pedido> pedido = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = pedido.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(pedido.get(i).getCantidad(), i, 1);
            tabla.setValueAt(pedido.get(i).getProducto(), i, 2);
            tabla.setValueAt(pedido.get(i).getPrecio(), i, 3);
            tabla.setValueAt(pedido.get(i).getTotal(), i, 4);
        }

    }
    
    public static void llenarTabla(JTable tabla, ArrayList<Pedido> pedido) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        nf = pedido.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(pedido.get(i).getCantidad(), i, 1);
            tabla.setValueAt(pedido.get(i).getProducto(), i, 2);
            tabla.setValueAt(pedido.get(i).getPrecio(), i, 3);
            tabla.setValueAt(pedido.get(i).getTotal(), i, 4);
        }
    }

    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList pedido = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                pedido.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return pedido;
    }

    public static void volcado(ObjectOutputStream salida, ArrayList pedido) {
        for (int i = 0; i < pedido.size(); i++) {
            try {
                salida.writeObject(pedido.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
