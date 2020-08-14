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
public class Trafico extends DelitoGrave {
    
    private String droga;
    private int cantidad;

    public Trafico() {
        super();
    }

    public Trafico(String droga, int cantidad, int gravedad, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(gravedad, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.droga = droga;
        this.cantidad = cantidad;
    }

    public String getDroga() {
        return droga;
    }

    public void setDroga(String droga) {
        this.droga = droga;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Trafico{" + "droga=" + droga + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
    
    
}
