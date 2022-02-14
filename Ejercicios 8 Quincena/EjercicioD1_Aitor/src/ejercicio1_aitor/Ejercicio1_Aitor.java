/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_aitor;

/**
 * Crea un programa con una clase llamada Punto que representará un punto de dos
 * dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y
 * (coordenadas). En el main de la clase principal instancia 3 objetos Punto con
 * las coordenadas (5,0), (10,10) y (-3, 7). Muestra por pantalla sus
 * coordenadas (utiliza un println para cada punto). Modifica todas las
 * coordenadas (prueba distintos operadores como = + - += *=...) y vuelve a
 * imprimirlas por pantalla.
 * 
 * @author Aitor
 */
public class Ejercicio1_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punto cord1 = new Punto(5, 0);
        Punto cord2 = new Punto(10, 10);
        Punto cord3 = new Punto(-3, 7);
        
        System.out.println("La cordenada 'X' de cord1 es: "+cord1.getX()+" y la cordenada 'Y' de cord1 es: "+cord1.getY());
        System.out.println("La cordenada 'X' de cord2 es: "+cord2.getX()+" y la cordenada 'Y' de cord2 es: "+cord2.getY());
        System.out.println("La cordenada 'X' de cord3 es: "+cord3.getX()+" y la cordenada 'Y' de cord3 es: "+cord3.getY());
        
        cord1.setX(cord1.getX() + cord2.getX());
        cord2.setY(cord2.getY() * cord3.getY());
        cord3.setX(cord3.getX() + cord3.getY());
        
        System.out.println("\nLas cordenadas se han modificado tras hacer varias operaciones.\n");
        System.out.println("La cordenada 'X' de cord1 es: "+cord1.getX()+" y la cordenada 'Y' de cord1 es: "+cord1.getY());
        System.out.println("La cordenada 'X' de cord2 es: "+cord2.getX()+" y la cordenada 'Y' de cord2 es: "+cord2.getY());
        System.out.println("La cordenada 'X' de cord3 es: "+cord3.getX()+" y la cordenada 'Y' de cord3 es: "+cord3.getY());
        
        cord1.desplaza(2, 5);
        cord1.imprime();
        
        cord2.setXY(4, 7);
        cord3.setXY(1, 5);
        
        System.out.println("\n"+cord2.distancia(cord3));
    }
    
}
