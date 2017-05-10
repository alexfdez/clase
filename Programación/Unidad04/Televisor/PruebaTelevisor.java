package Televisor;

public class PruebaTelevisor {

	public static void main(String[] args) {
		
		Televisor t1 = new Televisor("Sony", "Trinitron 4", 2003);
		t1.encender();
		
		t1.imprimirCaracteristicas();
		
		t1.bajarCanal();
		
		t1.seleccionarCanal(13);
		t1.subirCanal();
		
		t1.cambiarVolumen(300);
		
		t1.cambiarVolumen(50);
		t1.imprimirCaracteristicas();
		
		t1.apagar();
		
		t1.seleccionarCanal(60);
		
		t1.apagar();
	}
}