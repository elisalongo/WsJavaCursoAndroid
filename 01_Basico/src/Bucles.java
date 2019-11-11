public class Bucles {

	public static void main(String[] args) {
		System.out.println("-----------BUCLES----------");
		//estructura for
		for (int i=0; i<=10;i++){
	        System.out.println(i);
	    }int contador = 0;
	    //estructura while
	    while ( contador <= 10){ // entra de 0 a N veces
	         System.out.println("El contador vale:" + contador);
	         contador++;
	    }System.out.println(contador);
	    contador = 0;
	    //estructura do/while
	    do{ 
	        System.out.println("El contador vale:" + contador);
	         contador++;
	    } while (contador <=10);
	    System.out.println(contador);
	}

}