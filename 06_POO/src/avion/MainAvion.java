package avion;

import java.util.ArrayList;

public class MainAvion {

	public static void main(String[] args) {

		Maleta maleta1P1 = new Maleta();
		maleta1P1.setPeso(10);
		maleta1P1.setTipoMaleta("peque�a");

		Maleta maleta2P1 = new Maleta();
		maleta2P1.setPeso(20);
		maleta2P1.setTipoMaleta("grande");

		Pasajero p1 = new Pasajero();
		p1.setNombre("Felix");
		p1.setDNI("675858585");
		p1.setTelefono("883938383");

		ArrayList<Maleta> listaMaletasP1 = new ArrayList<Maleta>();
		listaMaletasP1.add(maleta1P1);
		listaMaletasP1.add(maleta2P1);

		p1.setListaMaletas(listaMaletasP1);

		Maleta maleta1P2 = new Maleta();
		maleta1P2.setPeso(8);
		maleta1P2.setTipoMaleta("peque�a");

		Maleta maleta2P2 = new Maleta();
		maleta2P2.setPeso(23);
		maleta2P2.setTipoMaleta("grande");

		Pasajero p2 = new Pasajero();
		p2.setNombre("Martin");
		p2.setDNI("53801962V");
		p2.setTelefono("695433282");

		ArrayList<Maleta> listaMaletasP2 = new ArrayList<Maleta>();
		listaMaletasP2.add(maleta1P2);
		listaMaletasP2.add(maleta2P2);

		p2.setListaMaletas(listaMaletasP2);

		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
		listaPasajeros.add(p1);
		listaPasajeros.add(p2);

		Asiento asiento1 = new Asiento();
		asiento1.setTipoAsiento("Economy");
		asiento1.setPosicion("A");
		asiento1.setFila("23");
		asiento1.setPasajero(p1);

		Asiento asiento2 = new Asiento();
		asiento2.setTipoAsiento("Economy");
		asiento2.setPosicion("D");
		asiento2.setFila("15");
		asiento2.setPasajero(p2);

		ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();
		listaAsientos.add(asiento1);
		listaAsientos.add(asiento2);

		Avion avion = new Avion();
		avion.setTipoAvion("Iberia");
		avion.setListaPasajeros(listaPasajeros);
		avion.setListaAsientos(listaAsientos);

		System.out.println(avion);
		System.out.println("El numero de asientos es: " + avion.getNumeroAsientos());
		System.out.println();
		System.out.println("El numero de pasajeros es: " + avion.getNumeroPasajeros());
		System.out.println();
		System.out.println("El numero de maletas totales es :" + avion.getNumeroMaletasTotales());


	}
	


}
