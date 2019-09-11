package com.edukate;

public class Provincia {
	private String nombProv;
	private String idProv;
	private Departamento departamento;

	public Provincia(){
		departamento = new Departamento();
	}

	public String getNombProv() {
		return nombProv;
	}

	public void setNombProv(String nombProv) {
		this.nombProv = nombProv;
	}

	public String getIdProv() {
		return idProv;
	}

	public void setIdProv(String idProv) {
		this.idProv = idProv;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}