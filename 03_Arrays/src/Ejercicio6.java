import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaStrings = new ArrayList<String>();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Introduzca el nombre que quiere: ");
			String nombre = "";
			nombre = sc.nextLine();
			listaStrings.add(nombre);
		}
		
		/*
		listaStrings.add("Elisa");
		listaStrings.add("Felix");
		listaStrings.add("Martin");
		*/
		
		
		System.out.println("---------- lista en mayusculas -----------");
		
		for(String valor : listaStrings) {
			System.out.println(valor.toUpperCase());
		}
		
		System.out.println("---------- lista en minusculas -----------");
		
		for(String valor : listaStrings) {
			System.out.println(valor.toLowerCase());
		}
	
		System.out.println("Gracias por utilizar nuestro programa :)");
		sc.close();
	}
	

}
