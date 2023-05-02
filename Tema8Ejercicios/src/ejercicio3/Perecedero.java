package ejercicio3;

public class Perecedero extends Productos {
	
	int diasACaducar;

	/**
	 * @param nombre
	 * @param precio
	 * @param diasACaducar
	 */
	public Perecedero(String nombre, int precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	/**
	 * @return the diasACaducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * @param diasACaducar the diasACaducar to set
	 */
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return super.toString() + "Perecedero [diasACaducar=" + diasACaducar + "]";
	}

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
