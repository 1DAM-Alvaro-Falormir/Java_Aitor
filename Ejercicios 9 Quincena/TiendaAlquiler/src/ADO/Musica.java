/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class Musica extends Articulo{
    
    private int nPistas;
    private float duracion;
    private String tipo; // cd o vinilo
    
    public Musica(int nPistas, float duracion, String tipo, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.nPistas = nPistas;
        this.duracion = duracion;
        this.tipo = tipo;
    }

     @Override
    public String info() {
        String resp = null;
        
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio = 0;
        
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp=false;
        
        return resp;
    }
    
}
