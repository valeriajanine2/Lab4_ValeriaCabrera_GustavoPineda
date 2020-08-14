/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_valeriacabrera_gustavopineda;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lab4_ValeriaCabrera_GustavoPineda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion=0;
        int menuChoices=5;
        while (opcion!=5){
            boolean flag=true;
            while(flag){
                try{
                    System.out.println("***Menu***");
                    System.out.println("1. Crear delito");
                    System.out.println("2. Modificar delito");
                    System.out.println("3. Eliminar delito");
                    System.out.println("4. Listar todo");
                    System.out.println("5. Salir corriendo");
                    opcion=Integer.parseInt(input.nextLine());
                    flag=false;
                }catch(NumberFormatException e){
                    System.out.println("El dato debe de ser un numero entero,Por favor intente de nuevo");
                }while(opcion<0||opcion>menuChoices) {
                    System.out.println("El dato debe de ser dentro de los numeros del menu");
                    try{
                        opcion=Integer.parseInt(input.nextLine());
                    }catch(NumberFormatException e){
                        System.out.println("El dato debe de ser un numero entero,Por favor intente de nuevo");
                    }
                }
            }
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
    
}
