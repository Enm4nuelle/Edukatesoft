package com.edukate;
import java.util.ArrayList;

public class Comercial extends Worker{
    private MetaMensual metaMensual;
    private ArrayList<Vendedor> vendedores;

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public MetaMensual getMetaMensual() {
        return metaMensual;
    }

    public void setMetaMensual(MetaMensual metaMensual) {
        this.metaMensual = metaMensual;
    }

    public void modificarObjetoVendedor(Vendedor vendedor){}
    public Vendedor obtenerMejorVendedor(){}
    public Vendedor obtenerPeorVendedor(){}
    public void mostrarVendedoresOrdPorVentas(){}
    public void administrarMetaMensual(){}
}