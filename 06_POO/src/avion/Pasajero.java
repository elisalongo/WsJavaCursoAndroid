package avion;

import java.util.ArrayList;

public class Pasajero {

	private String nombre;
	private String DNI;
	private String telefono;
	private ArrayList<Maleta> listaMaletas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Maleta> getListaMaletas() {
		return listaMaletas;
	}

	public void setListaMaletas(ArrayList<Maleta> listaMaletas) {
		this.listaMaletas = listaMaletas;
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", DNI=" + DNI + ", telefono=" + telefono + ", listaMaletas="
				+ listaMaletas + "]";
	}
	
	

}