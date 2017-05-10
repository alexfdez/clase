package D1;

public class Bombilla {
	
	private int contEncendidos = 0;
	private String estado = "APAGADA";
	
	// CONSTRUCTORES
	public Bombilla(String estado) {
		this.setEstado(estado);
	}
	
	public Bombilla() {
		this("APAGADO");
	}
	
	// GETTERS Y SETTERS
	public int getContEncendidos() {
		return contEncendidos;
	}

	public void setContEncendidos(int contEncendidos) {
		this.contEncendidos = contEncendidos;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void encender() {
		
		if (this.getContEncendidos() < 1000) {
			this.contEncendidos++;
			// this.setContEncendidos(this.getContEncendidos++);
		}
		
		if (this.getEstado().equals("FUNDIDA")) {
			System.out.println("La bombilla está fundida");
		}
		else if (this.getEstado().equals("ENCENDIDA")) {
			System.out.println("La bombilla ya estaba encendida");
		}
		else if (this.getContEncendidos() == 1000) {
			System.out.println("La bombilla se ha fundido");
			this.setEstado("FUNDIDA");
		}
		else {
			this.setEstado("ENCENDIDA"); 
		}
		
	}
	
	public void apagar() {
			if (this.getEstado().equals("FUNDIDA")) {
				System.out.println("La bombilla está fundida");
			}
			else if (this.getEstado().equals("APAGADA")) {
				System.out.println("La bombilla ya estaba apagada");
			}
			else {
				this.setEstado("APAGADA");
			}
	}
}