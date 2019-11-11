import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int nMayor = 0;
		do {
			nMayor = 0;
			do {
				System.out.println("Introduzca un numero: ");
				numero = sc.nextInt();
				if (numero > nMayor) {
					nMayor = numero;
				}

			} while (numero > 0);
			System.out.println("El numero mayor es: " + nMayor);
			System.out.println("Desea introducir otro numero? (0-Si,1-No)");
			numero = sc.nextInt();
		} while (numero == 0);

		System.out.println("Fin del programa");
	}
}
