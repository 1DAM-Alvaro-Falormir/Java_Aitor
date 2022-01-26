/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej03b_aitor;
import java.util.*;

/**
 *
 * @author aitor
 * Crea un programa que pida por teclado tres cadenas de texto:
 * nombre y dos apellidos. Luego mostrará un código de usuario (en mayúsculas)
 * formado por la concatenación de las tres primeras letras de cada uno de
 * ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará
 * “LIOTARALC”.
 */
public class Ej03B_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, apellido2, user;
        
        System.out.println("Bienvenido a un programa donde se creara un códigode usuario a partir de tu nombre y apellidos.");
        System.out.println("Introduce tu nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce tu primer apellido:");
        apellido = sc.nextLine();
        System.out.println("Introduce tu segundo apellido:");
        apellido2 = sc.nextLine();
        
        user = nombre.substring(0, 3);
        user += apellido.substring(0, 3);
        user += apellido2.substring(0, 3);
        user = user.toUpperCase();
        
        System.out.println("Tu código de usuario es: "+user);
    }
    
}
