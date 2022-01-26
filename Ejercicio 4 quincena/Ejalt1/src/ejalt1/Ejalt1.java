/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejalt1;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ejalt1 {

    public static void main(String[] args) {
        System.out.println("Bienvenido a un programa donde se indica el numero central de tres numeros introducidos por teclado.");
        Scanner entry = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduce un numero: ");
        num1 = entry.nextInt();
        System.out.print("Introduce un segundo numero: ");
        num2 = entry.nextInt();
        System.out.print("Introduce un tercer numero: ");
        num3 = entry.nextInt();
        if (num1 != num2 & num1 != num3 & num2 != num3) {
            if (num1 > num2 & num1 < num3) {
                System.out.println(num1 + " es el numero central.");
            } else if (num2 > num1 & num2 < num3) {
                System.out.println(num2 + " es el numero central");
            } else {
                System.out.println(num3 + " es el numero central");
            }
        } else {
            System.out.println("Hay valores iguales");
        }
    }

}
