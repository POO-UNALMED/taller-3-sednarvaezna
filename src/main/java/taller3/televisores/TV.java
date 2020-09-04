package taller3.televisores;

public class TV {
	private Marca marca = new Marca();
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control = new Control();
	public static int numTV;
	
	public TV(Marca marca1, boolean estado1) {
		this.setMarca(marca1);
		this.estado=estado1;
		TV.numTV++;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int a) {
		TV.numTV = a;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (this.estado && canal>=1 && canal <=120) {
			this.canal = canal;
		}
	}
	
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}

	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(this.estado && this.canal>=1 && this.canal <120) {
			this.canal++;
		}
	}
	public void canalDown() {
		if(this.estado && this.canal>1 && this.canal <=120) {
			this.canal--;
		}
	}
	public void volumenDown() {
		if(this.estado && this.volumen>0 && this.volumen <=7) {
			this.volumen = this.volumen - 1;
		}
	}

	public void volumenUp() {
		if(this.estado && this.volumen>=0 && this.volumen <7) {
			this.volumen = this.volumen + 1;
		}
	}
}
