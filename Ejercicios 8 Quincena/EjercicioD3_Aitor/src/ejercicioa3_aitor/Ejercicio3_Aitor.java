/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa3_aitor;

/**
 * Crea un programa con una clase llamada Rectangulo que representará un
 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2. En el main de
 * la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
 * Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas
 * (ancho x alto). Modifica todas las coordenadas como consideres y vuelve a
 * imprimir coordenadas, perímetros y áreas.
 *
 * @author Aitor
 */
public class Ejercicio3_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(2, 3, 7, 9);

        r1.imprimir();
        r2.imprimir();
        System.out.println("El pemiremetro del rectangulo1 es: " + r1.getPerimetro() + " y del rectangulo2 es: " + r2.getPerimetro());
        System.out.println("El area del rectangulo1 es: " + r1.getArea() + " y del rectangulo2 es: " + r2.getArea());

        r1.setX2(7);
        r1.setY2(10);
        r1.setX1(5);
        r1.setY1(5);

        
        r2.setX2(20);
        r2.setY2(25);
        r2.setX1(10);
        r2.setY1(10);
        

        System.out.println("Las cordenadas del rectangulo1 son: (" + r1.getX1() + "," + r1.getY1() + ") y (" + r1.getX2() + "," + r1.getY2() + ")");
        System.out.println("Las cordenadas del rectangulo2 son: (" + r2.getX1() + "," + r2.getY1() + ") y (" + r2.getX2() + "," + r2.getY2() + ")");
        System.out.println("El pemiremetro del rectangulo1 es: " + r1.getPerimetro() + " y del rectangulo2 es: " + r2.getPerimetro());
        System.out.println("El area del rectangulo1 es: " + r1.getArea() + " y del rectangulo2 es: " + r2.getArea());
    }

    

    

}
