package service;

import interfaces.Nadador;
import interfaces.Volador;
import model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Tema 3: Colecciones genéricas de interfaces.
 * Tema 4: Validación de tipos con instanceof.
 * Tema 5: Integración de la aplicación.
 *
 * Gestiona los animales del zoológico y permite
 * ejecutar operaciones generales y específicas.
 *
 * @author Prof. Miguel Puebla
 */
public class GestorZoologico {

    private List<Animal> animales;

    public GestorZoologico() {
        animales = new ArrayList<>();
    }

    /**
     * Agrega un animal a la colección.
     *
     * @param animal animal que será incorporado
     */
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    /**
     * Muestra todos los animales registrados.
     */
    public void listarAnimales() {
        System.out.println("\n--- ANIMALES DEL ZOOLÓGICO ---");

        for (Animal animal : animales) {
            animal.mostrarInformacion();
        }
    }

    /**
     * Busca un animal por su código.
     *
     * @param codigo código del animal
     * @return animal encontrado o null
     */
    public Animal buscarPorCodigo(String codigo) {

        for (Animal animal : animales) {
            if (animal.getCodigo().equalsIgnoreCase(codigo)) {
                return animal;
            }
        }

        return null;
    }

    /**
     * Crea una colección genérica basada en la interfaz Volador.
     *
     * @return lista de animales voladores
     */
    public List<Volador> obtenerVoladores() {

        List<Volador> voladores = new ArrayList<>();

        for (Animal animal : animales) {
            if (animal instanceof Volador) {
                voladores.add((Volador) animal);
            }
        }

        return voladores;
    }

    /**
     * Crea una colección genérica basada en la interfaz Nadador.
     *
     * @return lista de animales nadadores
     */
    public List<Nadador> obtenerNadadores() {

        List<Nadador> nadadores = new ArrayList<>();

        for (Animal animal : animales) {
            if (animal instanceof Nadador) {
                nadadores.add((Nadador) animal);
            }
        }

        return nadadores;
    }

    /**
     * Ejecuta los comportamientos específicos según
     * las interfaces implementadas por cada animal.
     */
    public void ejecutarHabilidades() {

        System.out.println("\n--- HABILIDADES DE LOS ANIMALES ---");

        for (Animal animal : animales) {

            System.out.println("\nAnimal: " + animal.getNombre());

            if (animal instanceof Volador) {
                Volador volador = (Volador) animal;
                volador.volar();
            }

            if (animal instanceof Nadador) {
                Nadador nadador = (Nadador) animal;
                nadador.nadar();
            }
        }
    }

    /**
     * Retorna la cantidad de animales registrados.
     *
     * @return total de animales
     */
    public int contarAnimales() {
        return animales.size();
    }
}