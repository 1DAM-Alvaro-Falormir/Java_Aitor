/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15_aitor;

/**
 * Escribe un programa que cree un array de tamaño 100 con los primeros 100
 * números naturales. Luego muestra la suma total y la media. Implementa una
 * función que calcule la suma de un array y otra que calcule la media de un
 * array
 * @author Aitor
 */
public class Ej15_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[100];
        
        for(int i = 0; i < array.length; i++)
            array[i] = i + 1;
        
        System.out.println("Esta es la suma de todos los numeros del array: "+sumaArray(array));
        System.out.println("");
        System.out.println("Esta es la media de todos los numeros del array: "+mediaArray(array));
    }
    
    public static int sumaArray(int[] a){
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }
    
    public static double mediaArray(int[] a){
        double media = 0;
        for (int i = 0; i < a.length; i++)
            media += a[i];
        media = media / a.length;
        return media;
    }
    
}
