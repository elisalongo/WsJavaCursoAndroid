package avion;

public class Asiento {

	private String tipoAsiento;
	private String posicion;
	private String fila;
	private Pasajero pasajero;

	public String getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(String tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		return "Asiento [tipoAsiento=" + tipoAsiento + ", posicion=" + posicion + ", fila=" + fila + ", pasajero="
				+ pasajero + "]";
	}
	
	

}
