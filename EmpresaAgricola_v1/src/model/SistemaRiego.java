package model;

/**
 * Representa un sistema de riego.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class SistemaRiego {

    private String tipo;
    private int litrosPorHora;

    public SistemaRiego(String tipo, int litrosPorHora) {
        this.tipo = tipo;
        this.litrosPorHora = litrosPorHora;
    }

    public void activar() {
        System.out.println("Riego " + tipo + " activado: " + litrosPorHora + " L/h");
    }

    @Override
    public String toString() {
        return tipo + " - " + litrosPorHora + " L/h";
    }
}