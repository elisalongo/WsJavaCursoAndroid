
public class Coche {
	
	public String matricula;
	public String modelo;
	public String marca;
	public boolean nuevo;
	
	public Coche() {
		
	}
	
	public Coche(String matricula, String modelo, String marca, boolean nuevo) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.nuevo = nuevo;
	}
	
	
	
	public Coche(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}
	
	
	public Coche(String matricula, boolean nuevo) {
		super();
		this.matricula = matricula;
		this.nuevo = nuevo;
	}
	

}
