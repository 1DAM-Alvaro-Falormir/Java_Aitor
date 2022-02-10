/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_aitor;
import java.util.Scanner;

/**
 * Crea un programa con una clase llamada Persona que representará los datos
 * principales de una persona: dni, nombre, apellidos y edad. En el main de la
 * clase principal instancia dos objetos de la clase Persona. Luego, pide por
 * teclado los datos de ambas personas (guárdalos en los objetos). Por último,
 * imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo
 * “Azucena Luján García con DNI ... es / no es mayor de edad”.
 * 
 * @author Aitor
 */
public class Ejercicio2_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1;
        Persona persona2;
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, dni;
        int edad;
        
        System.out.print("Bienvenido, introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ahora, introduzca sus apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Introduzca su dni: ");
        dni = sc.nextLine();
        System.out.println("Por ultimo, introduzca su edad: ");
        edad = sc.nextInt();
        persona1 = new Persona(dni, nombre, apellidos, edad);
        
        System.out.println("\nBienvenido seguna persona, introduzca su nombre: ");
        sc.nextLine();
        nombre = sc.nextLine();
        System.out.print("Ahora, introduzca sus apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Introduzca su dni: ");
        dni = sc.nextLine();
        System.out.println("Por ultimo, introduzca su edad: ");
        edad = sc.nextInt();
        persona2 = new Persona(dni, nombre, apellidos, edad);
        
        if(persona1.edad >= 18 && persona2.edad >= 18){
            System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI "+persona1.dni+" es mayor de edad");
            System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI "+persona2.dni+" es mayor de edad");
        }
        else if(persona1.edad >= 18 && persona2.edad < 18){
            System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI "+persona1.dni+" es mayor de edad");
            System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI "+persona2.dni+" no es mayor de edad");
        }
        else if(persona1.edad < 18 && persona2.edad >= 18){
            System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI "+persona1.dni+" no es mayor de edad");
            System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI "+persona2.dni+" es mayor de edad");
        }else{
            System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI "+persona1.dni+" no es mayor de edad");
            System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI "+persona2.dni+" no es mayor de edad");
        }
    }
    
}
