package model;

import interfaces.Nadador;
import interfaces.Volador;

/**
 * Tema 2: Implementación de múltiples interfaces.
 *
 * Representa un pato que puede volar y nadar,
 * por lo que implementa dos interfaces.
 *
 * @author Prof. Miguel Puebla
 */
public class Pato extends Animal
        implements Volador, Nadador {

    private String color;

    public Pato(String codigo, String nombre,
                int edad, String color) {

        super(codigo, nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void volar() {
        System.out.println(
                getNombre() + " vuela sobre el zoológico."
        );
    }

    @Override
    public void nadar() {
        System.out.println(
                getNombre() + " nada en el estanque."
        );
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "Pato | Código: " + getCodigo()
                        + " | Nombre: " + getNombre()
                        + " | Edad: " + getEdad()
                        + " | Color: " + color
        );
    }
}