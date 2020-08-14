/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_valeriacabrera_gustavopineda;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Criminales {
 
    private String nombre;
    private int edad;
    private String pais;
    private boolean encarcelado;
    private String descripcion;
    ArrayList<Delito> delito = new ArrayList();

    public Criminales() {
    }

    public Criminales(String nombre, int edad, String pais, boolean encarcelado, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.encarcelado = encarcelado;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Delito> getDelito() {
        return delito;
    }

    public void setDelito(ArrayList<Delito> delito) {
        this.delito = delito;
    }

    
    
    @Override
    public String toString() {
        return "Criminales{" + "nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + ", encarcelado=" + encarcelado + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
