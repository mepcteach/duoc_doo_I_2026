package app;

import model.EmpresaAgricola;
import model.Maquinaria;
import model.Trabajador;
import util.EstadisticasAgricolas;
import util.ReporteAgricola;

import java.util.List;

/**
 * Punto de entrada del sistema agrícola.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class Main {

    public static void main(String[] args) {

        List<Trabajador> equipo = List.of(
                new Trabajador("Carlos", "Cosecha"),
                new Trabajador("María", "Poda")
        );

        List<Maquinaria> flota = List.of(
                new Maquinaria("Tractor", "Operativo"),
                new Maquinaria("Cosechadora", "Mantención")
        );

        EmpresaAgricola empresa = new EmpresaAgricola(
                "Hacienda El Roble",
                120.5,
                "Arcilloso",
                "Trigo",
                "Invierno",
                equipo,
                flota
        );

        ReporteAgricola reporte = new ReporteAgricola(
                "REPORTE AGRÍCOLA",
                "Miguel Puebla"
        );

        reporte.mostrarEncabezado();
        reporte.generarResumen(empresa);

        empresa.iniciarJornada();

        EstadisticasAgricolas estadisticas =
                new EstadisticasAgricolas(4.2, 250000);

        estadisticas.mostrarEstadisticas(
                empresa.getTerreno().getHectareas()
        );

        System.out.println("\nLa empresa cierra...");

        // Agregación: el trabajador sigue existiendo fuera de la empresa.
        equipo.get(0).trabajar();
    }
}