/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej19_aitor;
import java.util.*;

/**
 *
 * @author Aitor
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores.
 * Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores
 * (habitualmente valores entre 1000 y 2800, de tipo entero)
 * y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja).
 */
public class Ej19_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[8];
        int i, puesto = 1;
        
        System.out.println("Bienvenido a un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores.");
        
        for (i = 0; i < array.length; i++){
            System.out.print("Introduce una puntuación: ");
            array[i] = sc.nextInt();
        }
        
        for (i = 0; i < array.length; i++){
            array[i] = array[i] * -1;
        }
        Arrays.sort(array);
        
        for (i = 0; i < array.length; i++){
            array[i] = array[i] * -1;
        }
        
        System.out.println("Estas son las puntuaciones de los jugados ordenadas en orden descendiente:");
        for (i = 0; i < array.length; i++){
            System.out.println(puesto+"º "+array[i]);
            puesto++;
        }
    
    }
    
}
