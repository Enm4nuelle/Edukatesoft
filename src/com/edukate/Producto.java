package com.edukate;

public class Producto{
	private static int contador = 1;
	private int id;
	private int stockEmpresa;
	private int stockVendedor;
	private float precioUnitario;
	private String nombre;
	private String descripcion;
	
	public Producto(){

	}

	public void SetStockEmpresa(int stockEmpresa){
		this.stockEmpresa = stockEmpresa;
	}

	public void SetStockVendedor(int stockVendedor){
		this.stockVendedor = stockVendedor;
	}

	public int GetStockEmpresa(){
		return stockEmpresa;
	}

	public int GetStockVendedor(){
		return stockVendedor;
	}

	public void SetPrecioUnitario(float precioUnitario){
		this.precioUnitario = precioUnitario;
	}
	public float GetPrecioUnitario(){
		return precioUnitario;
	}
	public void SetNombre(String nombre){
		this.nombre = nombre;
	}
	public void SetDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public String GetNombre(){
		return nombre;
	}
	public String GetDescripcion(){
		return descripcion;
	}
}