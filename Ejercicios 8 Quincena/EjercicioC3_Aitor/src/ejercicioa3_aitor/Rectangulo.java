/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa3_aitor;

/**
 *
 * @author aitgal
 */
public class Rectangulo{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    public Rectangulo(int x1, int y1, int x2, int y2){
        if (x1 < x2 && y1 < y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        } else {
            System.err.println("Error al instanciar Rectangulo, x1 no puede ser mayor a x2,\n"
                    +" o y1 no puede ser mayor que y2");
        }
    }
    
    public void setX1(int x){
        if(x > this.x2){
            System.err.println("Error. x1 no puede ser mayor que x2.");
        }
        else
            this.x1 = x;
    }
    
    public int getX1(){
        return x1;
    }
    
    public void setX2(int x){
        this.x2 = x;
    }
    
    public int getX2(){
        return x2;
    }
    
    public void setY1(int y){
        if(y > y2){
            System.err.println("Error. y1 no puede ser mayor que y2.");
        }
        else
            this.y1 = y;
    }
    
    public int getY1(){
        return y1;
    }
    
    public void setY2(int y){
        this.y2 = y;
    }
    
    public int getY2(){
        return y2;
    }
}
