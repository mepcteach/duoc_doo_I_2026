package ui;

import java.util.Scanner;

/**
 * Muestra el menú principal y captura datos ingresados por el usuario.
 */
public class Menu {

    private Scanner teclado = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n===== GAMEVAULT =====");
        System.out.println("1. Mostrar catálogo completo");
        System.out.println("2. Buscar videojuegos por categoría");
        System.out.println("3. Mostrar destacados");
        System.out.println("4. Mostrar cantidad y primer videojuego");
        System.out.println("5. Eliminar primer videojuego");
        System.out.println("6. Buscar videojuego por nombre");
        System.out.println("7. Mostrar última acción");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = teclado.nextInt();
        teclado.nextLine();

        return opcion;
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return teclado.nextLine();
    }

    public void cerrar() {
        teclado.close();
    }
}