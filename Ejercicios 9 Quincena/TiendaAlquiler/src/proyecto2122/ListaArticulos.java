/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2122;

import java.util.ArrayList;
import java.util.Iterator;
import ADO.*;

/**
 *
 * @author Aitor
 */
public class ListaArticulos {

    private ArrayList<Articulo> lista = new ArrayList();

    public ListaArticulos() {
    }

    public ListaArticulos(ArrayList<Articulo> lista) {
        this.lista = lista;
    }

    public ArrayList getLista() {
        return lista;
    }

    public boolean addArticulo(Articulo a) {
        boolean ok = false;

        if (a != null) {
            this.lista.add(a);
            ok = true;
        }

        return ok;
    }

    public boolean addArticulo(Libro l) {
        boolean ok = false;

        if (l != null) {
            this.lista.add(l);
            ok = true;
        }

        return ok;
    }

    public boolean addArticulo(AudioLibro al) {
        boolean ok = false;

        if (al != null) {
            this.lista.add(al);
            ok = true;
        }

        return ok;
    }

    public boolean addArticulo(LibroImpreso li) {
        boolean ok = false;

        if (li != null) {
            this.lista.add(li);
            ok = true;
        }

        return ok;
    }

    public boolean addArticulo(VideoJuego v) {
        boolean ok = false;

        if (v != null) {
            this.lista.add(v);
            ok = true;
        }

        return ok;
    }

    public boolean addArticulo(Musica m) {
        boolean ok = false;

        if (m != null) {
            this.lista.add(m);
            ok = true;
        }

        return ok;
    }

    public boolean existeCodArt(String codArt) {
        boolean ok = false;
        Articulo a;
        Iterator it = lista.iterator();

        while (it.hasNext()) {
            a = (Articulo) it.next();
            if (a.getCodArt().equals(codArt)) {
                ok = true;
            }
        }

        return ok;
    }

    public void mostrarPrecioAlquiler(String codArt, int dias) {
        Articulo a;
        Iterator <Articulo> it = lista.iterator();
        
        System.out.println("Se va a mostrar el precio del alquiler por "+dias+" alquilado.\n");
            while (it.hasNext()) {
                a = it.next();
                if (a.getCodArt().equals(codArt)) {
                    System.out.println(a.info());
                    System.out.println("Precio: "+ a.precioAlquilerArticulo(dias) + " euros.");
                }
            }
        }
    
    public void mostrarDatos(int dias){
        
        System.out.println("Se va a mostrar el precio del alquiler por "+dias+" alquilado.\n");
        
        for(Articulo a : lista) {
            System.out.println(a.info());
            System.out.println("Precio: "+ a.precioAlquilerArticulo(dias) + " euros.\n");
        }
    }
    
    public boolean estaVacio(){
        
        return lista.isEmpty();
    }
}
