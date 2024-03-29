
import java.util.Scanner;
import java.util.ArrayList;

public class EjercicioFunciones2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		ArrayList<String> listaFrases = new ArrayList<String>();
		int opcion = 0;
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		do {
			opcion = mostrarMenu();
			if (opcion != 0) {
				numero1 = leerNumero();
				numero2 = leerNumero();
			}
			if (opcion == 1) {
				System.out.println("Ha elegido la opci�n sumar:");
				resultado = sumar(numero1, numero2);
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La suma de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 2) {
				System.out.println("Ha elegido la opci�n restar: ");
				resultado = restar(numero1,numero2);
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La resta de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 3) {
				System.out.println("Ha elegido la opci�n moltiplicar: ");
				resultado = moltiplicar(numero1,numero2);
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La moltiplicaci�n de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 4) {
				System.out.println("Ha elegido la opci�n dividir: ");
				resultado = dividir(numero1,numero2);
				System.out.println(resultado);
				listaNumeros.add(resultado);
				listaFrases.add("La divisi�n de " + numero1 + " y de " + numero2 + " es: " + resultado);
			} else if (opcion == 0) {
				System.out.println("Ha elegido la opci�n salir");
			}

		} while (opcion != 0);

		/*
		 * for (Integer valor : listaNumeros) { System.out.println(valor); }
		 */

		for (String valor : listaFrases) {
			System.out.println(valor);
		}

		System.out.println("Muchas gracias por utilizar nuestro programa");
		sc.close();
	}

	public static int leerNumero() {
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}

	public static int mostrarMenu() {
		System.out.println("Introduzca la opcion que quiere:");
		System.out.println("0. salir");
		System.out.println("1. sumar");
		System.out.println("2. restar");
		System.out.println("3. moltiplicar");
		System.out.println("4. dividir");
		int i = leerNumero();
		return i;
	}

	public static int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public static int moltiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public static int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}
	

}
