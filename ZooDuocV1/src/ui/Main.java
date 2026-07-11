package ui;

import interfaces.Nadador;
import interfaces.Volador;
import model.Aguila;
import model.Animal;
import model.Pato;
import model.Tiburon;
import service.GestorZoologico;

import java.util.List;

/**
 * Tema 5: Integración de aplicaciones orientadas a objetos.
 *
 * Clase principal que crea los objetos, utiliza el gestor
 * y ejecuta todas las operaciones del zoológico.
 *
 * @author Prof. Miguel Puebla
 */
public class Main {

    public static void main(String[] args) {

        GestorZoologico gestor = new GestorZoologico();

        Animal aguila = new Aguila(
                "A001",
                "Áquila",
                5,
                1200
        );

        Animal tiburon = new Tiburon(
                "T001",
                "Tiburón Blanco",
                8,
                45
        );

        Animal pato = new Pato(
                "P001",
                "Donald",
                3,
                "Amarillo"
        );

        gestor.agregarAnimal(aguila);
        gestor.agregarAnimal(tiburon);
        gestor.agregarAnimal(pato);

        gestor.listarAnimales();

        System.out.println(
                "\nCantidad de animales: "
                        + gestor.contarAnimales()
        );

        gestor.ejecutarHabilidades();

        System.out.println("\n--- COLECCIÓN DE VOLADORES ---");

        List<Volador> voladores = gestor.obtenerVoladores();

        for (Volador volador : voladores) {
            volador.volar();
        }

        System.out.println("\n--- COLECCIÓN DE NADADORES ---");

        List<Nadador> nadadores = gestor.obtenerNadadores();

        for (Nadador nadador : nadadores) {
            nadador.nadar();
        }

        System.out.println("\n--- BÚSQUEDA POR CÓDIGO ---");

        Animal encontrado = gestor.buscarPorCodigo("P001");

        if (encontrado != null) {
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Animal no encontrado.");
        }
    }
}