/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejobligatorio;
import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class EjObligatorio {

    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int dia,mes,year;
        System.out.println("Bienvenido, introduzca una fecha para que se le muestre la fecha despues de siete dias.");
        System.out.print("Escribe un dia: ");
        dia=entry.nextInt();
        System.out.print("Escribe un mes en numero: ");
        mes=entry.nextInt();
        System.out.print("Escribe un año: ");
        year=entry.nextInt();
        if (year >0){
            switch (mes) {
                case 1:
                    if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/enero/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        System.out.println(dia+"/febrero/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 2:
                    if (dia>0&dia<=21){
                        dia= dia+7;
                        System.out.println(dia+"/febrero/"+year);
                    } else if (dia>0&dia>21&dia<=28){
                        dia=dia-21;
                        System.out.println(dia+"/marzo/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 3:
                     if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/marzo/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        System.out.println(dia+"/abril/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 4:
                    if (dia>0&dia<=23){
                        dia= dia+7;
                        System.out.println(dia+"/abril/"+year);
                    } else if (dia>0&dia>23&dia<=30){
                        dia=dia-23;
                        System.out.println(dia+"/mayo/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 5:
                    if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/mayo/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        System.out.println(dia+"/junio/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 6:
                     if (dia>0&dia<=23){
                        dia= dia+7;
                        System.out.println(dia+"/junio/"+year);
                    } else if (dia>0&dia>23&dia<=30){
                        dia=dia-24;
                        System.out.println(dia+"/julio/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 7:
                    if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/julio/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        System.out.println(dia+"/agosto/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 8:
                     if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/agosto/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        System.out.println(dia+"/septiembre/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 9:
                     if (dia>0&dia<=23){
                        dia= dia+7;
                        System.out.println(dia+"/septiembre/"+year);
                    } else if (dia>0&dia>23&dia<=30){
                        dia=dia-23;
                        System.out.println(dia+"/octubre/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 10:
                     if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/octubre/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        System.out.println(dia+"/noviembre/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 11:
                    if (dia>0&dia<=23){
                        dia= dia+7;
                        System.out.println(dia+"/noviembre/"+year);
                    } else if (dia>0&dia>23&dia<=30){
                        dia=dia-23;
                        System.out.println(dia+"/diciembre/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                case 12:
                    if (dia>0&dia<=24){
                        dia= dia+7;
                        System.out.println(dia+"/diciembre/"+year);
                    } else if (dia>0&dia>24&dia<=31){
                        dia=dia-24;
                        year++;
                        System.out.println(dia+"/enero/"+year);                        
                    } else {
                         System.err.println("dia incorrecto");
                    }
                    break;
                default:
                    System.err.println("El mes introducido es incorrecto");
                }
            
        } else{
            System.err.println("Año incorrecto, introduzca un año superior a 0");
        }    
    }
    
}
