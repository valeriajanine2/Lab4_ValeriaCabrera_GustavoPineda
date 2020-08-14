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
public class Secuestradores extends Agentes{
    
    private String victima;
    private int rescate;

    public Secuestradores() {
    }

    public Secuestradores(String victima, int rescate) {
        this.victima = victima;
        this.rescate = rescate;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public int getRescate() {
        return rescate;
    }

    public void setRescate(int rescate) {
        this.rescate = rescate;
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "Victima: " + victima + ", Rescate: " + rescate + '}';
    }

    @Override
    void cometerDelito() {
        System.out.println("Se ha secuestrado a "+victima+" y hay recompensa de "+rescate);
    }
    
    
    
}
