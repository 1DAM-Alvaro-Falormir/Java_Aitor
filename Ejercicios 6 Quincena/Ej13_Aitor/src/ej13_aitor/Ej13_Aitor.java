/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13_aitor;

import java.util.*;

/**
 *
 * @author Aitor
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla.
 * Una secuencia aritmética es una serie de números que comienza por un valor inicial V, y continúa con incrementos de I.
 * Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… 
 * Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… 
 * El programa solicitará al usuario V, I además de N (nº de valores a crear).
 */
public class Ej13_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int v, i, n, c = 0, suma;
        
        System.out.println("Bienvenido a un programa donde puedes almacenar una secuencia aritmética");
        System.out.print("Introduce el numero de valores que tendra la secuencia aritmética: ");
        n = sc.nextInt();
        
        if (n > 0){
            System.out.print("Introduce el valor inicial: ");
            v = sc.nextInt();
            System.out.print("Introduce el incremento: ");
            i = sc.nextInt();
            array = new int[n];
            if (i != 0){
                array[0] = v;
                suma = v;
                for (c = 1; c < array.length; c++){
                    suma = suma + i;
                    array[c] = suma;
                }
                System.out.print("Esta es la secuencia aritmética: ");
                for (c = 0; c < array.length; c++){
                    System.out.print(array[c]+" ");
                }
            }else{
                System.err.println("El incremento no puede ser 0");
            }
        }else{
            System.err.println("El array tine que tener elementos");
        }
    }
    
}
