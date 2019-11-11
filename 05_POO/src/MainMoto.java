public class MainMoto {
	public static void main(String[] args) {
		Moto moto = new Moto("1234", "Yahama", 0, 20);
		int posicion = moto.acelerar(true);
		System.out.println(posicion);
		moto.acelerar(true);
		moto.acelerar(true);
		moto.acelerar(true);

		System.out.println(moto);
		moto.acelerar(false);
		System.out.println(moto);

		Moto moto2 = new Moto("2345","BMW",0,25);
		moto2.acelerar(true);
		moto2.acelerar(true);
		moto2.acelerar(true);
		moto2.velocidad = 10;
		moto2.acelerar(true);
		moto2.acelerar(true);
		//moto2.velocidadInicial = 2;
		System.out.println(moto2.getVelocidadInicial());
		moto2.meterseEnBoxes();
		moto2.acelerar(true);
		moto2.acelerar(true);
		System.out.println(moto2);
	}
}