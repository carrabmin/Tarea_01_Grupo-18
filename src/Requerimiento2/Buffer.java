package Requerimiento2;

import java.util.LinkedList;
import java.util.Queue;

//Clase en donde creamos la capacidad del buffer implementamos una lista para los mails
// y creamos dos m�todos para sacar y recoger los mails del buffer. 
public class Buffer {

	public final static int capacidad = 5;

	private Queue<Mail> mailList = new LinkedList<>();

// M�todo para a�adir mensajes al buffer con el m�todo offer() y hacer que espere si 
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
		// en su defecto se a�ade al LinkedList y se notifica con notify()
		if (mail.getAddressee() == "pikachu@gmail.com") {

			System.out.println("\n Direcci�n de correo no v�lida");

		} else {
			mailList.offer(mail);
			notify();
		}

		mailList.offer(mail);

		notify();
	}

	// M�todo para recoger mensajes del buffer con el m�todo poll() y hacer que
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