/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej05b_aitor;
import java.util.Scanner;

/**
 *
 * @author aitor
 * Realiza un programa que lea una frase por teclado e indique si
 * la frase es un palíndromo o no (ignorando espacios y sin diferenciar entre
 * mayúsculas y minúsculas). Supondremos que el usuario solo introducirá letras
 * y espacios (ni comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto
 * que se lee igual de izquierda a derecha que de derecha a izquierda. Por
 * ejemplo: 
 * Amigo no gima 
 * Dabale arroz a la zorra el abad
 * Amo la pacífica paloma
 * A man a plan a canal Panama
 */
public class Ej05B_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, invertir = "";
        int i;
        
        System.out.println("Bienvenido a un programa donde escribira una frase y se le dira si es un palíndromo.");
        System.out.println("Introduzca una frase:");
        cadena = sc.nextLine();
        
        cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "");
        
        for (i = cadena.length() -1; i >=0; i--){
            invertir += cadena.charAt(i);
        }
        
        if (invertir.equals(cadena)){
            System.out.println("Tu frase es un palíndromo.");
        }
        else {
            System.out.println("Tu frase no es un palíndromo.");
        }
        
    }
    
}
