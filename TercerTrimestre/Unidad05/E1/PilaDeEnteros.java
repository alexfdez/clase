package E1;

public class PilaDeEnteros {
	
	// La parte más baja de la pila es [0],
	// la parte más alta [MAX_N - 1].
	
	private static final int MAX_N = 100;
	private int tope = -1;
	private int[] pila;
	
	
	// Constructores
	public PilaDeEnteros() {
		pila = new int[MAX_N];
	}
	
	
	// Métodos
	public void push(int n) {
		if (!this.estaLleno()) {
			this.tope++;
			this.pila[this.tope] = n;
		}
	}
	
	
	public int pop(int pos) {
		int n;
		int posReal = pos-1;
		
		if (posReal >= 0 && posReal <= 99) {
			n = this.pila[posReal];
			
			for (int i = posReal; i < this.tope; i++) {
				this.pila[i] = this.pila[i+1];
			}
			
			this.tope--;
		}
		else {
			n = 0;
		}
		
		return n;
	}
	
	
	public int peek() {
		return this.pila[this.tope];
	}
	
	
	private boolean estaLleno() {
		return (this.tope + 1) == MAX_N;
	}
	
}