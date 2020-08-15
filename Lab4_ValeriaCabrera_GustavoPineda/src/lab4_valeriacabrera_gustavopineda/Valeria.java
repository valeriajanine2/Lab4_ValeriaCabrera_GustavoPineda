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
        
        //case de modificar delitos
        
        System.out.println("Ingrese el numero del delito que desea modificar: ");
        int ndel = input.nextInt();
        
        
        System.out.println("Modificar");
        System.out.println("1) Modificar Descripcion");
        System.out.println("2) Modificar Nombre de la Victima");
        System.out.println("3) Modificar Culpabilidad");
        System.out.println("4) Modificar Fecha");
        System.out.println("5) Modificar País");
        System.out.println("6) Modificar Numero de Delito");
        int mod = input.nextInt();
        
        while(mod<0 || mod>7){
            System.out.println("Asegurese de ingresar una de las opciones del menu");
            System.out.println("Modificar");
            System.out.println("1) Modificar Descripcion");
            System.out.println("2) Modificar Nombre de la Victima");
            System.out.println("3) Modificar Culpabilidad");
            System.out.println("4) Modificar Fecha");
            System.out.println("5) Modificar País");
            System.out.println("6) Modificar Numero de Delito");
            mod = input.nextInt();
        }
        
        switch(mod){
            
            case 1: {
                System.out.println("Ingrese la nueva descripcion del delito");
                String desc = input.nextLine();
                
                ((Delito) Delitos.get(ndel)).setDescripcion(desc);
            }
            break;
            case 2: {
                System.out.println("Ingrese nombre de la victima");
                String nomVic = input.next();
                
                ((Delito) Delitos.get(ndel)).setNomVictima(nomVic);
                
            }
            break;
            case 3: {
                System.out.println("Ingrese si es culpable");
                System.out.println("1. Culpable");
                System.out.println("2. No es culpable");
                int culp = input.nextInt();
                int menuChoice1 = 2;
                boolean flag1 = true;
                while (flag1) {
                    try {
                        culp = Integer.parseInt(input.nextLine());
                        flag1 = false;
                    } catch (NumberFormatException e1) {
                        System.out.println("Ingrese un numero entero");
                    }
                    while (culp < 0 || culp > menuChoice1) {
                        System.out.println("El dato debe de ser dentro de los numeros del menu");
                    }
                    try {
                        culp = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e1) {
                        System.out.println("Ingrese un numero entero");
                    }
                }
                String sent = "0";
                boolean culpable = false;
                if (culp == 1) {
                    culpable = true;
                    System.out.println("Ingrese si es años de sentencia o pena de muerte");
                    System.out.println("1. Años de sentencia");
                    System.out.println("2. Pena de muerte");
                    int opcion3 = input.nextInt();
                    int menuChoice2 = 2;
                    boolean flag2 = true;
                    while (flag2) {
                        try {
                            opcion3 = Integer.parseInt(input.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e2) {
                            System.out.println("Ingrese un numero entero");
                        }
                        while (opcion3 < 0 || opcion3 > menuChoice2) {
                            System.out.println("El dato debe de ser dentro de los numeros del menu");
                        }
                        try {
                            opcion3 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e2) {
                            System.out.println("Ingrese un numero entero");
                        }
                    }
                    if (opcion3 == 1) {
                        System.out.println("Ingrese los años de sentencia");
                        sent = input.next();
                    }
                    if (opcion3 == 2) {
                        sent = "Pena de muerte";
                    }
                }
                
                ((Delito) Delitos.get(ndel)).setCulpable(culpable);
                ((Delito) Delitos.get(ndel)).setSentencia(sent);
                
            }
            break;
            case 4:{
                System.out.println("Ingrese la fecha en la cual el delito se ejecuto");
                String fechDel = input.next();
                
                ((Delito) Delitos.get(ndel)).setFecha(fechDel);
            }
            break;
            case 5:{
                System.out.println("Ingrese el pais donde se ejecuto el delito");
                String pais = input.next();
                
                ((Delito) Delitos.get(ndel)).setPais(pais);
                
            }
            break;
            case 6:{
                
                System.out.println("Ingrese el numero de delito");
                int numD = input.nextInt();
                boolean flag3 = true;
                while (flag3) {
                    try {
                        numD = Integer.parseInt(input.nextLine());
                        flag3 = false;
                    } catch (NumberFormatException e3) {
                        System.out.println("Ingrese un numero entero");
                    }
                }
                
                ((Delito) Delitos.get(ndel)).setNumDelito(numD);
                
            }
            break;
            default:{
                System.out.println("Asegurese de ingresar una de las opciones a modificar");
            }
            
        }//fin del switch
        

        

        
        

        

        

    }

}
