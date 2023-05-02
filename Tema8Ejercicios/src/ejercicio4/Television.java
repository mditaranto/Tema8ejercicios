package ejercicio4;

public class Television extends Electrodomestico{
	
	protected int resolucion;
	
	protected boolean sintonizador;

	/**
	 * 
	 */
	public Television() {
		super();
		resolucion = 20;
		sintonizador = false;
	}

	/**
	 * @param precio
	 * @param peso
	 */
	public Television(int precio, int peso) {
		super(precio, peso);
		resolucion = 20;
		sintonizador = false;
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Television(int precioBase, String color, String consumo, int peso, int resolucion, boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		resolucion = this.resolucion;
		sintonizador = this.sintonizador;
	}

	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @return the sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}

	@Override
	public int precioFinal() {
		int precio = super.precioFinal();
		if (resolucion >= 40) {
			precio += (precio*30)/100;
		}
		if (sintonizador) {
			precio += 50;
		}
		
		return precio;
	}
	
	


}
