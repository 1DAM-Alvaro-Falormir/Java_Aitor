/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_aitor;

import java.util.Scanner;

/**
 *
 * @author aitor
 *
 * Crea un programa que pida diez números reales por teclado, los almacene en un
 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
 * pantalla.
 */
public class Ej3_Aitor {

    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float num[] = new float[10];
        float small = Float.MAX_VALUE, big = Float.MIN_VALUE;
        int i = 0;
        //Las variables "small" y "big" son usadas para almacenar los numeros minimos y maximos.
        System.out.println("Bienvenido a un programa donde introduzca 10 numeros y te dice el mayor y menor.");
        System.out.print("Introduce el primer numero: ");
        
        for (i = 0; i < num.length; i++){
            num[i] = entry.nextFloat();
            System.out.print("Introduzca otro numero: ");
        }
        
        for (i = 0; i < num.length; i++){
            if (num[i] < small){
                small = num[i];
            }
            if (num[i] > big){
                big = num[i];
            }
        } 
        
        System.out.println("El numero maximo introducido es: "+big+" y el numero mínimo introducido es: "+small);
    }
    
}
