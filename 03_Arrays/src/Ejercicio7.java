import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		ArrayList<String> listaStrings = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String nombre = "";

		do {
			System.out.println("Intoduzca un nombre (HASTA QUE ESCRIBA FIN):");
			nombre = sc.nextLine();
			if (!nombre.equalsIgnoreCase("FIN")) {
				listaStrings.add(nombre);
			}
		} while (!nombre.equalsIgnoreCase("FIN"));

		System.out.println("---------- lista en mayusculas -----------");

		for (String valor : listaStrings) {
			System.out.println(valor.toUpperCase());
		}

		System.out.println("---------- lista en minusculas -----------");

		for (String valor : listaStrings) {
			System.out.println(valor.toLowerCase());
		}

		System.out.println("Gracias por utilizar nuestro programa :)");
		sc.close();
	}

}