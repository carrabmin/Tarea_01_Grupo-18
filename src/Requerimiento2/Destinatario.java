package Requerimiento2;

//Clase que hereda de Thread, para trabajar con hilos, y redescribe el método run()
public class Destinatario extends Thread{

	public String nombre;
	public Buffer buffer;
	
	public Destinatario(String nombre, Buffer buffer){
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}
	
	public void run(){
		for(int i = 1;i <= 10;i++){
			Mail mail = buffer.getMail();
			System.out.println(nombre + " recibió el mensaje: " + mail);
		}
	}

}