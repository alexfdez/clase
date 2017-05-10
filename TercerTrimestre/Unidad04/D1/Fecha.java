package D1;

public class Fecha {
    
    private int dia,mes,year;
    private static int[] diasMeses = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    // CONSTRUCTORES
    public Fecha(int dia, int mes, int year) throws IllegalArgumentException {
        if (!Fecha.comprobarFecha(dia,mes,year)){                
             throw new IllegalArgumentException("Error, fecha incorrecta");
        }
        
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }
    
    public Fecha() {
    	this(1,1,1900);
    }
    
    public Fecha(Fecha other){
    	this(other.dia, other.mes, other.year);
    }
    
    // GETTERS Y SETTERS
    public int devolverDia() {
        return this.dia;
    }

    public int devolverMes() {
        return this.mes;
    }

    public int devolverYear() {
        return this.year;
    }

    public void modificarDia(int dia) throws IllegalArgumentException {
        if (!Fecha.comprobarFecha(dia,this.mes,this.year)) {
        	throw new IllegalArgumentException("Error, el día no es correcto");
        }
        
        this.dia = dia;
    }

    public void modificarMes(int mes) throws IllegalArgumentException {
        if (!Fecha.comprobarFecha(this.dia,mes,this.year)) {
           throw new IllegalArgumentException("Error, el mes no es correcto");
        }
        
        this.mes = mes;         
    }

    public void modificarYear(int year) throws IllegalArgumentException {
       if (!Fecha.comprobarFecha(this.dia,this.mes,year)) {
           throw new IllegalArgumentException("Error, el año no es correcto");
       }
       
        this.year = year;        
    }
    
    public void modificarFecha(int dia, int mes, int year) throws IllegalArgumentException {
        if (!Fecha.comprobarFecha(dia,mes,year)) {
           throw new IllegalArgumentException("Error, fecha incorrecta");
        }
        
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }
    
    public void modificarFecha(Fecha other) {
        this.modificarFecha(other.dia, other.mes,other.year);
    }
    
    // MÉTODOS
    @Override
    public String toString() {
    	 return this.dia + "/" + this.mes + "/" + this.year;
    }
    
    public static boolean bisiesto(int year){
        return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }
    
    private static boolean comprobarFecha(int dia,int mes,int year) {
        boolean esCorrecta = false;
        
        if ((mes>0 && mes<13) && year>=1900) {
            if (Fecha.bisiesto(year)) { Fecha.diasMeses[2] = 29; }
            
            if (dia>0 && dia<=Fecha.diasMeses[mes]) {
                Fecha.diasMeses[2] = 28;
                esCorrecta = true;
            }           
        }
        
        return esCorrecta;        
    }
}