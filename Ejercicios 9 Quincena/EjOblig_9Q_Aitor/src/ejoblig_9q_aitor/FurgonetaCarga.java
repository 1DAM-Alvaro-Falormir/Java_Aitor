/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 * Clase del vehículo furgoneta de carga.
 *
 * @author Aitor
 */
public class FurgonetaCarga extends Vehiculo {

    private final float precioExtra = 20;
    private final int pma;

    /**
     * Contructor del objeto FurgonetaCarga.
     *
     * @param matricula Parametro donde se le indica la matrícula de la
     * furgoneta de carga.
     * @param pma Parametro donde se le indica el peso máximo autorizado en
     * toneladas de la furgoneta de carga.
     */
    public FurgonetaCarga(String matricula, int pma) {
        this.matricula = matricula;
        this.pma = pma;
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
        float precioPMA, precioTotal;

        precioPMA = pma * precioExtra;
        precioTotal = (precioAlquiler * dia) + precioPMA;

        return precioTotal;
    }
}
