package numero_primo;

// Clase NumeroPrimo que implementa la interface "Runnable" necesario para trabajar con hilos:
public class NumeroPrimo implements Runnable {
	
	//Declaración de los atributos de la clase NumeroPrimo:
	// (Utilizamos atributos tipo "long" para poder procesar números elevados)
	private long numero;
	private String esPrimo;
	private String nombreHilo;
	private long tiempo;
	
	// Constructor vacío:
	public NumeroPrimo() {
		super();
	}

	// Constructor para el atributo "long numero" (en un principio es el único atributo que necesitamos para el cálculo):
	public NumeroPrimo(long numero) {
		super();
		this.numero = numero;
		
	}
	
	// Getters and Setters:
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

	// Método para calcular si es número primo, pasándole el argumento "long numero":
	public void esPrimo(long numero) {
		// Declaramos la variable "startTime" para guardar el tiempo (en nanosegundos) en el que comienza a ejecutarse el método:
		long startTime = System.nanoTime();
		// Inicializamos la variable cant_divisores a cero:
		int cant_divisores = 0;
		// Inicializamos la variable i a uno que utilizaremos dentro del bucle while:
		// (Utilizamos el tipo "long" porque procedera a realizar divisiones con el número (también de tipo "long"))	
		long i = 1;
		// Bucle while para calcular el número de divisores con resto igual a cero de nuestro número problema:
		// (Siempre que el número sea menor que la varibale "i" entraremos en el bucle "while")
		while (i <= numero) {
			if (numero % i == 0) {
				// Si el resto de dividir el número entre la variable "i" es exactamente cero incrementamos el divisor en una unidad: 
				cant_divisores++;
			}
			// Incrementamos la variable "i" en una unidad para seguir o no entrando en el bucle "while":
			i++;
		}
		// Estructura de control if - else que determina si el número es primo o no:
		if (cant_divisores == 2) {
			// Si tiene sólo dos divisores el número es primo y llamamos a los constructores 
			// para que guarden dicha información en los atributos "esPrimo" y "nombreHilo":
			this.esPrimo = "Es número primo";
			// Utilizamos el método "currentThread().getName()" de la clase Thread para averiguar el nombre de hilo:
			this.nombreHilo = Thread.currentThread().getName();
		}else { 
			// En caso contrario el número no es primo y llamamos a los constructores 
			// para que guarden dicha información en los atributos "esPrimo" y "nombreHilo":
			this.esPrimo = "No es número primo"; 
			// Utilizamos el método "currentThread().getName()" de la clase Thread para averiguar el nombre de hilo:
			this.nombreHilo = Thread.currentThread().getName();
		}
		
		// Declaramos la variable "endTime" para guardar el tiempo (en nanosegundos) en el que acaba de ejecutarse el método:
		long endTime = System.nanoTime();
		// Llamamos al constructor del atributo "tiempo" para guardar el tiempo de ejecución 
		// con una simple resta de las dos variables: 
		this.tiempo = (endTime - startTime);
	}
	
	// Sobreescribimos el método "run()" que lanzará los hilos:
	@Override
	public void run() {
		// Utilizamos el método "esPrimo" implementado anteriormente con el número problema:
		esPrimo(numero);
		// Imprimimos la información del objeto con el método "toString" que nos da la información completa del objeto NumeroPrimo:
		System.out.println("\n" + toString());	
	}

	// Sobreescribimos el método "toString()" que nos da la información de los atributos que componen el objeto:
	// (Nótese que mostramos también la conversión del tiempo de ejecución de nanosegundos a segundos) 
	@Override
	public String toString() {
		return "Cálculo del Nº Primo [Numero: " + numero + ", Resultado: " + esPrimo + ", Hilo procesador: " + nombreHilo + ", Tiempo: "
				+ tiempo + " nanosegundos" + " (" + (float)(tiempo / Math.pow(10, 9)) + " seg)" + "]";
	}
	
}
