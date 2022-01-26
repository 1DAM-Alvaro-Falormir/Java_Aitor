/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.Scanner;

/**
 *
 * @author ciber
 */
public class Ej16 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int nota;
        System.out.print("Introduce una nota del 0 al 10: ");
        nota = entry.nextInt();
        if (nota >= 0 && nota <= 10) {
            if (nota >= 9) {
                System.out.println("Sobresaliente");
            } else if (nota >= 6) {
                System.out.println("Notable");
            } else if (nota >= 5) {
                System.out.println("Bien");
            } else if (nota >= 3) {
                System.out.println("Insuficiente");
            } else {
                System.out.println("Muy deficiente");
            }
        } else {
            System.err.println("Nota incorrecta.");
        }
    }
}
