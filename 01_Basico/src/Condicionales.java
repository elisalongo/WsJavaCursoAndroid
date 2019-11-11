public class Condicionales {
	public static void main(String[] args) {
		boolean cierto = true;
		if (cierto == true) {
			System.out.println("el valor es cierto");
		}
		cierto = false;
		if (cierto != true) {
			System.out.println("el valor es falso");
		}
		if (cierto == false) {
			System.out.println(" el valor es falso");
		}
		cierto = true;
		if (cierto) {
			System.out.println(" el valor es verdadero");
		}
		cierto = false;
		if (!cierto) {
			System.out.println(" el valor es falso");
		}
		cierto = true;
		if (cierto) {
			System.out.println("Es cierto");
			System.out.println("y lo sabes");
		}
		cierto = false;
		if (!cierto) { // La ! es igual a negación
			System.out.println("Es falso");
		}
		System.out.println("y lo sabes???");
		if (!cierto) {
			System.out.println("Es falso");
			System.out.println("de hecho, muy falso");
		}
		int numero1 = 1;
		int numero2 = 10;
		if (numero1 > 0 && numero2 < 20) {
			System.out.println("El número es mayor que 0 y menor que 20");
		}
		if (numero1 < 0 || numero2 < 20) {
			System.out.println("numero1 es menor que 0 OR numero2 menor que 20");
		}
		cierto = false;
		if (cierto) {
			System.out.println("la variable es cierta");
		} else {
			System.out.println("la variable NO es cierta");
		}
		int numero = 2;
		if (numero == 0) {
			System.out.println("El número vale 0");
		} else if (numero == 1) {
			System.out.println("El número vale 1");
		} else if (numero == 2) {
			System.out.println("El número vale 2");
		} else {
			System.out.println("El número no vale ni 0, ni 1, ni 2");
		}
	}
}
