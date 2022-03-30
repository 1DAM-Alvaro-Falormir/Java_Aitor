/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_aitor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Ej4_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        int rng = (int) (1 + Math.random() * 100), pos = 1;
        vector = new int[rng];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (1 + Math.random() * 10);
        }
        
        
        while(pos > 0){
            System.out.println("Para salir introduce un valor negativo.");
            try{
                System.out.print("Introduce una poscion del vector: ");
                pos = sc.nextInt();
                System.out.println("Este es el valor en la posicion "+pos+": "+vector[pos]);
            }
            
            catch(InputMismatchException ex){
                System.out.println("Valor introducido incorrecto.");
                sc.nextLine();
            }
            
            catch(ArrayIndexOutOfBoundsException exc){
                if(pos > 0)
                    System.out.println("Esta posicion no existe");
            }
            
        }
    }
    
}
