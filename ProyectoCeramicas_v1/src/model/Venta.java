package model;

/**
 * Representa una venta realizada a un cliente.
 *
 * Relación de composición:
 * Una Venta está compuesta por un DetalleVenta.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Venta {

    private int numeroVenta;
    private Cliente cliente;

    // COMPOSICIÓN
    private DetalleVenta detalle;

    public Venta(int numeroVenta,
                 Cliente cliente,
                 Producto producto,
                 int cantidad) {

        this.numeroVenta = numeroVenta;
        this.cliente = cliente;

        /*
         * La venta crea su propio detalle.
         * El detalle pertenece a la venta.
         */
        this.detalle = new DetalleVenta(producto, cantidad);
    }

    public double calcularTotal() {
        return detalle.calcularSubtotal();
    }

    @Override
    public String toString() {

        return "\n=== VENTA N° " + numeroVenta + " ===" +
                "\nCliente: " + cliente.getNombre() +
                "\nDetalle: " + detalle +
                "\nTotal: $" + calcularTotal();
    }
}