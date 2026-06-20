package org.example.data;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.model.Videojuego;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * Gestiona la colección de videojuegos del sistema PuertoGames.
 * Permite agregar videojuegos, mostrarlos por pantalla,
 * realizar búsquedas y cargar información desde archivos Excel.
 *
 * Esta clase actúa como intermediaria entre la interfaz de usuario
 * y los datos almacenados en memoria.
 *
 * @author Miguel Puebla
 * @version 1.0
 */
public class GestorVideojuegos {

    private ArrayList<Videojuego> videojuegos;
    /**
     * Constructor de la clase GestorVideojuegos.
     * Inicializa la colección de videojuegos vacía.
     */
    public GestorVideojuegos() {
        videojuegos = new ArrayList<>();
    }


    /**
     * Agrega un videojuego a la colección.
     *
     * @param videojuego Objeto Videojuego que será incorporado.
     */
    public void agregar(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

    public void mostrarTodos() {
        for (Videojuego v : videojuegos) {
            System.out.println(v);
        }
    }

    /**
     * Busca videojuegos según su género y muestra los resultados.
     *
     * @param genero Género que se desea buscar.
     */
    public void buscarPorGenero(String genero) {
        for (Videojuego v : videojuegos) {
            if (v.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(v);
            }
        }
    }

    /**
            * Carga videojuegos desde un archivo Excel (.xlsx)
     * y los incorpora a la colección.
            *
            * @param rutaArchivo Ruta del archivo Excel a procesar.
     */
    public void cargarDesdeExcel(String rutaArchivo) {
        try {
            FileInputStream archivo = new FileInputStream(rutaArchivo);
            Workbook libro = new XSSFWorkbook(archivo);
            Sheet hoja = libro.getSheetAt(0);

            for (int i = 1; i <= hoja.getLastRowNum(); i++) {
                Row fila = hoja.getRow(i);

                String titulo = fila.getCell(0).getStringCellValue();
                String genero = fila.getCell(1).getStringCellValue();
                double precio = fila.getCell(2).getNumericCellValue();

                videojuegos.add(new Videojuego(titulo, genero, precio));
            }

            libro.close();
            archivo.close();

            System.out.println("Datos cargados correctamente desde Excel.");

        } catch (Exception e) {
            System.out.println("Error al leer el archivo Excel: " + e.getMessage());
        }
    }
}
