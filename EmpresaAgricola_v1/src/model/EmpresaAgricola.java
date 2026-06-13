package model;


import java.util.List;

/**
 * Representa una empresa agrícola.
 *
 * Aplica composición con Terreno, Cultivo y SistemaRiego.
 * Aplica agregación con Trabajador y Maquinaria.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class EmpresaAgricola {

    private String nombre;

    // Composición: la empresa crea y posee estos objetos.
    private Terreno terreno;
    private Cultivo cultivo;
    private SistemaRiego sistemaRiego;

    // Agregación: estos objetos llegan desde fuera.
    private List<Trabajador> trabajadores;
    private List<Maquinaria> maquinarias;

    public EmpresaAgricola(String nombre,
                           double hectareas,
                           String suelo,
                           String planta,
                           String temporada,
                           List<Trabajador> trabajadores,
                           List<Maquinaria> maquinarias) {

        this.nombre = nombre;

        //composición
        this.terreno = new Terreno(hectareas, suelo);
        this.cultivo = new Cultivo(planta, temporada);
        this.sistemaRiego = new SistemaRiego("Goteo", 500);

        //agregacion
        this.trabajadores = trabajadores;
        this.maquinarias = maquinarias;
    }

    public String getNombre() {
        return nombre;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public List<Maquinaria> getMaquinarias() {
        return maquinarias;
    }

    public void iniciarJornada() {
        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Terreno: " + terreno);
        System.out.println("Cultivo: " + cultivo);
        System.out.println("Sistema de riego: " + sistemaRiego);

        System.out.println("\n====================");
        cultivo.sembrar();
        sistemaRiego.activar();

        System.out.println("\n====================");
        for (Trabajador trabajador : trabajadores) {
            trabajador.trabajar();
        }

        System.out.println("\n====================");
        for (Maquinaria maquinaria : maquinarias) {
            maquinaria.operar();
        }
    }

    @Override
    public String toString() {
        return nombre + " | Terreno: " + terreno + " | Cultivo: " + cultivo;
    }
}