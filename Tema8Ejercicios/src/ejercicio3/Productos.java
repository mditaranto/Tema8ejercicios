package ejercicio3;

/**
 * Clase que guarda los valores de los productos
 * @author mditaranto
 *
 */
public class Productos {
	
	/**
	 * Atributo del nombre
	 */
	protected String nombre;
	/**
	 * Atributo del precio
	 */
	protected int precio;
	
	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param precio
	 */
	public Productos(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	/**
	 * Getter del nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter del nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Getter del precio
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * Setter del precio
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	/**
	 * Metodo que calcula el precio total
	 * @param cant
	 * @return
	 */
	public double calcular(int cant) {
		double total;
		total = cant * precio;
		return total;
	}

}
