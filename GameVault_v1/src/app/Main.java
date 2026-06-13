package app;

import data.CargadorVideojuegos;
import model.Videojuego;
import ui.Menu;
import util.GestorColecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Metodo principal de la aplicación GameVault.
 * Inicializa los componentes del sistema, carga los videojuegos
 * desde un archivo de texto y crea las colecciones necesarias
 * para gestionar el catálogo, los destacados y el historial
 * de acciones del usuario.
 *
 * @param args argumentos recibidos desde la línea de comandos.
 */
public class Main {

    public static void main(String[] args) {

        // Objeto encargado de leer el archivo de videojuegos
        CargadorVideojuegos cargador = new CargadorVideojuegos();

        // Objeto que administra las operaciones sobre las colecciones
        GestorColecciones gestor = new GestorColecciones();

        // Objeto responsable de la interacción con el usuario
        Menu menu = new Menu();

        // Colección principal que almacena los videojuegos cargados desde el archivo
        ArrayList<Videojuego> juegos = cargador.cargarVideojuegos("videojuegos.txt");

        // Lista que almacena los videojuegos destacados según su precio
        List<Videojuego> destacados = gestor.obtenerDestacados(juegos);

        // Lista que almacena los videojuegos destacados según su precio
        HashMap<String, Videojuego> catalogo = gestor.crearCatalogo(juegos);

        // Pila utilizada para registrar el historial de acciones realizadas
        Stack<String> historial = new Stack<>();

        historial.push("Archivo cargado");

        int opcion;

        do {
            opcion = menu.mostrarMenu();

            switch (opcion) {
                case 1:
                    gestor.mostrarLista(juegos);
                    historial.push("Catálogo mostrado");
                    break;

                case 2:
                    String categoria = menu.pedirTexto("Ingrese categoría: ");
                    gestor.buscarPorCategoria(juegos, categoria);
                    historial.push("Búsqueda por categoría realizada");
                    break;

                case 3:
                    gestor.mostrarLista(destacados);
                    historial.push("Destacados mostrados");
                    break;

                case 4:
                    gestor.mostrarCantidadYPrimero(juegos);
                    historial.push("Cantidad consultada");
                    break;

                case 5:
                    gestor.eliminarPrimero(juegos, catalogo);
                    historial.push("Videojuego eliminado");
                    break;

                case 6:
                    String nombre = menu.pedirTexto("Ingrese nombre del videojuego: ");
                    Videojuego encontrado = catalogo.get(nombre);

                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontró el videojuego.");
                    }

                    historial.push("Búsqueda en HashMap realizada");
                    break;

                case 7:
                    gestor.mostrarUltimaAccion(historial);
                    break;

                case 8:
                    System.out.println("Saliendo de GameVault...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        menu.cerrar();
    }
}