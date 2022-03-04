/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 * Clase del vehículo coche
 *
 * @author Aitor
 */
public class Coche extends Vehiculo {

    private final float precioExtra = 1.5f;
    private final int plaza;

    /**
     * Contructor de la clase Coche.
     *
     * @param matricula Parametro donde se le indica la matrícula del coche.
     * @param plaza Parametro donde se le indica el numero de plazas del coche.
     */
    public Coche(String matricula, int plaza) {
        this.matricula = matricula;
        this.plaza = plaza;
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
        float precioDia, precioPlaza, precioTotal;

        precioDia = dia * precioExtra;
        precioPlaza = plaza * precioExtra;
        precioTotal = (precioAlquiler * dia) + (precioDia + precioPlaza);

        return precioTotal;
    }
}
