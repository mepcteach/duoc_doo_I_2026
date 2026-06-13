package util;

/**
 * Excepción personalizada para RUT inválido.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class RutInvalidoException extends Exception {

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}