package model;


/**
 * Tema 5: Integración de aplicaciones orientadas a objetos.
 *
 * Superclase abstracta que almacena los atributos
 * comunes de los animales del zoológico.
 *
 * @author Prof. Miguel Puebla
 */
public abstract class Animal {

    private String codigo;
    private String nombre;
    private int edad;

    public Animal(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public abstract void mostrarInformacion();
    /**
     * Muestra la información general del animal.
     * Cada subclase debe implementar su propia versión.
     */

}