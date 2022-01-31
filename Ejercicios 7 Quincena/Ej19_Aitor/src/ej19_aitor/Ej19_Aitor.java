/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej19_aitor;
import java.util.Scanner;

/**
 * Realiza un programa que permita comprobar si una terna de valores enteros (3
 * valores) se ajusta a la ecuación de Pitágoras: x² + y² = z². El programa
 * solicita al usuario los valores x, y, z. Se deberá crear una función a la que
 * se le pase x, y, z y devuelva si son iguales o no. Por ejemplo: 3² + 4² = 5².
 * 
 * @author Aitor
 */
public class Ej19_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Bienvenido a un programa que permite comprobar si una terna de valores enteros (3 valores) se ajusta a la ecuación de Pitágoras");
        System.out.print("Introduzca el valor x: ");
        x = sc.nextInt();
        System.out.print("Introduzca el valor y: ");
        y = sc.nextInt();
        System.out.print("Introduzca el valor z: ");
        z = sc.nextInt();
        
        if (pitagoras(x, y, z))
            System.out.println("La terna de valores enteros se ajusta a la ecuación de Pitágoras");
        else
            System.out.println("La terna de valores enteros no se ajusta a la ecuación de Pitágoras");
    }
    
    public static boolean pitagoras(int a, int b, int c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
            
    }
    
}
