/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;
import java.util.Scanner;
/**
 *
 * @author aitor
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numx = new Scanner(System.in);
        int num1,num2,suma,resta,prod,divi;
        System.out.print("Dame un numero positivo: ");
        num1=numx.nextInt();
        System.out.print("Dame un segundo numero: ");
        num2=numx.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        prod=num1*num2;
        divi=num1/num2;
        System.out.println("Esta es la suma de los dos numeros: "+suma+", esta es la resta: "+resta+", esta es la multipicacion: "+prod+", y esta es la division: "+divi);
        
    }
    
}
