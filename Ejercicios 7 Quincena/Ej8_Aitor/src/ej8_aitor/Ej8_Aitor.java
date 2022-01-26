/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_aitor;

import java.util.Scanner;

/**
 * Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
 * des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N.
 * @author Aitor
 */
public class Ej8_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduzca el valor maximo para el sumatorio, productorio y el valor intermedio: ");
        n = sc.nextInt();
        
        System.out.println("Este es el sumatorio de "+n+": "+suma1aN(n));
        System.out.println("Este es el productorio de"+n+": "+producto1aN(n));
        System.out.println("Este es el valor intermedio de "+n+": "+intermedio1aN(n));
    }
    
    public static int suma1aN(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++)
            suma += i;
        return suma;
    }
    
    public static int producto1aN(int n){
        int prod = 1;
        for (int i = 1; i <= n; i++)
            prod *= i;
        return prod;
    }
    
    public static double intermedio1aN(int n){
        int media = 0;
        for (int i = 1; i <= n; i++)
            media += i;
        media = media/n;
        return media;
        
        
    }
    
}
