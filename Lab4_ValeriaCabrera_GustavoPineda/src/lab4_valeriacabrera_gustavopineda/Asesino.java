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
public class Asesino extends Agentes{
    
    private String victima;
    private String arma;

    public Asesino() {
    }

    public Asesino(String victima, String arma) {
        this.victima = victima;
        this.arma = arma;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Asesino{" + "victima=" + victima + ", arma=" + arma + '}';
    }
    
    
    
}
