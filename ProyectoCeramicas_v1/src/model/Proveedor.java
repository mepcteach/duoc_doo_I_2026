package model;

/**
 * Representa un proveedor de Cerámicas del Sur.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Proveedor extends Persona {

    private String empresa;

    /**
     * Constructor de Proveedor.
     */
    public Proveedor(String nombre,
                     String rut,
                     String telefono,
                     String empresa) {

        setNombre(nombre);
        setRut(rut);
        setTelefono(telefono);

        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}