package model;

 /**
 * Representa una maquinaria agrícola.
 *
 * @author Miguel Puebla
 * @version 1.0
 * @since Semana 2
 */
public class Maquinaria {

    private String tipo;
    private String estadoActual;

    public Maquinaria(String tipo, String estadoActual) {
        this.tipo = tipo;
        this.estadoActual = estadoActual;
    }

    public void operar() {
        System.out.println(tipo + " operando - estado: " + estadoActual);
    }

    @Override
    public String toString() {
        return tipo + " - " + estadoActual;
    }
}