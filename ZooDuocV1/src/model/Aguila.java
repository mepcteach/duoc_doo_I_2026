package model;


import interfaces.Volador;

/**
 * Tema 2: Implementación de interfaces.
 *
 * Representa un águila que hereda de Animal
 * e implementa la interfaz Volador.
 *
 * @author Prof. Miguel Puebla
 */
public class Aguila extends Animal implements Volador {

    private double alturaVuelo;

    public Aguila(String codigo, String nombre,
                  int edad, double alturaVuelo) {

        super(codigo, nombre, edad);
        this.alturaVuelo = alturaVuelo;
    }

    public double getAlturaVuelo() {
        return alturaVuelo;
    }

    @Override
    public void volar() {
        System.out.println(
                getNombre() + " vuela a "
                        + alturaVuelo + " metros."
        );
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "Águila | Código: " + getCodigo()
                        + " | Nombre: " + getNombre()
                        + " | Edad: " + getEdad()
                        + " | Altura de vuelo: " + alturaVuelo
        );
    }
}