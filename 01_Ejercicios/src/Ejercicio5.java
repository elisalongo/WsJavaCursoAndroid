import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int numero1 = 0;
		int numero2 = 0;
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
				System.out.println(numero1 + numero2);
			} else if (opcion == 2) {
				System.out.println("Ha elegido la opci�n restar: ");
				System.out.println(numero1 - numero2);
			} else if (opcion == 3) {
				System.out.println("Ha elegido la opci�n moltiplicar: ");
				System.out.println(numero1 * numero2);
			} else if (opcion == 4) {
				System.out.println("Ha elegido la opci�n dividir: ");
				System.out.println(numero1 / numero2);
			} else if (opcion == 0) {
				System.out.println("Ha elegido la opci�n salir");
			}

		} while (opcion != 0);
		System.out.println("Muchas gracias por utilizar nuestro programa");
	}

}