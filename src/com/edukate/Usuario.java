package com.edukate;

public class Usuario{
    private String idUsuario;
    private String contrasena;
    private Rol rol;

    public Usuario(String idUsuario, String contrasena, Rol rol) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void cambiarContrasena(String nuevaContrasena){}

}