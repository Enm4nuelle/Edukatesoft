package com.edukate;

public class LineaPedido {
	private Producto producto;
	private int cantidad;
	private float subtotal;
	private int estado;

	public LineaPedido() {

	}

	public void agregarProducto(Producto producto) {
		this.producto = producto;
	}

	public Producto GetProducto() {
		return producto;
	}

	public void SetCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int GetCantidad() {
		return cantidad;
	}

	public void SetSubtotal() {

	}

	public float GetSubtotal() {
		return subtotal;
	}

	public void SetEstado(int estado) {
		this.estado = estado;
	}

	public int GetEstado(){
		return estado;
	}
}