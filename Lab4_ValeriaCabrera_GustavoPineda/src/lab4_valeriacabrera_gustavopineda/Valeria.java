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
        
        System.out.println("Eliminar");
        System.out.println("1) Eliminar Delito");
        System.out.println("2) Eliminar Criminal");
        System.out.println("3) Eliminar Agente");
        int eli = input.nextInt();
        
        if (eli==1) {
            
            System.out.println("Ingrese el numero del delito que desea eliminar: ");
            int del = input.nextInt();
            
            Delitos.remove(del);
            
            
        }else if(eli==2){
            
            System.out.println("Ingrese el numero del criminal que desea eliminar: ");
            int cri = input.nextInt();
            
            Criminal.remove(cri);
            
        }else if(eli==3){
            
            System.out.println("Ingrese el numero del agente que desea eliminar: ");
            int ag = input.nextInt();
            
            Agente.remove(ag);
        }
        
    }
    
    
        
    
}
