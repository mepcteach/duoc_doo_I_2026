package data;

import model.Videojuego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Lee archivos de texto y convierte cada línea en objetos Videojuego.
 */
public class CargadorVideojuegos {

    public ArrayList<Videojuego> cargarVideojuegos(String ruta) {
        ArrayList<Videojuego> lista = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(";");

                Videojuego juego = new Videojuego(
                        datos[0],
                        datos[1],
                        Double.parseDouble(datos[2])
                );

                lista.add(juego);
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
}