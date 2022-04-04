/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

/**
 *
 * @author adminroot
 */
public class VideoJuego extends Articulo{
    private int edadRecomendada;
    private String plataforma; // PS2, PS3, PS4, XBOX, PC,...
    private String categoria;  //Acción, Deportivo, Estrategia, Simulación,...
    private boolean formatoFisico;
    
    public VideoJuego(int edadRecomendada, String plataforma, String categoria, boolean formatoFisico, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.edadRecomendada = edadRecomendada;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.formatoFisico = formatoFisico;
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
