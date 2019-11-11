
public class Variables {

	public static void main(String[] args) {
		//En java tenemos dos tipos de variables
		//tenemos variables primitivas
		//tenemos variables de referencias
		//las siguentes serian variables primitivas
		// int, long, double, boolean
		int numero = 0 ;//variable numerica
		System.out.println("El numero es: " + numero);
		int numero2 = 78;
		System.out.println(numero2);
		
		//Otros tipos
		long numeroLargo = 676;
		int x = 5;
		double numeroReal = 34.567;
		boolean cierto = true;
		cierto = false;
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
	
		
		//El otro tipo son las variables de referencias o directamente referencias
		String nombre = "pepe";// declaración y asignación de la variable
		System.out.println("el nombre es: " + nombre);
		nombre = "laura";// asignación de la variable
		System.out.println("el nombre es: " + nombre);
	
		
		double numero4 = 10;
		double numero5 = numero4;
		
		int numero6= 56;
		double numero7 = numero6;
		
		double numero8 = 56;
		int numero9 = (int)numero8;//intenta meter
		
	}
	

}
