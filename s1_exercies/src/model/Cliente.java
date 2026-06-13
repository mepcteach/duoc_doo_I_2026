package model;

public class Cliente {

    // private: solo accesible dentro de la misma clase
    private String nombre;

    // protected: accesible en el mismo paquete y subclases
    protected String correo;

    // public: accesible desde cualquier clase
    private int edad;

    // default/package-private:
    // accesible solo dentro del mismo paquete
    public boolean esvip;


    /*

     private String nombre;
     private String correo;
     private int edad;
     private boolean esvip;

     */



    // Constructor
    public Cliente(String nombre, String correo, int edad, boolean esvip) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.esvip = esvip;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Representación textual del objeto
    @Override
    public String toString() {
        return nombre + " (" + correo + ")" + "  Edad: " + edad + " años";
    }


}
