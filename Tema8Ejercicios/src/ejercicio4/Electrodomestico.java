package ejercicio4;

public class Electrodomestico {

	protected int precioBase;

	protected int peso;
	
	protected Color color;
	
	protected Consumo consumo;
	
	protected enum Color {
		Blanco, Negro, Rojo, Azul, Gris
	}
	
	protected enum Consumo {
		A, B, C, D, E , F
	}

	/**
	 * 
	 */
	public Electrodomestico() {
		color = Color.Blanco;
		consumo = Consumo.F;
		precioBase = 100;
		peso = 5;
	}

	public Electrodomestico(int precio, int peso) {
		this.peso = peso;
		this.precioBase = precio;
		color = Color.Blanco;
		consumo = Consumo.F;
	}

	/**
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
	 * @return the precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return the consumo
	 */
	public Consumo getConsumo() {
		return consumo;
	}

	protected void comprobarConsumoEnergetico(char letra) {
		
		if (!(letra >= 'A' && letra <= 'F')) {
			consumo = Consumo.F;
		} 
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	protected void comprobarColor(String color) {
		
		if (!Color.values().equals(color)) {
			this.color = Color.Blanco;
		}
	}
	
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
