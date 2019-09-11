package com.edukate;
import java.util.ArrayList;
import com.edukate.LineaPedido;

public class Pedido{
	private static int contador;
	private ArrayList<LineaPedido> lineas;
	private float total;
	private EstadoPedido estado;
	private Cliente cliente;
	private Vendedor vendedor;
	
	public Pedido(){
	}
	public void agregarPedido(LineaPedido linea){
	}
	
	public void calcularTotal(){
	}
	
	public void SetTotal(int total){
	}
	
	public void SetCliente(Cliente cliente){
	}
	
	public void SetVendedor(Vendedor vendedor){
	}
	
	public void SetEstadoPedido(EstadoPedido estado){
	}

	public float GetTotal(){
		return total;
	}

	public EstadoPedido GetEstado(){
		return estado;
	}

	public Cliente GetCliente(){
		return cliente;
	}

	public Vendedor GetVendedor(){
		return vendedor;
	}
}