
public class EjercicioFunciones1 {
	
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		imprimirPersona("Elisa","Longo",24,"667257295");
		imprimirPersona("Felix","De Pablo", 40,"6658941459");
		imprimirPersona("Martin","Perez",18,"695463282");
		
		imprimirPersona2("Jorge","Rodriguez",35,"695455683");
		imprimirPersona2("Pablo","Ramirez",25,"692459363");
		imprimirPersona2("Ernesto","Cruz",15,"691455663");
		
		imprimirPersona3("Jorge","Rodriguez",35,"695455683",true);
		imprimirPersona3("Pablo","Ramirez",25,"692459363",false);
		imprimirPersona3("Ernesto","Cruz",15,"691455663",true);
		
	}
	
	public static void imprimirPersona(String nombre, String apellidos, int edad, String telefono) {
		System.out.println("nombre: " + nombre.toUpperCase());
		System.out.println("apellidos: " + apellidos.toUpperCase());
		System.out.println("edad: " + edad);
		System.out.println("telefono: " + telefono);
		
	}
	
	public static void imprimirPersona2(String nombre, String apellidos, int edad, String telefono) {
		System.out.println("nombre: " + nombre.toLowerCase());
		System.out.println("apellidos: " + apellidos.toLowerCase());
		System.out.println("edad: " + edad);
		System.out.println("telefono: " + telefono);	
	}
	
	public static void imprimirPersona3(String nombre, String apellidos, int edad, String telefono, boolean mayuscolas) {
		if(mayuscolas) {
	      imprimirPersona(nombre, apellidos, edad, telefono);
		}else {
			imprimirPersona2(nombre, apellidos, edad, telefono);
		}
		
	}
	

}
