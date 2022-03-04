/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 * Clase abstracta padre de los cuatro tipos de vehiculos
 *
 * @author Aitor
 */
public abstract class Vehiculo {

    protected String matricula;
    protected final int precioAlquiler = 50;

    /**
     * Metodo para conseguir el valor de la matrícula del objeto
     *
     * @return Devuelve un String en el que esta la matrícula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Metodo abstracto para que las subclases lo implementen
     *
     * @param dia Parametro donde se le indica cuantos dias se ha alquilado
     * @return Devuelve el precio del alquilamiento
     */
    public abstract float calcularPrecio(int dia);
}
