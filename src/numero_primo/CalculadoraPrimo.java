package numero_primo;

// Importamos la clase Scanner que nos permitirá guardar los números solicitados por pantalla:
import java.util.Scanner;

// Clase principal Main "CalculadoraPrimo" para calcular los números primos:
public class CalculadoraPrimo {

	public static void main(String[] args) {
		
		// Declaramos "obtenerNumero" de la clase "Scanner" para poder recoger los números solicitados por pantalla:
		Scanner obtenerNumero = new Scanner(System.in);
		
		// Pedimos 4 números primos por pantalla y los guardamos en las correspondientes variables:
		System.out.println("Introduce el primer número primo: ");
		long numero1 = obtenerNumero.nextLong();
		System.out.println("Introduce el segundo número primo: ");
		long numero2 = obtenerNumero.nextLong();
		System.out.println("Introduce el tercer número primo: ");
		long numero3 = obtenerNumero.nextLong();
		System.out.println("Introduce el cuarto número primo: ");
		long numero4 = obtenerNumero.nextLong();

		// Con cada número introducido por pantalla generamos un objeto de la clase "NumeroPrimo":
		NumeroPrimo n1 = new NumeroPrimo(numero1);
		NumeroPrimo n2 = new NumeroPrimo(numero2);
		NumeroPrimo n3 = new NumeroPrimo(numero3);
		NumeroPrimo n4 = new NumeroPrimo(numero4);
		
		// Generemos 4 objetos de la clase Thread (que nos permitirá trabajar con hilos) 
		// pasándoles como atributos el objeto de la clase "NumeroPrimo" y su correspondiente nombre de hilo:
		Thread t1 = new Thread(n1,"Hilo 1");
		Thread t2 = new Thread(n2,"Hilo 2");
		Thread t3 = new Thread(n3,"Hilo 3");
		Thread t4 = new Thread(n4,"Hilo 4");
		
		// Lanzamos la ejecución del hilo con el método "start()" que llamará al método "run()" sobreescrito en la clase NumeroPrimo:
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		// Cerramos "obtenerNumero" de la clase "Scanner":
		obtenerNumero.close();
		
	}
}
