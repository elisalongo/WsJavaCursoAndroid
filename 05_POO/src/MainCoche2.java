import java.util.ArrayList;
import java.util.Scanner;

public class MainCoche2 {

	public static void main(String[] args) {
		// 3 coches pedir marca, modelo, matricula que lo ponga el usuario
		//costruir array
		//mostrar el array
		
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		Scanner sc = new Scanner(System.in);
		String marca = "";
		String modelo = "";
		String matricula = "";
		boolean nuevo = true;
		
		
		System.out.println("Bienvenido a nuestra tienda de coches.");
		System.out.println();
		System.out.println("Puedes elegir tres tipos de coches:");
		System.out.println();

		for(int i = 0;i<3;i++) {
			System.out.println("Coche. Introduzca la marca: ");
			marca = sc.nextLine();
			System.out.println();
			System.out.println("Coche. Introduzca el modelo: ");
			modelo = sc.nextLine();
			System.out.println();
			System.out.println("Coche. Introduzca la matricula: ");
			matricula = sc.nextLine();
			System.out.println();
			System.out.println("Coche. Introduzca si es nuevo (si/no): ");
			String esNuevo = sc.nextLine();
			if(esNuevo.equalsIgnoreCase("si")) {
				nuevo = true;
			}else {
				nuevo = false;
			}
			
			Coche coche = new Coche(matricula, modelo, marca, nuevo);
			listaCoches.add(coche);
	
		}
		
		System.out.println();
		
		for(Coche valor : listaCoches) {
			System.out.println(valor.marca);
			System.out.println(valor.modelo);
			System.out.println(valor.matricula);
			System.out.println(valor.nuevo);
			System.out.println();
		}
		
		System.out.println("Gracias por visitar nuestra tienda :)");


	}

}
