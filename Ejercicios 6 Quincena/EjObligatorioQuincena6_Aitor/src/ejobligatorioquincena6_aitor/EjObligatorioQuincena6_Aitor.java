/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejobligatorioquincena6_aitor;
import java.util.Scanner;
import metodos.meto;

/**
 * 
 * Programa que califique un examen de preguntas de selección múltiple presentado por 8 estudiantes de Programación.
 * En cada una de las preguntas del examen, el estudiante debe elegir una de cinco opciones,
 * identificadas con las letras A, B, C, D y E.
 * 
 * @author aitor
 * 
 */
public class EjObligatorioQuincena6_Aitor {
    
    /**
     * Metodo principal del programa.
     * 
     * @param args los argumentos de linea de comando
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPreguntas, menu;
        String nombres[] = new String[8];
        char alu[][];
        char correcta[];
        int nota[] = null;
        
        
        
        System.out.print("Bienvenido, diga el numero de preguntas que hay en el examen: ");
        nPreguntas = sc.nextInt();
        while(nPreguntas <= 0){
            System.err.println("Valor invalido, el numero de preguntas tiene que ser mayor a 0.");
            System.out.print("Introduzca un valor superior a 0: ");
            nPreguntas = sc.nextInt();
        }
        alu = new char[nombres.length][nPreguntas];
        correcta = new char[nPreguntas];
        
        meto.inputNombres(nombres);
        meto.inputCorrectas(correcta);
        meto.inputAlumnos(alu, nombres);
        
        float notafloat[] = meto.notaAlumnos(alu, correcta, nombres, nPreguntas);
        nota = new int[notafloat.length];
        meto.floatToInt(notafloat, nota); 
        
        System.out.println("Menu:\n"
                +"Opción 1 Notas: Muestra la nota obtenida de cada estudiante. Esta nota corresponde al número de aciertos que tuvo el estudiante.\n"
                + "Opción 2 Media: Muestra la media de aciertos de los 8 alumnos.\n"
                + "Opción 3 Nota Alumno: dado un nombre de un alumno, muestra su nota.\n"
                + "Opción 4 Pregunta: Muestra el número de la pregunta más acertada.\n"
                + "Opcion 5 Salir.");
        
        do{
            System.out.print("Elija una opción: ");
           menu = sc.nextInt(); 
            switch(menu){
            case 1:
                for (int i = 0; i < nombres.length; i++){
                    System.out.println("La nota de "+nombres[i]+" es: "+nota[i]);
                }
                break;
            case 2:
                meto.mediaAlumnos(alu, correcta, nombres, nPreguntas);
                break;
            case 3:
                meto.buscarNota(nota, nombres);
                break;
            case 4:
                meto.pregunta(alu, correcta, nPreguntas);
                break;
            case 5:
                System.out.println("Gracias por utilizar este programa.");
                break;
            default:
                System.err.println("Opcion invalida");
                break;
                
        }
        }while(menu != 5);
        
    }
    
}
