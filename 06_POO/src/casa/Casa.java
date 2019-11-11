package casa;

import java.util.ArrayList;

public class Casa {
	// portal inmobiliar
	// precio ->double
	// direccion ->Direccion
	// numeros habitaciones -> 3 -> String tipoHabitacion; double m2;
	// Arraylis<Habitacion> listaHabitaciones;
	// tiene un? -> atributo Habitacion
	// Persona due�o
	// dise�ar esto

	private double precio;
	private Direccion direccion;
	private Persona persona;
	private ArrayList<Habitacion> listaHabitaciones;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public ArrayList<Habitacion> getListaHabitacions() {
		return listaHabitaciones;
	}

	public void setListaHabitacions(ArrayList<Habitacion> listaHabitacions) {
		this.listaHabitaciones = listaHabitacions;
	}

	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", persona=" + persona + ", listaHabitaciones="
				+ listaHabitaciones + "]";
	}

	

}
