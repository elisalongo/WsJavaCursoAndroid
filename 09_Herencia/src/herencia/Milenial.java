package herencia;

public class Milenial extends Persona {
	//private ArrayList<Persona> familia;
	private int pereza;
	private boolean gorro;
	
	public int getPereza() {
		return pereza;
	}
	public void setPereza(int pereza) {
		this.pereza = pereza;
	}
	public boolean isGorro() {
		return gorro;
	}
	public void setGorro(boolean gorro) {
		this.gorro = gorro;
	}
	@Override
	public String toString() {
		return "Milenial [pereza=" + pereza + ", gorro=" + gorro + ", getDni()=" + getDni() + ", getEdad()=" + getEdad()
				+ ", getPeso()=" + getPeso() + "]";
	}
	

	

}
