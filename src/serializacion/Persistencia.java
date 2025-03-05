/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializacion;

import controlador.Ferreteria;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Persistencia implements Serializable{
    
    
    public void guardarDatos(Ferreteria f, String nombreArchivo) throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream(nombreArchivo);
        ObjectOutputStream objeto = new ObjectOutputStream(file);
        objeto.writeObject(f);
        file.close();
        objeto.close();
        
    }
    
    public Ferreteria leerDatos(String nombreArchivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo = new FileInputStream(nombreArchivo);
        ObjectInputStream objeto = new ObjectInputStream(archivo);
        Ferreteria f1 = (Ferreteria) objeto.readObject();
        archivo.close();
        objeto.close();
        return f1;
    }
}
