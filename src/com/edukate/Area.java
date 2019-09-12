package com.edukate;

import java.util.ArrayList;

public class Area {
    private int id;
    private String nombre;
    private ArrayList<Empleado> empleadores;
    private ArrayList<MetaMensual> metasMensuales;

    public Area(){
        empleadores = new ArrayList <Empleado>();
        metasMensuales = new ArrayList <MetaMensual>();
    }

    public Area(int id, String nombre,ArrayList<Empleado> empleadores, ArrayList<MetaMensual> metasMensuales){
        this.id = id;
        this.nombre = nombre;
        this.empleadores = empleadores;
        this.metasMensuales = metasMensuales;
    }
    public int getId() {
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
    public ArrayList<Empleado> getEmpleadores() {
        return empleadores;
    }
    public void setEmpleadores(ArrayList<Empleado> empleadores) {
        this.empleadores = empleadores;
    }
    public ArrayList<MetaMensual> getMetasMensuales() {
        return metasMensuales;
    }
    public void setMetasMensuales(ArrayList<MetaMensual> metasMensuales) {
        this.metasMensuales = metasMensuales;
    }
}
