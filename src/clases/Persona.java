/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author hp 14
 */
public class Persona implements java.io.Serializable {

    private String cedula;
    private String nombre;
    private String apellido;
    private String codigo;

    public Persona(String cedula, String nombre, String apellido, String codigo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
