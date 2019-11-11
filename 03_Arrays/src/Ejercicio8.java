import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		ArrayList<String> listaFrases = new ArrayList<String>();
		int opcion = 0;
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		do {
			System.out.println("Introduzca la opcion que quiere:");
			System.out.println("0. salir");
			System.out.println("1. sumar");
			System.out.println("2. restar");
			System.out.println("3. moltiplicar");
			System.out.println("4. dividir");

			opcion = sc.nextInt();
			if (opcion != 0) {
				System.out.println("Introduzca numero1 ");
				System.out.println("Introduzca numero2 ");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
			}
			if (opcion == 1) {
				System.out.println("Ha elegido la opci�n sumar:");
				resultado = numero1 + numero2;
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La suma de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 2) {
				System.out.println("Ha elegido la opci�n restar: ");
				resultado = numero1 - numero2;
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La resta de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 3) {
				System.out.println("Ha elegido la opci�n moltiplicar: ");
				resultado = numero1 * numero2;
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La moltiplicaci�n de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 4) {
				System.out.println("Ha elegido la opci�n dividir: ");
				resultado = numero1 / numero2;
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La divisi�n de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 0) {
				System.out.println("Ha elegido la opci�n salir");
			}

		} while (opcion != 0);

		/*for (Integer valor : listaNumeros) {
			System.out.println(valor);
		}
		*/
		
		for (String valor : listaFrases) {
			System.out.println(valor);
		}

		System.out.println("Muchas gracias por utilizar nuestro programa");
		sc.close();
	}

}