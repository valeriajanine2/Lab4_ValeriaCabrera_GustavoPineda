/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_valeriacabrera_gustavopineda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Valeria {
    
    public Valeria(){
        
        Scanner input = new Scanner(System.in);
        ArrayList<Delito> Delitos = new ArrayList();
        ArrayList<Criminales> Criminal = new ArrayList();
        ArrayList<Agentes> Agente = new ArrayList();
        
        //case de listar
        
        System.out.println("Listar");
        System.out.println("1) Listar Delitos");
        System.out.println("2) Listar Criminales");
        System.out.println("3) Listar Agentes");
        int list = input.nextInt();
        
        if(list==1){
            System.out.println("DELITOS");
            for (int i = 0; i < Delitos.size(); i++) {
                System.out.println(Delitos.indexOf(i)+" - "+Delitos.get(i));
            }
        }else if(list==2){
            System.out.println("CRIMINALES");
            for (int i = 0; i < Criminal.size(); i++) {
                System.out.println(Criminal.indexOf(i)+" - "+Criminal.get(i));
            }
        }else if(list==3){
            System.out.println("AGENTES");
            for (int i = 0; i < Agente.size(); i++) {
                System.out.println(Agente.indexOf(i)+" - "+Agente.get(i));
            }
        }
        
    }
    
    
        
    
}
