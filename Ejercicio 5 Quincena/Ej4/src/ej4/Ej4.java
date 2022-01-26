/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;
/**
 *
 * @author aitor
 */
public class Ej4 {


    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int max;
        System.out.print("Introduce hasta que numero contar: ");
        max=entry.nextInt();
        for(int i=1; i <= max; i++){
            System.out.print(i);
            System.out.print(" ");
        } System.out.println("");
    }
    
}
