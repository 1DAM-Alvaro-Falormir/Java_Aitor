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
        int distancia = (int) Math.sqrt(Math.pow(this.x - this.y, 2)+Math.pow(p.x - p.y, 2));
        return distancia;
    }
}
