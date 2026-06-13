package util;

import model.Videojuego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Gestiona las operaciones sobre colecciones de videojuegos.
 */
public class GestorColecciones {


    public List<Videojuego> obtenerDestacados(ArrayList<Videojuego> juegos) {
        List<Videojuego> destacados = new ArrayList<>();

        for (Videojuego juego : juegos) {
            if (juego.getPrecio() > 30000) {
                destacados.add(juego);
            }
        }

        return destacados;
    }

    public HashMap<String, Videojuego> crearCatalogo(ArrayList<Videojuego> juegos) {
        HashMap<String, Videojuego> catalogo = new HashMap<>();

        for (Videojuego juego : juegos) {
            catalogo.put(juego.getNombre(), juego);
        }

        return catalogo;
    }

    public void buscarPorCategoria(ArrayList<Videojuego> juegos, String categoria) {
        for (Videojuego juego : juegos) {
            if (juego.getCategoria().contains(categoria)) {
                System.out.println(juego);
            }
        }
    }

    public void mostrarLista(List<Videojuego> juegos) {
        for (Videojuego juego : juegos) {
            System.out.println(juego);
        }
    }

    public void mostrarCantidadYPrimero(ArrayList<Videojuego> juegos) {
        System.out.println("Cantidad de videojuegos: " + juegos.size());

        if (!juegos.isEmpty()) {
            System.out.println("Primer videojuego: " + juegos.get(0));
        }
    }

    public void eliminarPrimero(ArrayList<Videojuego> juegos, HashMap<String, Videojuego> catalogo) {
        if (!juegos.isEmpty()) {
            Videojuego eliminado = juegos.remove(0);
            catalogo.remove(eliminado.getNombre());
            System.out.println("Videojuego eliminado: " + eliminado);
        } else {
            System.out.println("No hay videojuegos para eliminar.");
        }
    }

    public void mostrarUltimaAccion(Stack<String> historial) {
        if (!historial.empty()) {
            System.out.println("Última acción: " + historial.pop());
        } else {
            System.out.println("No hay acciones registradas.");
        }
    }
}