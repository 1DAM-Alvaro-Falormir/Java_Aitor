/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Aitor
 */
public class function {
    
    /**
     * 
     * @param d
     * @return 
     */
    
    public static String numeroContrato(String d){
        Scanner sc = new Scanner(System.in);
        Pattern valid = Pattern.compile("^\\d{3}-\\d{4}$");
        boolean sigue = false;
        
        System.out.print("Introduzca su numero de contrato, tiene que tener\n"
                        +"el siguiente formato(ddd-dddd) donde d es un numero: ");
        d = sc.nextLine();
        if (valid.matcher(d).matches()){
            System.out.println("Formato correcto.");
        }
        else{
            do{
                System.out.println("No es un formato correcto, introducelo de nuevo.");
                d = sc.nextLine();
                if (valid.matcher(d).matches())
                    sigue = true;
                
            }while(sigue == false);
        }
        return d;
    }
    
    public static double potenciaContrato(double p){
        Scanner sc = new Scanner(System.in);
        boolean listo = false;
        System.out.println("Digame su potencia contratada. Aqui tiene una tabla:\n"
                + " 3,45\n"
                + " 4,60\n"
                + " 5,75\n"
                + " 6,90\n"
                + " 8,05");
        p = sc.nextDouble();
        do{
            if (p == 3.45){
                listo = true;
            }
            else if (p == 4.60){
                listo = true;
            }
            else if (p == 5.75){
                listo = true;
            }
            else if (p == 6.90){
                listo = true;
            }
            else if (p == 8.05){
                listo = true;
            }
            else{
                System.out.println("No existe ese plan. Introduce el plan de nuevo: ");
                p = sc.nextDouble();
                listo = false;
            }
        }while(listo == false);        
        return p;
    }
    
    public static int kWConsumidos(int c){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digame el total de kW consumidos en el mes: ");
        c = sc.nextInt();
        
        return c;
    }
    
    public static double calcularImporte(int c, double p){
        double total;
        switch(c){
            case
        }
        
    }
    
    public static double calcularIncremento(int c){
        
    }
    
}
