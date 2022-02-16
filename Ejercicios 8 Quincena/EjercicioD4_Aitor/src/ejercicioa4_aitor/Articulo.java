/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa4_aitor;

/**
 *
 * @author aitgal
 */
public class Articulo{
    private String nombre;
    private double precio;//Sin IVA
    private double iva;
    private int cuantosQuedan;
    
    public Articulo(String nombre, double precio, double iva, int cuantosQuedan){
        if(nombre.length() > 0)
            this.nombre = nombre;
        else
            System.err.println("Nombre no puede ser nulo.");
        if(precio > 0)
            this.precio = precio;
        else
            System.err.println("El precio no puede ser 0 o menor.");
        if(iva >= 0)
            this.iva = iva;
        else
            System.err.println("El IVA no puede ser negativo.");
        if(cuantosQuedan > 0)
            this.cuantosQuedan = cuantosQuedan;
        else
            System.err.println("No pueden quedar 0 o negativos articulos.");
    }
    
    public void setNombre(String nombre){
        if(nombre.length() > 0)
            this.nombre = nombre;
        else
            System.err.println("Nombre no puede ser nulo.");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPrecio(double precio){
        if(precio > 0)
            this.precio = precio;
        else
            System.err.println("El precio no puede ser 0 o menor.");
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setIva(double iva){
        if(iva >= 0)
            this.iva = iva;
        else
            System.err.println("El IVA no puede ser negativo.");
    }
    
    public double getIva(){
        return iva;
    }
    
    public void setCuantosQuedan(int cuantosQuedan){
        if(cuantosQuedan > 0)
            this.cuantosQuedan = cuantosQuedan;
        else
            System.err.println("No pueden quedar 0 o negativos articulos.");
    }
    
    public int getCuantosQuedan(){
        return cuantosQuedan;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+this.nombre+
                "\nPrecio: "+this.precio+
                "\nIVA: "+this.iva*100+"%"+
                "\nStock: "+this.cuantosQuedan);
    }
    
    public double getPVP(){
        return ((this.precio * this.iva) + this.precio);
    }
    
    public double getPVPDescuento(double d){
        return Math.abs((this.precio * (d/100)) - this.precio);
    }
    
    public boolean vender(int x){
        if((this.cuantosQuedan - x) >= 0){
            this.cuantosQuedan -= x;
            return true;
        }
        else
            return false;
    }
    
    public boolean almacenar(int x){
        if (this.cuantosQuedan < x){
            this.cuantosQuedan += x;
            return true;
        }
        else
            return false;
    }
}
