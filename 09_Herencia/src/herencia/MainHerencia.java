package herencia;

import java.util.ArrayList;

public class MainHerencia {

	public static void main(String[] args) {

		Persona p = new Persona();
		p.setDni("");
		p.setEdad(40);
		p.setPeso(59);
		
		Milenial m = new Milenial();
		m.setDni("");
		m.setEdad(30);
		m.setPeso(89);
		m.setGorro(true);
		m.setPereza(7);
		
		GeneracionZ gz = new GeneracionZ();
		gz.setDni("12345678");
		gz.setEdad(18);
		gz.setPeso(71);
		gz.setPereza(4);
		gz.setGorro(false);
		gz.setTrabajaExtranjero(true);
		
		//Una referencia padre puede apuntar a 
		//cualquier objeto hijo
		Persona p2 = gz;
		Persona p3 = m;
		//aunque pueda apuntar a cualquiera de sus hijos
		//solamento puedo acceder a los metodos y 
		//atributos del tipo de la referencia
		
		System.out.println(p2.getDni());
		//System.out.println(p2.getPereza());
		//esto no se puede
		
		
		Persona p4 = new Milenial();
		p4.setPeso(34);
		//p4.setPereza();
		
		
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(p);
		listaPersona.add(m);
		listaPersona.add(gz);
		
		System.out.println(listaPersona.get(2).getDni());
		//si sabemos qeu un objeto es de un tipo concreto
		//podemos hacer un casting
		GeneracionZ gz1 = (GeneracionZ)listaPersona.get(2);
		System.out.println(gz1.getPereza());
		System.out.println(gz1.isTrabajaExtranjero());
		
		for(Persona p5: listaPersona) {
			System.out.println(p5.toString());
		}
		
		
		
		}

}
