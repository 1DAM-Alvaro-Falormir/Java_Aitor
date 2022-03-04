/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejoblig_9q_aitor;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase Principal del programa de la empresa
 * @author Aitor
 */
public class EjOblig_9Q_Aitor {

    /**
     * Metodo principal del programa donde hay un menu con 3 casos de uso
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList listaPrecios;
        ListaAlquiler lista = new ListaAlquiler();
        int opcion = 0;
        String tipo, matricula;
        int dias, plazas, pma;
        boolean asser = false, asser2 = false;
        float precio;

        System.out.println("Bienvenido a la aplicación para calcular los precios de alquiler de la empresa.");
        do {
            System.out.println("-------------MENU-------------"
                    + "\n \tSeleccione una opcion."
                    + "\n1.\tAñade Vehículo."
                    + "\n2.\tObetener precio alquiler."
                    + "\n3.\tMuestra todos los precios."
                    + "\n4.\tSalir.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Introduzca el tipo de vehiculo"
                                + " 'coche', 'microbus', 'furgoneta', 'camion'");
                        tipo = sc.next();
                        asser = Comprobacion.comprobarTipo(tipo);
                        if (asser) {
                            do {
                                if (tipo.equalsIgnoreCase("coche")) {
                                    System.out.print("Digame la matrícula del vehículo (formato de matrícula '1234ASD'): ");
                                    matricula = sc.next();
                                    System.out.print("Digame el numero de plazas del vehículo: ");
                                    plazas = sc.nextInt();
                                    asser = Comprobacion.comprobarMatricula(matricula);
                                    asser2 = Comprobacion.comprobarInt(plazas);
                                    if (asser && asser2) {
                                        lista.addAuto(new Coche(matricula, plazas));
                                    } else {
                                        System.err.println("Datos introducidos incorrectos, vuelva a intentarlo.");
                                    }
                                } else if (tipo.equalsIgnoreCase("microbus")) {
                                    System.out.print("Digame la matrícula del vehículo (formato de matrícula '1234ASD'): ");
                                    matricula = sc.next();
                                    System.out.print("Digame el numero de plazas del vehículo: ");
                                    plazas = sc.nextInt();
                                    asser = Comprobacion.comprobarMatricula(matricula);
                                    asser2 = Comprobacion.comprobarInt(plazas);
                                    if (asser && asser2) {
                                        lista.addAuto(new MicroBus(matricula, plazas));
                                    } else {
                                        System.err.println("Datos introducidos incorrectos, vuelva a intentarlo.");
                                    }
                                } else if (tipo.equalsIgnoreCase("furgoneta")) {
                                    System.out.print("Digame la matrícula del vehículo (formato de matrícula '1234ASD'): ");
                                    matricula = sc.next();
                                    System.out.print("Digame el peso máximo autorizado en toneladas del vehículo: ");
                                    pma = sc.nextInt();
                                    asser = Comprobacion.comprobarMatricula(matricula);
                                    asser2 = Comprobacion.comprobarInt(pma);
                                    if (asser && asser2) {
                                        lista.addAuto(new FurgonetaCarga(matricula, pma));
                                    } else {
                                        System.err.println("Datos introducidos incorrectos, vuelva a intentarlo.");
                                    }
                                } else if (tipo.equalsIgnoreCase("camion")) {
                                    System.out.print("Digame la matrícula del vehículo (formato de matrícula '1234ASD'): ");
                                    matricula = sc.next();
                                    asser = Comprobacion.comprobarMatricula(matricula);
                                    asser2 = true;
                                    if (asser && asser2) {
                                        lista.addAuto(new Camion(matricula));
                                    } else {
                                        System.err.println("Matrícula introducida incorrecta, vuelva a intentarlo.");
                                    }
                                }
                            } while (!asser || !asser2);

                        } else {
                            System.out.println("Tipo no admitido, introduzca un tipo admitido");
                        }
                    } while (!asser);
                    break;
                case 2:
                    do {
                        System.out.print("Introduzca la matrícula del vehículo (formato de matrícula '1234ASD'): ");
                        matricula = sc.next();
                        System.out.print("Introduzca los dias que ha durado el alquiler: ");
                        dias = sc.nextInt();
                        asser = Comprobacion.comprobarMatricula(matricula);
                        asser2 = Comprobacion.comprobarInt(dias);
                        if (asser && asser2) {
                            precio = lista.ObtenerPrecio(matricula, dias);
                            if (precio != -1) {
                                System.out.println("El precio del alquiler son " + precio + "€.");
                            } else {
                                System.out.println("La matrícula introducida no existe en la lista de vehículos.");
                            }
                        } else {
                            System.err.println("Datos introducidos no tienen el formato correcto, vuelva a intentarlo.");
                        }
                    } while (!asser || !asser2);
                    break;
                case 3:
                    do {
                        System.out.print("Introduzca los dias que ha durado el alquiler: ");
                        dias = sc.nextInt();
                        asser = Comprobacion.comprobarInt(dias);
                        if (asser) {
                            listaPrecios = lista.MostrarPrecioTodos(dias);
                            Iterator it = listaPrecios.iterator();
                            while (it.hasNext()) {
                                System.out.println(it.next());
                            }
                        } else {
                            System.out.println("Los dias que ha durado el alquiler no pueden ser 0 o menos");
                        }
                    } while (!asser);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no existente, vuelva a introducirla porfavor.");
                    break;
            }
        } while (opcion != 4);

    }

}
