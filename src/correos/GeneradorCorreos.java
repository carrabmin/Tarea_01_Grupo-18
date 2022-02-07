package correos;

// Importamos las clases que necesitamos para nuestro generador de correos:
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// Clase GeneradorCorreos (nos servir� para generar correos aleatorios):
public class GeneradorCorreos {
	
	// Declaramos el m�todo "generarCorreo" de tipo clase "Correo":
	public Correo generarCorreo() {
		// Generamos un correo un objeto de la clase "Correo":
		Correo correo = new Correo();
		// Asignamos los atributos del correo con los m�todos setter que a su vez
		// llaman a m�todos generadores que implementamos a continuaci�n:
		correo.setId(generarId());
		correo.setDestinatario(generarDestinatario());
		correo.setRemitente(generarRemitente());
		correo.setAsunto(generarAsunto());
		correo.setCuerpoMensaje(generarCuerpoMensaje());
		// Retornamos/Devolvemos el correo generado:
		return correo;
	}
	
	// M�todo generador de id (genera ids aleatoriamente):
	public String generarId() {
		// Declaramos una variable con un n�mero aleatorio generado por un m�todo de la clase "Thread":
		int numero = ThreadLocalRandom.current().nextInt(0, 10000);
		// Declaramos una variable con un id aleatorio con un c�digo "CXY-" y el n�mero aleatorio generado anteriormente:
		String id = "CXY-" + numero;
		// Retornamos/Devolvemos el id generado:
		return id;
	}
	
	// M�todo generador de destinatarios (genera destinatarios aleatoriamente):
	public String generarDestinatario() {
		// Declaramos una lista ArrayList para guardar posibles destinatarios:
		List<String> listaDestinatarios = new ArrayList<String>();
		// A nuestra ArrayList vamos a�adiendo distintos destinatarios:
		listaDestinatarios.add("michael_jordan@gmail.com");
		listaDestinatarios.add("albert_einstein@hotmail.com");
		listaDestinatarios.add("sheldon_cooper@yahoo.com");
		listaDestinatarios.add("ross_geller@gmail.com");
		listaDestinatarios.add("jerry_seinfeld@hotmail.com");
		listaDestinatarios.add("romario_souza_faria@yahoo.com");
		listaDestinatarios.add("pikachu@gmail.com");
		
		// Declaramos una variable con un n�mero aleatorio generado por un m�todo de la clase "Thread"
		// que utilizaremos para acceder a una posici�n de nuestro array:
		int numero = ThreadLocalRandom.current().nextInt(0, 7);
		
		// Retornamos/Devolvemos un destinatario accediendo a una posici�n aleatoria del ArrayList
		// que nos proporciona el m�todo "get(numero)" generado anteriormente:
		return listaDestinatarios.get(numero);
	}
	
	// M�todo generador de remitentes (genera remitentes aleatoriamente):
	public String generarRemitente() {
		// Declaramos una lista ArrayList para guardar posibles remitentes:
		List<String> listaRemitentes = new ArrayList<String>();
		// A nuestra ArrayList vamos a�adiendo distintos remitentes:
		listaRemitentes.add("michael_jackson@gmail.com");
		listaRemitentes.add("max_planck@hotmail.com");
		listaRemitentes.add("henrik_larsson@yahoo.com");
		listaRemitentes.add("chandler_bing@gmail.com");
		listaRemitentes.add("cosmo_kramer@hotmail.com");
		listaRemitentes.add("tom_hardy@yahoo.com");
		listaRemitentes.add("roger_federer@gmail.com");
		
		// Declaramos una variable con un n�mero aleatorio generado por un m�todo de la clase "Thread"
		// que utilizaremos para acceder a una posici�n de nuestro array:
		int numero = ThreadLocalRandom.current().nextInt(0, 7);
		
		// Retornamos/Devolvemos un remitente accediendo a una posici�n aleatoria del ArrayList
		// que nos proporciona el m�todo "get(numero)" generado anteriormente:
		return listaRemitentes.get(numero);
	}
	
	// M�todo generador de asuntos (genera asuntos aleatoriamente):
	public String generarAsunto() {
		// Declaramos una lista ArrayList para guardar posibles asuntos:
		List<String> listaAsuntos = new ArrayList<String>();
		// A nuestra ArrayList vamos a�adiendo distintos asuntos:
		listaAsuntos.add("Fiesta Fin de A�o");
		listaAsuntos.add("Se acerca el Apocalipsis");
		listaAsuntos.add("Convocatoria de Oposiciones");
		listaAsuntos.add("Fechas de ex�menes finales");
		listaAsuntos.add("Chistes del Comandante Lara");
		listaAsuntos.add("Goles de Ronaldiho");
		listaAsuntos.add("Noticias del volc�n de La Palma");
		
		// Declaramos una variable con un n�mero aleatorio generado por un m�todo de la clase "Thread"
		// que utilizaremos para acceder a una posici�n de nuestro array:
		int numero = ThreadLocalRandom.current().nextInt(0, 7);
		
		// Retornamos/Devolvemos un asunto accediendo a una posici�n aleatoria del ArrayList
		// que nos proporciona el m�todo "get(numero)" generado anteriormente:
		return listaAsuntos.get(numero);
	}
	
	// M�todo generador de mensajes (genera mensajes aleatoriamente):
	public String generarCuerpoMensaje() {
		// Declaramos una lista ArrayList para guardar posibles mensajes:
		List<String> listaCuerpoMensajes = new ArrayList<String>();
		// A nuestra ArrayList vamos a�adiendo distintos mensajes:
		listaCuerpoMensajes.add("Miles de personas afectadas por la erupci�n del Volc�n de Cumbre Vieja");
		listaCuerpoMensajes.add("Ma�ana nos vemos en la Plaza de Espa�a a las 20:00");
		listaCuerpoMensajes.add("Cristiano Ronaldo no le llega ni a la suela de los zapatos al gran Leo Messi");
		listaCuerpoMensajes.add("Prepara una cena rica que el jueves por la noche me paso a cenar");
		listaCuerpoMensajes.add("Vale m�s un 'por si acaso...' que un 'yo pens�...'");
		listaCuerpoMensajes.add("Hoy se cumple el aniversario de la muerte de Johan Cruyff");
		listaCuerpoMensajes.add("Por fin soy abuelo, mi primer nieto naci� ayer a las 2:00");
		
		// Declaramos una variable con un n�mero aleatorio generado por un m�todo de la clase "Thread"
		// que utilizaremos para acceder a una posici�n de nuestro array:
		int numero = ThreadLocalRandom.current().nextInt(0, 7);
		
		// Retornamos/Devolvemos un mensaje accediendo a una posici�n aleatoria del ArrayList
		// que nos proporciona el m�todo "get(numero)" generado anteriormente:
		return listaCuerpoMensajes.get(numero);
	}
	
}



