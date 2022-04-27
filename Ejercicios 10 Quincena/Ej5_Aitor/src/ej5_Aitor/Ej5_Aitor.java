/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_Aitor;


/**
 *
 * @author Aitor
 */
public class Ej5_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 50, i = 0;

        for (i = 0; i < 10; i++) {
            
            try {
                num = 50;
                num -= (int) (1 + Math.random() * 100);
                imprimePositivo(num);
                num += num -= (int) (1 + Math.random() * 100);
                imprimeNegativo(num);
            }
            
            catch (ExpectedPositiveNumber n) {
                System.out.println("El numero no es positivo");
            }
            
            catch (ExpectedNegativeNumber ex) {
                System.out.println("El numero no es negativo.");
            }

        }

    }

    public static void imprimePositivo(int p) throws ExpectedPositiveNumber {

        System.out.println(p);

        if (p < 0) {
            throw new ExpectedPositiveNumber(p);
        }
    }

    public static void imprimeNegativo(int n) throws ExpectedNegativeNumber {
        System.out.println(n);

        if (n > 0) {
            throw new ExpectedNegativeNumber(n);
        }
    }

}
