package Requerimiento2;

//Clase principal "MainCorreos" para probar nuestro programa:
public class MainCorreos {

	public static void main(String[] args) {
		
		// Generamos una cola(buffer) de la clase "Buffer":
		Buffer cola = new Buffer();
		
		// Generamos 3 productores de mensajes de la clase "ProdMensajes" 
		// (cada uno con su nombre y la misma cola generada anteriormente):
		ProdMensajes p1 = new ProdMensajes("Productor 1", cola);
		ProdMensajes p2 = new ProdMensajes("Productor 2", cola);
		ProdMensajes p3 = new ProdMensajes("Productor 3", cola);
		
		// Generamos 2 consumidores de mensajes de la clase "ConsMensajes" 
		// (cada uno con su nombre y la misma cola generada anteriormente):
		ConsMensajes c1 = new ConsMensajes("Consumidor 1", cola);
		ConsMensajes c2 = new ConsMensajes("Consumidor 2", cola);
		
		// Lanzamos cada hilo productor de mensajes llamando al método "start()"
		// que ejecuta el método "run()" implementado en su clase (ProdMensajes):
		p1.start();
		p2.start();
		p3.start();
		
		// Lanzamos cada hilo consumidor de mensajes llamando al método "start()"
		// que ejecuta el método "run()" implementado en su clase (ConsMensajes):
		c1.start();
		c2.start();

	}

}