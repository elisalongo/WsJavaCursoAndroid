
public class Pelicula {
	
	public String titulo;
	public String genero;
	public String director;
	public double puntuacion;
	
	
	
	public Pelicula(String titulo, String genero, String director) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
	}



	public Pelicula(String titulo, String genero, String director, double puntuacion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.puntuacion = puntuacion;
	}

	
	
}


/*
 * Peliculas peli1 = new Peliculas("La grande bellezza", "Comedia dramatica", "Paolo Sorrentino");
		System.out.println(peli1.titulo);
		System.out.println(peli1.genero);
		System.out.println(peli1.director);

		Peliculas peli2 = new Peliculas("La vita � bella", "Comedia dramatica", "Roberto Benigni");
		System.out.println(peli2.titulo);
		System.out.println(peli2.genero);
		System.out.println(peli2.director);

		Peliculas peli3 = new Peliculas("Amarcord", "Comedia dramatica", "Federico Fellini");
		System.out.println(peli3.titulo);
		System.out.println(peli3.genero);
		System.out.println(peli3.director);
*/