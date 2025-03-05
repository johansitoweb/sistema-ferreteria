/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Proveedor implements Serializable{
    private long documento;//id
    private String nombre;
    private String telefono;
    private double deuda;

    public Proveedor() {
    }

    public Proveedor(long documento, String nombre, String telefono, double deuda) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.deuda = deuda;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "documento=" + documento + ", nombre=" + nombre + ", telefono=" + telefono + ", deuda=" + deuda + '}';
    }

    
}
