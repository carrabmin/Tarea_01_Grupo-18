import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner obtenerNumero = new Scanner(System.in);
		
		System.out.println("Introduce el primer número primo: ");
		long numero1 = obtenerNumero.nextLong();
		System.out.println("Introduce el segundo número primo: ");
		long numero2 = obtenerNumero.nextLong();
		System.out.println("Introduce el tercer número primo: ");
		long numero3 = obtenerNumero.nextLong();
		System.out.println("Introduce el cuarto número primo: ");
		long numero4 = obtenerNumero.nextLong();

		NumeroPrimo n1 = new NumeroPrimo(numero1);
		NumeroPrimo n2 = new NumeroPrimo(numero2);
		NumeroPrimo n3 = new NumeroPrimo(numero3);
		NumeroPrimo n4 = new NumeroPrimo(numero4);
		
		Thread t1 = new Thread(n1,"Hilo 1");
		Thread t2 = new Thread(n2,"Hilo 2");
		Thread t3 = new Thread(n3,"Hilo 3");
		Thread t4 = new Thread(n4,"Hilo 4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		obtenerNumero.close();
		
	}
}