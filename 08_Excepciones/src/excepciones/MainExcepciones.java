package excepciones;

import java.util.Scanner;

public class MainExcepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		do {
		System.out.println("1- Dar de alta milenial");
		System.out.println("2- Buscar milenial");
		System.out.println("0- Salir");
		
		try {
			opcion = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			sc.nextLine();
			System.out.println("Solo se admiten numeros! No seas milenial");
		}
		System.out.println("Opcion elegida " + opcion);
		}while(opcion !=2);
		
		
		
		

	}

}
