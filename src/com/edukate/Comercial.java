package com.edukate;

public class Comercial extends Empleado{
    public Comercial(){}
    public Comercial(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo,
                     char estadoCivil, float sueldo){
    }
    //@Override
    //public float calcularSueldo(){}
    public void definirMeta(Vendedor vend){}
    public void definirComision(Vendedor vend){}
    public void definirBono(Vendedor vend){}
}
