
public class MainCoche {

	public static void main(String[] args) {

		System.out.println("Bienvenidos a nuestra tienda de coches");
		System.out.println();

		Coche c1 = new Coche();
		c1.marca = "Fiat";
		c1.modelo = "500";
		c1.matricula = "AY45996";
		c1.nuevo = true;

		System.out.println("Aqu� presentamos el primer coche: ");
		System.out.println("La marca es: " + c1.marca);
		System.out.println("El modelo es: " + c1.modelo);
		System.out.println("La matricula es: " + c1.matricula);
		System.out.println("La versi�n es nueva: " + c1.nuevo);
		System.out.println();

		Coche c2 = new Coche();
		c2.marca = "Lamborghini";
		c2.modelo = "Urus";
		c2.matricula = "ER929NG";
		c2.nuevo = false;

		System.out.println("Aqu� presentamos el segundo coche: ");
		System.out.println("La marca es: " + c2.marca);
		System.out.println("El modelo es: " + c2.modelo);
		System.out.println("La matricula es: " + c2.matricula);
		System.out.println("La versi�n es nueva: " + c2.nuevo);
		System.out.println();

		Coche c3 = new Coche();
		c3.marca = "Ferrari";
		c3.modelo = "Purosangue";
		c3.matricula = "DY937PG";
		c3.nuevo = true;

		System.out.println("Aqu� presentamos el tercer coche: ");
		System.out.println("La marca es: " + c3.marca);
		System.out.println("El modelo es: " + c3.modelo);
		System.out.println("La matricula es: " + c3.matricula);
		System.out.println("La versi�n es nueva: " + c3.nuevo);
		System.out.println();

		System.out.println("Aqu� presentamos el primer coche: ");
		imprimirCoche(c1);
		System.out.println();
		System.out.println("Aqu� presentamos el segundo coche: ");
		imprimirCoche(c2);
		System.out.println();
		System.out.println("Aqu� presentamos el tercer coche: ");
		imprimirCoche(c3);
		System.out.println();

		Coche c4 = new Coche("500", "Fiat");
		imprimirCoche(c4);
		System.out.println();
		Coche c5 = new Coche("Urus", "Lamborghini");
		imprimirCoche(c5);
		System.out.println();
		Coche c6 = new Coche("Purosangue", "Ferrari");
		imprimirCoche(c6);
		System.out.println();

		Coche c7 = new Coche("AY45996", true);
		imprimirCoche(c7);
		System.out.println();
		Coche c8 = new Coche("ER929NG", false);
		imprimirCoche(c8);
		System.out.println();
		Coche c9 = new Coche("DY937PG", true);
		imprimirCoche(c9);
		System.out.println();

		System.out.println("Gracias por visitar nuestra tienda :)");

	}

	public static void imprimirCoche(Coche coche) {
		if (coche.marca != null)
			System.out.println("La marca es: " + coche.marca);
		if (coche.modelo != null)
			System.out.println("El modelo es: " + coche.modelo);
		if (coche.matricula != null)
			System.out.println("La matricula es: " + coche.matricula);
		System.out.println("La versi�n es nueva: " + coche.nuevo);

	}

}
