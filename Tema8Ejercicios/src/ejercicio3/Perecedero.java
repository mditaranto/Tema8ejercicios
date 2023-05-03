package ejercicio3;

/**
 * Subclase de la clase Productos
 * @author mditaranto
 *
 */
public class Perecedero extends Productos {
	
	/**
	 * Atributo de los dias que quedan antes que caduque el producto
	 */
	int diasACaducar;

	/**
	 * Constructor con parametros 
	 * @param nombre
	 * @param precio
	 * @param diasACaducar
	 */
	public Perecedero(String nombre, int precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Getter de los dias que quedan para que caduque
	 * @return the diasACaducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Setter de los dias que quedan para que caduque
	 * @param diasACaducar the diasACaducar to set
	 */
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Metodo toString que implementa desde la clase padre
	 */
	@Override
	public String toString() {
		return super.toString() + "Perecedero [diasACaducar=" + diasACaducar + "]";
	}

	/**
	 * Metodo que calcula el total dependiendo de los dias a caducar
	 */
	@Override
	public double calcular(int cant) {
		double total = 0;
		switch (diasACaducar) {
		case 1 -> {
			total = super.calcular(cant)/4;
		}
		case 2 -> {
			total = super.calcular(cant)/3;
		}
		case 3 -> {
			total = super.calcular(cant)/2;
		}
		default -> {
			total = super.calcular(cant);
		}
		}
		return total;
	}
	
	

}
