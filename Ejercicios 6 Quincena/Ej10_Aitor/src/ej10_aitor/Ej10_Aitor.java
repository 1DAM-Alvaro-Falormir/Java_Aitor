/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_aitor;

import java.util.Scanner;

/**
 *
 * @author Aitor
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. 
 * Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media.
 */
public class Ej10_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float array[];
        int n, i = 0;
        float acum = 0, media, min, max;
        int contmin = 0, contmax = 0;
        //Declaración de variables
        
        System.out.println("Bienvenido a un progrma donde se pediran el numero de alturas que desea introducir.\n"
        +"Luego se mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media.");
        
        System.out.print("Digame el numero de alturas: ");
        n = sc.nextInt();
        array = new float[n];
        
        
        for (i = 0; i < array.length; i++){
            System.out.print("Introduce una altura: ");
            array[i] = sc.nextFloat();
            
        }
        
        
        
        for (i = 0; i < array.length; i++){
            acum = acum + array[i];
        }
        
        media = acum / array.length;
        System.out.println("La media de las alturas introducidas es: "+media+" metros.");
        
        max = array[0];
        min = array[0];
        for (i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("La altura maxima introducida es: "+max+" metros y la altura minima introducida es: "+min+" metros.");
        
        for (i = 0; i < array.length; i++){
            if (array[i] > media){
                contmax++;
            }
            if (array[i] < media){
                contmin++;
            }
        }
        System.out.println("Hay "+contmax+" alturas superiores a la media y hay "+contmin+" alturas inferiores a la media.");
    }
    
}
