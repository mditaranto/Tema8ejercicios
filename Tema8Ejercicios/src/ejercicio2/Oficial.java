package ejercicio2;

public class Oficial extends Operario {

	/**
	 * 
	 */
	public Oficial() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " Oficial";
	}

}
