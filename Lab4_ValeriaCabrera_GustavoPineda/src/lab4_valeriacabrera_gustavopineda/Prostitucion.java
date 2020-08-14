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
public class Prostitucion extends DelitoMenor {
    
    private String solicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String solicitante, String policia, long ID, int celda, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(policia, ID, celda, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.solicitante = solicitante;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @Override
    public String toString() {
        return "Detalles de la Prostitucion{"+super.toString() + ", Solicitante: " + solicitante + '}';
    }
    
    
    
}
