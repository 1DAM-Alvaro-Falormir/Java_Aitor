/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2122;

import ADO.*;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Proyecto2122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Articulo art;
        ListaArticulos miLista = new ListaArticulos();
        Scanner sc = new Scanner(System.in);
        int op, opart, year, nPaginas, horasDuracion, minutos, nPistas, pegi, dias;
        String cod, nombre, fecha, resumen, autor, deterioro, format, tapa, sintetiza, tipo, categoria, formatf, comentDeterioro;
        float duracion;
        boolean ok, deteriorado, formato, sintetizador, formatoFisico, coment;

        do {
            do {
                op = mostrarMenu();
                switch (op) {
                    case 1:
                        do {
                            System.out.println("Introduzca el codigo del articulo");
                            System.out.println("Debe estar formado por tres digitos: ");
                            cod = sc.next();
                            ok = Utilidades.validarCOD(cod);
                            if (!ok) {
                                System.err.println("Formato incorrecto.");
                            }
                        } while (!ok);
                        do {
                            System.out.println("Introduzca el nombre: ");
                            nombre = sc.next();
                            ok = Utilidades.campoVacio(nombre);
                            if (!ok) {
                                System.err.println("El campo no puede estar vacio.");
                            }
                        } while (!ok);
                        do {
                            System.out.println("Introduzca la fecha en la que se dio de alta");
                            System.out.println("El Formato debe ser este -> dd-mm-aaaa: ");
                            fecha = sc.next();
                            ok = Utilidades.validarFecha1(fecha);
                            if (ok) {
                                ok = Utilidades.validarFecha(fecha);
                            } else {
                                System.out.println("Formato Incorrecto");
                            }
                        } while (!ok);
                        do {
                            System.out.println("¿En que año se publico?: ");
                            year = sc.nextInt();
                            ok = Utilidades.validarPositivo(year);
                        } while (!ok);
                        do {
                            System.out.println("Escriba un resumen del articulo: ");
                            resumen = sc.next();
                            ok = Utilidades.campoVacio(resumen);
                        } while (!ok);
                        do {
                            System.out.println("¿Cual es su autor?");
                            System.out.print("Escriba su nombre y pais: ");
                            autor = sc.next();
                            ok = Utilidades.campoVacio(autor);
                        } while (!ok);
                        do {
                            System.out.println("¿Esta deteriorado? Responda SI o NO: ");
                            deterioro = sc.next();
                            ok = Utilidades.validarSN(deterioro);
                        } while (!ok);

                        deteriorado = deterioro.equalsIgnoreCase("si");

                        do {
                            System.out.println("¿Que clase de Artículo es?");
                            System.out.println("1- LibroImpreso ");
                            System.out.println("2- AudioLibro ");
                            System.out.println("3- Musica ");
                            System.out.println("4- Videojuego");
                            System.out.print("\nTeclee opcion:");
                            opart = sc.nextInt();
                        } while (opart < 1 || opart > 4);
                        switch (opart) {
                            case 1:
                                System.out.println("Alta un LibroImpreso");
                                do {
                                    System.out.println("¿Cuantas páginas tiene el libro? :");
                                    nPaginas = sc.nextInt();
                                    ok = Utilidades.validarPositivo(nPaginas);
                                } while (!ok);

                                do {
                                    System.out.println("¿El libro esta en papel o en ebook?");
                                    format = sc.next();
                                    ok = Utilidades.validarFormatoLibro(format);
                                } while (!ok);

                                formato = format.equalsIgnoreCase("ebook");

                                do {
                                    System.out.println("¿Que tipo de tapa tiene, dura o blanda?");
                                    tapa = sc.next();
                                    ok = Utilidades.validarTapa(tapa);
                                } while (!ok);

                                art = new LibroImpreso(formato, tapa, nPaginas, cod, nombre,
                                        fecha, year, resumen, autor, deteriorado);
                                if (deteriorado) {
                                    do {
                                        System.out.println("¿Le gustaria añadir un comentario sobre la deterioración? Responda SI o NO.");
                                        comentDeterioro = sc.next();
                                        ok = Utilidades.validarSN(comentDeterioro);
                                        coment = comentDeterioro.equalsIgnoreCase("Si");
                                        if (coment) {
                                            do {
                                                System.out.println("Introduzca el comentario.");
                                                comentDeterioro = sc.next();
                                                ok = Utilidades.campoVacio(comentDeterioro);
                                            } while (!ok);
                                            ok = art.guardaComentario(comentDeterioro);
                                        }
                                    } while (!ok);
                                }
                                ok = miLista.addArticulo(art);
                                if (ok) {
                                    System.out.println("Artículo añadido.");
                                } else {
                                    System.out.println("No se ha podido añadir el LibroImpreso");
                                }
                                break;

                            case 2:
                                System.out.println("Alta un AudioLibro");
                                do {
                                    System.out.println("¿Cuantas páginas tiene el libro? :");
                                    nPaginas = sc.nextInt();
                                    ok = Utilidades.validarPositivo(nPaginas);
                                } while (!ok);
                                do {
                                    System.out.println("¿Esta narrado por un sintetizador? Responda SI o NO");
                                    sintetiza = sc.next();
                                    ok = Utilidades.validarSN(sintetiza);
                                } while (!ok);

                                sintetizador = sintetiza.equalsIgnoreCase("si");

                                do {
                                    System.out.println("¿Cuantas horas tiene de duración?");
                                    horasDuracion = sc.nextInt();
                                    ok = Utilidades.validarPositivo(horasDuracion);
                                } while (!ok);
                                do {
                                    System.out.println("¿Cuantos minutos tiene de duración?");
                                    minutos = sc.nextInt();
                                    ok = Utilidades.validarMinutos(minutos);
                                } while (!ok);
                                art = new AudioLibro(sintetizador, horasDuracion, horasDuracion,
                                        nPaginas, cod, nombre, fecha, year, resumen, autor, deteriorado);
                                if (deteriorado) {
                                    do {
                                        System.out.println("¿Le gustaria añadir un comentario sobre la deterioración? Responda SI o NO.");
                                        comentDeterioro = sc.next();
                                        ok = Utilidades.validarSN(comentDeterioro);
                                        coment = comentDeterioro.equalsIgnoreCase("Si");
                                        if (coment) {
                                            do {
                                                System.out.println("Introduzca el comentario.");
                                                comentDeterioro = sc.next();
                                                ok = Utilidades.campoVacio(comentDeterioro);
                                            } while (!ok);
                                            ok = art.guardaComentario(comentDeterioro);
                                        }
                                    } while (!ok);
                                }
                                ok = miLista.addArticulo(art);
                                if (ok) {
                                    System.out.println("AudioLibro añadido");
                                } else {
                                    System.out.println("No se ha podido añadir el AudioLibro");
                                }
                                break;

                            case 3:
                                System.out.println("Alta artículo musical");
                                do {
                                    System.out.println("¿Cuantas pistas tiene?");
                                    nPistas = sc.nextInt();
                                    ok = Utilidades.validarPositivo(nPistas);
                                } while (!ok);
                                do {
                                    System.out.println("¿Cuanto dura?");
                                    duracion = sc.nextFloat();
                                    ok = Utilidades.validarPositivo(duracion);
                                } while (!ok);
                                do {
                                    System.out.println("¿Cual es el formato?, ¿CD o Vinilo? ");
                                    tipo = sc.next();
                                    ok = Utilidades.validarTipoMusica(tipo);
                                } while (!ok);
                                //Constructor del articulo de Musica: 
                                art = new Musica(nPistas, duracion, tipo, cod, nombre,
                                        fecha, year, resumen, autor, deteriorado);
                                if (deteriorado) {
                                    do {
                                        System.out.println("¿Le gustaria añadir un comentario sobre la deterioración? Responda SI o NO.");
                                        comentDeterioro = sc.next();
                                        ok = Utilidades.validarSN(comentDeterioro);
                                        coment = comentDeterioro.equalsIgnoreCase("Si");
                                        if (coment) {
                                            do {
                                                System.out.println("Introduzca el comentario.");
                                                comentDeterioro = sc.next();
                                                ok = Utilidades.campoVacio(comentDeterioro);
                                            } while (!ok);
                                            ok = art.guardaComentario(comentDeterioro);
                                        }
                                    } while (!ok);
                                }
                                ok = miLista.addArticulo(art);
                                if (ok) {
                                    System.out.println("Artículo de música añadido");
                                } else {
                                    System.out.println("No se ha podido añadir el artículo");
                                }
                                break;

                            case 4:
                                System.out.println("Vamos a dar de Alta un Videojuego");
                                do {
                                    System.out.println("Introduzca la edad recomendad: ");
                                    pegi = sc.nextInt();
                                    ok = Utilidades.validarPEGI(pegi);
                                } while (!ok);
                                do {
                                    System.out.println("Introduzca la categoria: ");
                                    categoria = sc.next();
                                    ok = Utilidades.campoVacio(categoria);
                                } while (!ok);
                                do {
                                    System.out.println("¿Tiene formato físico? Responda SI o NO :");
                                    formatf = sc.next();
                                    ok = Utilidades.validarSN(formatf);
                                } while (!ok);

                                formatoFisico = formatf.equalsIgnoreCase("s");

                                art = new VideoJuego(pegi, categoria, categoria,
                                        formatoFisico, cod, nombre, fecha, year,
                                        resumen, autor, deteriorado);
                                if (deteriorado) {
                                    do {
                                        System.out.println("¿Le gustaria añadir un comentario sobre la deterioración? Responda SI o NO.");
                                        comentDeterioro = sc.next();
                                        ok = Utilidades.validarSN(comentDeterioro);
                                        coment = comentDeterioro.equalsIgnoreCase("Si");
                                        if (coment) {
                                            do {
                                                System.out.println("Introduzca el comentario.");
                                                comentDeterioro = sc.next();
                                                ok = Utilidades.campoVacio(comentDeterioro);
                                            } while (!ok);
                                            ok = art.guardaComentario(comentDeterioro);
                                        }
                                    } while (!ok);
                                }
                                ok = miLista.addArticulo(art);
                                if (ok) {
                                    System.out.println("VideoJuego añadido");
                                } else {
                                    System.out.println("No se ha podido añadir el Videojuego");
                                }
                                break;

                        }
                        break;

                    case 2:
                        if (!miLista.estaVacio()) {
                            do {
                                System.out.println("Introduzca el codigo del articulo");
                                System.out.println("Debe estar formado por tres digitos: ");
                                cod = sc.next();
                                ok = Utilidades.validarCOD(cod);
                                if (!ok) {
                                    System.err.println("Formato incorrecto.");
                                }
                            } while (!ok);
                            do {
                                System.out.println("Introduce los días del alquiler.");
                                dias = sc.nextInt();
                                ok = Utilidades.validarPositivo(dias);
                                if (!ok) {
                                    System.out.println("Formato incorrecto");
                                }
                            } while (!ok);
                            ok = miLista.existeCodArt(cod);
                            if (ok) {
                                miLista.mostrarPrecioAlquiler(cod, dias);
                            } else {
                                System.out.println("El codigo de articulo no existe.");
                            }
                        } else {
                            System.out.println("No hay ningun articulo\n");
                        }
                        break;
                    case 3:
                        if (!miLista.estaVacio()) {
                            do {
                                System.out.println("Introduce los días del alquiler.");
                                dias = sc.nextInt();
                                ok = Utilidades.validarPositivo(dias);
                                if (!ok) {
                                    System.out.println("Formato incorrecto");
                                }
                            } while (!ok);
                            miLista.mostrarDatos(dias);
                        } else {
                            System.out.println("No hay nigun articulo.\n");
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por usar nuestro programa.");
                        System.out.println("Saludos.");
                        break;
                    default:
                        System.out.println("Opcion Equivocada");
                }

            } while (op < 1 || op > 4);
        } while (op != 4);
    }

    public static int mostrarMenu() {
        int op;
        Scanner sc = new Scanner(System.in);

        System.out.println("--------MENU--------");
        System.out.println("1- Añadir un articulo a la lista.");
        System.out.println("2- Mostrar los datos y precio de alquiler de un articulo.");
        System.out.println("3- Mostrar los datos y precios de alquiler de todos los articulos.");
        System.out.println("4- Salir.\n");
        System.out.print("Elige una opcion: ");
        op = sc.nextInt();

        return op;
    }
}
