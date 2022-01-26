/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_aitor;

import java.util.*;

/**
 *
 * @author ciber
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 
 * (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
 */
public class Ej9_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[100];
        int n, i = 0;
        
        System.out.println("Bienvenido a un programa donde hay un vector con 100 numeros entre 1 y 10");
        System.out.print("Dime un numero entero entre esos numeros y te mostrare en que posicion esta: ");
        n = sc.nextInt();
        
        if (n > 1 && n < 10){
            for (i = 0; i < num.length; i++) {
                num[i] = (int) (1 + Math.random() * 10);
            }
            
            System.out.print(n+" Esta en las posiciones: ");
            for (i = 0; i < num.length; i++) {
                if(num[i] == n){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.err.println("Numero invalido");
        }
    }
}
