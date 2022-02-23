/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej_8_Aitor;

import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class PruebaCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni, iban;
        boolean corr = false, ext = false, cuentaSeguir = true;
        int opcion, numero, index = 0, cont, i = 0;
        double saldo;
        Persona p[];
        Cuenta c = null;
        char salir = 'N';

        System.out.println("Bienvenido al programa para gestionar a personas y sus cuentas.");
        System.out.println("Introduzca el numero de personas que va a gestionar.\n"
                + "(Tome nota de que este numero no se podra cambiar hasta que vuelva a iniciar el programa)\n"
                + "Asi mismo una vez cierre el programa se borraran los datos introducidos.");
        numero = sc.nextInt();
        p = new Persona[numero];
        do {
            System.out.println("-----MENU-----\n"
                    + "Seleccione una opcion para continuar el programa:\n"
                    + "1. Identifiqué a las personas a gestionar.\n"
                    + "2. Introduzca una cuenta bancaria y asociela a una persona.\n"
                    + "3. Muestre los datos de una persona.\n"
                    + "4. Reciba la nómina mensual de la persona a gestionar y en que cuenta pertenece.\n"
                    + "5. Reciba un pago y diga a que cuenta pertenece.\n"
                    + "6. Realize una transferencia entre sus cuentas bancarias.\n"
                    + "7. Imprima las personas morosas.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (i = 0; i < p.length; i++) {
                        System.out.println("Introduzca el dni de la persona a introdir");
                        do {
                            dni = sc.next();
                            corr = Persona.comprobarDNI(dni);
                            if (!corr) {
                                System.err.println("Formato del dni incorrecto.\n"
                                        + "Vuelve a introducirlo");
                            }
                        } while (!corr);
                        instanciarPersona(p, i, dni);
                    }
                    break;
                case 2:
                    i = 0;
                    System.out.println("Una persona solo puede tener 3 cuentas bancarias como maximo.");
                    while (i < p[0].getCuentasBankLength() && cuentaSeguir) {
                        System.out.println("Introduzca el IBAN de la cuenta bancaria.");
                        do {
                            iban = sc.next();
                            corr = Cuenta.comprobarIBAN(iban);
                            if (!corr) {
                                System.err.println("Formato del iban incorrecto.\n"
                                        + "Vuelve a introducirlo");
                            }
                        } while (!corr);
                        do {
                            System.out.println("digame el dni de la pesona a la que le va a asociar la cuenta bancaria.");
                            dni = sc.next();
                            corr = Persona.comprobarDNI(dni);
                            if (!corr) {
                                System.err.println("Formato del dni incorrecto.\n"
                                        + "Vuelve a introducirlo");
                            }
                        } while (!corr);
                        cont = 0;
                        ext = false;
                        while (!ext) {
                            if (p[cont].getDni().matches(dni)) {
                                index = cont;
                                ext = true;
                            }
                            cont++;
                        }
                        cont = 0;
                        System.out.println("Es esta su primera cuenta bancaria? S/n");
                        salir = sc.next().charAt(0);
                        if (salir == 'S' || salir == 's') {
                            System.out.println("La cuenta que va a introducir tiene saldo? s/N");
                            salir = sc.next().charAt(0);
                            if (salir == 'N' || salir == 'n') {
                                instanciarCuenta(c, iban, 0);
                                p[index].setCuentaBank(c, cont);
                            } else {
                                System.out.println("Introduce el saldo de la cuenta.");
                                saldo = sc.nextDouble();
                                instanciarCuenta(c, iban, saldo);
                                p[index].setCuentaBank(c, cont);
                            }
                        } else {
                            do {
                                System.out.println("digame si es su segunda o tercera cuenta bancaria.");
                                cont = sc.nextInt();
                                if (cont == 2 || cont == 3) {
                                    cont--;
                                    System.out.println("La cuenta que va a introducir tiene saldo? s/N");
                                    salir = sc.next().charAt(0);
                                    if (salir == 'N' || salir == 'n') {
                                        instanciarCuenta(c, iban, 0);
                                        p[index].setCuentaBank(c, cont);
                                    } else {
                                        System.out.println("Introduce el saldo de la cuenta.");
                                        saldo = sc.nextDouble();
                                        instanciarCuenta(c, iban, saldo);
                                        p[index].setCuentaBank(c, cont);
                                    }
                                } else {
                                    System.err.println("El numero tiene que ser 2 o 3");
                                }
                            } while (cont != 1 || cont != 2 || cont != 3);

                        }

                    }
            }
        } while (salir == 'N' || salir == 'n');
    }

    public static void instanciarPersona(Persona[] p, int i, String dni) {
        p[i] = new Persona(dni);
    }

    public static void instanciarCuenta(Cuenta c, String iban, double saldo) {
        c = new Cuenta(iban, saldo);
    }

}
