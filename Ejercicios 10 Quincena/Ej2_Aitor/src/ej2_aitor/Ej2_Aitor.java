/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_aitor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Ej2_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        try{
            System.out.print("Introduzca un valor entero A: ");
            a = sc.nextInt();
            System.out.print("Introduzca un valor entero B: ");
            b = sc.nextInt();
            
            System.out.println("Este es el resultado de "+a+"/"+b+": "+a/b);
        }
        
        catch(InputMismatchException ex){
            System.out.println("Valor introducido incorrecto");
        }
        
        catch(ArithmeticException ar){
            System.out.println("No se puede dividir entre 0");
        }
    }
    
}
