package casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
	
		// Casa de Alta
		
		Direccion d = new Direccion();
		d.setTipoVia("Calle");
		d.setNombreVia("SerrannO");
		d.setNumeroVia("56");
		d.setCp("28003");
		d.setCiudad("Madrid");
		
		Persona p = new Persona();
		p.setNombre("Pablo");
		p.setEdad(33);
		p.setPeso(67.8);
		p.setDireccion(d);
		
		
		Habitacion h1 = new Habitacion();
		h1.setTipoHabitacion("Baño");
		h1.setM2(10);
		
		Habitacion h2 = new Habitacion();
		h2.setTipoHabitacion("Cocina");
		h2.setM2(20);
		
		Habitacion h3 = new Habitacion();
		h3.setTipoHabitacion("Cuarto Individual");
		h3.setM2(15);
		
		Habitacion h4 = new Habitacion();
		h4.setTipoHabitacion("Cuarto Matrimonial");
		h4.setM2(25);
		
		
		ArrayList <Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h3);
		listaHabitaciones.add(h4);

		
		
		Casa casa = new Casa();
		casa.setDireccion(d);
		casa.setListaHabitacions(listaHabitaciones);
		casa.setPersona(p);
		casa.setPrecio(250.000);
		
		System.out.println(casa);
		
	}
	
	/*
	public static void reccorrerArray(ArrayList<Habitacion> listaHabitaciones) {
		System.out.println("Mostrando la lista de las habitaciones");
		int i = 1;
		for(Habitacion h : listaHabitaciones) {
			mostrarHabitaciones(h,i);
			i++;
		}
		
		public static void mostrarHabitaciones(Habitacion h) {
			System.out.println("Mostrando habitacion ");
			System.out.println(h1);
			System.out.println(h2);
			System.out.println(h3);
			System.out.println(h4);
		}
*/
}
