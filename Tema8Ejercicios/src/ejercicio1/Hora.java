package ejercicio1;

/**
 * Clase que guarda el valor de una hora
 * @author mditaranto
 *
 */
public class Hora {

	/**
	 * Atributo que guarda el valor de las horas
	 */
	int hora;
	/**
	 * Atributo que guarda valor de los minutos
	 */
	int minutos;

	/**
	 * Constructor con parametros
	 * @param hora
	 * @param minutos
	 */
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	/**
	 * Metodo que incrementa los minutos en 1
	 */
	public void inc() {
		if (minutos == 59) {
            minutos = 0;
            if (hora == 23) {
                hora = 0;
            } else {
                hora++;
            }
        } else {
            minutos++;
        }
    }
	

	/**
	 * Setter de los minutos
	 * @param minutos
	 * @return
	 */
	public boolean setMinutos(int minutos) {
		boolean verif = false;
		if (minutos < 60 && minutos > 0) {
			this.minutos = minutos;
			verif = true;
		}
		return verif;
	}

	/**
	 * Setter de las horas
	 * @param hora
	 * @return
	 */
	public boolean setHora(int hora) {
		boolean verif = false;
		if (hora >= 0 && hora < 24) {
			verif = true;
			this.hora = hora;
		}

		return verif;
	}

	/**
	 * Metodo toString de la clase
	 */
	public String toString() {
		return String.format("%02d:%02d", hora, minutos);
	}
	
	

}
