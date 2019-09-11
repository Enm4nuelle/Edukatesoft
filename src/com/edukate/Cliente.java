package com.edukate;

public abstract class Cliente {
    protected String Direccion;
    protected String Telefono;
    protected Provincia provincia;
    protected String correo;
    protected Tipo_Cliente tipoCliente;

    public Provincia getProvincia() {
        return provincia;
    }

    public Tipo_Cliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Tipo_Cliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
