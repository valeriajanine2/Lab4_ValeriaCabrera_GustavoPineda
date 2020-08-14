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
        int opcion = 0;
        int menuChoices = 5;
        while (opcion != 5) {
            boolean flag = true;
            while (flag) {
                try {
                    System.out.println("***Menu***");
                    System.out.println("1. Crear delito");
                    System.out.println("2. Modificar delito");
                    System.out.println("3. Eliminar delito");
                    System.out.println("4. Listar todo");
                    System.out.println("5. Salir corriendo");
                    opcion = Integer.parseInt(input.nextLine());
                    flag = false;
                } catch (NumberFormatException e) {
                    System.out.println("El dato debe de ser un numero entero,Por favor intente de nuevo");
                }
                while (opcion < 0 || opcion > menuChoices) {
                    System.out.println("El dato debe de ser dentro de los numeros del menu");
                    try {
                        opcion = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("El dato debe de ser un numero entero,Por favor intente de nuevo");
                    }
                }
            }
            switch (opcion) {
                case 1:
                    System.out.println("Agregar delito");
                    System.out.println("Ingrese descripcion del delito");
                    String desc = input.nextLine();

                    System.out.println("Ingrese nombre de la victima");
                    String nomVic = input.next();

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
                    System.out.println("Ingrese la fecha en la cual el delito se ejecuto");
                    String fechDel = input.next();

                    System.out.println("Ingrese el pais donde se ejecuto el delito");
                    String pais = input.next();

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

                    System.out.println("Elija si es delito menor o grave");
                    System.out.println("1. Menor");
                    System.out.println("2. Grave");
                    int opcion2 = input.nextInt();
                    int menuChoice3 = 2;
                    boolean flag4 = true;
                    while (flag4) {
                        try {
                            opcion2 = Integer.parseInt(input.nextLine());
                            flag4 = false;
                        } catch (NumberFormatException e4) {
                            System.out.println("Ingrese un numero entero");
                        }
                        while (opcion2 < 0 || opcion2 > menuChoice1) {
                            System.out.println("El dato debe de ser dentro de los numeros del menu");
                        }
                        try {
                            opcion2 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e4) {
                            System.out.println("Ingrese un numero entero");
                        }
                    }
                    if (opcion2 == 1) {
                        System.out.println("Ingrese nombre del policia");
                        String nomP = input.next();
                        System.out.println("Ingrese el numero de identificacion del policio");
                        long ID = input.nextLong();
                        System.out.println("Ingrese el numero de celda");
                        int celda = input.nextInt();
                        boolean flag5 = true;
                        while (flag5) {
                            try {
                                celda = Integer.parseInt(input.nextLine());
                                flag5 = false;
                            } catch (NumberFormatException e5) {
                                System.out.println("Ingrese un numero entero");
                            }
                        }
                        Delitos.add(new DelitoMenor(nomP, ID, celda, desc, nomVic, culpable, sent, fechDel, pais, numD));
                    } else if (opcion2 == 2) {
                        System.out.println("Ingrese nivel de gravedad");
                        int gravedad = input.nextInt();
                        boolean flag6 = true;
                        while (flag6) {
                            try {
                                gravedad = Integer.parseInt(input.nextLine());
                                flag6 = false;
                            } catch (NumberFormatException e6) {
                                System.out.println("Ingrese un numero entero");
                            }
                            while (gravedad < 0 || gravedad > 5) {
                                System.out.println("El dato debe de ser entre 1 y 5");
                            }
                            try {
                                gravedad = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException e6) {
                                System.out.println("Ingrese un numero entero");
                            }
                        }
                        Delitos.add(new DelitoGrave(gravedad, desc, nomVic, culpable, sent, fechDel, pais, numD));
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
