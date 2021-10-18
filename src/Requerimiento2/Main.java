package Requerimiento2;

// clase principal en la que se crean los hilos y se arrancan con el método start()
public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		Remitentes r1 = new Remitentes("Remitente 1",buffer);
		Remitentes r2 = new Remitentes("Remitente 2",buffer);
		Remitentes r3 = new Remitentes("Remitente 3",buffer);
		
		Destinatario d1 = new Destinatario("Destinatario 1",buffer);
		Destinatario d2 = new Destinatario("Destinatario 2",buffer);
		
		
		r1.start();
		r2.start();
		r3.start();
		
		d1.start();
		d2.start();
		
	}
}