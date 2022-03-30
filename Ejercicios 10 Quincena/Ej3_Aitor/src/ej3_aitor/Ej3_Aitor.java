/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_aitor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Ej3_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        
        for (int i = 0; i < vector.length; i++) {
            try{
                System.out.print("Introduzca un numero real: ");
                vector[i] = sc.nextDouble();
            }
            catch(InputMismatchException ex){
                System.out.println("Valor introducido incorrecto.");
                sc.nextLine();
                i--;
            }
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+", ");
        }
        
    }
    
}
