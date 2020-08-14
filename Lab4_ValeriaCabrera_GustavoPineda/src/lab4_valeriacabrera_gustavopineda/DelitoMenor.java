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
public class DelitoMenor extends Delito{
    
    private String policia;
    private long ID;
    private int celda;

    public DelitoMenor() {
        super();
    }

    public DelitoMenor(String policia, long ID, int celda, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.policia = policia;
        this.ID = ID;
        this.celda = celda;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    @Override
    public String toString() {
        return "DelitoMenor{" + "policia=" + policia + ", ID=" + ID + ", celda=" + celda + '}';
    }
    
    
    
    
    
}
