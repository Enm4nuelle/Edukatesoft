package com.edukate;

import java.util.ArrayList;

public class Administrador {
    private int id;
    private String nombre;
    private ArrayList<Empleador> empleadores;

    public Administrador(){
    }

    public Administrador(int id, String nombre,ArrayList<Empleador> empleadores){
        this.id = id;
        this.nombre = nombre;
        this.empleadores = empleadores;
    }

    public String getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Empleador> getEmpleadores() {
        return empleadores;
    }
    public void setEmpleadores(ArrayList<Empleador> empleadores) {
        this.empleadores = empleadores;
    }
    public void imprimirReporteIngresos(){
    }
    public void actualizarMetas(){
    }
}
