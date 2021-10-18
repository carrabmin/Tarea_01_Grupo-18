public class NumeroPrimo implements Runnable {

	private long numero;
	private String esPrimo;
	private String nombreHilo;
	private long tiempo;

	public NumeroPrimo() {
		super();
	}

	public NumeroPrimo(long numero) {
		super();
		this.numero = numero;
	}
	
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getEsPRimo() {
		return esPrimo;
	}
	
	public void setEsPrimo(String esPrimo) {
		this.esPrimo = esPrimo;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}
	
	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	public long getTiempo() {
		return tiempo;
	}
	
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}

	public void esPrimo(long numero) {
		long startTime = System.nanoTime();
		int cant_divisores = 0;
		long i = 1;
		while (i <= numero) {
			if (numero % i == 0) {
				cant_divisores++;
			}
			i++;
		}
		if (cant_divisores == 2) {
			this.esPrimo = "Es número primo";
			this.nombreHilo = Thread.currentThread().getName();
		}else { 
			this.esPrimo = "No es número primo"; 
			this.nombreHilo = Thread.currentThread().getName();
		}
		
		long endTime = System.nanoTime();
		this.tiempo = (endTime - startTime);
	}
	
	@Override
	public void run() {
		esPrimo(numero);
		System.out.println("\n" + toString());	
	}

	@Override
	public String toString() {
		return "Cálculo del Nº Primo [Numero: " + numero + ", Resultado: " + esPrimo + ", Hilo procesador: " + nombreHilo + ", Tiempo: "
				+ tiempo + " nanosegundos" + " (" + (float)(tiempo / Math.pow(10, 9)) + " seg)" + "]";
	}
	
}