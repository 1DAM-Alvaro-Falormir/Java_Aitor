/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_aitor;

/**
 *
 * @author Aitor
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void imprime(){
        System.out.println("("+this.x+", "+this.y+")");
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public int distancia(Punto p){
        int distancia = (int) Math.sqrt(Math.pow(this.x - p.x, 2)+Math.pow(this.y - p.y, 2));
        return distancia;
    }
    
    public static Punto creaPuntoAleatorio(){
        int rng1, rng2;
        
        rng1 = (int) (Math.random()*200 -100);
        rng2 = (int) (Math.random()*200 -100);
        Punto p = new Punto(rng1, rng2);
        
        return p;
    }
}
