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
public class Asesinato extends DelitoGrave{
    
    private String arma;
    private int cuerpos;

    public Asesinato() {
        super();
    }

    public Asesinato(String arma, int cuerpos, int gravedad, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(gravedad, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.arma = arma;
        this.cuerpos = cuerpos;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getCuerpos() {
        return cuerpos;
    }

    public void setCuerpos(int cuerpos) {
        this.cuerpos = cuerpos;
    }

    @Override
    public String toString() {
        return "Detalles del Asesinato{" +super.toString()+ ", Arma: " + arma + ", Cuerpos: " + cuerpos + '}';
    }
    
    
}
