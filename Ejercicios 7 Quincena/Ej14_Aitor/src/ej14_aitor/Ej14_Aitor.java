/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14_aitor;
import java.util.Scanner;

/**
 * Escribe una función que muestre por pantalla un triángulo como el del
 * ejemplo. Deberá recibir dos parámetros: el carácter que se desea imprimir y
 * el número de líneas del triángulo.

 * @author aitgal
 */
public class Ej14_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        int lines;
        
        System.out.print("Introduce el caracter para hacer el triangulo: ");
        c = sc.nextLine().charAt(0);
        System.out.print("Introduce el numero de lineas que tendra el triangulo: ");
        lines = sc.nextInt();
        do{
            if (lines < 1){
                System.out.println("El triangulo debe tener mas de una linea");
                System.out.println("Introduce el numero de lineas otra vez: ");
                lines = sc.nextInt();
            }
        }while(lines < 1 );
        
        triangulo(c, lines);
    }
    
    public static void triangulo(char chara, int nL) {
        int numEsp = nL - 1;
        
        for (int i = 1; i <= nL; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }
            for (int h = 1; h <= i * 2 - 1; h++) {
                System.out.print(chara);
            }
            System.out.println();
            numEsp--;
        }
    }
    
}
