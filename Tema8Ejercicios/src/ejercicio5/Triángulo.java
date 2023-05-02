package ejercicio5;

import java.util.Scanner;

public class Triángulo extends Polígono {

	private double lado1;
	private double lado2;
	private double lado3;

	@Override
	public String toString() {
		return super.toString() + " Es un triángulo con lados:" + " lado 1: " + lado1 + " lado 2: " + lado2
				+ " lado 3: " + lado3;

	}

	@Override
	public double area() {
		double semi;
		semi = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(semi * (semi - lado1) * (semi - lado2) * (semi - lado3));
	}

	/**
	 * @param numlados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triángulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * @param numlados
	 */
	public Triángulo() {
		super(3);
	}

	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public void crearTriangulo(Polígono[] array, int cant) {
		double lado1;
		double lado2;
		if (cant < 5) {
			Scanner sca = new Scanner(System.in);
			System.out.println("Introduzca el primer lado del triangulo");
			lado1 = sca.nextDouble();
			System.out.println("Introduzca el segundo lado del triangulo");
			lado2 = sca.nextDouble();
			System.out.println("Introduzca el tercer lado del triangulo");

			array[cant] = new Triángulo(lado1, lado2, sca.nextDouble());
		} else {
			System.out.println("Esta lleno");
		}
	}

}
