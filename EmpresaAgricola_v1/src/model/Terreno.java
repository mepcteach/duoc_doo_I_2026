package model;



/**
 * Representa un terreno agrícola.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class Terreno {

    private double hectareas;
    private String tipoDeSuelo;

    public Terreno(double hectareas, String tipoDeSuelo) {
        this.hectareas = hectareas;
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public double getHectareas() {
        return hectareas;
    }

    public String getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public String getInfo() {
        return hectareas + " ha - suelo: " + tipoDeSuelo;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}