package Javabean;

public class MainPersonaBean {
	public static void main(String[] args) {
		PersonaBean p1 = new PersonaBean();
		p1.setNombre("Julio");
		p1.setEdad(79);
		p1.setPeso(86);
		p1.setEdad(-6);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		System.out.println(p1.getPeso());

	}
}
