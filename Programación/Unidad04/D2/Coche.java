package D2;

public class Coche {
	
	// Propiedades independientes del estado
	private String matricula;
	private double maxLitrosDeposito;
	private double maxLitrosReserva;
	private double velocidadMaxima;
	private double consumoMedio100km;
	
	
	// Propiedades que definen el estado del coche
	private boolean motorArrancado;
	private boolean estaEnReserva;
	private double numLitrosActual;
	private double velocidadActual;
	private double kilometraje;
	
	
	// Constructor
	public Coche (String mat, double maxLitrosDeposito, double consumoMedio, double velocidadMax) {
		this.matricula = mat;
		this.maxLitrosDeposito = (maxLitrosDeposito <= 0 ? 50 : maxLitrosDeposito );
		this.consumoMedio100km = (consumoMedio <= 0 ? 7.5 : consumoMedio );
		this.velocidadMaxima = (velocidadMax <= 0 ? 180 : velocidadMax );
		this.maxLitrosReserva = this.maxLitrosDeposito * 0.15;
	}
	
	
	// Getters y setters
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public double getMaxLitrosDeposito() {
		return maxLitrosDeposito;
	}

	public double getMaxLitrosReserva() {
		return maxLitrosReserva;
	}
	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public double getConsumoMedio100km() {
		return consumoMedio100km;
	}
	
	public boolean getMotorArrancado() {
		return motorArrancado;
	}
	
	public boolean getEstaEnReserva() {
		return estaEnReserva;
	}
	
	public double getNumLitrosActual() {
		return numLitrosActual;
	}
	
	public double getVelocidadActual() {
		return velocidadActual;
	}
	
	public double getKilometraje() {
		return kilometraje;
	}
	
	
	// Comportamientos
	public void arrancarMotor() {
		if (this.numLitrosActual > 0 && !this.motorArrancado) {
			this.motorArrancado = true;
			System.out.println("El coche con matrícula" + this.matricula + " ha arrancado");
			
			if (this.estaEnReserva) {
				System.out.println("El coche con matrícula" + this.matricula + " está en reserva de combustible");
			}
		}
		else if (this.motorArrancado) {
			System.out.println("El coche con matrícula" + this.matricula + " ya estaba arrancado");
		}
		else {
			System.out.println("El coche con matrícula" + this.matricula + " no le queda combustible, no se ha podido arrancar");
		}
	}
	
	public void pararMotor() {
		if (this.motorArrancado) {
			this.motorArrancado = false;
			System.out.println("El coche con matrícula" + this.matricula + " ha parado");
		}
	}
	
	public void repostar(double litros) {
		if ( (this.numLitrosActual + litros) > this.maxLitrosDeposito ) {
			this.numLitrosActual = this.getMaxLitrosDeposito();
			System.out.println("El coche con matrícula" + this.matricula + " ha rebosado el depósito");
			
			if (this.estaEnReserva) {
				this.estaEnReserva = false;
			}
		}
		else if ( litros > 0 && (this.numLitrosActual + litros) <= this.maxLitrosDeposito ) {
			this.numLitrosActual += litros;
			
			if (this.numLitrosActual > this.maxLitrosReserva) {
				this.estaEnReserva = false;
			}
		}
		
		System.out.println("El coche con matrícula" + this.matricula + " tiene " + this.numLitrosActual + " litros de combustible");
	}
	
	public void fijarVelocidad(double velocidad) {
		double velocidadInicial = this.getVelocidadActual();
		
		if (!this.motorArrancado) {
			System.out.println("El coche con matrícula" + this.matricula + " no está arrancado");
		}
		else if (velocidad > this.velocidadMaxima) {
			this.velocidadActual = this.getVelocidadMaxima();
		}
		else if (velocidad <= 0) {
			this.velocidadActual = 0;
		}
		
		if (this.motorArrancado && velocidadInicial != this.velocidadActual) {
			System.out.println("La velocidad del coche con matrícula " + this.matricula + " ha cambiado a " + this.velocidadActual + "km/h");
		}
	}
	
	public void recorrerDistancia(double kilometros) {
		if ( !this.motorArrancado || this.velocidadActual <= 0 ) {
			System.out.println("El coche con matrícula " + this.matricula + " está parado, no tiene velocidad");
		}
		else if (kilometros <= 0) {
			System.out.println("ERROR: La distancia es negativa");
		}
		else {
			double consumoInstantaneo = this.getConsumoMedio100km() * ( 1 + ( (this.getVelocidadActual() - 100) / 100 ) );
			
			double litrosNecesarios = (kilometros * consumoInstantaneo) / 100;
			
			if (litrosNecesarios < this.numLitrosActual) {
				this.kilometraje += kilometros;
				System.out.println("El coche con matrícula" + this.matricula + " ha recorrido " + kilometraje);
				
				this.numLitrosActual -= litrosNecesarios;
				
				if (this.numLitrosActual <= this.maxLitrosReserva) {
					this.estaEnReserva = true;
				}
			}
			else {
				double distanciaReal = 100 * this.getNumLitrosActual() / consumoInstantaneo;
				
				this.kilometraje += distanciaReal;
				this.numLitrosActual = 0;
				this.estaEnReserva = true;
				
				System.out.println("El coche con matrícula " + this.matricula + " ha recorrido " + distanciaReal + " kilómetros");
				System.out.println("El coche con matrícula " + this.matricula + " está sin combustible");
				System.out.println("El coche con matrícula " + this.matricula + " está parado");
			}
		}
	}
	
}