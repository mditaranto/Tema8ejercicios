package ejercicio2;

public class Empleado {

	String nombre;

	public Empleado() {
	}

	/**
	 * @param nombre
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
