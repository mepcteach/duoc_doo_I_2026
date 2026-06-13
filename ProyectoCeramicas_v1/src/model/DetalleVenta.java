package model;

/**
 * Representa el detalle de una venta.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class DetalleVenta {

    private Producto producto;
    private int cantidad;

    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() +
                " x " + cantidad +
                " = $" + calcularSubtotal();
    }
}