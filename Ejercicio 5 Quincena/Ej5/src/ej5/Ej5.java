/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ej5 {


    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num,solu = 1;
        System.out.print("Introduce un numero positivo para hacer el factorial: ");
        num = entry.nextInt();
        for (int i = 1; i <= num; i++){
            solu = solu * i;
        }
        System.out.println("El numero factorial de "+num+" es: "+solu);
    }
    
}
