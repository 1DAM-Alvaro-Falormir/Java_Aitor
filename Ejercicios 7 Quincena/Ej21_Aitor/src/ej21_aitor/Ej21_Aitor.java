/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej21_aitor;

import java.util.Scanner;

/**
 * Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y
 * “2.Área”. En ambas se le pedirá al usuario que introduzca un radio y luego se
 * le mostrará el cálculo oportuno.
 *
 * @author Aitor
 */
public class Ej21_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double radio;
        do {
            menu = menu();
            
            switch(menu){
                case 1:
                    System.out.print("Dime el radio para hacer el calculo: ");
                    radio = pideRadio();
                    System.out.println("La circunferencia a partir del radio : "+radio+" es: "+circunferencia(radio));
                    break;
                case 2:
                    System.out.print("Dime el radio para hacer el calculo: ");
                    radio = pideRadio();
                    System.out.println("El area a partir del radio : " + radio + " es: " + area(radio));
                    break;
                case 3:
                    System.out.print("Dime el radio para hacer el calculo: ");
                    radio = pideRadio();
                    System.out.println("El volumen a partir del radio : "+radio+" es: "+volumen(radio));
                    break;
                case 4:
                    System.out.print("Dime el radio para hacer los calculos: ");
                    radio = pideRadio();
                    System.out.println("La circunferencia a partir del radio : "+radio+" es: "+circunferencia(radio));
                    System.out.println("El area a partir del radio : " + radio + " es: " + area(radio));
                    System.out.println("El volumen a partir del radio : "+radio+" es: "+volumen(radio));
                    break;
                case 5:
                    break;
                    
            }

        } while (menu != 5);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean salir = true;

        System.out.println("Elija una opcion:\n"
                + "1.Circunferencia\n"
                + "2.Área\n"
                + "3.Volumen\n"
                + "4.Todas\n"
                + "5.Salir");
        choice = sc.nextInt();
        do {

            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
                salir = false;
            } else {
                salir = true;
                System.out.println("Opcion incorrecta");
                System.out.println("Introduce otra vez:\n"
                        + "1.Circunferencia\n"
                        + "2.Área\n"
                        + "3.Volumen\n"
                        + "4.Todas\n"
                        + "5.Salir");
                choice = sc.nextInt();
            }

        } while (salir);
        return choice;
    }

    public static double pideRadio() {
        Scanner sc = new Scanner(System.in);
        double radio;

        System.out.print("Introduzca el radio: ");
        radio = sc.nextDouble();

        return radio;
    }

    public static double circunferencia(double r) {
        return 2 * Math.PI * r;
    }

    public static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    
    public static double volumen(double r){
        return 4/3 * Math.PI * Math.pow(r, 3);
    }
}
