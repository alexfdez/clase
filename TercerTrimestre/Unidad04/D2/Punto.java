package D2;

public class Punto {
	
	private double a;
	private double b;
	
	// Constructores
	public Punto(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Punto() {
		this(0,0);
	}
	
	
	// Getters y setters
	public double getX() {
		return a;
	}
	
	public void setX(double a) {
		this.a = a;
	}
	
	public double getY() {
		return b;
	}
	
	public void setY(double b) {
		this.b = b;
	}
	
	
	// Métodos
	public boolean equals(Punto otro) {
		return this.a == otro.a && this.b == otro.b;
	}
	
	public double distancia() {
		return Math.sqrt( (this.a*this.a) + (this.b*this.b) );
	}
	
}