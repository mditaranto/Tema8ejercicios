package ejercicio2;

/**
 * Subclase de la clase padre "Empleado"
 * 
 * @author mditaranto
 *
 */
public class Directivo extends Empleado {

	/**
	 * Constructor sin paramtros
	 */
	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo toString que implementa la clase padre
	 */
	@Override
	public String toString() {
		return super.toString() + " Directivo";
	}

}
