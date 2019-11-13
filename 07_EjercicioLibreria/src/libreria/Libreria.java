package libreria;

import java.util.ArrayList;

public class Libreria {

	private String nombre;
	private ArrayList<Libro> listaLibros;

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", listaLibros=" + listaLibros + "]";
	}

	public Libro buscarLibro(String isbn) {
		for (Libro libro : getListaLibros()) {
			if (libro.getIsbn().equalsIgnoreCase(isbn)) {
				return libro;
			}

		}

		return null;
	}
	
	public ArrayList<Libro> busquedaEditorial(String editorial){
		ArrayList<Libro> listaLibrosEditorial = new ArrayList<Libro>();
		for(Libro l : listaLibros){
			if(l.getEditorial().equalsIgnoreCase(editorial)) {
				listaLibrosEditorial.add(l);
			}
		}
		return listaLibrosEditorial;
	}
	
   public ArrayList<Libro> busquedaLibroPorNombreAutor(String nombre){
		ArrayList<Libro> listaLibrosPorAutor = new ArrayList<Libro>();
		for(Libro libro : listaLibros) {
			if(libro.getAutor().getNombre().equalsIgnoreCase(nombre)){
				listaLibrosPorAutor.add(libro);
			}
		}
		return listaLibrosPorAutor;
	}
}
