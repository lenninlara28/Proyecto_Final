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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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

    public static void habilitarJTextField(JTextField[] txtA) {
        for (int i = 0; i < txtA.length; i++) {
            txtA[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botonesD) {
        for (int i = 0; i < botonesD.length; i++) {
            botonesD[i].setEnabled(false);
        }
    }

    public static void deshabilitarJTextField(JTextField[] txtD) {
        for (int i = 0; i < txtD.length; i++) {
            txtD[i].setEnabled(false);
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

    public static void llenarTablaAdmin(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Administrador> administrador = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = administrador.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(administrador.get(i).getCedula(), i, 1);
            tabla.setValueAt(administrador.get(i).getNombre(), i, 2);
            tabla.setValueAt(administrador.get(i).getApellido(), i, 3);
            tabla.setValueAt(administrador.get(i).getCodigo(), i, 4);
            tabla.setValueAt(administrador.get(i).getContraseña(), i, 5);
        }
    }

    public static void llenarTablaMesero(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Mesero> meseros = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = meseros.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(meseros.get(i).getCedula(), i, 1);
            tabla.setValueAt(meseros.get(i).getNombre(), i, 2);
            tabla.setValueAt(meseros.get(i).getApellido(), i, 3);
            tabla.setValueAt(meseros.get(i).getCodigo(), i, 4);
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

    public static ArrayList traerTabla(JTable tabla) {
        String producto;
        int cantidad, precio, total;
        int nf = tabla.getRowCount();
        int nc = tabla.getColumnCount();
        Pedido pedido = null;
        ArrayList<Pedido> p = new ArrayList();
        for (int i = 0; i < nf; i++) {
            cantidad = (int) tabla.getValueAt(i, 1);
            producto = "" + tabla.getValueAt(i, 2);
            precio = (int) tabla.getValueAt(i, 3);
            total = (int) tabla.getValueAt(i, 4);
            pedido = new Pedido(cantidad, producto, precio, total);
            p.add(pedido);
        }
        return p;
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

    public static void volcado(ObjectOutputStream salida, String ruta) {
        ArrayList<Pedido> pedido = new ArrayList();
        pedido = Helper.traerDatos(ruta);
        for (int i = 0; i < pedido.size(); i++) {
            try {
                salida.writeObject(pedido.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void guardarArraysList(ObjectOutputStream salida, ArrayList<Pedido> pedido) throws IOException {
        for (int i = 0; i < pedido.size(); i++) {
            pedido.get(i).guardar(salida);
        }
    }

    public static ArrayList<Administrador> modificarAdmin(String ruta, String cedula, String nombre, String apellido, String codigo, String contraseña) {
        ArrayList<Administrador> administrador = traerDatos(ruta);
        for (int i = 0; i < administrador.size(); i++) {
            if (administrador.get(i).getCedula().equals(cedula)) {
                administrador.get(i).setNombre(nombre);
                administrador.get(i).setApellido(apellido);
                administrador.get(i).setCodigo(codigo);
                administrador.get(i).setContraseña(contraseña);

                return administrador;
            }
        }
        return null;
    }

    public static ArrayList<Mesero> modificarMesero(String ruta, String cedula, String nombre, String apellido, String codigo) {
        ArrayList<Mesero> meseros = traerDatos(ruta);
        for (int i = 0; i < meseros.size(); i++) {
            if (meseros.get(i).getCedula().equals(cedula)) {
                meseros.get(i).setNombre(nombre);
                meseros.get(i).setApellido(apellido);
                meseros.get(i).setCodigo(codigo);
                return meseros;
            }
        }
        return null;
    }

    public static boolean buscarAdminCedula(String cedula, String ruta) {
        ArrayList<Administrador> administrador = traerDatos(ruta);
        for (int i = 0; i < administrador.size(); i++) {
            if (administrador.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscarMeseroCedula(String cedula, String ruta) {
        ArrayList<Mesero> meseros = traerDatos(ruta);
        for (int i = 0; i < meseros.size(); i++) {
            if (meseros.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public static Administrador traerAdminCedula(String cedula, String ruta) {
        ArrayList<Administrador> administrador = traerDatos(ruta);
        for (int i = 0; i < administrador.size(); i++) {
            if (administrador.get(i).getCedula().equals(cedula)) {
                return administrador.get(i);
            }
        }
        return null;
    }

    public static Mesero traerMeseroCedula(String cedula, String ruta) {
        ArrayList<Mesero> mesero = traerDatos(ruta);
        for (int i = 0; i < mesero.size(); i++) {
            if (mesero.get(i).getCedula().equals(cedula)) {
                return mesero.get(i);
            }
        }
        return null;
    }

    public static void llenarComboNombresAdmin(JComboBox combo, String ruta) {
        ArrayList<Administrador> administrador = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Administrador a;
        for (int i = 0; i < administrador.size(); i++) {
            a = administrador.get(i);
            dcbm.addElement(a.getNombre());
        }
    }

    public static void llenarComboNombresMeseros(JComboBox combo, String ruta) {
        ArrayList<Mesero> meseros = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Mesero m;
        for (int i = 0; i < meseros.size(); i++) {
            m = meseros.get(i);
            dcbm.addElement(m.getNombre());
        }
    }
}
