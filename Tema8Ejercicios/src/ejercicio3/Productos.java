package ejercicio3;

public class Productos {
	
	private String nombre;
	private int precio;
	/**
	 * @param nombre
	 * @param precio
	 */
	public Productos(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public double calcular(int cant) {
		double total;
		total = cant * precio;
		return total;
	}

}
