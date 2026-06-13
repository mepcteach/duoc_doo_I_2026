package app;

import model.Cliente;
import model.Producto;
import model.Proveedor;
import model.Venta;
import util.RutInvalidoException;
import util.RutValidator;

/**
 * Clase principal para probar el sistema Cerámicas del Sur.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        try {

            // Crear proveedor
            Proveedor proveedor = new Proveedor(
                    "María González",
                    "76086428-5",
                    "+56998765432",
                    "Arcillas del Sur"
            );

            // Validar RUT del proveedor
            RutValidator.validarRut(proveedor.getRut());

            // Crear cliente
            Cliente cliente = new Cliente(
                    "Juan Pérez",
                    "11111111-1",
                    "+56912345678",
                    "juan@email.cl"
            );

            // Validar RUT del cliente
            RutValidator.validarRut(cliente.getRut());

            // Crear producto
            Producto producto = new Producto(
                    1001,
                    "Jarrón Decorativo",
                    18990,
                    proveedor
            );

            // Crear venta
            Venta venta = new Venta(
                    1,
                    cliente,
                    producto,
                    2
            );

            // Mostrar información
            System.out.println("================================");
            System.out.println("      CERÁMICAS DEL SUR");
            System.out.println("================================");

            System.out.println("\nPROVEEDOR");
            System.out.println(proveedor);

            System.out.println("\nCLIENTE");
            System.out.println(cliente);

            System.out.println("\nPRODUCTO");
            System.out.println(producto);

            System.out.println("\nVENTA");
            System.out.println(venta);

        } catch (RutInvalidoException e) {

            System.out.println("ERROR DE VALIDACIÓN");
            System.out.println(e.getMessage());

        }
    }
}