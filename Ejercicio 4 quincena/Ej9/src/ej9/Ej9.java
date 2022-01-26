/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;
import java.util.Scanner;
/**
 *
 * @author aitor
 */
public class Ej9 {

   
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int edad;
        System.out.print("Dime tu edad: ");
        edad=entry.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    
}
