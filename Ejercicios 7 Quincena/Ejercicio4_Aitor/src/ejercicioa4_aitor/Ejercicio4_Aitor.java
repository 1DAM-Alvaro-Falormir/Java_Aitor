/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa4_aitor;

/**
 * Crea un programa con una clase llamada Articulo con los siguientes atributos:
 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa
 * cuantos quedan en el almacén). En el main de la clase principal instancia un
 * objeto de la clase artículo. Asígnale valores a todos sus atributos (los que
 * quieras) y muestra por pantalla un mensaje del estilo “Pijama -
 * Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es
 * decir, el precio con IVA). Luego, cambia el precio y vuelve a imprimir el
 * mensaje.
 * 
 * @author Aitor
 */
public class Ejercicio4_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo artc = new Articulo();
        artc.nombre = "Pijama";
        artc.precio = 13;
        
        System.out.println(artc.nombre+" - Precio:"+artc.precio+"€ - IVA:"+artc.iva+"% - PVP:"+((artc.precio*(artc.iva/100))+artc.precio)+"€");
    }
    
}
