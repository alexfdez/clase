package D2;

public class Recta {
	
	private Punto p;
	private Vector v;
	
	// Constructores
	public Recta(Punto p, Vector v) {
		this.p = p;
		this.v = v;
	}
	
	public Recta(Vector v) {
		this.p = new Punto();
		this.v = v;
	}
	
	public Recta(Punto p1, Punto p2) {
		this.p = new Punto();
		this.v = new Vector(p1,p2);
	}
	
	
	// Getters y setters
	public Punto getP() {
		return p;
	}
	
	public void setP(Punto p) {
		this.p = p;
	}
	
	public Vector getV() {
		return v;
	}
	
	public void setV(Vector v) {
		this.v = v;
	}
	
	
	// Métodos
	public boolean equals(Recta otra) {
		return this.p.equals(otra.p) && this.v.equals(otra.v);
	}
	
	public boolean perpendicular(Recta otra) {
		return this.v.perpendicular(otra.v);
	}
	
	public boolean paralela(Recta otra) {
		return this.v.proporcional(otra.v);
	}
	
	public boolean pertenece(Punto otro) {
		return true;
	}
}