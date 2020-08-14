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
public class Lab4_ValeriaCabrera_GustavoPineda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Delito> Delitos = new ArrayList();
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
                    System.out.println("Agregar delito");
                    System.out.println("Ingrese descripcion del delito");
                    String desc=input.nextLine();
                    
                    System.out.println("Ingrese nombre de la victima");
                    String nomVic=input.next();
                    
                    System.out.println("Ingrese si es culpable");
                    System.out.println("1. Culpable");
                    System.out.println("2. No es culpable");
                    int culp=input.nextInt();
                    String sent="0";
                    boolean culpable =false;
                    if (culp==1) {
                        culpable=true;
                        System.out.println("Ingrese si es años de sentencia o pena de muerte");
                        System.out.println("1. Años de sentencia");
                        System.out.println("2. Pena de muerte");
                        int opcion3=input.nextInt();
                        if (opcion3==1) {
                            System.out.println("Ingrese los años de sentencia");
                            sent=input.next();
                        }
                        if(opcion3==2){
                            sent="Pena de muerte";
                        }
                    }
                    System.out.println("Ingrese la fecha en la cual el delito se ejecuto");
                    String fechDel=input.next();
                    
                    System.out.println("Ingrese el pais donde se ejecuto el delito");
                    String pais=input.next();
                    
                    System.out.println("Ingrese el numero de delito");
                    int numD=input.nextInt();
                    
                    System.out.println("Elija si es delito menor o grave");
                    System.out.println("1. Menor");
                    System.out.println("2. Grave");
                    int opcion2=input.nextInt();
                    if (opcion2==1) {
                        System.out.println("Ingrese nombre del policia");
                        String nomP=input.next();
                        System.out.println("Ingrese el numero de identificacion del policio");
                        long ID=input.nextLong();
                        System.out.println("Ingrese el numero de celda");
                        int celda=input.nextInt();
                        Delitos.add(new DelitoMenor(nomP,ID,celda,desc,nomVic,culpable,sent,fechDel,pais,numD));
                    }else if(opcion2==2){
                        System.out.println("Ingrese nivel de gravedad");
                        int gravedad=input.nextInt();
                        Delitos.add(new DelitoGrave(gravedad,desc,nomVic,culpable,sent,fechDel,pais,numD));
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    for (int i = 0; i < Delitos.size(); i++) {
                        System.out.println(Delitos.get(i));
                    }
                    break;
            }
        }
    }
}
