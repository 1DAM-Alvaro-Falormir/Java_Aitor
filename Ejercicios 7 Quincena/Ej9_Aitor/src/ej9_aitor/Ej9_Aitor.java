/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_aitor;

import java.util.Scanner;

/**
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál
 * de ellos es el más elevado.
 * @author Aitor
 */
public class Ej9_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, masGrande;
        
        System.out.print("Introducza el primer valor entero: ");
        a = sc.nextInt();
        System.out.print("Introduzca el segundo valor entero: ");
        b = sc.nextInt();
        System.out.print("Introduzca el tercer valor entero: ");
        c = sc.nextInt();
        
        masGrande = maximo(a, b);
        masGrande = maximo(masGrande, c);
        
        System.out.println(masGrande+" es el numero mas elevado.");
    }
    
    public static int maximo(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }
    
}
