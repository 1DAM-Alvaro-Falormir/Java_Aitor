/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author ciber
 */
public class Ej7 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num, contpos = 0, contneg = 0;
        boolean neg = false;
        System.out.println("Introduce 10 numeros no nulos y el programa te dira cuantos positivos y negativos has puesto.");
        for (int i = 0; i < 10; i++) {
            num = entry.nextInt();
            if (num != 0) {
                if (num < 0) {
                    contneg++;
                } else {
                    contpos++;
                }
            }
            else{
                System.err.println("No introduzcas el numero 0.");
            }

        }
        System.out.println("Se han leido "+contneg+" numeros negativos y "+contneg+" numeros negativos.");
    }
}
