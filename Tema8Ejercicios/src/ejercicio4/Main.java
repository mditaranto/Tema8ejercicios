package ejercicio4;

public class Main {

	public static void main(String[] args) {
		int sumTotal = 0;
		int sumLav = 0;
		int sumTel = 0;
		Electrodomestico array[] = new Electrodomestico[10];

		array[0] = new Lavadora(60, "Blanco", "B", 70, 30);
		array[1] = new Television(120, "Rojo", "C", 20, 41, true);
		array[2] = new Electrodomestico();
		array[3] = new Television();
		array[4] = new Electrodomestico();
		array[5] = new Television();
		array[6] = new Lavadora();
		array[7] = new Electrodomestico();
		array[8] = new Lavadora();
		array[9] = new Television();

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].precioFinal());
			System.out.println(array[i].getPrecioBase());

			sumTotal += array[i].precioFinal();

			if (array[i] instanceof Lavadora) {
				sumLav += array[i].precioFinal();
			} else if (array[i] instanceof Television) {
				sumTel += array[i].precioFinal();
			}
		}
		System.out.println("El precio total de las lavadoras es igual a: " + sumLav
				+ " El de las televisiones es igual a: " + sumTel);
		System.out.println("El precio total de todos los electrodomesticos es igual a: " + sumTotal);
	}
}
