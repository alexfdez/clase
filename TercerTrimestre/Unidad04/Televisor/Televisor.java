package Televisor;

public class Televisor {
	
	private String marca;
	private String modelo;
	private int anio;
	private boolean panoramica;
	private boolean estereo;
	private boolean encendida;
	private int volumen;
	private int canal;
	
	// CONSTRUCTORES
	public Televisor(String marca, String modelo, int anio, boolean panoramica, boolean estereo, boolean encendida, int volumen, int canal) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.panoramica = panoramica;
		this.estereo = estereo;
		this.encendida = encendida;
		this.volumen = volumen;
		this.canal = canal;
	}
	
	public Televisor(String marcaInicial, String modeloInicial, int anioIni) {
		this.marca = marcaInicial;
		this.modelo = modeloInicial;
		this.anio = ((anioIni > 2200 || anioIni < 1950)? 2000 : anioIni );
	}
	
	public Televisor() {
		this("", "", 2000);
	}
	
	// MÉTODOS
	public void encender() {
		if (!this.encendida) {
			System.out.println("Se ha encendido el televisor");
			this.encendida = true;
		}
	}
	
	public void apagar() {
		if (this.encendida) {
			System.out.println("Se ha apagado el televisor");
			this.encendida = false;
		}
	}
	
	public void seleccionarCanal(int nuevoCanal) {
		if (!this.encendida) {
			System.out.println("Televisor apagado");
		}
		else if (nuevoCanal > 99 || nuevoCanal < 0) {
			System.out.println("El canal que intentas seleccionar no existe");
		}
		else {
			this.canal = nuevoCanal;
			System.out.println("Has seleccionado el canal " + nuevoCanal);
		}
	}
	
	public int obtenerCanal() {
		return this.canal;
	}
	
	public void subirCanal() {
		this.seleccionarCanal(this.obtenerCanal() + 1);
	}
	
	public void bajarCanal() {
		this.seleccionarCanal(this.obtenerCanal() - 1);
	}
	
	public void cambiarVolumen(int nuevoVolumen) {
		if (!this.encendida) {
			System.out.println("Televisor apagado");
		}
		else if (nuevoVolumen > 100 || nuevoVolumen < 0) {
			System.out.println("El volumen ha llegado al límite");
		}
		else {
			this.volumen = nuevoVolumen;
			System.out.println("Volumen: " + nuevoVolumen);
		}
	}
	
	public void imprimirCaracteristicas() {
		String cadena = "\n### Características del televisor ###";
		
		cadena += "\n* Marca: " + this.marca;
		cadena += "\n* Modelo: " + this.modelo;
		cadena += "\n* Año: " + this.anio;
		cadena += "\n* Panorámica: " + (this.panoramica? "Sí" : "No");
		cadena += "\n* Estéreo: " + (this.estereo? "Sí" : "No");
		
		System.out.println(cadena + "\n");
	}
}