package D1;

public class Temperatura {
	
	private Fecha fechaTemp;
	private double tempMaxima;
	private double tempMinima;
	
	// CONSTRUCTORES
	public Temperatura(double tempMaxima, double tempMinima) {
		this.setTempMaxima(tempMaxima);
		this.setTempMinima(tempMinima);
		this.fechaTemp = new Fecha();
	}
	
	// GETTERS Y SETTERS
	public void setTempMaxima(double maxima) {
		this.tempMaxima = maxima;
	}
	
	public double getTempMaxima() {
		return this.tempMaxima;
	}
	
	public void setTempMinima(double minima) {
		this.tempMinima = minima;
	}
	
	public double getTempMinima() {
		return this.tempMinima;
	}
	
	public void setFechaTemp(int dia, int mes, int year) {
		this.fechaTemp.modificarFecha(dia, mes, year);
	}
	
	public double getTempMedia() {
		return ( this.getTempMaxima()+this.getTempMinima() )/2;
	}
	
	// MÉTODOS
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "* Fecha: " + this.fechaTemp;
		cadena += "\n* Temperatura máxima: " + this.tempMaxima + "ºC";
		cadena += "\n* Temperatura mínima: " + this.tempMinima + "ºC";
		cadena += "\n* Temperatura media: " + this.getTempMedia() + "ºC";
		
		return cadena;
	}
}