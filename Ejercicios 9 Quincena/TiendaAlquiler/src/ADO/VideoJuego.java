/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

/**
 *
 * @author Aitor
 */
public class VideoJuego extends Articulo {

    private int edadRecomendada;
    private String plataforma; //PS4, PS5, XBOX ONE, XBOX SERIES X, PC, SWITCH
    private String categoria;  //Acción, Deportivo, Estrategia, Simulación,...
    private boolean formatoFisico;

    public VideoJuego(int edadRecomendada, String plataforma, String categoria, boolean formatoFisico, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.edadRecomendada = edadRecomendada;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.formatoFisico = formatoFisico;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isFormatoFisico() {
        return formatoFisico;
    }

    public void setFormatoFisico(boolean formatoFisico) {
        this.formatoFisico = formatoFisico;
    }

    @Override
    public String info() {
        String resp;
        resp = "Codigo Articulo: " + getCodArt()
                + "\nNombre: " + getNombre()
                + "\nFecha de alta: " + getFecha()
                + "\nFecha de creacion: " + getAnyo()
                + "\nResumen: " + getResumen()
                + "\nAutor: " + getAutor()
                + "\nEdad Recomendada: " + getEdadRecomendada()
                + "\nPlataforma del videojuego: " + getPlataforma()
                + "\nCategoria del juego: "+ getCategoria()
                + "\n¿El juego esta en fisico?" +isFormatoFisico()
                + "\n¿Esta deteriorado? " + isDeteriorado()
                + "\nComentario sobre el deterioro: " + getComentarios().toString()
                + "\nPrecio alquiler por dia: " + Articulo.getPreciobase() + " por 1 dia.";
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        
        precio = (Articulo.getPreciobase() * dias) + 5;
        
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;
        
        if(c!=null){
            getComentarios().add(c);
            resp = true;
        }
        
        return resp;
    }
}
