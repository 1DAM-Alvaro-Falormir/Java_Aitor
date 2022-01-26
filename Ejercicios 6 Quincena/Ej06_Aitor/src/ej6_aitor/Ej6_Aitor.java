/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_aitor;
import java.util.*;

/**
 *
 * @author aitor
 * Crea un programa que pida dos valores enteros N y M, luego cree
 * un array de tamaño N, escriba M en todas sus posiciones y lo muestre por
 * pantalla.
 * 
 */
public class Ej6_Aitor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int num[];
        System.out.println("Bienvenido a un programa donde introduce dos valores"
                +"los cuales son el tamaño del vector y los numeros dentro");
        System.out.print("Introduzca el tamaño del vector: ");
        n = sc.nextInt();
        System.out.print("Introduzca el numeros a rellenar: ");
        m = sc.nextInt();
        if (n == 0){
            System.err.println("El vector no puede ser de 0 valores.");
        }
        else {
            num = new int[n];
            Arrays.fill(num, m);
            for (int i = 0; i < num.length; i++){
                System.out.print(num[i]+" ");
            }
        }
        
    }
    
}
