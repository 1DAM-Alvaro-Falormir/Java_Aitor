/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14_aitor;

/**
 *
 * @author Aitor
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc.
 * Hasta introducir 10 diez veces, y luego la muestre por pantalla.
 */
public class Ej14_Aitor {

    public static void main(String[] args) {
        int num[];
        int i = 0, j = 0, cuantos = 0, posicion = 0;
        
        for(i = 1; i <= 10; i++){
            cuantos += i;
        }
        
        num = new int[cuantos];
        
        for (i = 1; i <= 10; i++){
            for (j= 0; j < i; j++){
                num[posicion] = i;
                posicion++;
            }
        }
        
        System.out.println("Este es el valor del vector.");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
}
