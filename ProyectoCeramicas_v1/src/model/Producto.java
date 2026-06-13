package model;

/**
 * Representa un producto fabricado o comercializado
 * por Cerámicas del Sur.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private Proveedor proveedor;

    /**
     * Constructor de Producto.
     */
    public Producto(int codigo,
                    String nombre,
                    double precio,
                    Proveedor proveedor) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=$" + precio +
                ", proveedor='" + proveedor.getEmpresa() + '\'' +
                '}';
    }
}