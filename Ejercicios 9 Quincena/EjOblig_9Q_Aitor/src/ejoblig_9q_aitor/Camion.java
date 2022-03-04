/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 * Clase del Vehiculo camión.
 *
 * @author Aitor
 */
public class Camion extends Vehiculo {

    private final float precioExtra = 40;

    /**
     * Constructor del objeto Camion.
     *
     * @param matricula Parametro donde se introduce la matrícula del camión.
     */
    public Camion(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo implementado de la clase Vehiculo.
     *
     * @param dia Parametro donde se le indica los dias que a durado el
     * alquiler.
     * @return Devuelve el precio del alquilamiento.
     */
    @Override
    public float calcularPrecio(int dia) {
        float precioTotal;

        precioTotal = (precioAlquiler * dia) + precioExtra;

        return precioTotal;

    }
}
