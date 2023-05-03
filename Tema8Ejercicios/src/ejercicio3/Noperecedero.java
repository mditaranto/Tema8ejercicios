package ejercicio3;

/**
 * Subclase de la clase Productos
 * @author mditaranto
 *
 */
public class Noperecedero extends Productos{
	
	/**
	 * Atibuto que guarda el tipo de producto
	 */
	String tipo;

	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public Noperecedero(String nombre, int precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 *Getter del tipo de producto
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Setter del tipo de producto
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Metodo toString que implementa desde la clase padre
	 */
	@Override
	public String toString() {
		return super.toString() + "Noperecedero [tipo=" + tipo + "]";
	}
	

}
