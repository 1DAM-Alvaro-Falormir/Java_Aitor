/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Aitor Rodriguez Gallardo
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int hora, min, dia;
        char confirmar;
        String pais, basura;
        System.out.println("Bienvenido a un programa el cual convierte la hora de España a Japón y viceversa.");
        System.out.println("¿Quieres empezar el programa? (s/n)");
        confirmar = entry.next().charAt(0);
        while (confirmar != 'n' && confirmar != 'N') {
            System.out.println("Introduza de que país es la hora que va ha introducir (Spain/Japan)");
            entry.nextLine();
            pais = entry.nextLine();
            if (pais.equalsIgnoreCase("Spain")) {
                System.out.println("Introduce la hora la cual quieres convertir.(HH MM formato 24h)");
                hora = entry.nextInt();
                min = entry.nextInt();
                System.out.println("Introduce el dia de esa hora. (lunes'1'|martes'2'|etc.)");
                dia = entry.nextInt();
                if (hora >= 0 && hora <= 24 && min >= 0 && min < 60) {
                    switch (dia) {
                        case 1:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del lunes en Japón es 0" + (hora = hora + 8) + ":0" + min + " del lunes.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del lunes en Japón es " + (hora = hora + 8) + ":0" + min + " del lunes.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del lunes en Japón es " + (hora = hora + 8) + ":0" + min + " del lunes.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del lunes en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del martes.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del lunes en Japón es 0" + (hora = hora + 8) + ":" + min + " del lunes.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del lunes en Japón es " + (hora = hora + 8) + ":" + min + " del lunes.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del lunes en Japón es " + (hora = hora + 8) + ":" + min + " del lunes.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del lunes en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del martes.");
                            }
                            break;
                        case 2:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del martes en Japón es 0" + (hora = hora + 8) + ":0" + min + " del martes.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del martes en Japón es " + (hora = hora + 8) + ":0" + min + " del martes.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del martes en Japón es " + (hora = hora + 8) + ":0" + min + " del martes.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del martes en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del miercoles.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del martes en Japón es 0" + (hora = hora + 8) + ":" + min + " del martes.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del martes en Japón es " + (hora = hora + 8) + ":" + min + " del martes.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del martes en Japón es " + (hora = hora + 8) + ":" + min + " del martes.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del martes en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del miercoles.");
                            }
                            break;
                        case 3:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del miercoles en Japón es 0" + (hora = hora + 8) + ":0" + min + " del miercoles.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del miercoles en Japón es " + (hora = hora + 8) + ":0" + min + " del miercoles.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del miercoles en Japón es " + (hora = hora + 8) + ":0" + min + " del miercoles.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del miercoles en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del jueves.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del miercoles en Japón es 0" + (hora = hora + 8) + ":" + min + " del miercoles.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del miercoles en Japón es " + (hora = hora + 8) + ":" + min + " del miercoles.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del miercoles en Japón es " + (hora = hora + 8) + ":" + min + " del miercoles.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del miercoles en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del jueves.");
                            }
                            break;
                        case 4:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del jueves en Japón es 0" + (hora = hora + 8) + ":0" + min + " del jueves.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del jueves en Japón es " + (hora = hora + 8) + ":0" + min + " del jueves.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del jueves en Japón es " + (hora = hora + 8) + ":0" + min + " del jueves.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del jueves en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del viernes.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del jueves en Japón es 0" + (hora = hora + 8) + ":" + min + " del jueves.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del jueves en Japón es " + (hora = hora + 8) + ":" + min + " del jueves.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del jueves en Japón es " + (hora = hora + 8) + ":" + min + " del jueves.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del jueves en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del viernes.");
                            }
                            break;
                        case 5:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del viernes en Japón es 0" + (hora = hora + 8) + ":0" + min + " del viernes.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del viernes en Japón es " + (hora = hora + 8) + ":0" + min + " del viernes.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del viernes en Japón es " + (hora = hora + 8) + ":0" + min + " del viernes.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del viernes en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del sabado.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del viernes en Japón es 0" + (hora = hora + 8) + ":" + min + " del viernes.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del viernes en Japón es " + (hora = hora + 8) + ":" + min + " del viernes.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del viernes en Japón es " + (hora = hora + 8) + ":" + min + " del viernes.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del viernes en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del sabado.");
                            }
                            break;
                        case 6:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del sabado en Japón es 0" + (hora = hora + 8) + ":0" + min + " del sabado.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del sabado en Japón es " + (hora = hora + 8) + ":0" + min + " del sabado.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del sabado en Japón es " + (hora = hora + 8) + ":0" + min + " del sabado.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del sabado en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del domingo.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del sabado en Japón es 0" + (hora = hora + 8) + ":" + min + " del sabado.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del sabado en Japón es " + (hora = hora + 8) + ":" + min + " del sabado.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del sabado en Japón es " + (hora = hora + 8) + ":" + min + " del sabado.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del sabado en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del domingo.");
                            }
                            break;
                        case 7:
                            if (hora < 2 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del domingo en Japón es 0" + (hora = hora + 8) + ":0" + min + " del domingo.");
                            } else if (hora < 9 && min < 10) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del domingo en Japón es " + (hora = hora + 8) + ":0" + min + " del domingo.");
                            } else if (hora < 16 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del domingo en Japón es " + (hora = hora + 8) + ":0" + min + " del domingo.");
                            } else if (hora <= 24 && min < 10) {
                                System.out.println("La hora Española " + hora + ":0" + min + " del domingo en Japón es 0" + (hora = (hora - 24) + 8) + ":0" + min + " del lunes.");
                            } else if (hora < 2) {
                                System.out.println("La hora Española 0" + hora + ":" + min + " del domingo en Japón es 0" + (hora = hora + 8) + ":" + min + " del domingo.");
                            } else if (hora < 9) {
                                System.out.println("La hora Española 0" + hora + ":0" + min + " del domingo en Japón es " + (hora = hora + 8) + ":" + min + " del domingo.");
                            } else if (hora < 16) {
                                System.out.println("La hora Española " + hora + ":" + min + " del domingo en Japón es " + (hora = hora + 8) + ":" + min + " del domingo.");
                            } else if (hora <= 24) {
                                System.out.println("La hora Española " + hora + ":" + min + " del domingo en Japón es 0" + (hora = (hora - 24) + 8) + ":" + min + " del lunes.");
                            }
                            break;
                    }
                }
            } else if (pais.equalsIgnoreCase("Japan")) {
                System.out.println("Introduce la hora la cual quieres convertir.(HH MM formato 24h)");
                hora = entry.nextInt();
                min = entry.nextInt();
                System.out.println("Introduce el dia de esa hora. (lunes'1'|martes'2'|etc.)");
                dia = entry.nextInt();
                if (hora >= 0 && hora <= 24 && min >= 0 && min < 60) {
                    switch (dia) {
                        case 1:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del lunes en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del domingo.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del lunes en España es 0" + (hora = hora - 8) + ":0" + min + " del lunes.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del lunes en España es 0" + (hora = hora - 8) + ":0" + min + " del lunes.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del lunes en España es " + (hora = hora - 8) + ":0" + min + " del lunes.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del lunes en España es " + (hora = hora - 8) + ":0" + min + " del domingo.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del lunes en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del domingo.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del lunes en España es 0" + (hora = hora - 8) + ":" + min + " del lunes.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del lunes en España es 0" + (hora = hora - 8) + ":" + min + " del lunes.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del lunes en España es " + (hora = hora - 8) + ":" + min + " del lunes.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del lunes en España es " + (hora = hora - 8) + ":" + min + " del domingo.");
                            }
                            break;
                        case 2:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del martes en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del lunes.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del martes en España es 0" + (hora = hora - 8) + ":0" + min + " del martes.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del martes en España es 0" + (hora = hora - 8) + ":0" + min + " del martes.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del martes en España es " + (hora = hora - 8) + ":0" + min + " del martes.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del martes en España es " + (hora = hora - 8) + ":0" + min + " del lunes.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del martes en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del lunes.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del martes en España es 0" + (hora = hora - 8) + ":" + min + " del martes.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del martes en España es 0" + (hora = hora - 8) + ":" + min + " del martes.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del martes en España es " + (hora = hora - 8) + ":" + min + " del martes.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del martes en España es " + (hora = hora - 8) + ":" + min + " del lunes.");
                            }
                            break;
                        case 3:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del miercoles en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del martes.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del miercoles en España es 0" + (hora = hora - 8) + ":0" + min + " del miercoles.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del miercoles en España es 0" + (hora = hora - 8) + ":0" + min + " del miercoles.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del miercoles en España es " + (hora = hora - 8) + ":0" + min + " del miercoles.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del miercoles en España es " + (hora = hora - 8) + ":0" + min + " del martes.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del miercoles en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del martes.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del miercoles en España es 0" + (hora = hora - 8) + ":" + min + " del miercoles.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del miercoles en España es 0" + (hora = hora - 8) + ":" + min + " del miercoles.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del miercoles en España es " + (hora = hora - 8) + ":" + min + " del miercoles.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del miercoles en España es " + (hora = hora - 8) + ":" + min + " del martes.");
                            }
                            break;
                        case 4:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del jueves en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del miercoles.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del jueves en España es 0" + (hora = hora - 8) + ":0" + min + " del jueves.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del jueves en España es 0" + (hora = hora - 8) + ":0" + min + " del jueves.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del jueves en España es " + (hora = hora - 8) + ":0" + min + " del jueves.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del jueves en España es " + (hora = hora - 8) + ":0" + min + " del miercoles.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del jueves en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del miercoles.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del jueves en España es 0" + (hora = hora - 8) + ":" + min + " del jueves.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del jueves en España es 0" + (hora = hora - 8) + ":" + min + " del jueves.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del jueves en España es " + (hora = hora - 8) + ":" + min + " del jueves.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del jueves en España es " + (hora = hora - 8) + ":" + min + " del miercoles.");
                            }
                            break;
                        case 5:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del viernes en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del jueves.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del viernes en España es 0" + (hora = hora - 8) + ":0" + min + " del viernes.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del viernes en España es 0" + (hora = hora - 8) + ":0" + min + " del viernes.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del viernes en España es " + (hora = hora - 8) + ":0" + min + " del viernes.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del viernes en España es " + (hora = hora - 8) + ":0" + min + " del jueves.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del viernes en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del jueves.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del viernes en España es 0" + (hora = hora - 8) + ":" + min + " del viernes.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del viernes en España es 0" + (hora = hora - 8) + ":" + min + " del viernes.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del viernes en España es " + (hora = hora - 8) + ":" + min + " del viernes.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del viernes en España es " + (hora = hora - 8) + ":" + min + " del jueves.");
                            }
                            break;
                        case 6:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del sabado en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del viernes.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del sabado en España es 0" + (hora = hora - 8) + ":0" + min + " del sabado.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del sabado en España es 0" + (hora = hora - 8) + ":0" + min + " del sabado.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del sabado en España es " + (hora = hora - 8) + ":0" + min + " del sabado.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del sabado en España es " + (hora = hora - 8) + ":0" + min + " del viernes.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del sabado en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del viernes.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del sabado en España es 0" + (hora = hora - 8) + ":" + min + " del sabado.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del sabado en España es 0" + (hora = hora - 8) + ":" + min + " del sabado.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del sabado en España es " + (hora = hora - 8) + ":" + min + " del sabado.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del sabado en España es " + (hora = hora - 8) + ":" + min + " del viernes.");
                            }
                            break;
                        case 7:
                            if (hora < 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del domingo en España es " + (hora = ((hora + 24) - 8)) + ":0" + min + " del sabado.");
                            } else if (hora == 8 && min < 10) {
                                System.out.println("La hora Japonesa 0" + hora + ":0" + min + " del domingo en España es 0" + (hora = hora - 8) + ":0" + min + " del domingo.");
                            } else if (hora < 18 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del domingo en España es 0" + (hora = hora - 8) + ":0" + min + " del domingo.");
                            } else if (hora < 24 && min < 10) {
                                System.out.println("La hora Japonesa " + hora + ":0" + min + " del domingo en España es " + (hora = hora - 8) + ":0" + min + " del domingo.");
                            } else if (hora == 24 && min < 10) {
                                System.out.println("La hora Japonesa 00:0" + min + " del domingo en España es " + (hora = hora - 8) + ":0" + min + " del sabado.");
                            } else if (hora < 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del domingo en España es " + (hora = ((hora + 24) - 8)) + ":" + min + " del sabado.");
                            } else if (hora == 8) {
                                System.out.println("La hora Japonesa 0" + hora + ":" + min + " del domingo en España es 0" + (hora = hora - 8) + ":" + min + " del domingo.");
                            } else if (hora < 18) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del domingo en España es 0" + (hora = hora - 8) + ":" + min + " del domingo.");
                            } else if (hora < 24) {
                                System.out.println("La hora Japonesa " + hora + ":" + min + " del domingo en España es " + (hora = hora - 8) + ":" + min + " del domingo.");
                            } else if (hora == 24) {
                                System.out.println("La hora Japonesa 00:" + min + " del domingo en España es " + (hora = hora - 8) + ":" + min + " del sabado.");
                            }
                            break;
                    }
                }
            } else {
                System.err.println("País no valido.");
            }
            System.out.println("¿Quieres continuar? (s/n)");
            confirmar = entry.next().charAt(0);
        }
    }
}
