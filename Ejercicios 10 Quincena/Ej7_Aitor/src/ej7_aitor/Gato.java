/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7_aitor;

/**
 *
 * @author Aitor
 */
public class Gato {
    private String nombre;
    private int edad;

    public Gato() {
    }

    public Gato(String nombre, int edad) throws ExpectedNegativeNumberException, ExpectedValidNameException {
        if (nombre.length() < 3)
            throw new ExpectedValidNameException(nombre);
        
        if (edad < 0)
            throw new ExpectedNegativeNumberException(edad);
            
        this.nombre = nombre;
        this.edad = edad;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExpectedValidNameException {
        if (nombre.length() < 3)
            throw new ExpectedValidNameException(nombre);
        
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExpectedNegativeNumberException {
        
        if (edad < 0)
            throw new ExpectedNegativeNumberException(edad);
        
        this.edad = edad;
    }
    
    public void imprime(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
