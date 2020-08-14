/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_valeriacabrera_gustavopineda;

/**
 *
 * @author Usuario
 */
public class Violacion extends DelitoGrave{
    
    private int edad;

    public Violacion() {
        super();
    }

    public Violacion(int edad, int gravedad, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(gravedad, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Violacion{" + "edad=" + edad + '}';
    }
    
    
    
    
    
}
