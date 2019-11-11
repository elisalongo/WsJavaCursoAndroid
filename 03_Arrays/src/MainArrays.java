import java.util.ArrayList;

public class MainArrays {

	public static void main(String[] args) {
		// Hay dos tipos de Arrays (listas)
		//Arrays estaticos
		//Arrays dinamicos
		
		//estatica
		int[] arrayNumeros = new int [10];
		arrayNumeros[0] = 23;
		arrayNumeros[4] = 56;
		System.out.println(arrayNumeros[0]);
		System.out.println(arrayNumeros[1]);
		System.out.println(arrayNumeros.length);
		System.out.println(" --- Recorremos Array --- ");
		for(int i=0;i<=arrayNumeros.length - 1;i++) {
			System.out.println("Valor de la posicion" + i + " del Array es " + arrayNumeros[i]);
		}
		//si poneis una posicione del array que no existe
		//Java te para el programa instantaneamente
		
		System.out.println(arrayNumeros[0]);
		System.out.println("Esto se ejecuta despues");
		
		//Dinamicos, son objetos en java (atributos y comportamento)
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add(0, "Harry");//Primer valor, posicion;segundo valor el valor
		listaStrings.add(1, "Hermione");
		listaStrings.add("Ron");
		System.out.println(listaStrings.get(0));
		System.out.println(listaStrings.get(2));
		
		for(int i = 0; i < listaStrings.size();i++) {
			System.out.println(i);
			System.out.println(listaStrings.get(i));
		}
		
		//para recorrer una array es un for each
		for(String valor : listaStrings) {
			System.out.println(valor);
		}
		
		System.out.println("---Recorriendo el array esatico---");
		for(int n : arrayNumeros) {
			System.out.println(n);
		}
	
	}

}
