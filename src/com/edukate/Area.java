package com.edukate;

import java.util.ArrayList;

public class Area {
    private int id;
    private String nombre;
    private ArrayList<Empleador> empleadores;
    private ArrayList<MetaMensual> metasMensuales;

    public Area(){
        empleadores = new ArrayList <Empleador>();
        metasMensuales = new ArrayList <MetaMensual>();
    }

    public Area(int id, String nombre,ArrayList<Empleador> empleadores, ArrayList<MetaMensual> metasMensuales){
        this.id = id;
        this.nombre = nombre;
        this.empleadores = empleadores;
        this.metasMensuales = metasMensuales;
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
    public ArrayList<MetaMensual> getMetasMensuales() {
        return metasMensuales;
    }
    public void setMetasMensuales(ArrayList<MetaMensual> metasMensuales) {
        this.metasMensuales = metasMensuales;
    }
}
