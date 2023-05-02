package ejercicio2;

public class Main {

	public static void main(String[] args) {

		//Creacion de los objetos
		Empleado E1 = new Empleado("Matias");

		Operario O1 = new Operario("Manu");
		
		Directivo D1 = new Directivo("Juanmapayo");
		
		Tecnico T1 = new Tecnico("yerayito");
		
		Oficial OF1 = new Oficial("Pepe Pablo");

		//Impresion de dichos objetos
		System.out.println(E1);
		System.out.println(O1);
		System.out.println(D1);
		System.out.println(T1);
		System.out.println(OF1);
		
		
	}

}
