package ejercicio2;

/**
 * Subclase de la clase padre "Empleado"
 * 
 * @author mditaranto
 *
 */
public class Operario extends Empleado {

	/**
	 * Constructor sin parametros
	 */
	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo toString que implementa la clase padre
	 */
	@Override
	public String toString() {
		return super.toString() + " Operario";
	}

}
