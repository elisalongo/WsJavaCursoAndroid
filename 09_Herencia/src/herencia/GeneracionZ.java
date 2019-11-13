package herencia;

public class GeneracionZ extends Milenial{

	private boolean trabajaExtranjero;

	public boolean isTrabajaExtranjero() {
		return trabajaExtranjero;
	}

	public void setTrabajaExtranjero(boolean trabajaExtranjero) {
		this.trabajaExtranjero = trabajaExtranjero;
	}

	@Override
	public String toString() {
		return "GeneracionZ [trabajaExtranjero=" + trabajaExtranjero + ", getPereza()=" + getPereza() + ", isGorro()="
				+ isGorro() + ", toString()=" + super.toString() + ", getDni()=" + getDni() + ", getEdad()=" + getEdad()
				+ ", getPeso()=" + getPeso() + "]";
	}

	
	
}
