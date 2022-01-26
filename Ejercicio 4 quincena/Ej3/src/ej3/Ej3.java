/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;
import java.util.Scanner;
/**
 *
 * @author aitor
 */
public class Ej3 {

    public static void main(String[] args) {
        Scanner lados = new Scanner(System.in);
        int lado;
        int area;
        System.out.print("Introduce un numero positivo para calcular el area de un cuadrado: ");
        lado = lados.nextInt();
        area = lado * lado;
        System.out.println("Este es el area del cuadrado: " + area);
    }
    
}
