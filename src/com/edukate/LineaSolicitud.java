package com.edukate;

public class LineaSolicitud {
    private int id;
    private int cantidad;

    public LineaSolicitud(){
    }

    public LineaSolicitud(int id, int cantidad){
        this.id = id;
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}
