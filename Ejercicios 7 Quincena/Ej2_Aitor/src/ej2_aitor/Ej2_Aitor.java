/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_aitor;
import java.util.Scanner;

/**
 * Escribe un programa que pida la edad por teclado y muestre por pantalla si
 * eres mayor de edad o no
 * @author aitor
 */
public class Ej2_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();
        
        if (esMayorEdad(edad))
            System.out.println("Eres mayor de edad.");
        else
            System.out.println("No eres mayor de edad.");
    }
    
    public static boolean esMayorEdad(int a){
        return a>=18;
    }
}
