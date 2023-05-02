package ejercicio1;

public class HoraExacta extends Hora {

	int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	@Override
	public void inc() {
		if (segundos == 59) {
            segundos = 0;
            super.inc();
        } else {
            segundos++;
        }
	}

	@Override
	public boolean setMinutos(int minutos) {
		// TODO Auto-generated method stub
		return super.setMinutos(minutos);
	}

	@Override
	public boolean setHora(int hora) {
		// TODO Auto-generated method stub
		return super.setHora(hora);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d:%02d:%02d", super.hora, super.minutos, segundos);
		 
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		}
	}

}
