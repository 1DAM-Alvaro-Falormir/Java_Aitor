/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_aitor;
import java.util.Scanner;

/**
 *
 * @author Aitor
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.
 */
public class Ej1_Aitor {


    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float vector[]= new float[10];
        int i;
        
        System.out.print("introduce 10 numeros reales: ");
        for(i = 0; i < vector.length; i++){
            vector[i]=entry.nextFloat();
        }
        
        System.out.print("Este es el vector introducido: ");
        for(i = 0; i < vector.length; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.print("\n");
    }
    
}
