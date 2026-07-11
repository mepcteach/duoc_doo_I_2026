package model;


import interfaces.Nadador;

/**
 * Tema 2: Implementación de interfaces.
 *
 * Representa un tiburón que hereda de Animal
 * e implementa la interfaz Nadador.
 *
 * @author Prof. Miguel Puebla
 */
public class Tiburon extends Animal implements Nadador {

    private double velocidadNado;

    public Tiburon(String codigo, String nombre,
                   int edad, double velocidadNado) {

        super(codigo, nombre, edad);
        this.velocidadNado = velocidadNado;
    }

    public double getVelocidadNado() {
        return velocidadNado;
    }

    @Override
    public void nadar() {
        System.out.println(
                getNombre() + " nada a "
                        + velocidadNado + " km/h."
        );
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "Tiburón | Código: " + getCodigo()
                        + " | Nombre: " + getNombre()
                        + " | Edad: " + getEdad()
                        + " | Velocidad: " + velocidadNado
        );
    }
}
