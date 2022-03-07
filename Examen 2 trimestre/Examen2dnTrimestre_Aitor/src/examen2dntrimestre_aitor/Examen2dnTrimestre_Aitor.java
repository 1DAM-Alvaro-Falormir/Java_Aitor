/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2dntrimestre_aitor;

import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Examen2dnTrimestre_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaElectrodomesticos lista = new ListaElectrodomesticos();
        int opcion, peso, choice, carga;
        double precioBase;
        float res;
        String nombre, color;
        char consumo;
        boolean wifi;

        System.out.println("Bienvenido al programa.");

        do {
            System.out.println("----------MENU----------"
                    + "\n1.\tAñadir un electrodoméstico."
                    + "\n2.\tMostrar todos los electrodomésticos con su precio final."
                    + "\n3.\tBorrar un electrodoméstico con su nombre."
                    + "\n4.\tMostrar las lavadoras de más de 8 kg de carga."
                    + "\n5.\tSalir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Que quiere añadir?"
                                + "\n1.\tLavadora."
                                + "\n2.\tTelevisor."
                                + "\n3.\tSalir.");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Introduzca el nombre: ");
                                nombre = sc.next();
                                System.out.print("Introduzca el color (Solo son validos 'blanco', 'negro', 'rojo', 'azul' y 'gris'): ");
                                color = sc.next();
                                System.out.print("Introduzca el precio base: ");
                                precioBase = sc.nextDouble();
                                System.out.print("Introduzca el consumo energético (Solo son validas de la A hasta la F en mayúsculas): ");
                                consumo = sc.next().charAt(0);
                                System.out.print("Introduzca el peso: ");
                                peso = sc.nextInt();
                                System.out.print("Introduzca la carga: ");
                                carga = sc.nextInt();
                                lista.addElectrodomestico(new Lavadora(carga, nombre, precioBase, color, consumo, peso));
                                break;
                            case 2:
                                System.out.print("Introduzca el nombre: ");
                                nombre = sc.next();
                                System.out.print("Introduzca el color (Solo son validos 'blanco', 'negro', 'rojo', 'azul' y 'gris'): ");
                                color = sc.next();
                                System.out.print("Introduzca el precio base: ");
                                precioBase = sc.nextDouble();
                                System.out.print("Introduzca el consumo energético (Solo son validas de la A hasta la F en mayúsculas): ");
                                consumo = sc.next().charAt(0);
                                System.out.print("Introduzca el peso: ");
                                peso = sc.nextInt();
                                System.out.print("Introduzca las pulgadas: ");
                                res = sc.nextFloat();
                                System.out.print("Introduzca si tiene wifi (true/false): ");
                                wifi = sc.nextBoolean();
                                lista.addTelevision(new Television(res, wifi, nombre, precioBase, color, consumo, peso));
                        }
                    } while (choice != 3);
                    break;
                case 2:
                    lista.mostrarAllElectrodomesticos();
                    break;
                case 3:
                    System.out.print("Diga el nombre del electrodomestico a boorar: ");
                    nombre = sc.next();
                    lista.delElectrodomestico(nombre);
                    break;
                case 4:
                    lista.mostrarLavadoras8Kg();
                    break;
                case 5:
                    break;
            }

        } while (opcion != 5);
    }

}
