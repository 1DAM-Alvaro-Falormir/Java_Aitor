/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16_aitor;
import java.util.Scanner;

/**
 * Escribe un programa que cree un array del tamaño indicado por teclado y luego
 * lo rellene con valores aleatorios (utiliza Math.random()). Implementa la
 * función que rellena un array con valores aleatorios.
 * 
 * @author Aitor
 */
public class Ej16_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nA;
        double array[];
        
        System.out.print("Dime la longitud del vector: ");
        nA = sc.nextInt();
        array = new double[nA];
        
        mathRandomArray(array);
    }
    
    public static void mathRandomArray(double[] a){
        for (int i = 0; i < a.length; i++)
            a[i] = Math.random();
    }
    
}
