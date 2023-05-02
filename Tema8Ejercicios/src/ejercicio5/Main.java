package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opc = 0;
		int cant = 0;
		Polígono[] array = new Polígono[5];
		

		Rectángulo rec = new Rectángulo();
		Triángulo tria = new Triángulo();
		Scanner sca = new Scanner(System.in);

		while (opc != 4) {
			System.out.println(
					"1. Introducir triángulo." + "\n 2. Introducir rectángulo." + "\n 3. Mostrar contenido del array.");
			opc = sca.nextInt();

			switch (opc) {
			case 1 -> {
				tria.crearTriangulo(array, cant);
				cant++;
			}
			case 2 -> {
				rec.crearRectangulo(array, cant);
				cant++;
			}
			case 3 -> {
				double areas [] = new double [cant];
				for (int i = 0; i < cant; i++) {
					areas[i] = array[i].area();
				}
				System.out.println(Arrays.toString(array));
				System.out.println(Arrays.toString(areas));
			}
			}
		}
		

	}

}
