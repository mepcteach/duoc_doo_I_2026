package util;

/**
 * Utilidad para validar RUT chileno.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class RutValidator {

    /**
     * Valida formato y módulo 11.
     *
     * @param rut RUT a validar.
     * @throws RutInvalidoException si el RUT es inválido.
     */
    public static void validarRut(String rut)
            throws RutInvalidoException {

        if (rut == null ||
                !rut.matches("^[0-9]{7,8}-[0-9kK]$")) {

            throw new RutInvalidoException(
                    "Formato de RUT inválido."
            );

        }

         if (!validarModulo11(rut)) {

            throw new RutInvalidoException(
                    "Dígito verificador incorrecto."
            );
        }
    }

    /**
     * Validación módulo 11.
     */
    private static boolean validarModulo11(String rut) {

        String[] partes = rut.split("-");

        String numero = partes[0];
        String dvIngresado = partes[1].toUpperCase();

        int suma = 0;
        int multiplicador = 2;

        for (int i = numero.length() - 1; i >= 0; i--) {

            suma += Character.getNumericValue(
                    numero.charAt(i)
            ) * multiplicador;

            multiplicador++;

            if (multiplicador > 7) {
                multiplicador = 2;
            }
        }

        int resto = 11 - (suma % 11);

        String dvCalculado;

        switch (resto) {
            case 11:
                dvCalculado = "0";
                break;
            case 10:
                dvCalculado = "K";
                break;
            default:
                dvCalculado = String.valueOf(resto);
        }

        return dvCalculado.equals(dvIngresado);
    }
}