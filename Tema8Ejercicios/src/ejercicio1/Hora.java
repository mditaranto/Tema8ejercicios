package ejercicio1;

public class Hora {

	int hora;
	int minutos;

	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

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
	

	public boolean setMinutos(int minutos) {
		boolean verif = false;
		if (minutos < 60 && minutos > 0) {
			this.minutos = minutos;
			verif = true;
		}
		return verif;
	}

	public boolean setHora(int hora) {
		boolean verif = false;
		if (hora >= 0 && hora < 24) {
			verif = true;
			this.hora = hora;
		}

		return verif;
	}

	public String toString() {
		return String.format("%02d:%02d", hora, minutos);
	}
	
	

}
