import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		long resultado = 1;
		numero = sc.nextInt();
		for(int i = 2;i<=numero;i++) {
			resultado= resultado * i;
		}
		System.out.println("El factorial de " + numero + " es " + resultado);
	}
}