package com.edukate;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String idDep;
	private ArrayList<Provincia> provincias;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdDep() {
		return idDep;
	}

	public void setIdDep(String idDep) {
		this.idDep = idDep;
	}

	public ArrayList<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}
}