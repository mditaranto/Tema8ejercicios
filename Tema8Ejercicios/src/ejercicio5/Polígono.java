package ejercicio5;

public abstract class Polígono {

	protected int numlados;

	@Override
	public String toString() {
		return "Polígono con " + numlados + " lados.";
	}
	
	protected abstract double area();

	/**
	 * @param numlados
	 */
	public Polígono(int numlados) {
		super();
		this.numlados = numlados;
	}

	/**
	 * @return the numlados
	 */
	public int getNumlados() {
		return numlados;
	}
	
	
}
