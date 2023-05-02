package ejercicio4;

public class Lavadora extends Electrodomestico {
	
	protected int carga;

	/**
	 * 
	 */
	public Lavadora() {
		super();
		carga = 5;
	}

	/**
	 * @param precio
	 * @param peso
	 */
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		carga = 5;
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Lavadora(int precioBase, String color, String consumo, int peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	@Override
	public int precioFinal() {
		int precio = super.precioFinal();
		if (carga >= 30) {
			precio += 50;
		}
		return precio;
	}

	
}
