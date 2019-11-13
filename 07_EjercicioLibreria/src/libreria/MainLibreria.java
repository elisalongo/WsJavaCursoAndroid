package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		Libreria l = new Libreria();
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		l.setListaLibros(listaLibros);
		l.setNombre("Libreria la Bella Elisa");

		System.out.println("Bienvenidos a nuestra libreria: " + l.getNombre());
		System.out.println();

		do {
			opcion = mostrarMenu();
			if (opcion == 1) {
				System.out.println("Ha elegido la opcion dar de Alta del libro");
				System.out.println();
				System.out.println("Introduzca el autor que quiere: ");

				System.out.println();
				String nombre = leerAutor("Nombre: ", sc);
				String apellido = leerAutor("Apellido: ", sc);
				String fecha = leerAutor("Fecha de Nacimiento: ", sc);

				Autor autor = new Autor();
				autor.setNombre(nombre);
				autor.setApellido(apellido);
				autor.setFecha(fecha);

				System.out.println();
				System.out.println("Introduzca el libro que quiere: ");

				System.out.println();
				String titulo = leerLibro("Titulo: ", sc);
				String isbn = leerLibro("ISBN: ", sc);
				String editorial = leerLibro("Editorial: ", sc);

				Libro libro = new Libro();
				libro.setAutor(autor);
				libro.setTitulo(titulo);
				libro.setEditorial(editorial);
				libro.setIsbn(isbn);

				System.out.println();
				l.getListaLibros().add(libro);

			} else if (opcion == 2) {
				System.out.println("Ha elegido la opcion Buscar libro");
				System.out.println();
				String isbn = leerIsbn("ISBN: ", sc);
				Libro libro = l.buscarLibro(isbn);
				System.out.println(libro);
				System.out.println();

			} else if (opcion == 3) {
				System.out.println("Ha elegido la opcion Recorrer libreria");
				System.out.println();
				System.out.println("Aquí tiene la lista de libros presentes en nuestra libreria: ");
				System.out.println();
				for (Libro libro : l.getListaLibros()) {
					System.out.println(libro);
					System.out.println();
				}
			} else if (opcion == 4) {
				System.out.println("Introduzca un editorial para buscar el libro");
				String editorial = sc.nextLine();
				ArrayList<Libro> listaLibrosEditorial = l.busquedaEditorial(editorial);
				recorrerArray(listaLibrosEditorial);
			}
				 else if (opcion == 5) {
						System.out.println("Ha elegido la opcion Buscar Autor por Nombre");
						System.out.println();
						String nombre = sc.nextLine();
						ArrayList<Libro> listaAutores = l.busquedaLibroPorNombreAutor(nombre);
						for (Libro libro : listaAutores) {
							System.out.println(libro);
							System.out.println();
						}
		
			}

		} while (opcion != 0);

		System.out.println(l.getNombre() + " le quiere agradecer por su visita a nuestra libreria :)");
	}
	
	

	public static String leerIsbn(String codigo, Scanner sc) {
		System.out.println("Introduzca " + codigo);
		String isbn = sc.nextLine();
		return isbn;
	}

	public static String leerLibro(String valor, Scanner sc) {
		System.out.println("Introduzca " + valor);
		String libro = sc.nextLine();
		return libro;
	}

	public static String leerAutor(String nombre, Scanner sc) {
		System.out.println("Introduzca " + nombre);
		String autor = sc.nextLine();
		return autor;
	}

	public static int leerOpcion() {
		System.out.println("Introduzca la opcion que quiere: ");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}

	public static int mostrarMenu() {
		System.out.println("Introduzca la opcion que quiere:");
		System.out.println("0. Salir");
		System.out.println("1. Alta libro");
		System.out.println("2. Buscar libro (por isbn)");
		System.out.println("3. Recorrer libreria");
		System.out.println("4. Busuqeda de autores por nombre");
		int i = leerOpcion();
		return i;
	}
	
	public static void recorrerArray(ArrayList<Libro> listaLibros) {
		for (Libro l : listaLibros) {
			System.out.println("----LIBRO----");
			System.out.println("El título es : " + l.getTitulo());
			System.out.println("La editorial es : " + l.getEditorial());
			System.out.println("El isbn es : " + l.getIsbn());
			System.out.println("El autor es : " + l.getAutor());
			System.out.println("-------------");
		}
	}

}
