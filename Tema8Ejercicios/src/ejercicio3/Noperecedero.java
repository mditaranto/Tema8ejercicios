package ejercicio3;

public class Noperecedero extends Productos{
	
	String tipo;

	/**
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public Noperecedero(String nombre, int precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Noperecedero [tipo=" + tipo + "]";
	}
	

}
