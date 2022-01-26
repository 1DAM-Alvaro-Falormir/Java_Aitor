/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startwars;

import java.util.Scanner;

/**
 *
 * @author Aitor Rodriguez Gallardo
 */
public class StartWars {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int s1, s2, solucion1 = 0, respuesta1, p1, p2, solucion2 = 1, respuesta2, nLv3, factorialLv3 = 0, solucion3 = 1, respuesta3;
        int pLv4, solucion4 = 2, respuesta4, mLv5, sLv5, solucion5 = 0, solucion5_1 = 1, solucion5_2 = 1, respuesta5;
        s1 = (int) (1 + Math.random() * (10 - 1 + 1));
        s2 = (int) (20 + Math.random() * (30 - 20 + 1));
        p1 = (int) (1 + Math.random() * (7 - 1 + 1));
        p2 = (int) (8 + Math.random() * (12 - 8 + 1));
        nLv3 = (int) (50 + Math.random() * (100 - 50 + 1));
        pLv4 = (int) (10 + Math.random() * (100 - 10 + 1));
        mLv5 = (int) (5 + Math.random() * (10 - 5 + 1));
        sLv5 = (int) (5 + Math.random() * (10 - 5 + 1));

        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n"
                + "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"
                + "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"
                + "está construyendo para destruirla. (Presiona Intro para continuar)");
        entry.nextLine();

        System.out.println("=== NIVEL 1 ===\n"
                + "Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
                + "sistema " + s1 + " en el sector " + s2 + ", pero el sistema de navegación está estropeado y el\n"
                + "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
                + "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
                + "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
                + "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
                + "¿Qué debe introducir?");

        for (int i = s1; i <= s2; i++) {
            solucion1 = i + solucion1;
        }
        respuesta1 = entry.nextInt();
        if (respuesta1 == solucion1) {
            System.out.println("CORRECTO!!");
            System.out.println("");
            System.out.println("=== NIVEL 2 ===\n"
                    + "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
                    + "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
                    + "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n"
                    + "agente de espaciopuerto " + p1 + " contactando con nave imperial " + p2 + ". No están destinados\n"
                    + "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n"
                    + "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n"
                    + "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n"
                    + "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n"
                    + "manual del piloto que estaba en la guantera y da con la página correcta. El código\n"
                    + "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                    + "¿Cuál es el código?");
            for (int i = p1; i <= p2; i++) {
                solucion2 = i * solucion2;
            }
            respuesta2 = entry.nextInt();
            if (respuesta2 == solucion2) {
                System.out.println("CORRECTO!!");
                System.out.println("");
                System.out.println("=== NIVEL 3 ===\n"
                        + "Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n"
                        + "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
                        + "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + nLv3 + " existentes se\n"
                        + "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
                        + "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
                        + "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n"
                        + "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n"
                        + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                        + "¿Cual es el nivel correcto?");
                factorialLv3 = nLv3 / 10;
                for (int i = 1; i <= factorialLv3; i++) {
                    solucion3 = i * solucion3;
                }
                respuesta3 = entry.nextInt();
                if (respuesta3 == solucion3) {
                    System.out.println("CORRECTO!!");
                    System.out.println("");
                    System.out.println("=== NIVEL 4 ===\n"
                            + "Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
                            + "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
                            + "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
                            + "verificar si el número " + pLv4 + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0");
                    int m = pLv4 / 2;
                    boolean resto0 = false;
                    for (int i = 2; i <= m; i++) {
                        if (pLv4 % i == 0) {
                            solucion4 = 0;
                            resto0 = true;
                            break;
                        }
                    }
                    if (resto0 == false) {
                        solucion4 = 1;
                    }
                    respuesta4 = entry.nextInt();
                    if (respuesta4 == solucion4) {
                        System.out.println("CORRECTO!!");
                        System.out.println("");
                        System.out.println("=== NIVEL 5 ===\n"
                                + "Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
                                + "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
                                + "explote en exactamente " + mLv5 + " minutos y " + sLv5 + " segundos, el tiempo suficiente para escapar\n"
                                + "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
                                + "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
                                + "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
                                + "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");
                        for (int i = 1; i <= mLv5; i++) {
                            solucion5_1 = i * solucion5_1;
                        }
                        for (int i = 1; i <= sLv5; i++) {
                            solucion5_2 = i * solucion5_2;
                        }
                        solucion5 = solucion5_1 + solucion5_2;
                        respuesta5 = entry.nextInt();
                        if (respuesta5 == solucion5) {
                            System.out.println("=== HAS GANADO ===\n"
                                    + "Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"
                                    + "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
                                    + "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
                                    + "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
                                    + "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
                                    + "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
                                    + "imperio.\n"
                                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
                        }
                        else {
            System.out.println("=== HAS PERDIDO ===\n"
                    + "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
                    }
                    else {
            System.out.println("=== HAS PERDIDO ===\n"
                    + "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
                }
                else {
            System.out.println("=== HAS PERDIDO ===\n"
                    + "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
            }
            else {
            System.out.println("=== HAS PERDIDO ===\n"
                    + "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
        } 
        else {
            System.out.println("=== HAS PERDIDO ===\n"
                    + "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
        System.out.println("=== FIN ===\n"
                + "Gracias por jugar :D");
    }

}
