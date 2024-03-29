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
        Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

        System.out.println("Las cordenadas del rectangulo1 son: (" + r1.x1 + "," + r1.y1 + ") y (" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Las cordenadas del rectangulo2 son: (" + r2.x1 + "," + r2.y1 + ") y (" + r2.x2 + "," + r2.y2 + ")");
        System.out.println("El pemiremetro del rectangulo1 es: " + perimetro(r1) + " y del rectangulo2 es: " + perimetro(r2));
        System.out.println("El area del rectangulo1 es: " + area(r1) + " y del rectangulo2 es: " + area(r2));

        r1.x1 = 5;
        r1.y1 = 5;
        r1.x2 = 7;
        r1.y2 = 10;

        r2.x1 = 10;
        r2.y1 = 10;
        r2.x2 = 20;
        r2.y2 = 25;

        System.out.println("Las cordenadas del rectangulo1 son: (" + r1.x1 + "," + r1.y1 + ") y (" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Las cordenadas del rectangulo2 son: (" + r2.x1 + "," + r2.y1 + ") y (" + r2.x2 + "," + r2.y2 + ")");
        System.out.println("El pemiremetro del rectangulo1 es: " + perimetro(r1) + " y del rectangulo2 es: " + perimetro(r2));
        System.out.println("El area del rectangulo1 es: " + area(r1) + " y del rectangulo2 es: " + area(r2));
    }

    public static int perimetro(Rectangulo r) {
        int lado1 = Math.abs(r.x1 - r.x2);
        int lado2 = Math.abs(r.y1 - r.y2);
        return ((lado1 + lado2) * 2);
    }

    public static int area(Rectangulo r) {
        int lado1 = Math.abs(r.x1 - r.x2);
        int lado2 = Math.abs(r.y1 - r.y2);
        return lado1 * lado2;
    }

}
