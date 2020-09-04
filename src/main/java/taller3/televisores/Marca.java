package taller3.televisores;

public class Marca {
	private String nombre = new String();

	public Marca(String nombre1) {
		this.nombre = nombre1;
	}


	public Marca() {
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}