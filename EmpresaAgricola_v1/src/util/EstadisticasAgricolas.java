package util;

/**
 * Realiza cálculos agrícolas simples.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class EstadisticasAgricolas {

    private double toneladasPorHectarea;
    private double precioPorTonelada;

    public EstadisticasAgricolas(double toneladasPorHectarea,
                                 double precioPorTonelada) {
        this.toneladasPorHectarea = toneladasPorHectarea;
        this.precioPorTonelada = precioPorTonelada;
    }

    public double calcularProduccion(double hectareas) {
        return hectareas * toneladasPorHectarea;
    }

    public double calcularIngresos(double hectareas) {
        return calcularProduccion(hectareas) * precioPorTonelada;
    }

    public void mostrarEstadisticas(double hectareas) {
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Producción estimada: " + calcularProduccion(hectareas) + " toneladas");
        System.out.println("Ingresos estimados: $" + calcularIngresos(hectareas));
    }
}