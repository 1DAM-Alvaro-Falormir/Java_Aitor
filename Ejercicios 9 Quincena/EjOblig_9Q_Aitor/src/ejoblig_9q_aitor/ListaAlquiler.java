/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase donde esta contenida la lista de los vehículos de la empresa.
 * @author Aitor
 */
public class ListaAlquiler {
    private ArrayList listaAutos;
    
    /**
     * Contructor del objeto ListaAlquiler
     */
    public ListaAlquiler(){
        this.listaAutos = new ArrayList();
    }
    
    /**
     * Metodo para añadir un coche a la lista.
     * @param c Parametro donde se le indica los datos del coche o el objeto ya creado.
     */
    public void addAuto(Coche c){
        this.listaAutos.add(c);
    }
    
    /**
     * Metodo para añadir un microbus a la lista.
     * @param m Parametro donde se le indica los datos del microbus o el objeto ya creado.
     */
    public void addAuto(MicroBus m){
        this.listaAutos.add(m);
    }
    
    /**
     * Metodo para añadir una furgoneta de carga a la lista.
     * @param f Parametro donde se le indica los datos de la furgoneta de carga o el objeto ya creado.
     */
    public void addAuto(FurgonetaCarga f){
        this.listaAutos.add(f);
    }
    
    /**
     * Metodo para añadir un camión a la lista.
     * @param c Parametro donde se le indica los datos del camión o el objeto ya creado.
     */
    public void addAuto(Camion c){
        this.listaAutos.add(c);
    }
    
    /**
     * Metodo para obtener el precio del alquiler de un vehículo en particular.
     * @param mat Parametro en el cual se le indica la matrícula a buscar.
     * @param dias Parametro en el cual se le indica cuantos dias a durado el alquiler del vehiculo.
     * @return Devuelve el precio del alquiler.
     */
    public float ObtenerPrecio(String mat, int dias){
        Vehiculo v;
        float precio = -1;
        for (Iterator it = listaAutos.iterator(); it.hasNext();) {
           v = (Vehiculo) it.next();
            if(v.getMatricula().matches(mat)){
                precio = v.calcularPrecio(dias);
            }
        }
        
        return precio;
    }
    
    /**
     * Metodo para obtener el precio del alquiler de todos los vehículos en la lista.
     * @param dias Parametro donde se le indica cuantos dias a durado el alquiler de los vehículos.
     * @return Devuelve una lista de strings con los precios y matriculos de todos los vehículos.
     */
    public ArrayList MostrarPrecioTodos(int dias){
        ArrayList listaPrecios = new ArrayList();
        Vehiculo v;
        String matricula, frase;
        float precio;
        for (Iterator it = listaAutos.iterator(); it.hasNext();){
            v = (Vehiculo) it.next();
            matricula = v.getMatricula();
            precio = v.calcularPrecio(dias);
            frase = "Matrícula: "+ matricula + ", precio por "+ dias + " dias de alquiler: "+ precio +"€";
            listaPrecios.add(frase);
        }
        
        return listaPrecios;
    }
    
}
