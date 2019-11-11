import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Introduzca un numero: ");
			//leer numero
			numero = sc.nextInt();//aqui el programa se quedara parado a la espera de 
			//que el usuario ponga un numero y pulse enter
			for(int i = 1;i<=numero;i++) {
				System.out.println(i);
			}
			do {
				System.out.println("Desea introducir otro numero? (0-Si,1-No)");
				numero = sc.nextInt();
			}while(numero < 0 || numero > 1 );
		}while(numero == 0);
		System.out.println("Fin del programa");
	}

}