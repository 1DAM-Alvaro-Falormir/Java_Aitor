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
     * Metodo para pedir el número de contrato.
     * @return Devuelve un String con el número de contrato.
     */
    
    public static String numeroContrato(){
        Scanner sc = new Scanner(System.in);
        String d;
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
    
    /**
     * Metodo para pedir la potencia contratada.
     * @return Devuelve el precio segun la tarifa introducida.
     */
    
    public static double precioContrato(){
        Scanner sc = new Scanner(System.in);
        boolean listo = false;
        double tarifa = 0, p = 0;
        System.out.println("Digame su potencia contratada. Aqui tiene una tabla:\n"
                + " 3.45\n"
                + " 4.60\n"
                + " 5.75\n"
                + " 6.90\n"
                + " 8.05");
        p = sc.nextDouble();
        do{
            if (p == 3.45){
                listo = true;
                tarifa = 10.23;
            }
            else if (p == 4.60){
                listo = true;
                tarifa = 14.45;
            }
            else if (p == 5.75){
                listo = true;
                tarifa = 18.69;
            }
            else if (p == 6.90){
                listo = true;
                tarifa = 21.34;
            }
            else if (p == 8.05){
                listo = true;
                tarifa = 25.99;
            }
            else{
                System.out.println("No existe ese plan. Introduce el plan de nuevo: ");
                p = sc.nextDouble();
                listo = false;
            }
        }while(listo == false);        
        return tarifa;
    }
    
    /**
     * Metodo para conseguir la potencia contratada
     * @param p Argumento donde se introduce la tarifa de la potencia contratada
     * @return devuelve la potencia contratada.
     */
    
    public static double potenciaContrato(double p){
        double tarifa = 0;
        
        if (p == 10.23)
            tarifa = 3.45;
        else if (p == 14.45)
            tarifa = 4.60;
        else if (p == 18.69)
            tarifa = 5.75;
        else if (p == 21.34)
            tarifa = 6.90;
        else if (p == 25.99)
            tarifa = 8.05;
        return tarifa;
    }
    
    /**
     * Metodo para pedir los kW consumidos.
     * @return Devuelve los kW consumidos en el mes.
     */
    
    public static int kWConsumidos(){
        Scanner sc = new Scanner(System.in);
        boolean listo = false;
        int c;
        System.out.print("Digame el total de kW consumidos en el mes: ");
        c = sc.nextInt();
        if (c > 0)
            listo = true;
        else{
            do{
                System.out.println("El numero de Kw consumidos no puede ser menor a 0");
                c = sc.nextInt();
                if(c > 0)
                    listo = true;
                    
            }while(listo == false);
        }                   
        return c;
    }
    
    /**
     * Metodo para calcular el importe según loos kW consumidos y la potencia contratada.
     * @param c Argumento para introducir los kW consumidos.
     * @param p Argumento para introducir el precio de la potencia contratada.
     * @return Devuelve el importe a pagar sin el incremento.
     */
    
    public static double calcularImporte(int c, double p){
        double kwh = 0.1684, consumo;
        consumo = c * kwh;
        
        return consumo + p;
        
        
    }
    
    /**
     * Metodo para calcular el incremento
     * @param c Argumento para introducir los kW consumidos.
     * @return Devuelve el incremento.
     */
    
    public static double calcularIncremento(int c){
        double incremento = 0;
        if (c <= 150)
            incremento = 0;
        else if (c <= 300)
            incremento = 0.05;
        else if (c <= 400)
            incremento = 0.08;
        else 
            incremento = 0.12;
        return incremento;
    }
    
    public static double precioAPagar(double inc, double imp){
        double incremento;
        
        incremento = inc * imp;
        
        return incremento + imp;
    }
    
}
