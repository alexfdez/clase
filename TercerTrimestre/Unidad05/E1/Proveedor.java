package E1;

public class Proveedor {
	
	private static int idActual = 10000;
	private String nombre;
	private String direccion;
	private String telefono;
	private int id;
	
	// CONSTRUCTORES
	public Proveedor(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.id = Proveedor.idActual;
		Proveedor.idActual++;
	}
	
	public Proveedor(String nombre) {
		this(nombre, "<Desconocido>", "<Desconocido>");
	}

	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	// MÉTODOS
	@Override
	public String toString() {
		return "Proveedor Nº " + this.id + " - " + this.nombre + "\n\n" + this.direccion + "\nTel. " + this.telefono;
	}
	
}