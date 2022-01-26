/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_aitor;

import java.util.Scanner;

/**
 *
 * @author aitor
 * Crea un programa que pida diez números reales por teclado, los
 * almacene en un array, y luego muestre la suma de todos los valores.
 */
public class Ej2_Aitor {


    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num[]= new int[10];
        int suma = 0, i = 0;
        System.out.println("Bienvenido a un programa el cual pide 10 numeros y te muesta la suma");
        System.out.print("Introduzca el primer numero: ");
        for (i = 0; i < num.length; i++){
            num[i] = entry.nextInt();
            System.out.print("Introduzca otro numero: ");
            
        }
        for (i = 0; i < num.length; i++){
            suma += num[i];
        }
        System.out.println("La suma de todos los numeros es: "+suma);
    }
    
}
