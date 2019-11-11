package avion;

import java.util.ArrayList;

public class Avion {

	private ArrayList<Pasajero> listaPasajeros;
	private ArrayList<Asiento> listaAsientos;
	private String tipoAvion;

	public ArrayList<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(ArrayList<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

	public String getTipoAvion() {
		return tipoAvion;
	}

	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}

	public ArrayList<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	@Override
	public String toString() {
		return "Avion [listaPasajeros=" + listaPasajeros + ", listaAsientos=" + listaAsientos + ", tipoAvion="
				+ tipoAvion + "]";
	}

	public int getNumeroAsientos() {
		return listaAsientos.size();
	}

	public int getNumeroPasajeros() {
		return listaPasajeros.size();
	}

	public int getNumeroMaletasTotales() {
		int acumuladorMaletas = 0;
		for (Pasajero p : listaPasajeros) {
			acumuladorMaletas = acumuladorMaletas + p.getListaMaletas().size();
		}
		return acumuladorMaletas;
	}

	public int contarMaletasDeTipo(String tipo) {
		int contadorMaletas = 0;
		for (Pasajero p : getListaPasajeros()) {
			for (Maleta m : p.getListaMaletas()) {
				if (m.getTipoMaleta().equalsIgnoreCase(tipo)) {
					contadorMaletas++;
				}				
			}
		}
		
		return contadorMaletas;
	}

}
