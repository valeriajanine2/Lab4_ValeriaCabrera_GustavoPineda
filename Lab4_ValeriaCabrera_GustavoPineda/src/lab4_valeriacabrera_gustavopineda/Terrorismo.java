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
public class Terrorismo extends DelitoGrave {
    
    private String artefacto;
    private int victimas;

    public Terrorismo() {
        super();
    }

    public Terrorismo(String artefacto, int victimas, int gravedad, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(gravedad, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.artefacto = artefacto;
        this.victimas = victimas;
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

    @Override
    public String toString() {
        return "Terrorismo{"+super.toString() + "artefacto=" + artefacto + ", victimas=" + victimas + '}';
    }
    
    
    
    
    
}
