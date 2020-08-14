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
public class Organizacion {
    
    ArrayList<Criminales> crimi = new ArrayList();

    public Organizacion() {
    }

    public ArrayList<Criminales> getCrimi() {
        return crimi;
    }

    public void setCrimi(ArrayList<Criminales> crimi) {
        this.crimi = crimi;
    }

    @Override
    public String toString() {
        return "Organizacion{" + "crimi=" + crimi + '}';
    }
    
    
    
}
