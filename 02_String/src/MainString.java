
public class MainString {

	public static void main(String[] args) {
		// Las cadenas en java no son primitivos
		// son objetos
		String cadena = "Harry Potter";
		String cadena2 = "Hermione";
		String cadena3 = "Ron";

		String valor = "Homer";
		String valor2 = "Homer";

		// para comparar string SIEMPRE el metodo .equals
		if (valor.equals(valor2)) {
			System.out.println("Los nombres son iguales");
		}

		String valor3 = "homer";
		if (valor.equals(valor3)) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres son diferentes");
		}
		if (valor.equalsIgnoreCase(valor3)) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres son diferentes");
		}
		String frase = "Homer se comio un pollo";
		if (frase.contains("Homer")) {
			System.out.println("Si que existe Homer");
		} else {
			System.out.println("No existe Homer");
		}

		String mayuscola = frase.toUpperCase();
		System.out.println(mayuscola);

		System.out.println(frase.endsWith("pollo"));

		String subcadena = frase.substring(0, 8).toUpperCase().concat("N").toLowerCase();
		System.out.println(subcadena);

	}

}
