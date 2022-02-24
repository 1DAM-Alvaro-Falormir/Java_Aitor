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
        int opcion, numero, index = 0, cont = 0, i = 0, numCuentasTotal = 0;
        double saldo, nomina;
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
                        System.out.println("Introduzca el dni de la persona a introducir");
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
                    cuentaSeguir = true;
                    System.out.println("Una persona solo puede tener 3 cuentas bancarias como maximo.");
                    while (i < p[0].getCuentasLength() && cuentaSeguir) {
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
                            System.out.println("digame el DNI de la pesona a la que le va a asociar la cuenta bancaria.");
                            dni = sc.next();
                            corr = Persona.comprobarDNI(dni);
                            if (!corr) {
                                System.err.println("Formato del dni incorrecto.\n"
                                        + "Vuelve a introducirlo");
                            }
                        } while (!corr);
                        index = getIndexOfDni(p, dni);
                        System.out.println("La cuenta que va a introducir tiene saldo? s/N");
                        salir = sc.next().charAt(0);
                        if (salir == 'N' || salir == 'n') {
                            c = new Cuenta(iban, 0);
                            p[index].setCuentaBank(c);
                        } else {
                            System.out.println("Introduce el saldo de la cuenta.");
                            saldo = sc.nextDouble();
                            c = new Cuenta(iban, saldo);
                            p[index].setCuentaBank(c);
                        }
                        if (i < 2 && cuentaSeguir) {
                            System.out.println("Quieres seguir introduciendo cuentas? S/n");
                            salir = sc.next().charAt(0);
                            if (salir == 'S' || salir == 's') {
                                cuentaSeguir = true;
                            } else {
                                cuentaSeguir = false;
                            }
                        }
                        i++;
                    }
                    break;
                case 3:
                    do {
                        System.out.println("digame el DNI de la pesona de la que se le van a mostrar los datos.");
                        dni = sc.next();
                        corr = Persona.comprobarDNI(dni);
                        if (!corr) {
                            System.err.println("Formato del dni incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);
                    index = getIndexOfDni(p, dni);
                    p[index].getDatos();
                    break;
                case 4:
                    System.out.println("digame el DNI de la pesona a la que se le va a ingresar la nomina");
                    do {
                        dni = sc.next();
                        corr = Persona.comprobarDNI(dni);
                        if (!corr) {
                            System.err.println("Formato del dni incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);
                    System.out.println("Introduzca el IBAN de la cuenta bancaria a la que se le va a ingresar la nomina.");
                    do {
                        iban = sc.next();
                        corr = Cuenta.comprobarIBAN(iban);
                        if (!corr) {
                            System.err.println("Formato del iban incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);
                    index = getIndexOfDni(p, dni);
                    System.out.println("Introduzca la nomina a ingresar.");
                    nomina = sc.nextDouble();
                    ext = false;
                    while (!ext) {
                        if (nomina > 0) {
                            ext = true;
                        } else {
                            System.out.println("La cantidad a ingresar no puede ser igual o menor a 0.");
                            ext = false;
                            System.out.println("Introduzca la nomina a ingresar.");
                            nomina = sc.nextDouble();
                        }
                    }
                    p[index].setNomina(iban, nomina);
                    break;
                case 5:
                    do {
                        System.out.println("digame el DNI de la pesona a la que se le va a retirar el pago");
                        dni = sc.next();
                        corr = Persona.comprobarDNI(dni);
                        if (!corr) {
                            System.err.println("Formato del dni incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);
                    System.out.println("Introduzca el IBAN de la cuenta bancaria a la que se le va a retirar pagos.");
                    do {
                        iban = sc.next();
                        corr = Cuenta.comprobarIBAN(iban);
                        if (!corr) {
                            System.err.println("Formato del iban incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);
                    index = getIndexOfDni(p, dni);
                    System.out.println("Introduzca el pago a retirar.");
                    nomina = sc.nextDouble();
                    ext = false;
                    while (!ext) {
                        if (nomina >= 0) {
                            ext = true;
                        } else {
                            System.out.println("La cantidad a pagar no puede ser igual o menor a 0.");
                            ext = false;
                        }
                    }
                    p[index].setPago(iban, nomina);
                    break;
                case 6:
                    System.out.println("Digame el DNI de la pesona a la que se le van ha hacer las transferencias.");
                    do {
                        dni = sc.next();
                        corr = Persona.comprobarDNI(dni);
                        if (!corr) {
                            System.err.println("Formato del dni incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);

                    System.out.println("Introduzca el IBAN de la cuenta bancaria a la que se le va a retirar el saldo para hacer la transferencia.");
                    do {
                        iban = sc.next();
                        corr = Cuenta.comprobarIBAN(iban);
                        if (!corr) {
                            System.err.println("Formato del iban incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);

                    index = getIndexOfDni(p, dni);

                    System.out.println("Introduzca el saldo a retirar.");
                    nomina = sc.nextDouble();
                    ext = false;
                    while (!ext) {
                        if (nomina >= 0) {
                            ext = true;
                        } else {
                            System.out.println("La cantidad a retirar no puede ser igual o menor a 0.");
                            ext = false;
                        }
                    }
                    p[index].setPago(iban, nomina);

                    System.out.println("Introduzca el IBAN de la cuenta bancaria a la que se le va a ingresar el saldo retirado.");
                    do {
                        iban = sc.next();
                        corr = Cuenta.comprobarIBAN(iban);
                        if (!corr) {
                            System.err.println("Formato del iban incorrecto.\n"
                                    + "Vuelve a introducirlo");
                        }
                    } while (!corr);

                    p[index].setNomina(iban, nomina);
                    break;
                case 7:
                    i = 0;
                    for (i = 0; i < p.length; i++) {
                        numCuentasTotal += p[i].getNumCuentas();
                    }
                    for (int j = 0; j < numCuentasTotal; j++) {
                        if(p[j].morosa()){
                            System.out.println("La persona con dni: "+p[j].getDni()+" es morosa.");
                            cont++;
                        }
                    }
                    if (cont == 0){
                            System.out.println("No hay personas morosas.");
                        }

            }
            System.out.println("Quieres continuar usando el programa? S/n");
            salir = sc.next().charAt(0);
        } while (salir == 'S' || salir == 's');
    }

    public static void instanciarPersona(Persona[] p, int i, String dni) {
        p[i] = new Persona(dni);
    }

    public static int getIndexOfDni(Persona[] p, String dni) {
        int cont = 0;
        boolean ext = false;
        int index = -1;
        while (!ext) {
            if (p[cont].getDni().equals(dni)) {
                index = cont;
                ext = true;
            }
            cont++;
        }
        return index;
    }
}
