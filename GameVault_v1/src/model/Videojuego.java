package model;

/**
 * Representa un videojuego disponible en GameVault.
 */
public class Videojuego {

    private String nombre;
    private String categoria;
    private double precio;

    public Videojuego(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return nombre + " | " + categoria + " | $" + precio;
    }
}