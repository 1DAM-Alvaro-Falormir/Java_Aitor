/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_aitor;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Ej1_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        try{
            System.out.print("Introduce un valor entero: ");
            a = sc.nextInt();
            System.out.println("Valor introducido: "+a);
        }
        
        catch(InputMismatchException ex){
            System.out.println("Valor introducido incorrecto");
        }
        
    }
    
}
