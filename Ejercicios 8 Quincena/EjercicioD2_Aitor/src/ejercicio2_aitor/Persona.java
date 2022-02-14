/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_aitor;

/**
 *
 * @author aitgal
 */
public class Persona{
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprime(){
        System.out.println("DNI: "+this.dni+"\nNombre: "+this.nombre+"\nApellido: "+this.apellidos+"\nEdad: "+this.edad);
    }
    
    public boolean esMayorEdad(){
        return this.edad >= 18;
    }
    
    public boolean esJubilado(){
        return this.edad >= 65;
    }
    
    public int diferenciaEdad(Persona p){
        return this.edad - p.edad;
    }
}
