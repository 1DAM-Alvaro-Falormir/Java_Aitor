/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;
import java.util.Scanner;
/**
 *
 * @author ciber
 */
public class Ej7 {


    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int millas;
        int metros;
        System.out.print("Conversor de millas maritimas a metros. Introduzca un valor: ");
        millas=entry.nextInt();
        metros=millas*1852;
        System.out.println("La distancia en metros es: "+metros);
    }
    
}
