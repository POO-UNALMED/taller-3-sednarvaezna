package taller3.televisores;

public class Control {
	private TV tv;
	
	
	public void enlazar(TV tv1) {
		this.tv = tv1;
		tv.setControl(this);
		
	}

	public void turnOff() {
		tv.turnOff();
	}

	public void setCanal(int i) {
		tv.setCanal(i);
		
	}

	public void turnOn() {
		tv.turnOn();
		
	}

	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}

	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

}
