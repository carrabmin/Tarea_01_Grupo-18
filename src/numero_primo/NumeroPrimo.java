package numero_primo;

// Clase NumeroPrimo que implementa la interface "Runnable" necesario para trabajar con hilos:
public class NumeroPrimo implements Runnable {
	
	//Declaraci�n de los atributos de la clase NumeroPrimo:
	// (Utilizamos atributos tipo "long" para poder procesar n�meros elevados)
	private long numero;
	private String esPrimo;
	private String nombreHilo;
	private long tiempo;
	
	// Constructor vac�o:
	public NumeroPrimo() {
		super();
	}

	// Constructor para el atributo "long numero" (en un principio es el �nico atributo que necesitamos para el c�lculo):
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

	// M�todo para calcular si es n�mero primo, pas�ndole el argumento "long numero":
	public void esPrimo(long numero) {
		// Declaramos la variable "startTime" para guardar el tiempo (en nanosegundos) en el que comienza a ejecutarse el m�todo:
		long startTime = System.nanoTime();
		// Inicializamos la variable cant_divisores a cero:
		int cant_divisores = 0;
		// Inicializamos la variable i a uno que utilizaremos dentro del bucle while:
		// (Utilizamos el tipo "long" porque procedera a realizar divisiones con el n�mero (tambi�n de tipo "long"))	
		long i = 1;
		// Bucle while para calcular el n�mero de divisores con resto igual a cero de nuestro n�mero problema:
		// (Siempre que el n�mero sea menor que la varibale "i" entraremos en el bucle "while")
		while (i <= numero) {
			if (numero % i == 0) {
				// Si el resto de dividir el n�mero entre la variable "i" es exactamente cero incrementamos el divisor en una unidad: 
				cant_divisores++;
			}
			// Incrementamos la variable "i" en una unidad para seguir o no entrando en el bucle "while":
			i++;
		}
		// Estructura de control if - else que determina si el n�mero es primo o no:
		if (cant_divisores == 2) {
			// Si tiene s�lo dos divisores el n�mero es primo y llamamos a los constructores 
			// para que guarden dicha informaci�n en los atributos "esPrimo" y "nombreHilo":
			this.esPrimo = "Es n�mero primo";
			// Utilizamos el m�todo "currentThread().getName()" de la clase Thread para averiguar el nombre de hilo:
			this.nombreHilo = Thread.currentThread().getName();
		}else { 
			// En caso contrario el n�mero no es primo y llamamos a los constructores 
			// para que guarden dicha informaci�n en los atributos "esPrimo" y "nombreHilo":
			this.esPrimo = "No es n�mero primo"; 
			// Utilizamos el m�todo "currentThread().getName()" de la clase Thread para averiguar el nombre de hilo:
			this.nombreHilo = Thread.currentThread().getName();
		}
		
		// Declaramos la variable "endTime" para guardar el tiempo (en nanosegundos) en el que acaba de ejecutarse el m�todo:
		long endTime = System.nanoTime();
		// Llamamos al constructor del atributo "tiempo" para guardar el tiempo de ejecuci�n 
		// con una simple resta de las dos variables: 
		this.tiempo = (endTime - startTime);
	}
	
	// Sobreescribimos el m�todo "run()" que lanzar� los hilos:
	@Override
	public void run() {
		// Utilizamos el m�todo "esPrimo" implementado anteriormente con el n�mero problema:
		esPrimo(numero);
		// Imprimimos la informaci�n del objeto con el m�todo "toString" que nos da la informaci�n completa del objeto NumeroPrimo:
		System.out.println("\n" + toString());	
	}

	// Sobreescribimos el m�todo "toString()" que nos da la informaci�n de los atributos que componen el objeto:
	// (N�tese que mostramos tambi�n la conversi�n del tiempo de ejecuci�n de nanosegundos a segundos) 
	@Override
	public String toString() {
		return "C�lculo del N� Primo [Numero: " + numero + ", Resultado: " + esPrimo + ", Hilo procesador: " + nombreHilo + ", Tiempo: "
				+ tiempo + " nanosegundos" + " (" + (float)(tiempo / Math.pow(10, 9)) + " seg)" + "]";
	}
	
}
