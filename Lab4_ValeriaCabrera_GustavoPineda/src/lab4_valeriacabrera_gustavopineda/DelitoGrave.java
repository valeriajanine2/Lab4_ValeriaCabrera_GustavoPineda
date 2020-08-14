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
public class DelitoGrave extends Delito{
    
    private int gravedad;

    public DelitoGrave() {
        super();
    }

    public DelitoGrave(int gravedad, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        setGravedad(gravedad);
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        if (gravedad>=1 && gravedad<=5) {
            this.gravedad = gravedad;
        }
        
    }

    @Override
    public String toString() {
        return "DelitoGrave{"+super.toString() + "Gravedad: " + gravedad + '}';
    }
    
    
    
    
    
}
