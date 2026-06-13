package model;

public class ProductoTecnologico {

    /*
    Tema 3: Modificadores de acceso
    Los atributos son private para aplicar encapsulamiento.
   */
    private String nombre;
    private String marca;
    private double precio;


    /*
     Tema 5: Constructores
     Inicializa el objeto al momento de crearlo con new.
    */
    public ProductoTecnologico(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    /*
    Tema 4: Métodos get y set
    Permiten acceder y modificar atributos de forma controlada.
   */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        // Validación básica
        if (precio > 0) {
            this.precio = precio;
        }
    }


    /*
   Tema 6: Metodo toString()
   Personaliza cómo se muestra el objeto en pantalla.
  */
    @Override
    public String toString() {
        return marca + " " + nombre + " - $" + precio;
    }


}
