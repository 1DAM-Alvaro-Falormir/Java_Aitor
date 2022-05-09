/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb1_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aitgal
 */
public class EjB1_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max, min, num;
        try{
            File f = new File("Documentos/numeros.txt");
            Scanner sc = new Scanner(f);
            
            max = sc.nextInt();
            min = max;
            
            do{
                num = sc.nextInt();
                if(num > max)
                    max = num;
                if(num < min)
                    min = num;
            }
            while(sc.hasNextInt());
            
            System.out.println("Este es el valor maximo dentro de " + f.getName() +": " + max);
            System.out.println("Este es el valor minimo dentro de " + f.getName() + ": "+ min);
        
            sc.close(); 
        }
        
        
        
        catch(FileNotFoundException e){
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
        
        
        
    }
    
}
