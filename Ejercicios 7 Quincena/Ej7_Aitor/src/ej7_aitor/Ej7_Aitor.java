/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7_aitor;

import java.util.Scanner;

/**
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
 * pantalla su área y su perímetro.
 * @author Aitor
 */
public class Ej7_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ancho, alto;
        
        System.out.print("Dame la anchura de un rectángulo: ");
        ancho = sc.nextDouble();
        System.out.print("Dame la altura del rectángulo: ");
        alto = sc.nextDouble();
        
        System.out.println("El perímetro del rectángulo es: "+perimetroRectangulo(ancho, alto));
        System.out.println("El área del rectángulo es: "+areaRectangulo(ancho, alto));
    }
    
    public static double perimetroRectangulo(double ancho, double alto){
        return 2*ancho + 2*alto;
    }
    
    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
    
}
