/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;
import java.util.Scanner;
/**
 *
 * @author aitor
 */
public class Ej12 {

   
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int num;
        System.out.print("Introduce un numero: ");
        num=entry.nextInt();
        if (num>=0){
            System.out.println("Es positivo");
        } else{
            System.out.println("Es negativo");
        }
    }
    
}
