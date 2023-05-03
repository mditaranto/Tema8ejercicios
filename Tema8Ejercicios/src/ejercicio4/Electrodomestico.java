package ejercicio4;

/**
 * Clase que guarda electrodomesticos
 * @author Matis
 *
 */
public class Electrodomestico {

	/**
	 * Atributo del precio base
	 */
	protected int precioBase;

	/**
	 * Atributo del preso
	 */
	protected int peso;
	
	/**
	 * Atributo del color
	 */
	protected Color color;
	
	/**
	 * Atributo del consumo
	 */
	protected Consumo consumo;
	
	/**
	 * Enumerador del color
	 * @author Matis
	 *
	 */
	protected enum Color {
		Blanco, Negro, Rojo, Azul, Gris
	}
	
	/**
	 * Enumerador del consumo
	 * @author Matis
	 *
	 */
	protected enum Consumo {
		A, B, C, D, E , F
	}

	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {
		color = Color.Blanco;
		consumo = Consumo.F;
		precioBase = 100;
		peso = 5;
	}

	/**
	 * Constructor con parametros
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(int precio, int peso) {
		this.peso = peso;
		this.precioBase = precio;
		color = Color.Blanco;
		consumo = Consumo.F;
	}

	/**
	 * Constructor con parametros
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Electrodomestico(int precioBase, String color, String consumo, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = Color.valueOf(color);
		this.consumo = Consumo.valueOf(consumo);
		this.peso = peso;
		comprobarConsumoEnergetico(consumo.charAt(0));
		comprobarColor(color);
	}

	/**
	 *Getter del precio base
	 * @return the precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * Getter del peso
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Getter del color
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Getter del consumo
	 * @return the consumo
	 */
	public Consumo getConsumo() {
		return consumo;
	}

	/**
	 * Metodo que comprueba el consumo energetico
	 * @param letra
	 */
	public void comprobarConsumoEnergetico(char letra) {
		
		if (!(letra >= 'A' && letra <= 'F')) {
			consumo = Consumo.F;
		} 
		
	}
	
	/**
	 * Metodo que comprueba el color
	 * @param color
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void comprobarColor(String color) {
		
		if (!Color.values().equals(color)) {
			this.color = Color.Blanco;
		}
	}
	
	/**
	 * Metodo del precio final
	 * @return
	 */
	public int precioFinal() {
		
		int precio = precioBase;
		
		switch (consumo) {
		case A -> {
			precio += 100;
		}
		case B -> {
			precio += 80;
		}
		case C -> {
			precio += 60;
		}
		case D -> {
			precio += 50;
		}
		case E -> {
			precio += 30;
		}
		default -> {
			precio += 10;
		}
		}
		
		if (peso <= 19 && peso >= 0) {
			precio += 10;
		} else if (peso <= 49 && peso >= 20) {
			precio += 50;
		} else if (peso <= 79 && peso >= 50) {
			precio += 80;
		} else if (peso > 80) {
			precio += 100;
		}
		
		return precio;
	}
	
}
