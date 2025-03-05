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
public class Empleado extends Persona implements Serializable{
    private double salario;
    private String usuario;
    private String contrasenia;
    
    public Empleado(){
        
    }

    public Empleado(double salario, long documento, String nombre, String apellido, String telefono, String direccion, String contrasenia, String usuario) {
        super(documento, nombre, apellido, telefono, direccion);
        this.salario = salario;
        this.contrasenia= contrasenia;
        this.usuario= usuario;
    }

    public Empleado(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    } 

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    
}