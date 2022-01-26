/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_aitor;

import java.util.Scanner;

/**
 * Escribe un programa que pida un número entero por teclado y muestre por
 * pantalla si es positivo, negativo o cero.
 * @author Aitor
 */
public class Ej4_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Introduza un numero entero: ");
        a = sc.nextInt();
        
        switch(dimeSigno(a)){
            case 1:
                System.out.println(a+" es positivo");
                break;
            case 0:
                System.out.println(a+" es igual a cero");
                break;
            case -1:
                System.out.println(a+" es negativo");
                break;
        }
    }
    
    public static int dimeSigno(int a){
        if (a > 0)
            return 1;
        else if (a < 0)
            return -1;
        else
            return 0;
    }
}
