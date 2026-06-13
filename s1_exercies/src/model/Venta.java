// ==========================
// PAQUETE: model
// CLASE: Venta
// ==========================

package model;

/*
 Tema 1 y 2:
 La clase Venta representa una venta real dentro del sistema.
*/
public class Venta {

    /*
     Relación entre clases:
     Venta tiene un Cliente y un ProductoTecnologico.
     Esto corresponde a composición (has-a).
    */
    private Cliente cliente;
    private ProductoTecnologico producto;

    private int cantidad;

    // Constructor
    public Venta(Cliente cliente, ProductoTecnologico producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Metodo de cálculo
    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    // toString para mostrar toda la venta
    @Override
    public String toString() {

        return "Cliente: " + cliente +
                "Correo cliente: " + cliente.correo +  // no al inicio
                "\nProducto: " + producto +
                "\nCantidad: " + cantidad +
                "\nTotal: $" + calcularTotal();
    }
}