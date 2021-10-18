package Requerimiento1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// mandamos introducir números por consola y lo capturamos en las variables con
		// el Scanner
		System.out.println("insert number:");
		long number1 = read.nextLong();
		System.out.println("insert number");
		long number2 = read.nextLong();
		System.out.println("insert number");
		long number3 = read.nextLong();
		System.out.println("insert number");
		long number4 = read.nextLong();

		// ahora con esos números tenemos que generar una clase
		Number one = new Number(number1);
		Number two = new Number(number2);
		Number three = new Number(number3);
		Number four = new Number(number4);

		// para que podamos trabajar con hilos tenemos que generar una clase Thread con
		// esos numeros y darle nombre al hilo
		Thread n1 = new Thread(one, "Branch 1");
		Thread n2 = new Thread(two, "Branch 2");
		Thread n3 = new Thread(three, "Branch 3");
		Thread n4 = new Thread(four, "Branch 4");

		// damos comienzo a los hilos
		n1.start();
		n2.start();
		n3.start();
		n4.start();

		read.close();

	}

}