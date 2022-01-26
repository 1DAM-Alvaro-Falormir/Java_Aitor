/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author aitor
 */
public class meto {
    
    /**
     * Metodo para introducir nombres en un vector de Strings.
     * @param n vector donde se guardaran los nombres. 
     */
    
    public static void inputNombres(String[] n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.print("Introduzca el nombre de un estudiante: ");
            n[i] = sc.nextLine();

        }
    }
    
    /**
     * Metodo para intoducir las respuestas correctas a la preguntas del examen.
     * @param c vector donde se guardaran las respuestas correctas
     */
    
    public static void inputCorrectas(char[] c){
        Scanner sc = new Scanner(System.in);
        char carac;
        boolean correcto = true;
        System.out.println("Las respuestas solo pueden ser desde la A hasta la E en mayusculas");
        for (int i = 0; i < c.length; i++){
            System.out.print("Introduce la respuesta correcta a la pregunta "+(i+1)+": ");
            carac = sc.nextLine().charAt(0);
            switch(carac){
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                    c[i] = carac;
                    break;
                default:
                    do{
                        System.out.print("Introduzca una opcion valida: ");
                        carac = sc.nextLine().charAt(0);
                        switch (carac) {
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                                c[i] = carac;
                                correcto = false;
                                break;
                            default:
                                    System.err.println("opcion invalida.");
                                    correcto = true;
                        }
                    }while(correcto);
                    
            }
        }
    }
    
    /**
     * Metodo para introducir las respuestas de los alumnos.
     * @param c matriz donde se guardaran las respuestas de los alumnos.
     * @param n Argumento para poder poner los nombres de los alumnos.
     */
    
    public static void inputAlumnos(char[][] c, String[] n){
        Scanner sc = new Scanner(System.in);
        char carac;
        boolean correcto = true;
        for (int i = 0; i < c.length; i++){
            System.out.println("Pon las respuestas del alumno "+n[i]+": ");
            System.out.println("Las respuestas son desde la A hasta la E en mayusculas");
            for (int j = 0; j < c[0].length; j++){
                System.out.print("Escribe la respuesta a la pregunta "+(j + 1)+": ");
                carac = sc.nextLine().charAt(0);
                switch (carac) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                        c[i][j] = carac;
                        break;
                    default:
                        do {
                            System.out.print("Introduzca una opcion valida (Desde la A hasta la E en mayusculas): ");
                            carac = sc.nextLine().charAt(0);
                            switch (carac) {
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                    c[i][j] = carac;
                                    correcto = false;
                                    break;
                                default:
                                    System.err.println("opcion invalida.");
                                    correcto = true;
                            }
                        } while (correcto);

                }
            }
            System.out.println("");
        }
    }
    
    /**
     * Metodo para sacar las notas de los alumnos
     * @param a matriz con las respuestas de los alumnos
     * @param r vector con las respuestas correctas
     * @param n vector con los nombres de los alumnos
     * @param np entero con el numero de preguntas
     * @return devuelve un vector de flotantes en los cuales estan las notas de los alumnos sobre 100
     */
    
    public static float[] notaAlumnos(char[][] a, char[] r, String[] n, int np) {
        float aciertos[] = new float[n.length];
        float nota[] = new float[n.length];
        Arrays.fill(aciertos, 0);
        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                if(a[i][j] == r[j]){
                    aciertos[i] += 1;
                }
            }
        }
        for (int i = 0; i < n.length; i++){
            nota[i] = (aciertos[i]/np)*100;
        }
        return nota;
    }
    
    /**
     * Metodo para pasar vector de flotantes a vector de enteros
     * @param a vector de flotantes
     * @param b vector de enteros
     */
    
    public static void floatToInt(float[] a, int[] b){
        for (int i = 0; i < b.length; i++)
            b[i] = (int) a[i];
    }
    
    /**
     * Metodo para mostrar la media de los alumnos
     * @param a matriz con las respuestas de los alumnos
     * @param r vector con las respuestas correctas
     * @param n vector con los nombres de los alumnos
     * @param np entero con el numero de preguntas 
     */
    
    public static void mediaAlumnos(char[][] a, char[] r, String[] n, int np){
        float aciertos[] = new float[n.length];
        float media = 0;
        Arrays.fill(aciertos, 0);
        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                if(a[i][j] == r[j]){
                    aciertos[i] += 1;
                }
            }
        }
        for (int i = 0; i < n.length; i++){
            media += aciertos[i];
        }
        System.out.println("La media de aciertos es: "+(media/np));
    }
    
    /**
     * Metodo para buscar la nota de un alumno en concreto
     * @param a vector con las notas de los alumnos
     * @param n vector con los nombres de los alumnos
     */
    
    public static void buscarNota(int[] a, String[] n){
        Scanner sc = new Scanner(System.in);
        String name;
        int indice;
        do{
            indice = -1;
            System.out.print("Introduzca el nombre del alumno:");
            name = sc.nextLine();
        
            for(int i = 0; i < n.length; i++){
            if (n[i].equals(name)){
                indice = i;
                i = n.length;
                }
            }
        
            if (indice == -1)            
                System.out.println("No hay ningun estudiante con este nombre.");
            else{
                System.out.println("Esta es la nota de " + n[indice] + ": " + a[indice]);
            }               
        }while(indice == -1);
        
        
    }
    
    /**
     * Metodo para sacar la pregunta(o preguntas si tienen la misma cantidad de respuestas correctas) mas acertada.
     * @param a matriz con las respuestas de los alumnos
     * @param r vector con las respuestas correctas
     * @param np entero con el numero de preguntas 
     */
    
    public static void pregunta(char[][] a, char[] r, int np){
        int preguntas[] = new int[np];
        int cont = 0, cont2 = 0, indexString;
        int masUnaAcertada[] = new int[np];
        Arrays.fill(masUnaAcertada, 0);
        
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a.length; j++){
                if(a[j][i] == r[i]){
                    preguntas[i] += 1;
                }
            }
        }
        for (int i = 0; i < preguntas.length; i++){
            if (i == 0){
                masUnaAcertada[i] = i;
                i++;
            }
            if (preguntas[i] == a.length && preguntas[i] >= preguntas[cont]){
                masUnaAcertada[cont] = i;
                cont++;
            }
            else if (preguntas[i] > preguntas[masUnaAcertada[0]]){
                masUnaAcertada[0] = i;
                cont2++;
            }
            else if (preguntas[i] > preguntas[masUnaAcertada[cont2]]) {
                masUnaAcertada[cont2] = i;
                cont2++;
            }
        }
        for (int i = 0; i < masUnaAcertada.length; i++){
            if (i == 0)
                masUnaAcertada[i] += 1;
            else{
                if (masUnaAcertada[i] != 0)
                    masUnaAcertada[i] += 1;
            }
        }
        String acertadas = Arrays.toString(masUnaAcertada);
        indexString = acertadas.indexOf("0");
        acertadas = acertadas.substring(1, (indexString - 2));
        System.out.println("Pregunta mas acertada: "+acertadas);
    }
}
