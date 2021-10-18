package Requerimiento2;


//Importamos las clases "LinkedList" y "Queue":
import java.util.LinkedList;
import java.util.Queue;

//Clase "Buffer" que nos permitir� generar el buffer donde guardaremos los correos:
public class Buffer {
	
	// Declaramos la constante "MAX_ELEMENTOS" para limitar la capacidad del la cola (buffer):
	public final static int MAX_ELEMENTOS = 5;
	
	// Creamos una lista "cola" de la clase LinkedList donde guardaremos los objetos de la clase "Correo":
	private Queue<Correo> cola = new LinkedList<>();
	
	// Declaramos el m�todo sincronizado "addMensaje" que utilizar�n los productores de los correos (ProdMensajes): 
	// (El argumento que habr� que pasarle es un objeto de la clase "Correo")
	public synchronized void addMensaje(Correo correo){
		
		// Con un bluce "while" establecemos una condici�n con el tama�o de la cola(buffer) y la constante "MAX_ELEMENTOS":
		while(cola.size() == MAX_ELEMENTOS){
			// Si el tama�o de la cola(buffer) es igual a "MAX_ELEMENTOS"(5) llamamos al m�todo "wait()" 
			// que mantendr� en espera a los hilos productores de mensajes hasta que se vaya vaciando la cola(buffer): 
			try {
				wait();
			// Capturamos la excepci�n:	
			}catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		// REQUISITO DEL REQUERIMIENTO 03: Si nuestro correo generado tiene del remitente: 'pikachu@gmail.com'
		// no se procesar� dicho correo en nuestra cola(buffer):
		if (correo.getDestinatario() == "pikachu@gmail.com") {
			// Imprimimos por pantalla el mensaje de correo no procesado:
			System.out.println("\nCorreo no procesado: No enviamos mensajes a 'pikachu@gmail.com'");
		// En el caso de que el destinaratio no sea 'pikachu@gamil.com y si la cola(buffer)
		// no est� llena el m�todo "offer(correo)" a�adir� un correo a la cola(buffer):
		}else {
			cola.offer(correo);
		// Llamamos al m�todo "notify()" que notificar� que se ha introducido un correo por un productor de mensajes
		// y despertar� a los hilos en espera (permite que los consumidores de mensajes puedan "consumir" un correo):
			notify();
		}
	}
	
	// Declaramos el m�todo sincronizado "getCorreo()" que utilizar�n los consumidores de correos (ConsMensajes):
	public synchronized Correo getCorreo(){
		// Con un bucle "while" establecemos una condici�n con el tama�o de la cola(buffer):
		while(cola.size() == 0){
			// Si la cola est� vac�a(cero elementos) llamamos al m�todo "wait()" que mantendr� en espera a los hilos
			// consumidores de mensajes hasta que se a�adan mensajes(correos) por los productores a la cola(buffer):
			try {
				wait();
			//Capturamos la excepci�n:
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Si la cola(buffer) no est� vac�a generamos email(de la clase Correo) llamando al m�todo "cola.poll()" (que nos 
		// proporciona(saca) un mensaje(correo) de la cola(buffer)):
		Correo email = cola.poll();
		// Una vez obtenido un correo llamamos al m�todo "notify()" para notificar que hemos sacado un mensaje(correo) de 
		// la cola(buffer):
		notify();
		// El m�todo nos retorna/devuelve el email(correo) guardado en el objeto "Correo email":
		return email;
	}
}