package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Productos array[] = new Productos[5];
		
		array[0] = new Perecedero("Queso", 5, 1);
		array[1] = new Noperecedero("Lata", 2, "Lata");
		array[2] = new Productos("Chocolate", 3);
		array[3] = new Perecedero("Leche", 7, 2);
		array[4] = new Perecedero("mazorca", 5, 9);
		
		System.out.println(array[0].calcular(5));
		System.out.println(array[1].calcular(5));
		System.out.println(array[2].calcular(5));
		System.out.println(array[3].calcular(5));
		System.out.println(array[4].calcular(5));

	}

}
