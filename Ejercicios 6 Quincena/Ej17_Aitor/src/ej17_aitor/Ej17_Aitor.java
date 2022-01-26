/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17_aitor;
import java.util.*;

/**
 *
 * @author ciber
 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en otro array.
 * Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
 */
public class Ej17_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[10];
        int array2[] = new int[10];
        int i = 0;
        
        System.out.println("Bienvenido a un programa donde introduciras 20 numeros enteros y en dos arrays distintos y se compararan entre ellos.");
        
        for (i = 0; i < array1.length; i++){
            System.out.print("Introduzca un entero: ");
            array1[i] = sc.nextInt();
        }
        
        for (i = 0; i < array2.length; i++){
            System.out.print("Introduzca un entero: ");
            array2[i] = sc.nextInt();
        }
        
        
        if (Arrays.equals(array1, array2)){
            System.out.println("Los arrays son iguales");
        }
        else{
            System.out.println("Los arrays son diferentes");
        }
    }
    
}
