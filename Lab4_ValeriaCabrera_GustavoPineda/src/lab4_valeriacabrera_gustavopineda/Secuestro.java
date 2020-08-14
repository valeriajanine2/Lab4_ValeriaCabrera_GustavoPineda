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
public class Secuestro extends DelitoGrave {
    
    private int retenido;
    private boolean vivo;

    public Secuestro() {
        super();
    }

    public Secuestro(int retenido, boolean vivo, int gravedad, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(gravedad, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.retenido = retenido;
        this.vivo = vivo;
    }

    public int getRetenido() {
        return retenido;
    }

    public void setRetenido(int retenido) {
        this.retenido = retenido;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Detalles del Secuestro{"+super.toString() + ", Retenido: " + retenido + ", Vivo: " + vivo + '}';
    }
    
    
    
    
    
    
    
}
