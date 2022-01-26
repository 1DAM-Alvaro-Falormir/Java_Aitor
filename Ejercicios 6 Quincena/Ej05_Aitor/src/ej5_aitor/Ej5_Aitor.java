/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_aitor;

import java.util.Scanner;

/**
 *
 * @author aitor
 * Crea un programa que pida veinte números reales por teclado,
 * los almacene en un array y luego lo recorra para calcular y mostrar la media:
 * (suma de valores) / nº de valores.
 */
public class Ej5_Aitor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num[] = new float[20];
        float suma = 0, media;
        int i = 0;
        System.out.println("Bienvenido a un programa en el cual introducira 20 numeros reales\n"
        +"y se le mostrara la media de todos los numeros.");
        System.out.print("Introduzca un numero: ");
        
        for (i = 0; i < num.length; i++){
            num[i] = sc.nextFloat();
            System.out.print("Introduce otro numero: ");
            
        }
        
        for (i = 0; i < num.length; i++){
            suma = suma + num[i];
        }
        media = suma / num.length;
        System.out.println("La media de los numeros es: "+media);
    }   
    
}
