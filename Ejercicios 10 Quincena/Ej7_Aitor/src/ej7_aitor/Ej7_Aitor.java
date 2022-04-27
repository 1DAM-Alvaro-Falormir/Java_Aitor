/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7_aitor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Ej7_Aitor {

    /**
     * @param args the command line arguments
     * @throws ej7_aitor.ExpectedNegativeNumberException
     * @throws ej7_aitor.ExpectedValidNameException
     */
    public static void main(String[] args) throws ExpectedNegativeNumberException, ExpectedValidNameException {
        ArrayList<Gato> listaGatos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad, cont = 0;
        Gato gato;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Introduce el nombre de un gato:");
                nombre = sc.next();
                System.out.println("Introduce la edad de un gato:");
                edad = sc.nextInt();
                gato = new Gato(nombre, edad);
                listaGatos.add(gato);
            } 
            
            catch (ExpectedNegativeNumberException e) {
                System.out.println("La edad no puede ser negativa");
                i--;
            } 
            
            catch (ExpectedValidNameException ex) {
                System.out.println("El nombre tiene que tener un minimo de tres letras");
                i--;
            }

        }

        while (cont < listaGatos.size()) {
            gato = listaGatos.get(cont);
            gato.imprime();
            cont++;
        }

    }

}
