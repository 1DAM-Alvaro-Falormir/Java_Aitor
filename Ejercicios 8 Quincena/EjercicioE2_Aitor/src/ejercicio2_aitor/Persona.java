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
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int mayoriaEdad = 18;
    
    public Persona(String nif, String nombre, String apellidos, int edad){
        if (validarDNI(nif)){
            this.dni = nif;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }
        else{
            System.err.println("Dni invalido.");
            this.dni = null;
        }
    }

    public String getDni() {
        return dni;
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
        return this.edad >= mayoriaEdad;
    }
    
    public boolean esJubilado(){
        return this.edad >= 65;
    }
    
    public int diferenciaEdad(Persona p){
        return this.edad - p.edad;
    }
    
    public static boolean validarDNI(String dni){
        return dni.matches("\\d{8}\\[A-Za-z]");
    }
}
