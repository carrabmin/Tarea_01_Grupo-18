package Requerimiento2;

import java.util.LinkedList;
import java.util.Queue;

//Clase en donde creamos la capacidad del buffer implementamos una lista para los mails
// y creamos dos métodos para sacar y recoger los mails del buffer. 
public class Buffer {

	public final static int capacidad = 5;

	private Queue<Mail> mailList = new LinkedList<>();

// Método para añadir mensajes al buffer con el método offer() y hacer que espere si 
	// se ha llenado la capacidad del buffer Notificamos con notifi()
	public synchronized void addMail(Mail mail) {

		while (mailList.size() == capacidad) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// parte del requerimiento 3. los mensajes a pikachu@gmail.com no se gestionan.
		// Imprimimos mensaje en pantalla
		// en su defecto se añade al LinkedList y se notifica con notify()
		if (mail.getAddressee() == "pikachu@gmail.com") {

			System.out.println("\n Dirección de correo no válida");

		} else {
			mailList.offer(mail);
			notify();
		}

		mailList.offer(mail);

		notify();
	}

	// Método para recoger mensajes del buffer con el método poll() y hacer que
	// espere si se ha llenado la capacidad del buffer. Notificamos con notifi()
	public synchronized Mail getMail() {

		while (mailList.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Mail email = mailList.poll();
		notify();

		return email;
	}

}