/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ej13 {

   
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce un numero: ");
        num1=entry.nextInt();
        System.out.print("Introduce otro numero: ");
        num2=entry.nextInt();
        if (num1>num2){
            System.out.println(num2);
            System.out.println(num1);
        } else{
            System.out.println(num1);
            System.out.println(num2);
        }
    }
    
}
