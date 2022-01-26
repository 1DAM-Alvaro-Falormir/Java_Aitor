/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej04b_aitor;

import java.util.*;

/**
 *
 * @author aitor Crea un programa que muestre por pantalla cuantas vocales de
 * cada tipo hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por
 * teclado. No se debe diferenciar entre mayúsculas y minúsculas. Por ejemplo
 * dada la frase “Mi mama me mima” dirá que hay: Nº de A's: 3 Nº de E's: 1 Nº de
 * I's: 2 Nº de O's: 0 Nº de U's: 0
 */
public class Ej04B_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int a = 0, e = 0, i = 0, o = 0, u = 0, j;

        System.out.println("Bienvenido a un programa donde se mostraran cuantas vocales y cuales tiene la frase introducida.");
        System.out.println("Introduce una frase:");
        frase = sc.nextLine();
        frase = frase.toLowerCase();

        for (j = 0; j < frase.length(); j++) {
            switch (frase.charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("tu frase: " + frase + ". tiene:\n"
                + "Nº de A's: "+a+"\n"
                + "Nº de E's: "+e+"\n"
                + "Nº de I's: "+i+"\n"
                + "Nº de O's: "+o+"\n"
                + "Nº de U's: "+u+"");

    }

}
