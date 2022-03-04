/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 * Clase del vehículo microbus.
 *
 * @author Aitor
 */
public class MicroBus extends Vehiculo {

    private final float precioExtra = 2;
    private final int plaza;

    /**
     * Constructor del objeto MicroBus.
     *
     * @param matricula Parametro donde se le indica la matrícula del microbus.
     * @param plaza Parametro donde se le indica el numero de plazas del
     * microbus.
     */
    public MicroBus(String matricula, int plaza) {
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
        float precioPlaza, precioTotal;

        precioPlaza = plaza * precioExtra;
        precioTotal = (precioAlquiler * dia) + precioPlaza;

        return precioTotal;
    }
}
