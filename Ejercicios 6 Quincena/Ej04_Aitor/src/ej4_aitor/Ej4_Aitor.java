/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_aitor;

import java.util.Scanner;

/**
 *
 * @author aitor
 * Crea un programa que pida veinte números enteros por teclado,
 * los almacene en un array y luego muestre por separado la suma de todos los
 * valores positivos y negativos.
 */
public class Ej4_Aitor {


    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num[] = new int[20];
        int sumap = 0, suman = 0, i = 0;
        //Variables para acumular las sumas de los positivos y de los negativos.
        System.out.println("Bienvenido a un programa donde introduce 20 numeros enteros \n"
        +"y le muestra la suma por separado de todos los valores positivos y negativos.");
        //El 0 es contado como positivo.
        System.out.print("Introduzca un numero: ");
        
        for(i = 0; i < num.length; i++){
            num[i] = entry.nextInt();
            System.out.print("Introduce otro numero: ");
            
        }
        for (i = 0; i < num.length; i++){
            if (num[i] < 0){
                suman = suman +num[i];
            }
            if (num[i] >= 0){
                sumap = sumap + num[i];
            }
        }
        
        System.out.println("La suma de los positivos es: "+sumap+" y la suma de los negativos es: "+suman);
    }
    
}
