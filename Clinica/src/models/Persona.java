package models;

public abstract class Persona {
	
	private String nombre, dni, direccion;
	private int numeroContacto;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, String dni, String direccion, int numeroContacto) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.numeroContacto = numeroContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroContacto() {
		return numeroContacto;
	}
	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", numeroContacto="
				+ numeroContacto + "]";
	}
	

}
