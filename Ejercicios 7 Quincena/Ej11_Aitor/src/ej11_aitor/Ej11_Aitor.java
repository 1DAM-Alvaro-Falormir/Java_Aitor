/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11_aitor;

import java.util.Scanner;

/**
 * Realiza un programa que escriba la tabla de multiplicar de un número
 * introducido por teclado. Para ello implementa una función que reciba como
 * parámetro un número entero y muestre por pantalla la tabla de multiplicar de
 * dicho número.

 * @author Aitor
 */
public class Ej11_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Introduce un entero para ver su tabla de multiplicar hasta el 10: ");
        a = sc.nextInt();
        
        tablaMultiplica(a);
    }
    
    /**
     * 
     * @param a 
     */
    
    public static void tablaMultiplica(int a){
        for (int i = 1; i <= 10; i++){
            System.out.println("Esta es la tabla de multiplicar del "+a+": "+(i*a));
        }
    }
    
}
