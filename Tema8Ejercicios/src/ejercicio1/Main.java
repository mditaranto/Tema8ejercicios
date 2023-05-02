package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		HoraExacta hour = new HoraExacta(22, 56, 59);
	
		hour.setMinutos(20);
		
		hour.inc();
		
		System.out.println(hour.toString());

	}

}
