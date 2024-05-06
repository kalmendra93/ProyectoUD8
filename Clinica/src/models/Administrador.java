package models;

public class Administrador {
	
	private String usuario, password;

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
