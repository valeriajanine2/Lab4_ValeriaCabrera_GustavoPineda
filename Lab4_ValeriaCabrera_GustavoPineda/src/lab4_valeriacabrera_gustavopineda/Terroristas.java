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
public class Terroristas extends Agentes {
    
    private String pais;
    private String ciudad;
    private String metodo;

    public Terroristas() {
    }

    public Terroristas(String pais, String ciudad, String metodo) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Terrorista{" + "Pais: " + pais + ", Ciudad: " + ciudad + ", Metodo: " + metodo + '}';
    }

    @Override
    void cometerDelito() {
        System.out.println("Ocurrió un acto terrorista en "+pais+", "+ciudad+"");
    }

    
    
    
    
}
