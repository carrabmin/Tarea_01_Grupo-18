package Requerimiento2;

//Clase que hereda de Thread, para trabajar con hilos, y redescribe el método run()
public class Remitentes extends Thread{

	public String nombre;
	public Buffer buffer;
	
	public Remitentes(String nombre, Buffer buffer){
		this.nombre = nombre;
		this.buffer = buffer;
	}
	
	public void run(){
		MailGeneration gc = new MailGeneration();
		for(int i = 1;i <= 10;i++){
			Mail mail = gc.mailProduction();
			System.out.println("\n"+nombre + " ha producido el email " + mail);
			buffer.addMail(mail);
			
			// Paramos el hilo unos 0,5 segundos como requisito del requerimiento 2
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
