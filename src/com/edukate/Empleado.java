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
	public Empleado(){
		user = new Usuario();
		this.id = codigoGenerado;
		codigoGenerado++;
	}
	public Empleado(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo, 
					char estadoCivil, float sueldo){}
	public int getId(){}
	public void setId(int id){}
	public String getNombre(){}
	public void setNombre(String nombre){}
	public String setApellidos(){}
	public void getApellidos(String apellidos){}
	public String getDni(){}
	public void setDni(String dni){}
	public int getEdad(){}
	public void setEdad(int edad){}
	public String getTelefono(){}
	public void setTelefono(String telefono){}
	public String getDireccion(){}
	public void setDireccion(String direccion){}
	public String getCorreo(){}
	public void setCorreo(String correo){}
	public char getEstadoCivil(){}
	public void setEstadoCivil(char estadoCivil){}
	public float getSueldo(){}
	public void setSueldo(float sueldo){}
	public Usuario getUser(){}
	public void setUser(Usuario user){}
	
	abstract float calcularSueldo(){
	}
	
}