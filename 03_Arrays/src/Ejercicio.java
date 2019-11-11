import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {

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

		for (String valor : listaStrings) {
			System.out.println(valor);
		}

		System.out.println("Fin del programa");
		sc.close();
	}

}
