/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author aitgal
 */
public class ListaAlquiler {
    ArrayList listaAutos;
    
    public ListaAlquiler(){
        this.listaAutos = new ArrayList();
    }
    
    public void addAuto(Coche c){
        this.listaAutos.add(c);
    }
    
    public void addAuto(MicroBus m){
        this.listaAutos.add(m);
    }
    
    public void addAuto(FurgonetaCarga f){
        this.listaAutos.add(f);
    }
    
    public void addAutos(Camion c){
        this.listaAutos.add(c);
    }
    /*
    public float ObtenerPrecio(String mat, int dias){
        Vehiculo v;
        for (Iterator it = listaAutos.iterator(); it.hasNext();) {
           
            if(v.getMatricula().matches(mat)){
                
            }
        }
    }
    */
}
