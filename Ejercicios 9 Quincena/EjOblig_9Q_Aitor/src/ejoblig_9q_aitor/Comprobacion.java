/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 * Clase para comprobar valores.
 *
 * @author Aitor
 */
public class Comprobacion {

    /**
     * Metodo para comprobar si la matrícula tiene el formato correcto.
     *
     * @param mat Parametro donde se introduce la matrícula a comprobar.
     * @return Devuelve true si la matrícula tiene el formato correcto.
     */
    public static boolean comprobarMatricula(String mat) {
        return mat.matches("\\d{4}[A-Z]{3}");
    }

    /**
     * Metodo para comprobar todos los valor de tipo int.
     *
     * @param entero Parametro donde se introduce el valor de tipo int a
     * comprobar
     * @return Devuelbe true si el valor esta por encima de 0(excluyendolo).
     */
    public static boolean comprobarInt(int entero) {
        return entero > 0;
    }

    /**
     * Metodo para comprobar el tipo de vehículo que se va a introducir.
     *
     * @param tipo Parametro donde se introduce el tipo a comprobar.
     * @return Devuelve true si el tipo se encuentra entre los tipos
     * especificados.
     */
    public static boolean comprobarTipo(String tipo) {
        boolean cierto = false;

        cierto = tipo.equalsIgnoreCase("coche") || tipo.equalsIgnoreCase("microbus") || tipo.equalsIgnoreCase("furgoneta") || tipo.equalsIgnoreCase("camion");

        return cierto;
    }
}
