package com.edukate;
import java.util.ArrayList;
public class Vendedor extends Empleado{
	private ArrayList<Pedido> pedidos;
	private ArrayList<ObjetivoVendedor> objetivos;
	public Vendedor(){}
	public Vendedor(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo, 
					char estadoCivil, float sueldo){}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ArrayList<ObjetivoVendedor> getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(ArrayList<ObjetivoVendedor> objetivos) {
		this.objetivos = objetivos;
	}

	public String mostrarCatalogoProductos(){}
	@Override
	public float calcularMostrarSueldo(){}
}