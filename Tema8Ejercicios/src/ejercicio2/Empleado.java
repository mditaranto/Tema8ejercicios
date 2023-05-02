package ejercicio2;

/**
 * Clase que guarda informacion de los empleados
 * 
 * @author mditaranto
 *
 */
public class Empleado {

	/**
	 * Atributo del nombre del empleado
	 */
	protected String nombre;

	/**
	 * Constructor sin parametros
	 */
	public Empleado() {
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Getter del nombre
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
