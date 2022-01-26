/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej20_aitor;

import java.util.*;
import java.util.stream.IntStream;

/**
 *
 * @author Aitor
 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99 (utiliza Math.random()*100).
 * Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces.
 */
public class Ej20_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[1000];
        int i = 0, n, cont = 0;
        boolean test;
        
        System.out.println("Bienvenido a un programa con un array de tamaño 1000 con valores enteros aleatorios entre 0 y 99");
        for (i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.print("Dime un valor y te mostrare si existe en el array y cuantas veces esta: ");
        n = sc.nextInt();
        test = IntStream.of(arr).anyMatch(x -> x == n);
        //Variable donde se usa un metodo de la clase stream para verificar si N esta en el array.
        
        for (i = 0; i < arr.length; i++){
            if (arr[i] == n){
                cont++;
            }
        }
        if(test){
            System.out.println(n+" existe en el array");
        }
        else{
            System.out.println(n+" no existe en el array");
        }
        System.out.println(n+" se ha visto en el array "+cont+" veces.");
        
    }
    
}
