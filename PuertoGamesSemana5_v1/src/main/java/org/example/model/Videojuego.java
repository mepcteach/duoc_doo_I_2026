package org.example.model;



/**
 * Representa un videojuego dentro del sistema PuertoGames.
 * Almacena información básica como el título, género y precio
 * de un videojuego cargado desde el sistema o desde un archivo Excel.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Videojuego {

    private String titulo;
    private String genero;
    private double precio;

    /**
     * Constructor de la clase Videojuego.
     *
     * @param titulo Nombre del videojuego.
     * @param genero Género al que pertenece el videojuego.
     * @param precio Precio del videojuego.
     */
    public Videojuego(String titulo, String genero, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Videojuego: " + titulo +
                " | Género: " + genero +
                " | Precio: $" + precio;
    }
}
