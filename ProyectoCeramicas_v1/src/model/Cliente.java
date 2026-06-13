package model;

/**
 * Representa un cliente de Cerámicas del Sur.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Cliente extends Persona {

    private String correo;

    /**
     * Constructor de Cliente.
     */
    public Cliente(String nombre,
                   String rut,
                   String telefono,
                   String correo) {

        setNombre(nombre);
        setRut(rut);
        setTelefono(telefono);

        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}