package ejercicio1;

public class Main {

	public static void main(String[] args) {
		//Creacion de un objeto HoraExacta
		HoraExacta hour = new HoraExacta(22, 56, 59);
	
		//Modificacion de los minutos
		hour.setMinutos(20);
		
		//Incrementa los segundos
		hour.inc();
		
		//Imprime la hora
		System.out.println(hour.toString());

	}

}
