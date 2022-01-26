/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12_aitor;

import java.util.*;

/**
 *
 * @author ciber
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
 * a. Mostrar valores. b. Introducir valor. c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla.
 * La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array.
 * El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */
public class Ej12_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int i = 0, v, p;
        char menu;
        //Declaración de variables
        
        do{
            System.out.println("Bienvenido a un programa con un menu donde habra tres opciones.\n"
            +"'a' para mostrar los valores del array\n"
            +"'b' para introducir un dato en una posicion exacta\n"
            +"'c' para salir");
            
            menu = sc.next().charAt(0);
            if (menu == 'a' || menu == 'b' || menu == 'c'){
                switch(menu){
                case 'a':
                    System.out.print("Estos son los valores del array: ");
                    for(i = 0; i < array.length; i++){
                        System.out.print(array[i]+" ");
                    }
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.print("Introduce el valor: ");
                    v = sc.nextInt();
                    System.out.print("Introduce la posicion(primera posicion '0' ultima posición '9'): ");
                    p = sc.nextInt();
                    
                    if(p < 10 && p >= 0){
                        array[p] = v;
                    }
                    else{
                        System.err.println("posición equivocada");
                    }
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("Gracias por usar el programa.");
                    break;
                }
            }
            else {
                System.err.println("opción equivocada.");
            }
        }while(menu != 'c');
        
    }
    
}
