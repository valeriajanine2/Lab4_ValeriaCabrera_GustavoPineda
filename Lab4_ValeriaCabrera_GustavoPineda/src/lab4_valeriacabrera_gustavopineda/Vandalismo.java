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
public class Vandalismo extends DelitoMenor {
    
    private String edificacion;
    private String pisos;
    private String dueno;

    public Vandalismo() {
        super();
    }

    public Vandalismo(String edificacion, String pisos, String dueno, String policia, long ID, int celda, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(policia, ID, celda, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.edificacion = edificacion;
        this.pisos = pisos;
        this.dueno = dueno;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public String getPisos() {
        return pisos;
    }

    public void setPisos(String pisos) {
        this.pisos = pisos;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Detalles del Vandalismo{"+super.toString()+ ", edificacion=" + edificacion + ", pisos=" + pisos + ", dueno=" + dueno + '}';
    }
    
    
    
    
    
}
