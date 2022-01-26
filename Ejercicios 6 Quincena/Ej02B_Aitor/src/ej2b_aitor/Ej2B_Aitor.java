/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2b_aitor;
import java.util.*;

/**
 *
 * @author aitor
 * 
 * Crea un programa que pida dos cadenas de texto por teclado y
 * luego indique si son iguales, además de si son iguales sin diferenciar entre
 * mayúsculas y minúsculas.
 */
public class Ej2B_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto1, texto2;
        
        System.out.println("Bienvenido a un programa donde introduce dos cadenas de texto y se le indica si son iguales, ademas de indicar si son iguales sin diferenciar entre mayúsculas y minúsculas.");
        System.out.println("Introduce una cadena de texto:");
        texto1 = sc.nextLine();
        System.out.println("Introduce otra cadena de texto:");
        texto2 = sc.nextLine();
        
        if (texto1.equals(texto2))
            System.out.println("Los textos son iguales.");
        
        else if (texto1.equalsIgnoreCase(texto2))
            System.out.println("Los textos son iguales sin diferenciar entre mayúsculas y minúsculas.");
        
        else
            System.out.println("Los textos son diferentes.");
            
        
    }
    
}
