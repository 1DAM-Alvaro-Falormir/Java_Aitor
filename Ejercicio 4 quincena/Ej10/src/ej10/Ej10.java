/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;
import java.util.Scanner;
/**
 *
 * @author aitor
 */
public class Ej10 {


    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        int num1,num2,suma,resta,prod,divi;
        System.out.print("Dime un numero: ");
        num1=entry.nextInt();
        System.out.print("Dime otro numero: ");
        num2=entry.nextInt();
        if (num2==0){
            System.out.println("No se puede dividir por 0");
        } else{
            suma=num1+num2;
            resta=num1-num2;
            prod=num1*num2;
            divi=num1/num2;
            System.out.println("Esta es la suma: "+suma);
            System.out.println("Esta es la resta: "+resta);
            System.out.println("Esta es el producto: "+prod);
            System.out.println("Esta es la division: "+divi);
        }
    }
    
}
