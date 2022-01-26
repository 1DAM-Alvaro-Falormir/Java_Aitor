/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1b_aitor;

import java.util.*;

/**
 *
 * @author aitor
 * Crea un programa que pida una cadena de texto por teclado y
 * luego muestre cada palabra de la cadena en una línea distinta.
 */
public class Ej1B_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int i = 0;

        
        System.out.println("Bienvenido a un programa donde escribes una linea de texto y se muestra cada palabra de la linea en una linea distinta");
        texto = sc.nextLine();
        String[] palabras = texto.split(" ");
        
        for(i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }
        
    }
    
}
