public class Moto {
	public String matricula;
	public String marca;
	public int posicion;
	public int velocidad;
	private int velocidadInicial;

	public Moto() {
		super();
	}

	public Moto(String matricula, String marca, int posicion, int velocidad) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.velocidadInicial = velocidad;
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca + ", posicion=" + posicion + ", velocidad="
				+ velocidad + "]";
	}

	public int acelerar(boolean adelate) {
		if(adelate) {
			this.posicion = this.posicion + this.velocidad;
		}else {
			this.posicion = this.posicion - this.velocidad;
		}
		return this.posicion;
	}

	public void irAPosicionDeSalida() {
		this.posicion = 0;
	}

	public void meterseEnBoxes() {
		this.velocidad = this.velocidadInicial;
	}

	public int getVelocidadInicial() {
		return this.velocidadInicial;
	}

	/*
	public int acelerarAtras() {
		this.posicion = this.posicion - this.velocidad;
		return this.posicion;
	}*/
}