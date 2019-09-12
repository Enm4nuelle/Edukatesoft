package com.edukate;
import java.util.ArrayList;
public class Logistica extends Empleado {
    private ArrayList<Solicitud> solicitudes;
    public Logistica(){}
    public Logistica(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo,
                      char estadoCivil, float sueldo){
    }
    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    //@Override
    //public float calcularSueldo(){}
    //public String obtenerListaSolicitudesSinStock(){}
    public void crearProdcuto(){}
    public void modificarProducto(int stock){}



}
