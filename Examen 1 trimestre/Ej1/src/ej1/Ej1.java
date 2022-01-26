/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author aitor Rodriguez Gallardo
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        char menu;
        int numeroNota = 0, aprobado = 0, suspenso = 0;
        double nota;
        int numFamilia, edad;
        double precioBillete, acumulador = 0, total = 0;
        String nombre, basura;
        //El nombre, edad y coste del billetes se volvera a cero cada vez que se introduzca un nuevo miembro de la familia.

        do {
            System.out.println("Bienvenido al menu para seleccionar un modo.");
            System.out.println("Elija una opcion:\n"
                    + "(a) Aprobados y suspendidos.\n"
                    + "(b) Billetes a Madrid.\n"
                    + "(c) Salir.");
            menu = entry.next().charAt(0);
            if (menu == 'a' || menu == 'A' || menu == 'b' || menu == 'B' || menu == 'c' || menu == 'C') {
                if (menu == 'a' || menu == 'A') {
                    menu = 1;
                }
                if (menu == 'b' || menu == 'B') {
                    menu = 2;
                }
                if (menu == 'c' || menu == 'C') {
                    menu = 3;
                }
                switch (menu) {
                    case 1:
                        System.out.print("Bienvenido al contador de notas, introduzca el numero de notas a poner: ");
                        numeroNota = entry.nextInt();
                        System.out.println("A continuacion introduzca las notas a comparar y el programa le dira si hay mas aprobados o suspensos.");
                        aprobado = 0;
                        suspenso = 0;                        
                        for (int i = 0; i < numeroNota; i++) {
                            nota = entry.nextDouble();
                            if (nota >= 0 && nota <= 10) {
                                if (nota >= 5) {
                                    aprobado++;
                                } else {
                                    suspenso++;
                                }
                            } else {
                                break;
                            }
                        }
                        if (aprobado > suspenso) {
                            System.out.println("Hay mas aprobados.");
                        } else if (suspenso > aprobado) {
                            System.out.println("Hay mas suspensos");
                        } else {
                            System.out.println("La cantidad de aprobados y suspensos son los mismos.");
                        }
                        break;
                    case 2:
                        System.out.println("Bienvenido al programa para calcular el precio de un billete de valencia a Madrid.");
                        System.out.print("Indica el numero de familiares que tienen que comprar el tiquet: ");
                        numFamilia = entry.nextInt();
                        total = 0;
                        for (int i = 0; i < numFamilia; i++) {
                            precioBillete = 32;
                            System.out.println("Escriba el nombre de un familiar:");
                            basura = entry.nextLine();
                            nombre = entry.nextLine();
                            System.out.print("Introduzca la edad en años de " + nombre + ": ");
                            edad = entry.nextInt();
                            if (edad > 0) {
                                if (edad >= 65) {
                                    acumulador = precioBillete * 0.1;
                                    precioBillete = precioBillete - acumulador;
                                } else if (edad >= 12 && edad <= 15) {
                                    acumulador = precioBillete * 0.08;
                                    precioBillete = precioBillete - acumulador;
                                } else if (edad >= 4 && edad <= 11) {
                                    acumulador = precioBillete * 0.35;
                                    precioBillete = precioBillete - acumulador;
                                } else if (edad >= 0 && edad < 4) {
                                    precioBillete = 0;
                                } else {
                                    System.out.println("No hay descuento para esta edad.");
                                    precioBillete = 32;
                                }
                            } else {
                                System.err.println("Edad invalida");
                                break;
                            }
                            System.out.println("El billete de " + nombre + " cuesta: " + precioBillete);
                            total = total + precioBillete;
                        }
                        System.out.println("El precio total de la familia es: " + total);
                }

            } else {
                System.err.println("Opcion invalida, vuelva a introducir la opción");
            }
        } while (menu != 3);
        System.out.println("Gracias por uitilizar este programa.\n"
                + "Vuelva pronto.");
    }
}
