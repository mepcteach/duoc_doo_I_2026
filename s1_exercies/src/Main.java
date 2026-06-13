import model.Cliente;
import model.ProductoTecnologico;
import model.Venta;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Ana Pérez",
                "ana@mail.com",
                28,
                true
        );

        //modificar atrbutos del Cliente
        //cliente.setCorreo("ana_rivas@gmail.com");

        //System.out.println("Esta es la Venta para: " +cliente.getNombre() + " Es Cliente Vip: " + cliente.esvip);

        ProductoTecnologico producto = new ProductoTecnologico(
                "Notebook Gamer",
                "Lenovo",
                899990
        );

        /*
         La venta integra otras clases.
         Aplicación práctica de DOO.
        */
        Venta venta = new Venta(
                cliente,
                producto,
                2
        );

        // Mostrar resultado usando toString()
        System.out.println(venta);


    }
}