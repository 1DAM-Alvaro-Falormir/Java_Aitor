/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej18_aitor;

import java.util.Scanner;

import java.util.regex.Pattern;

/**
 * El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se
 * divide el número de DNI entre 23 y el resto es codificado por una letra según
 * la siguiente equivalencia: 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6:
 * "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N", 13: "J", 14: "Z", 15:
 * "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E". Escribe
 * un programa que pida el DNI y muestre por pantalla la letra asociada. Para
 * ello se deberá crear una función a la que se le pase el número y devuelva la
 * letra. Ejemplo: para el DNI 56321122 el NIF es ‘X’.
 *
 * @author ciber
 */
public class Ej18_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;
        String nif;

        System.out.print("Introduce tu DNI (solo los 8 numeros): ");
        dni = sc.nextInt();
        nif = Integer.toString(dni);
        nif += nif(dni);

        System.out.println("Tu NIF completo es: " + nif);

    }

    static public char nif(int a) {
        Scanner sc = new Scanner(System.in);
        char nif = '&';
        int number;
        String dni;
        boolean bucle = false;
        Pattern reg = Pattern.compile("(?<!\\d)\\d{8}(?!\\d)");
        do {
            dni = Integer.toString(a);
            if (reg.matcher(dni).matches()) {
                number = a % 23;
                switch (number) {
                    case 0:
                        nif = 'T';
                        bucle = true;
                        break;
                    case 1:
                        nif = 'R';
                        bucle = true;
                        break;
                    case 2:
                        nif = 'W';
                        bucle = true;
                        break;
                    case 3:
                        nif = 'A';
                        bucle = true;
                        break;
                    case 4:
                        nif = 'G';
                        bucle = true;
                        break;
                    case 5:
                        nif = 'M';
                        bucle = true;
                        break;
                    case 6:
                        nif = 'Y';
                        bucle = true;
                        break;
                    case 7:
                        nif = 'F';
                        bucle = true;
                        break;
                    case 8:
                        nif = 'P';
                        bucle = true;
                        break;
                    case 9:
                        nif = 'D';
                        bucle = true;
                        break;
                    case 10:
                        nif = 'X';
                        bucle = true;
                        break;
                    case 11:
                        nif = 'B';
                        bucle = true;
                        break;
                    case 12:
                        nif = 'N';
                        bucle = true;
                        break;
                    case 13:
                        nif = 'J';
                        bucle = true;
                        break;
                    case 14:
                        nif = 'Z';
                        bucle = true;
                        break;
                    case 15:
                        nif = 'S';
                        bucle = true;
                        break;
                    case 16:
                        nif = 'Q';
                        bucle = true;
                        break;
                    case 17:
                        nif = 'V';
                        bucle = true;
                        break;
                    case 18:
                        nif = 'H';
                        bucle = true;
                        break;
                    case 19:
                        nif = 'L';
                        bucle = true;
                        break;
                    case 20:
                        nif = 'C';
                        bucle = true;
                        break;
                    case 21:
                        nif = 'K';
                        bucle = true;
                        break;
                    case 22:
                        nif = 'E';
                        bucle = true;
                        break;
                }
            } else {
                System.out.println("Formato incorrecto. Vuelva a introducir su DNI.");
                a = sc.nextInt();
                bucle = false;
            }
        } while (bucle == false);
        return nif;
    }
}
