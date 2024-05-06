package models;

public class Veterinario extends Persona{

	private int nroColegiado;

	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinario(String nombre, String dni, String direccion, int numeroContacto) {
		super(nombre, dni, direccion, numeroContacto);
		// TODO Auto-generated constructor stub
	}

	public int getNroColegiado() {
		return nroColegiado;
	}

	public void setNroColegiado(int nroColegiado) {
		this.nroColegiado = nroColegiado;
	}
	
}
