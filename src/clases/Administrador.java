/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author hp 14
 */
public class Administrador extends Persona {

    private String contraseña;

    public Administrador(String cedula, String nombre, String apellido, String codigo, String contraseña) {
        super(cedula, nombre, apellido, codigo);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
