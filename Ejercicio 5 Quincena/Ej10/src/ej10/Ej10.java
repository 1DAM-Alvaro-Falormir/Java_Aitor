/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author ciber
 */
public class Ej10 {

    public static void main(String[] args) {
        double nota;
        boolean diez = false;
        Scanner entry = new Scanner(System.in);
        System.out.println("Bienvenido a un programa el cual lee una secuencia de notas hasta que introduzcas '-1' y te dira si ha habido algun 10.");
        nota=entry.nextDouble();
        while(nota != -1){
            if (nota ==10){
                    diez = true;
            }
            System.out.println("Introduzca otra nota: ");
            nota=entry.nextDouble();
            
        }
        if (diez){
            System.out.println("Se ha leido algun 10.");
        }
        else if (diez == false) {
            System.out.println("No se han leido ningun 10.");
        }
        
    }
    
}
