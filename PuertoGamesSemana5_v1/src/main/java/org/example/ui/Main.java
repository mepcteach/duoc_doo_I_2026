package org.example.ui;
import org.example.data.GestorVideojuegos;
import org.example.model.Videojuego;

/**
 * Clase principal del sistema PuertoGames.
 *
 * Contiene el   main(), que actúa como punto de entrada
 * de la aplicación. Desde aquí se crea el gestor de videojuegos,
 * se cargan los datos desde un archivo Excel y se ejecutan las
 * operaciones principales del sistema.
 *
 * Esta clase pertenece a la capa de interfaz de usuario (ui)
 * y coordina la interacción entre las distintas clases del proyecto.
 *
 *
 * @author Miguel Puebla
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        //creamos el objeto gestor
        GestorVideojuegos gestor = new GestorVideojuegos();

        //agregar dos juegos
        gestor.agregar(new Videojuego("Mario Kart", "Carreras", 34990));
        gestor.agregar(new Videojuego("Mortal Kombat", "Lucha", 44990));

        //cargamos datos desde excel
        gestor.cargarDesdeExcel("videojuegos.xlsx");

        //mostramos informaicon
        System.out.println("Listado de videojuegos:");
        gestor.mostrarTodos();

        System.out.println("\nBúsqueda por género Aventura:");
        gestor.buscarPorGenero("Aventura");
    }
}
