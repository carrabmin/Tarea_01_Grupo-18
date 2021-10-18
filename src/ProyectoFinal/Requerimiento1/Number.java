package Requerimiento1;

//implementamos la interfaces Runnable para poder trabajar con los hilos
public class Number implements Runnable {
	private long number;
	private String isPrime;
	private String branch;
	private long time;

	public Number(long number) {
		super();
		this.number = number;

	}

	public void isPrime(long number) {
		// usamos el método currentTimeMilles porque ya nos da directamente el tiempo en
		// segundos y sin necesidad de declarar
		// otra nueva variable
		long startTime = System.currentTimeMillis();
		// generamos un contador para sacar la cantidad de números pares y con ello si
		// es número primo o no
		int counterDivision = 0;
		int i = 1;

		// dentro del grupo While damos dos condiciones:
		// una que sea numero par y la otra, si ese numero introducido pasa de dos
		// divisores pares no será un numero par.
		while (i <= number) {
			if (number % i == 0) {
				counterDivision++;
			}
			i++;
			if (counterDivision == 2) {
				this.isPrime = "Es un número primo";
			} else {
				this.isPrime = "No es un número primo";
			}
			// con Thread.currentThread().getName() sacamos el nombre del hilo que está
			// pasando por el método en ese momento.
			this.branch = Thread.currentThread().getName();
			// restamos el tiempo transcurrido con System.currentTimeMillis() al tiempo que
			// recogimos en la variable startTime.
			this.time = (System.currentTimeMillis() - startTime);

		}
	}

	@Override
	public void run() {
		// necesitamos pasar el número introducido al método que busca si es primo o no,
		// para ello usamos el método heredado run()
		isPrime(number);
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Number [Número=" + number + ", es primo=" + isPrime + ", hilo=" + branch + ", tiempo recorrido=" + " "
				+ time + " seg" + "]";
	}

}