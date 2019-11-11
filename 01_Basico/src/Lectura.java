import java.util.Scanner;

public class Lectura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduzca un numero: ");
		//leer numero
		numero = sc.nextInt();//aqui el programa se quedara parado a la espera de 
		//que el usuario ponga un numero y pulse enter
		for(int i = 1;i<=numero;i++) {
			System.out.println(i);
		}
		
		//Capturar texto
		sc.hasNextLine();
		System.out.println("Introduzca una palabra: ");
		String cadena = sc.nextLine();
		System.out.println("El texto introducido ha sido: " + cadena);
		sc.close();
	}

}