/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Venta implements Serializable{
    private ArrayList<Producto> productos = new ArrayList<>();
    private double precioTotal;
    private Cliente cliente;
    private int cantidadProductos;
    
    public Venta(){
        
    }

    public Venta(ArrayList<Producto> productos, double precioTotal, Cliente cliente, int cantidadProductos) {
        this.productos = productos;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.cantidadProductos = cantidadProductos;
    }

    
    public void agregarProductoVenta(Producto p){
        productos.add(p);
    }

    public boolean eliminarProductoventa(Producto p){
        return productos.remove(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" +" productos=" + productos + ", precioTotal=" + precioTotal + ", cliente=" + cliente + '}';
    }

    /**
     * @return the cantidadProductos
     */
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    /**
     * @param cantidadProductos the cantidadProductos to set
     */
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    
}
