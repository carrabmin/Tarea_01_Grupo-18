package Requerimiento2;

//Clase "ProdMensajes" que extiende de "Thread" para poder trabajar con hilos:
public class ProdMensajes extends Thread {
	
	// Declaramos los atributos "String nombre", "Correo correo" y "Buffer cola":
	public String nombre;
	public Correo correo;
	public Buffer cola;
	
	// Constructor vac�o:
	public ProdMensajes() {
		super();
	}

	// Constructor para los atributos "String nombre" y "Buffer cola": 
	public ProdMensajes(String nombre, Buffer cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	// Declaramos el m�todo "run()" que lanzar� el hilo:
	public void run(){
		// Generamos un objeto de la clase "GenerarCorreos":
		GeneradorCorreos gc = new GeneradorCorreos();
		// Con una estructura de control "for" establecemos que cada productor de mensajes genere hasta 10 correos:
		for(int i = 1; i <= 10; i++){
			// Generamos un objeto de la clase "Correo" con la ayuda del generador de correos:
			Correo correo = gc.generarCorreo();
			// A�adimos el correo aleatorio generado a la cola(buffer) con el m�todo "addMensaje(correo)":
			cola.addMensaje(correo);
			// Imprimimos el nombre del hilo(productor del mensaje) que genera el correo y el id de dicho correo:
			System.out.println("\n" + nombre + " ha producido el correo con el id: " + correo.getId());
			
			// "Dormimos" o paramos la ejecuci�n de cada hilo 0.5 segundos (500 milisegundos):
			try {
				Thread.sleep(500);
			// Capturamos la excepci�n:
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}