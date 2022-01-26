/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_aitor;
import java.util.*;

/**
 *
 * @author aitor
 * Escribe un programa que pida dos números reales por teclado y
 * muestre por pantalla el resultado de multiplicarlos. Implementa y utiliza la
 * función: double multiplica(double a, double b) // Devuelve la multiplicación
 * de dos números
 */
public class Ej1_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        
        System.out.println("Bienvenido a un programa donde se multiplican dos numeros que has introducido.");
        System.out.print("Introduce el primer valor: ");
        a = sc.nextDouble();
        System.out.print("Introduce el segundo valor: ");
        b = sc.nextDouble();
        
        System.out.println("Este es el resultado de "+a+" * "+b+": "+(multiplica(a, b)));
        
    }
    
    public static double multiplica(double a, double b){
        double multiplica = a * b;
        return multiplica;
    }
    
}
