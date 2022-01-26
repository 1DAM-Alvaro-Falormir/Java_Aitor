/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15_aitor;
import java.util.*;
/**
 *
 * @author Aitor
 * Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M en todas sus posiciones.
 * Luego muestra el array por pantalla.
 */
public class Ej15_Aitor {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double m;
        double num[];
        
        System.out.println("Bienvenido a un programa donde introduce dos valores los cuales son el tamaño del vector y los numeros dentro.");
        System.out.print("Introduzca el tamaño del vector: ");
        n = sc.nextInt();
        System.out.print("Introduzca el numero a rellenar: ");
        m = sc.nextDouble();
        
        if (n == 0){
            System.err.println("El vector no puede ser de 0 valores.");
        }
        else {
            num = new double[n];
            Arrays.fill(num, m);
            for (int i = 0; i < num.length; i++){
                System.out.print(num[i]+" ");
            }
        }
        
    }
    
}
