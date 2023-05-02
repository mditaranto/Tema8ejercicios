package ejercicio5;

import java.util.Scanner;

public class Rectángulo extends Polígono {

	private double lado1;
	private double lado2;

	@Override
	public String toString() {
		return super.toString() + " Es un cuadrado con lados:" + " lado 1: " + lado1 + " lado 2: " + lado2;
	}

	/**
	 * @param numlados
	 * @param lado1
	 * @param lado2
	 */
	public Rectángulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return lado1 * lado2;
	}

	/**
	 * @param numlados
	 */
	public Rectángulo() {
		super(4);
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

	public void crearRectangulo(Polígono[] array, int cant) {
		double lado1;
		if (cant < 5) {
			Scanner sca = new Scanner(System.in);
			System.out.println("Introduzca la base lado del rectandulo");
			lado1 = sca.nextDouble();
			System.out.println("Introduzca la altura lado del rectangulo");
			array[cant] = new Rectángulo(lado1, sca.nextDouble());
		} else {
			System.out.println("Esta lleno");
		}
	}

}
