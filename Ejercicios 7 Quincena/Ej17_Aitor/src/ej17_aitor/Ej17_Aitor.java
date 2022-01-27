/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17_aitor;
import java.util.Scanner;

/**
 * Realiza un programa que nos pida número enteros hasta que se introduzca el 0,
 * diciéndonos, para cada número introducido si es primo o no. Hay que recordar
 * que un número es primo si es divisible por si mismo y por 1. El 1 no es primo
 * por convenio. Se debe crear una función que pasándole un número entero
 * devuelva si es primo o no.
 * 
 * @author Aitor
 */
public class Ej17_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Introduce un numero entero para saber si es primo: ");
            num = sc.nextInt();
            if (esPrimo(num))
                System.out.println(num+" es primo.");
            else
                System.out.println(num+" no es primo.");
            System.out.println("Le gustaria introducir otro numero? (0 para salir/ 1 para seguir)");
            num = sc.nextInt();
        }while(num != 0);
    }
    
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                return false;
            }
        }
        return true;
    }
    
}
