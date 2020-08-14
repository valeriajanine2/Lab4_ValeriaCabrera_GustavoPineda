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
public class Delito {
    
    private String descripcion;
    private String nomVictima;
    private boolean culpable;
    private String sentencia;
    private String fecha;
    private String pais;
    private int numDelito;

    public Delito() {
    }

    public Delito(String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        this.descripcion = descripcion;
        this.nomVictima = nomVictima;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.fecha = fecha;
        this.pais = pais;
        this.numDelito = numDelito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomVictima() {
        return nomVictima;
    }

    public void setNomVictima(String nomVictima) {
        this.nomVictima = nomVictima;
    }

    public boolean isCulpable() {
        return culpable;
    }

    public void setCulpable(boolean culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumDelito() {
        return numDelito;
    }

    public void setNumDelito(int numDelito) {
        this.numDelito = numDelito;
    }

    @Override
    public String toString() {
        return "Delito{" + "descripcion=" + descripcion + ", nomVictima=" + nomVictima + ", culpable=" + culpable + ", sentencia=" + sentencia + ", fecha=" + fecha + ", pais=" + pais + ", numDelito=" + numDelito + '}';
    }
    
    
    
}