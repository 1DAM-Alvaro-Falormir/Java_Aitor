/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb6_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ciber
 */
public class EjB6_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File pi = new File("pi-million.txt");
        Scanner sc = new Scanner(System.in), scpi;
        String piMillon, piDecimal, num;
        int cont = 0, i = 0, numLength;
        boolean ok = false;

        try {
            scpi = new Scanner(pi);
            piMillon = scpi.next();
            piDecimal = piMillon.substring(2);

            do {
                System.out.println("Escribe un numero positivo: ");
                num = sc.nextLine();
            } while (!num.matches("\\d+"));

            numLength = num.length();
            while (!ok) {
                for (int j = 0; j < piDecimal.length() && ok == false; j++) {
                    if (piDecimal.charAt(i) == num.charAt(cont)) {
                        cont++;
                        i++;
                    } else {
                        cont = 0;
                        i++;
                    }
                    if(cont == numLength){
                        ok = true;
                    }
                }
            }
            
            if(ok)
                System.out.println("El numero " + num + " esta en el primer millon de decimales de pi.");
            else
                System.out.println("El numero " + num + " no esta en el primer millon de decimales de pi");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Ruta no encontrada");
        }
    }

}
