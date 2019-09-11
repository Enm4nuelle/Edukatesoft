package com.edukate;
import java.util.ArrayList;
public class Facturador extends Empleado{
    private ArrayList<Solicitud> solicitudes;
    public Facturador(){}
    public Facturador(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo,
                      char estadoCivil, float sueldo){
    }
    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    @Override
    public float calcularSueldo(){}
    public void actualizarStock(Producto prod){}
    public String registrarPago(){}
    public void consultarProductosFaltantes(Pedido ped){}

}
