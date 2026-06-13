package model;

/**
 * Representa una persona dentro del sistema.
 * Clase base para Cliente y Proveedor.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Persona {

    private String nombre;
    private String rut;
    private String telefono;

    /**
     * Constructor vacío.
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros.
     */
    public Persona(String nombre, String rut, String telefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}