package com.edukate;

import java.util.ArrayList;
import java.util.Date;

public class Solicitud {
    private int id;
    private String descripcion;
    private int estado;
    private Date fecha;
    private Logistica logistica;
    private Facturador facturador;
    private Pedido pedido;
    private ArrayList <LineaSolicitud> lineasSolicitud;

    public Solicitud(){
        logistica = new Logistica();
        facturador = new Facturador();
        pedido = new Pedido();
        lineasSolicitud = new ArrayList <LineaSolicitud>();
    }

    public Solicitud(int id, String descripcion, int estado, Date fecha,Logistica logistica,Facturador facturador, Pedido pedido,ArrayList <LineaSolicitud> lineasSolicitud){
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha = fecha;
        this.logistica = logistica;
        this.facturador = facturador;
        this.pedido = pedido;
        this.lineasSolicitud = lineasSolicitud;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado){
        this.estado = estado;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Logistica getLogistica() {
        return logistica;
    }
    public void setLogistica(Logistica logistica){
        this.logistica = logistica;
    }
    public Facturador getFacturador() {
        return facturador;
    }
    public void setFacturador(Facturador facturador){
        this.facturador = facturador;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
    public ArrayList<LineaSolicitud> getLineasSolicitud() {
        return lineasSolicitud;
    }
    public void setLineaSolicitud(ArrayList<LineaSolicitud> lineasSolicitud) {
        this.lineasSolicitud = lineasSolicitud;
    }
}
