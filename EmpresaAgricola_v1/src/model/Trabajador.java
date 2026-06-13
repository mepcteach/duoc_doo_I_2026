package model;

/**
 * Representa un trabajador agrícola.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class Trabajador {

    private String nombre;
    private String especialidad;

    public Trabajador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void trabajar() {
        System.out.println(nombre + " trabajando como " + especialidad);
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}