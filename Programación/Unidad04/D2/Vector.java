package D2;

public class Vector {
	
	private double a;
	private double b;
	
	// Constructores
	public Vector(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Vector(Punto punto) {
		this(punto.getX(), punto.getY());
	}
	
	public Vector(Punto p1, Punto p2) {
		this(p2.getX() - p1.getX(), p2.getY() - p1.getY());
	}
	
	
	// Getters y setters
	public double getExtremoX() {
		return a;
	}

	public void setExtremoX(double a) {
		this.a = a;
	}

	public double getExtremoY() {
		return b;
	}

	public void setExtremoY(double b) {
		this.b = b;
	}
	
	
	// Métodos
	public boolean equals(Vector otro) {
		return this.a == otro.a && this.b == otro.b;
	}
	
	public double longitud() {
		return Math.sqrt( (this.a*this.a) + (this.b*this.b) );
	}
	
	public boolean proporcional(Vector otro) {
		return (this.a/otro.a) == (this.b/otro.b);
	}
	
	public boolean perpendicular(Vector otro) {
		return ( (this.a*otro.a) + (this.b*otro.b) ) == 0;
	}
	
	public Punto traslada(Punto punto) {
		return new Punto(punto.getX() + this.a, punto.getY() + this.b);
	}
}