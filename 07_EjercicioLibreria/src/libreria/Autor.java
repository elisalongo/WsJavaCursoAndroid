package libreria;

public class Autor {

	private String nombre;
	private String apellido;
	private String fecha;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
