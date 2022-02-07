package correos;

// Clase "ConsMensajes" que extiende de la clase "Thread"(que nos permite trabajar con hilos):
public class ConsMensajes extends Thread{
	
	// Declaramos los atributos "String correo", "Correo correo" y "Buffer cola" que necesita nuestro objeto "ConsMensajes":
	public String nombre;
	public Correo correo;
	public Buffer cola;
	
	// Constructor vacío:
	public ConsMensajes() {
		super();
	}

	// Constructor para los atributos "String nombre" y "Buffer cola": 
	public ConsMensajes(String nombre, Buffer cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	// Declaramos el método "run()" que lanzará el hilo:
	public void run(){
		// Con una estructura de control "for" establecemos que consuman hasta 10 correos:
		for (int i = 1 ; i <= 10; i++) {
			// En cada iteración consumimos un correo llamando al método "cola.getCorreo()":
			Correo correo = cola.getCorreo();
			// Imprimimos por pantalla el nombre del hilo(consumidor de correo) y los datos del correo:
			System.out.println("\n" + nombre + " ha consumido el correo: " + "\n" +  correo);
		}
	}
}
