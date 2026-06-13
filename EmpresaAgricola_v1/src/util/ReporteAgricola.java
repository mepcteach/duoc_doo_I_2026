package util;

import model.EmpresaAgricola;

/**
 * Genera reportes simples de una empresa agrícola.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class ReporteAgricola {

    private String titulo;
    private String responsable;

    public ReporteAgricola(String titulo, String responsable) {
        this.titulo = titulo;
        this.responsable = responsable;
    }

    public void mostrarEncabezado() {
        System.out.println("\n=========================");
        System.out.println(titulo);
        System.out.println("=========================");
        System.out.println("Responsable: " + responsable);
    }

    public void generarResumen(EmpresaAgricola empresa) {
        System.out.println("\nEmpresa: " + empresa.getNombre());
        System.out.println("Terreno: " + empresa.getTerreno());
        System.out.println("Trabajadores: " + empresa.getTrabajadores().size());
        System.out.println("Maquinarias: " + empresa.getMaquinarias().size());
    }

    @Override
    public String toString() {
        return titulo + " - " + responsable;
    }
}