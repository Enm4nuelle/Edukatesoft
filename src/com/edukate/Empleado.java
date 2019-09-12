package com.edukate;
public abstract class Empleado{
	//Variable constante que nos permitira generar un id correlativo
	private static int codigoGenerado = 1; 
	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private String telefono;
	private String direccion;
	private String correo;
	private char estadoCivil;
	private float sueldo;
	private Usuario user;
	private Area area;
	public Empleado(){}
	public Empleado(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo, 
					char estadoCivil, float sueldo){}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String setApellidos(){
		return apellidos;
	}
	public void getApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	public String getDni(){
		return dni;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public String getCorreo(){
		return correo;
	}
	public void setCorreo(String correo){
		this.correo = correo;
	}
	public char getEstadoCivil(){
		return estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil){
		this.estadoCivil = estadoCivil;
	}
	public float getSueldo(){
		return sueldo;
	}
	public void setSueldo(float sueldo){
		this.sueldo = sueldo;
	}
	public Usuario getUser(){
		return user;
	}
	public void setUser(Usuario user){
		this.user = user;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	//public abstract float calcularSueldo();
	
}