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
public class Hurto extends DelitoMenor{

    private String objeto;
    private double valor;

    public Hurto() {
        super();
    }

    public Hurto(String objeto, double valor, String policia, long ID, int celda, String descripcion, String nomVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito) {
        super(policia, ID, celda, descripcion, nomVictima, culpable, sentencia, fecha, pais, numDelito);
        this.objeto = objeto;
        this.valor = valor;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Detalles del Hurto{"+super.toString()+ ", Objeto: " + objeto + ", Valor: " + valor + '}';
    }
    
    
    
    
    
}
