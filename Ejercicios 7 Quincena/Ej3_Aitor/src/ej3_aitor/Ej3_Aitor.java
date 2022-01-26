/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_aitor;
import java.util.Scanner;

/**
 * Escribe un programa que pida dos números enteros por teclado y muestre por
 * pantalla cual es el mínimo.
 * @author Aitor
 */
public class Ej3_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Introduzca un valor: ");
        a = sc.nextInt();
        System.out.print("Introduzca un valor: ");
        b = sc.nextInt();
        System.out.println(minimo(a, b)+" es el numero minimo.");
    }
    
    public static int minimo(int a, int b){
        if (a > b)
            return b;
        else
            return a;
    }
    
}
