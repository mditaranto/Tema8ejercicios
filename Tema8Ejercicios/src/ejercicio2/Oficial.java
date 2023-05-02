package ejercicio2;

/**
 * Subclase de la clase padre "Empleado"
 * 
 * @author mditaranto
 *
 */
public class Oficial extends Operario {

	/**
	 * Constructor sin parametros
	 */
	public Oficial() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo toString que implementa la clase padre
	 */
	@Override
	public String toString() {
		return super.toString() + " Oficial";
	}

}
