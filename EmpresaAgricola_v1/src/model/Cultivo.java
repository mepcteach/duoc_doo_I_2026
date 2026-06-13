package model;

/**
 * Representa un cultivo agrícola.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class Cultivo {

    private String tipoPlanta;
    private String temporada;

    public Cultivo(String tipoPlanta, String temporada) {
        this.tipoPlanta = tipoPlanta;
        this.temporada = temporada;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public String getTemporada() {
        return temporada;
    }

    public void sembrar() {
        System.out.println("Sembrando " + tipoPlanta + " en temporada " + temporada);
    }

    @Override
    public String toString() {
        return tipoPlanta + " - temporada " + temporada;
    }
}