package ejercicio1;

/**
 * Subclase de la padre "Hora"
 * @author mditaranto
 *
 */
public class HoraExacta extends Hora {

	/**
	 * Atributo que guarda los segundos
	 */
	int segundos;

	/**
	 * Constructor con parametros
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	/**
	 * Metodo que incrementa en 1 los segundos.
	 * Implementa el metodo inc de la clase padre
	 */
	@Override
	public void inc() {
		if (segundos == 59) {
            segundos = 0;
            super.inc();
        } else {
            segundos++;
        }
	}

	/**
	 * Metodo toString de la clase
	 * Implementa el metodo de la clase padre
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d:%02d:%02d", super.hora, super.minutos, segundos);
		 
	}

	/**
	 * Setter de los segundos
	 * @param segundos
	 */
	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		}
	}

}
