package com.edukate;

public class MetaMensual {
    private date fechaInicio;
    private date fechaLimite;
    private float cantObjetivo;

    public date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public float getCantObjetivo() {
        return cantObjetivo;
    }

    public void setCantObjetivo(float cantObjetivo) {
        this.cantObjetivo = cantObjetivo;
    }
}
