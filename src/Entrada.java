import java.time.LocalDate;

public class Entrada {
	private int numero;
	private int valor;
	private LocalDate fecha;
	private String funcion;
	private String nombreFuncion;
	private int cantidadAsiento;
	
	public Entrada() {
		
	}

	public Entrada(int numero, int valor, LocalDate fecha, String funcion, String nombreFuncion, int cantidadAsiento) {
		this.numero = numero;
		this.valor = valor;
		this.fecha = fecha;
		this.funcion = funcion;
		this.nombreFuncion = nombreFuncion;
		this.cantidadAsiento = cantidadAsiento;
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String getNombreFuncion() {
		return nombreFuncion;
	}

	public void setNombreFuncion(String nombreFuncion) {
		this.nombreFuncion = nombreFuncion;
	}

	
	
	
}