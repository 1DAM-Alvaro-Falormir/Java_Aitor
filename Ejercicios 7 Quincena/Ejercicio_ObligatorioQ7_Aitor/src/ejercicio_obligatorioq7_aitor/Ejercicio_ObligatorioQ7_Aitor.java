/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_obligatorioq7_aitor;
import java.util.Scanner;
import metodos.function;

/**
 *
 * @author aitor
 */
public class Ejercicio_ObligatorioQ7_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numContrato;
        double precioContrato, potenciaContrato, importe, incremento, aPagar, total = 0;
        int kw;
        boolean finish = false;
        char confirmar = 'S';
        
        System.out.println("Bienvenido al programa para calcular la tarifa a cobrar.");
        do{
            numContrato = function.numeroContrato();
            precioContrato = function.precioContrato();
            potenciaContrato = function.potenciaContrato(precioContrato);
            kw = function.kWConsumidos();
            importe = function.calcularImporte(kw, precioContrato);
            incremento = function.calcularIncremento(kw);
            aPagar = function.precioAPagar(incremento, importe);
            total += aPagar;
            
            System.out.println("Los datos del cliente son los siguientes:");
            System.out.println("Su numero de contrato: "+numContrato);
            System.out.println("El total de su consumo de kW: "+kw);
            System.out.println("La potencia contratada: "+potenciaContrato);
            System.out.println("El incremento es del "+(incremento*100)+"% y el precio a pagar es de: "+String.format("%.2f", aPagar)+" euros");
            
            System.out.println("\n¿Quiere seguir introduciendo clientes? S/n ");
            confirmar = sc.nextLine().charAt(0);
            if (confirmar == 'N' || confirmar == 'n')
                finish = true;
            else
                finish = false;
            
        }while(finish == false);
        
        System.out.println("El total de kW facturados son: "+String.format("%.2f", total)+" euros");
    }
    
}
