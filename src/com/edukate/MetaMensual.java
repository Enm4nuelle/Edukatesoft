package com.edukate;
import java.util.Date;

public class MetaMensual {
    private Date fechaInicio;
    private Date fechaLimite;
    private float cantObjetivo;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public float getCantObjetivo() {
        return cantObjetivo;
    }

    public void setCantObjetivo(float cantObjetivo) {
        this.cantObjetivo = cantObjetivo;
    }
}
